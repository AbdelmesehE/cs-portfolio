#include <iostream>
#include <string>
#include <vector>
#include <limits>
#include <fstream>
#include <sstream>
#include <cctype>

using namespace std;

// ------------------------------------------------------
// Data structures
// ------------------------------------------------------

// Represents a single course in the catalog
struct Course {
    string courseId;                 // e.g., "CSCI300"
    string title;                    // e.g., "Introduction to Algorithms"
    vector<string> prerequisites;    // e.g., {"CSCI200", "MATH201"}
};

// Node for the binary search tree
struct Node {
    Course course;
    Node* left;
    Node* right;

    Node(const Course& c) : course(c), left(nullptr), right(nullptr) {}
};

// ------------------------------------------------------
// Function prototypes
// ------------------------------------------------------

void loadCoursesFromFile(const string& filename, Node*& root);
void insertCourse(Node*& root, const Course& course);
Course* findCourse(Node* root, const string& courseId);
void printCourseList(Node* root);
void printCourseInfo(Node* root, const string& courseId);
void deleteTree(Node*& root);

// ------------------------------------------------------
// Function definitions
// ------------------------------------------------------

/*
 * loadCoursesFromFile
 * --------------------
 * Reads course data from a CSV file and loads it into the BST.
 * Each line in the file is:
 *   courseId,courseTitle,prereq1,prereq2,...
 */
void loadCoursesFromFile(const string& filename, Node*& root) {
    ifstream inFile(filename);
    if (!inFile.is_open()) {
        cout << "Error: Could not open file '" << filename << "'." << endl;
        return;
    }

    // Clear any existing data before loading new courses
    deleteTree(root);
    root = nullptr;

    string line;

    while (getline(inFile, line)) {
        if (line.empty()) {
            continue; // skip blank lines
        }

        stringstream ss(line);
        string token;
        Course c;

        // 1) Course ID
        if (!getline(ss, token, ',')) {
            continue; // malformed line
        }
        c.courseId = token;

        // 2) Course title
        if (!getline(ss, token, ',')) {
            continue; // malformed line
        }
        c.title = token;

        // 3+) Any remaining tokens are prerequisites
        while (getline(ss, token, ',')) {
            if (!token.empty()) {
                c.prerequisites.push_back(token);
            }
        }

        // Insert the course into the BST
        insertCourse(root, c);
    }

    inFile.close();
    cout << "Courses loaded successfully from '" << filename << "'." << endl;
}

/*
 * insertCourse
 * ------------
 * Inserts a course into the BST ordered by courseId.
 */
void insertCourse(Node*& root, const Course& course) {
    if (root == nullptr) {
        root = new Node(course);
        return;
    }

    if (course.courseId < root->course.courseId) {
        insertCourse(root->left, course);
    } else {
        insertCourse(root->right, course);
    }
}

/*
 * findCourse
 * ----------
 * Searches for a course by ID in the BST.
 * Returns a pointer to the Course if found, otherwise nullptr.
 */
Course* findCourse(Node* root, const string& courseId) {
    if (root == nullptr) {
        return nullptr;
    }
    if (courseId == root->course.courseId) {
        return &(root->course);
    }
    if (courseId < root->course.courseId) {
        return findCourse(root->left, courseId);
    } else {
        return findCourse(root->right, courseId);
    }
}

/*
 * printCourseList
 * ---------------
 * In-order traversal of the BST to print courses
 * in alphanumeric order by courseId.
 */
void printCourseList(Node* root) {
    if (root == nullptr) {
        return;
    }
    printCourseList(root->left);
    cout << root->course.courseId << ", " << root->course.title << endl;
    printCourseList(root->right);
}

/*
 * printCourseInfo
 * ---------------
 * Prints the course title and its prerequisites.
 */
void printCourseInfo(Node* root, const string& courseId) {
    Course* course = findCourse(root, courseId);
    if (course == nullptr) {
        cout << "Course " << courseId << " not found." << endl;
        return;
    }

    // Print the selected course
    cout << course->courseId << ", " << course->title << endl;

    // Print prerequisites (numbers and titles)
    if (course->prerequisites.empty()) {
        cout << "Prerequisites: None" << endl;
    } else {
        cout << "Prerequisites:" << endl;
        for (const string& prereqId : course->prerequisites) {
            Course* prereqCourse = findCourse(root, prereqId);
            if (prereqCourse != nullptr) {
                cout << "  " << prereqCourse->courseId << ", "
                     << prereqCourse->title << endl;
            } else {
                // Fallback if not found in the tree
                cout << "  " << prereqId << endl;
            }
        }
    }
}

/*
 * deleteTree
 * ----------
 * Frees all nodes in the BST to avoid memory leaks.
 */
void deleteTree(Node*& root) {
    if (root == nullptr) return;
    deleteTree(root->left);
    deleteTree(root->right);
    delete root;
    root = nullptr;
}

/*
 * main
 * ----
 * Displays the menu and handles user interaction.
 */
int main() {
    Node* root = nullptr;
    int choice = 0;
    string filename;
    string courseId;

    cout << "Welcome to the course planner." << endl << endl;

    // Main menu loop
    while (choice != 9) {
        cout << "  1. Load Data Structure." << endl;
        cout << "  2. Print Course List." << endl;
        cout << "  3. Print Course." << endl;
        cout << "  9. Exit" << endl << endl;

        cout << "What would you like to do? ";
        cin >> choice;
        cout << endl;

        // Handle non-numeric input
        if (cin.fail()) {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            cout << "Invalid input. Please enter a number from the menu." << endl << endl;
            choice = 0;
            continue;
        }

        switch (choice) {
        case 1:
            cout << "Enter the file name to load: ";
            cin >> filename;
            cout << endl;
            loadCoursesFromFile(filename, root);
            cout << endl;
            break;

        case 2:
            if (root == nullptr) {
                cout << "No data loaded. Please load the data structure first." << endl << endl;
            } else {
                cout << "Here is a sample schedule:" << endl;
                printCourseList(root);
                cout << endl;
            }
            break;

        case 3:
            if (root == nullptr) {
                cout << "No data loaded. Please load the data structure first." << endl << endl;
            } else {
                cout << "What course do you want to know about? ";
                cin >> courseId;
                cout << endl;

                // Make lookup case-insensitive
                for (char& ch : courseId) {
                    ch = toupper(static_cast<unsigned char>(ch));
                }

                printCourseInfo(root, courseId);
                cout << endl;
            }
            break;

        case 9:
            cout << "Thank you for using the course planner!" << endl;
            break;

        default:
            cout << choice << " is not a valid option." << endl << endl;
            break;
        }
    }

    // Clean up allocated memory
    deleteTree(root);
    return 0;
}
