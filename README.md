# Junit Assignment
## Project Description

The Repository contains a maven project with queue extended from [Princeton's Intro to programming](https://introcs.cs.princeton.edu/java/43stack/) sample.
You are the developer who is supposed to write the unit test case for this class.
The client required a simple Java class which implements the Queue Data structure. As the developer you wrote the code and the same was pushed in this repository.

**The problem:** The "dequeue" method has a bug : The developer has forgot to throw an exception when the queue is empty.

## Complete the following Tasks.
### Task 1 : Create Passing test cases
Create Unit test cases for the code in this repository. The tests should have 100% instruction & branch coverage for both constructors, enqueue, dequeue, peek, length, isEmpty, removeAll methods.

**Upload Results** Copy the code coverage report and attach the same with your submission.


### Task 2:  Create Test case that *fails* revealing the underlying fault
Write a test case which exercises the program to find the fault in the dequeue method. 
Bug : The class does not throw an exception when dequeue function is called on an empty queue. Remember the intended behaviour of the dequeue method in a queue data-structure is throw an exception if it is called on a queue is empty. You find the problem is that: someone commented a part of your code (Line 147 & 148) after you pushed the same.

**Note** after writing this test case: 

> mvn test

will state that one of your test case is failing

Hint : Your test case would expect a NoSuchElementException, but that is not thrown hence this test case will make your mvn test fail, and this the expected behaviour.

**Upload Results** : Upload your code and test cases to the repository and the blackboard.


#### Current code coverage: 
![Instructions Coverage](.github/badges/jacoco.svg "Instructions Coverage Jacoco")
![Branch Coverage](.github/badges/branches.svg "Branch Coverage Jacoco")

## Requirements for assignment

* Have 100% instruction & branch coverage for both constructors, enqueue, dequeue, peek, length, isEmpty, removeAll for Queue Class.
* Annotations of JUnit are to be used.
* Test cases must be complete & should check for expected outcome. (except for the "toString" method). An example would be, after the dequeue method is called on the queue, ensure that the length of the queue decreases by one. Or that when "peek" method is called, the returned value is the expected element.
* You should have atleast 1 failing test which reveals the bug in the enqueue method disclosed earlier.

## Required Artifacts:
Please submit the following on blackboard:
1. Github Repository link.
2. Screenshot of instruction coverage after Task 1.
3. Screenshot of instruction coverage after Task 2.
4. zip the project folder
## Instructions to run
The project is tested on [adoptium JDK-17 LTS](https://adoptium.net) but any JDK-17 flavour should work just fine.
This assignment assumes you have knowledge of Java Classes and have a working installation of JDK. P.s. Java-8 might work as well, but is not tested!


You can check the current code coverage using the following ways:
### Checking code coverage on local machine.
To Run tests and generate coverage reports :

> mvn jacoco:prepare-agent test jacoco:report

or just 

> mvn test
* Location of reports : *target/site/jacoco/index.html*
* [Screenshot of a sample report](https://github.com/ninadpchaudhari/JUnit-Assignment/blob/master/jacoco-report-sample.png?raw=true) 

### Automatic Coverage test: 
This repo is configured to automatically generate a new commit after you push code online!
This commit will generate badges reflecting the current test coverage of code.
You can just push code to github then wait for the github action to finish
which should update the badges automatically! 

*Please do `git pull` after the bot has updated your repo with badges*
This helps everyone stay on the same page.


#### References
* [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide)
* [JUnit 5 Samples](https://github.com/junit-team/junit5-samples)
* [JUnit 5 tests for *Stack*](https://github.com/junit-team/junit5/blob/master/documentation/src/test/java/example/TestingAStackDemo.java)
