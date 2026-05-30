# 🚗 ZigWheels Automation Framework (BDD)

This project is an End-to-End Automation Testing Framework built for the ZigWheels website using **Selenium WebDriver, Cucumber (BDD), TestNG, and Page Object Model (POM)**.

---

## 🛠 Tools & Technologies Used

- Java
- Selenium WebDriver
- Cucumber (BDD)
- TestNG (Runner Execution)
- Page Object Model (POM)
- Apache Commons IO (Screenshot Utility)

---

## ✅ Features Covered

✔ Google Login Validation  
✔ Upcoming Honda Bikes Filtering  
✔ Electric Cars Details Extraction  
✔ User Reviews Extraction & Sorting  
✔ Browse by Brand (BMW → Cruiser Bikes)  
✔ Car Filters (Seating Capacity, Engine, Price)  
✔ Electric Bikes Search  
✔ Screenshot Capture Utility  

---

## 🧱 Framework Architecture

Feature Files (.feature)
↓
Step Definitions
↓
Page Object Classes (POM)
↓
WebDriver (BaseTest)
↓
Hooks (@Before / @After)
↓
Test Runner (Cucumber + TestNG)

---

## 📁 Project Structure


src/
├── main/java
│   ├── base/              → WebDriver setup (BaseTest)
│   ├── pages/             → Page classes (POM design)
│   └── utils/             → Utility classes (Screenshot)
│
├── test/java
│   ├── stepdefinitions/   → Step Definition classes
│   ├── hooks/             → Cucumber Hooks (Setup/Teardown)
│   └── runner/            → Test Runner
│
├── test/resources
│   └── features/          → Feature files (BDD Scenarios)

---

## 🔥 Key Highlights

- ✅ BDD approach using Cucumber (Gherkin syntax)
- ✅ Clean separation of test logic and implementation
- ✅ Page Object Model for maintainability
- ✅ Hooks for browser lifecycle management
- ✅ Reusable step definitions
- ✅ Screenshot capture for validation and debugging
- ✅ Multiple scenarios execution

---

## ▶️ How to Run

1. Clone the repository:

git clone https://github.com/nikhilgandule/ZigWheels-Automation-Framework.git

2. Import as **Maven project** in Eclipse/IDE

3. Run:

TestRunner.java → Run as TestNG

---

## 📸 Sample Output


===== CAR DETAILS =====
Name  : Maruti Suzuki e Vitara
Price : Rs 0.72/kilometer

Screenshots will be saved in:

/screenshots/

---

## 🚀 Future Enhancements

- Parallel Execution
- Extent Reporting Integration
- CI/CD (Jenkins)
- Cross-Browser Execution via Grid
- Data-driven testing with Scenario Outline

---
