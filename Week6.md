# Chapter 10: Software Verification, Validation, and Testing

## Objectives
- Understand techniques for software verification and validation
- Analyze software testing basics and techniques
- Discuss software inspections and how to perform them

## Introduction to Testing and Quality Assurance
- Quality is defined as meeting specifications and being fit for use
- Best quality comes from good processes and craftsmanship
- Quality assurance: activities to measure and improve quality (process, training, team)
- Quality control: activities to verify product quality, detect and fix defects
- Software has static structure (code) and dynamic behavior; documents only have static structure
- Error detection techniques: testing, inspections/reviews, formal methods, static analysis
- Quality definitions: conformance to specifications vs. serving its purpose
- Verification: checks product conforms to requirements/specs
- Validation: checks product meets user needs
- Fault/defect: condition causing failure, due to error
- Failure: system not performing as specified
- Error: mistake by engineer/programmer
- Severity vs. priority: impact vs. importance

## Testing
- Testing evaluates and improves product quality by finding defects
- Involves dynamic verification using selected test cases
- Requires test criteria to determine when testing is sufficient
- Testing must be planned: goals, methodology, resources, tools, schedule, test plan

### Purposes of Testing
- Find defects for correction/mitigation
- Provide quality assessment and assurance
- Testing cannot prove a product works for all cases, only for tested cases

## Testing Techniques
- Many techniques exist; classification is complex

### Who Does Testing?
- Programmers: unit testing
- Testers: write and execute test cases, analyze results
- Users: detect usability issues, perform acceptance (alpha/beta) testing

### What is Tested?
- Unit testing: individual functions/classes
- Functional testing: combined units as functional group
- Integration/system/component testing: integrated system or components

### Why Test?
- Acceptance, conformance, configuration, performance, stress, user-interface testing

### How to Generate Test Cases
- Intuition: based on experience
- Specification: black-box testing (equivalence class partitioning, boundary value analysis)
- Code: white-box testing (coverage, path analysis)
- Existing test cases: regression testing
- Faults: error guessing, error-prone analysis

### Testing Progression
- Small projects: unit and functional testing
- Large projects: unit → functional → component → system/regression testing

## Key Techniques

### Equivalence Class Partitioning
- Black-box technique: divide input into classes expected to behave similarly
- Choose representative test cases for each class
- Example: age groups for marketing app

### Boundary Value Analysis
- Focuses on errors at boundaries of equivalence classes
- Test at, just inside, and just outside boundaries
- Produces more test cases, especially for ordinal variables

### Path Analysis
- White-box technique: analyze and test all logical paths in code
- Ensures statement and branch coverage

---

# Week 6: Software Testing Scopes and Approaches

## Software Testing
- Critical phase to verify software works as intended
- Testing finds defects that may cause failures
- Exhaustive testing is impractical; careful planning is needed for effective testing

## Scopes of Testing
- Software is part of larger systems; testing occurs at multiple stages
- Unit testing: by developers, uses drivers/stubs to test modules/classes
- Integration testing: combines modules/components, checks interfaces
- System testing: by independent team, tests complete system (hardware + software)
  - Includes recovery, security, stress, performance testing
- Acceptance testing: by users, ensures product meets needs; often called beta/end-user testing
- Acceptance test plan: developed during requirements analysis, specifies criteria and scenarios
- Acceptance tests: black-box cases derived from use cases

## Approaches to Testing
- Two main approaches: structural (white-box) and functional (black-box)
- Both are essential for validating correctness and requirements compliance

### White-Box Testing
- Focuses on code logic, paths, and decision points
- Tests each logic branch, decision, and calculation
- In OOP, each method is a candidate for testing
- Decision-control structures (if-then-else, case, loops) must be covered
- Goal: execute every instruction and decision direction at least once

### Black-Box Testing
- Based on requirements, not code internals
- Validates functions, interfaces, data access, performance, initialization/termination
- Tester has little/no knowledge of code
- Each test case specifies input and expected output
- In OOP, test each public method

### Black-Box Test Case Design
- Effective testing requires comprehensive, challenging test cases
- Each test case: specific inputs, expected output, actual result, pass/fail
- Example table: triangle sides and expected results

### Diagrams and Test Case Design
- Diagrams (state transition, data flow, class diagrams) help design test cases
- Used for both white-box and black-box test case development
