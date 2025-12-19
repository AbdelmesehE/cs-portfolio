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
