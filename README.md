# CS Portfolio — CS 250 Module Eight Journal

**Course:** CS-250: Software Development Lifecycle  
**Artifact:** Sprint Review & Retrospective  
**Student:** Ehab Abdelmeseh  
**Date:** October 18, 2025  

## 🔗 Artifact
- [Sprint Review & Retrospective](Sprint_Review_and_Retrospective.docx)

---

## 🧠 Reflection (Essential Questions)

### 1. How do I interpret user needs and implement them into a program? How does creating “user stories” help with this?
I interpret user needs by breaking them down into clear user stories that describe what the user wants and why. Each story includes acceptance criteria that define when the story is complete. This helps me stay focused on delivering what provides value to the user and allows the Product Owner to confirm that the implementation matches expectations. Creating user stories ensures the development process remains user-focused and easy to adjust when feedback changes requirements.

### 2. How do I approach developing programs? What Agile processes do I hope to incorporate into my future work?
I approach development through short, iterative sprints that emphasize communication and collaboration. I plan to keep using Agile practices like sprint planning, daily stand-ups, and retrospectives to continuously improve. Using backlog refinement, version control, and testing during each sprint helps ensure high-quality results that can adapt quickly to changes.

### 3. What does it mean to be a good team member in software development?
Being a good team member means communicating clearly, helping teammates solve problems, and taking responsibility for quality work. It also means being open to feedback, meeting sprint goals, and supporting others to ensure the entire team succeeds. A great developer collaborates, not just codes — they contribute to a positive, productive, and learning-oriented team culture.

---

## 🗂️ Repository Structure

.
├─ docs/
│ └─ Sprint_Review_and_Retrospective.docx
└─ README.md


---

## 👥 Instructor Access
**Access Method:** Public Repository  
**Instructor:** Added as collaborator


---

# CS Portfolio — CS 230 Software Design Journal

**Course:** CS-230: Operating Platforms  
**Artifact:** Software Design Document – *The Gaming Room (Draw It or Lose It)*  
**Student:** Ehab Abdelmeseh  

## Artifact
- [CS-230 Software Design Document (The Gaming Room)](CS%20230%20Project%20Software%20Design.docx)

---

## Reflection

**1. Briefly summarize The Gaming Room client and their software requirements. Who was the client? What type of software did they want you to design?**  
The Gaming Room was the client for this project. They previously offered their game, *Draw It or Lose It*, as an Android-only application and wanted to expand it into a web-based, multi-platform game. The client required a design that would support multiple teams and players, enforce unique game and team names, and ensure that only a single instance of the game service exists in memory. The goal was to create a scalable, secure, and maintainable web application that could support users across different devices and operating systems.

**2. What did you do particularly well in developing this documentation?**  
I did particularly well in clearly documenting the system architecture and design constraints. I effectively applied object-oriented principles such as encapsulation, inheritance, and abstraction to create a clean domain model. I also clearly explained why specific design patterns, such as the Singleton and Iterator patterns, were chosen and how they directly supported the client’s requirements.

**3. What about the process of working through a design document did you find helpful when developing the code?**  
Working through the design document helped me think through system requirements and constraints before writing any code. By defining classes, relationships, and responsibilities ahead of time, I was able to anticipate potential issues related to scalability, data integrity, and concurrency. This made the development process more structured and reduced the likelihood of major design changes later.

**4. If you could choose one part of your work on these documents to revise, what would you pick? How would you improve it?**  
If I were to revise one part of the document, I would expand the security section further. While the document addressed security at a high level, I would improve it by including more detailed authentication and authorization strategies, as well as examples of how data validation and secure session management would be implemented.

**5. How did you interpret the user’s needs and implement them into your software design? Why is it so important to consider the user’s needs when designing?**  
I interpreted the user’s needs by focusing on the core gameplay requirements and the need for consistent, reliable access across platforms. These needs were implemented through a centralized game service, unique name enforcement, and a platform-independent web architecture. Considering user needs is critical because it ensures the system is usable, reliable, and aligned with what the client and end users actually expect from the application.

**6. How did you approach designing software? What techniques or strategies would you use in the future to analyze and design a similar software application?**  
I approached the design by first analyzing requirements, identifying constraints, and then mapping those requirements to appropriate design patterns and architectural decisions. In the future, I would continue using techniques such as UML modeling, iterative refinement, and early evaluation of operating platforms to ensure scalability and maintainability before implementation begins.



## CS 255 – System Analysis and Design Portfolio Reflection

### DriverPass Project Summary
The DriverPass project was created for a client named DriverPass, a company that offers driver education services and prepares students for DMV written and road exams. The client requested the design of a web-based information system that would centralize their operations and improve student success rates. The system needed to allow students to register, purchase training packages, schedule on-the-road driving lessons, and complete online practice exams based on current DMV rules. In addition, the system was required to support multiple user roles, including students, a secretary, an owner, and an IT officer, each with specific permissions and responsibilities.

### What I Did Well
One of my strongest contributions to this project was developing a clear and well-organized business requirements document. I effectively translated the client’s needs into detailed functional and nonfunctional requirements, including performance expectations, security controls, and platform constraints. I also did well in identifying system components such as scheduling, reporting, audit logging, and role-based access control. This structured approach made it easier to create consistent UML diagrams and a system design that aligned closely with the client’s goals.

### Area for Improvement
If I were to revise one part of my work, I would enhance the UML diagrams by adding more detailed explanations and alternative process flows. While the diagrams accurately represent the main system behaviors, additional detail would improve communication with developers and stakeholders by clarifying edge cases, exception handling, and system dependencies.

### Interpreting and Implementing User Needs
I interpreted the user’s needs by carefully reviewing the interview transcript and identifying key challenges faced by DriverPass, such as scheduling inefficiencies, lack of centralized data management, limited progress tracking, and security concerns. These needs were implemented into the system design through features such as role-based permissions, audit logs for reservation changes, integrated lesson scheduling, and online testing modules. Considering user needs is critical in system design because a solution that does not reflect real user workflows can lead to poor adoption, errors, and reduced business value.

### My Approach to Software Design
My approach to designing software begins with thoroughly understanding stakeholder requirements and constraints. I then break the system into logical components and use modeling techniques such as use case diagrams, activity diagrams, sequence diagrams, and class diagrams to visualize system behavior before implementation. In future projects, I plan to continue using iterative analysis, stakeholder feedback, and documentation-driven design to ensure systems are scalable, secure, and aligned with business objectives.


# CS Portfolio — CS 320 Module Eight Journal

**Course:** CS-320: Software Testing and Automation  
**Artifact:** Contact Service Classes & Summary/Reflections Report  
**Student:** Ehab Abdelmeseh  
**Date:** 02/28/2026  

##  Artifact

**Project One Artifacts (Contact Service):**  
- `Contact.java`  
- `ContactService.java`  
- `ContactTest.java`  
- `ContactServiceTest.java`  

**Project Two Artifact:**  
- `CS320_Project 2.docx`

## Reflection (Essential Questions)
### 1. How can I ensure that my code, program, or software is functional and secure?

To ensure functionality, I rely on thorough unit testing, test-driven development principles, and validation of all inputs. Writing automated JUnit tests helped me confirm that every method performed as expected and exposed issues early before integration. To ensure security, I focus on restricting invalid data, handling errors safely, and maintaining good coding practices that prevent vulnerabilities such as unsafe input handling or unintended data exposure. Secure coding and complete test coverage together ensure that the software behaves correctly and safely.

### 2. How do I interpret user needs and incorporate them into a program?

I interpret user needs by reviewing requirements and translating them into clear, testable behaviors. For the Contact Service project, requirements such as maximum field lengths and non-null constraints were turned into specific validation rules and test cases. User needs are incorporated by ensuring every requirement maps to functionality in the code and a test that verifies it. This approach ensures my implementation remains aligned with what the user expects the system to do.

### 3. How do I approach designing software?

My approach to software design begins with understanding the requirements and breaking the solution into small, modular components. For CS-320, this meant creating separate classes for data representation, business logic, and testing. I rely on clean code principles, encapsulation, and reusable methods to keep the design simple and maintainable. Going forward, I will continue using iterative refinement, continuous testing, and modular design so that the software remains reliable, scalable, and easy to update.

## 🗂️ Repository Structure (for this course)
CS320_ProjectOne/
└── src/
└── contact/
├── Contact.java
├── ContactService.java
├── ContactServiceTest.java
└── ContactTest.java
CS320_Project 2.docx

## CS-305: Artemis Financial – Practices for Secure Software (Project Two)

### 1. Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

Artemis Financial is a financial services company that handles sensitive client information and secure financial transactions. Their main requirement was to protect data transmitted through their web application using strong encryption and modern secure communication standards. They needed a secure hashing solution for verifying data integrity and a properly configured HTTPS environment to protect confidentiality. My task was to analyze their existing application, implement secure communication using TLS, generate cryptographic certificates, and demonstrate safe hashing and secure coding practices.

### 2. What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

I did well identifying weak areas in the application’s configuration and implementing modern cryptographic algorithms like SHA-256. I also configured HTTPS properly with a PKCS12 keystore and used secure TLS communication. Coding securely is crucial because it protects against data breaches, loss of customer trust, and regulatory penalties. Strong software security supports stability, compliance, and long-term business success, especially in industries that handle financial data.

### 3. Which part of the vulnerability assessment was challenging or helpful to you?

The most challenging part was working with the OWASP Dependency-Check tool, especially since the National Vulnerability Database now requires API keys for updates. Although the scan didn’t fully complete, it helped me understand how dependency scanning works in a real DevSecOps environment and how security tools integrate with build processes. It also helped me recognize the importance of keeping third-party libraries updated to prevent known CVEs.

### 4. How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I increased layers of security by implementing SHA-256 hashing, configuring HTTPS/TLS encryption, generating a secure certificate, and isolating cryptography logic into a dedicated controller. I also ensured the application rejected insecure HTTP and tested the integrity of the hashing endpoint. In the future, I would use tools like OWASP Dependency-Check, static analysis tools, vulnerability databases, and industry frameworks such as the OWASP Top 10 and NIST guidelines. I would prioritize vulnerabilities based on risk to confidentiality, integrity, and availability.

### 5. How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

I tested functionality by running the application over HTTPS and verifying that the `/hash` endpoint produced consistent, correct SHA-256 hashes. I confirmed that the keystore and certificate were loaded correctly, and the application responded securely on port 8443. After refactoring, I reran the dependency scanner, reviewed the code for security risks, and retested all functionality. This confirmed that the application worked correctly and that no new vulnerabilities were introduced during development.

### 6. What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

I used Java’s MessageDigest, SHA-256 hashing, TLS configuration, PKCS12 keystores, X.509 certificates, and the OWASP Dependency-Check plug-in. I followed best practices like separation of concerns, avoiding hard-coded secrets, and using vetted cryptographic algorithms. These tools and practices will be valuable in future courses and real-world secure software development.

### 7. Employers sometimes ask for examples of work you have successfully completed. What might you show future employers from this assignment?

I can show employers the secure software practices report, the code demonstrating SHA-256 hashing, the HTTPS/TLS configuration, and the dependency scanning setup. This assignment demonstrates my ability to implement secure communication, use modern cryptography, configure certificates, identify security risks, and follow industry best practices — all skills that employers look for in software engineering and cybersecurity roles.

