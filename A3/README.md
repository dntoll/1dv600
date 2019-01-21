Large chunk of text ahead, read early and carefully, ask questions in Slack!

# Testing

The focus of this assignment is to perform tests on the system you are building. 

Do not forget to work with your time log, make estimations, track actual time, learn.

Remember that all assignments are individual!

## Task 1 ­­ Test Plan
To get an overall structure to test, the first task is to create a test plan. Make use of your requirements from the previous assignment and possibly additional material from Assignment 2. Don’t forget that the quality requirements will require special treatment. 

Your test plan should include:

Information about the test effort in this iteration of your system, note that some of what it should include is specified in this assignment so read the entire assignment before planning.

* What are the objectives of the testing in this iteration?
* What to test? Include a short rationale for why you choose to test these objects and not others. (Look in Task 2, 3 for this...)
* How this testing is going to be done, what should be dynamically or statically tested, what testing techniques are going to be used. (Look in Task 2, 3 for this...)
* Make a time plan for this including time-estimations and measure and fill in actual time taken when you execute your plan. 

An approved test-plan must include all of the items above.

***

## Task 2, ­­ Manual Test Cases using the client application
Take two use cases that you identified in assignment 2, and create manual test cases that are using the console application. Describe what it is you are going to test, how you are going to do it and what outcome you expect from different tests. The test case should include.

* Name and id of the test-case
* Reference to what requirement (use-case) that is tested
* Short description of what is tested and why.
* Preconditions that need to be fulfilled before this test is can be started (can be other test-cases or things like "Server must be started")
* Test-steps including test-data. This is an exact description of what the tester is supposed to do. "Click 'Send' button", "Write 'Daniel' in Name box" etc.
* A description of the expected result that should happen if the system works as specified. This should also be exact description of the expected output. For example "The text 'Welcome Daniel' is shown on the screen"
* Checkboxes if the test did succeed or fail. These are filled in when the test has been conducted.
* A space for comments by the tester






### Rules for the Manual tests
* To be approved, to be approved you must submit TWO test-cases that include all the above. 
* To be approved, include your test-cases in the report document under its own heading.
* To be approved, manual tests should be readable and make sense.
* For higher grade, add several manual test-cases for each use-case. 
* For higher grade, the tests should test different paths(scenarios) through the use-case and have different test-data. 
* For higher grade, include a test-matrix that clearly shows what test-cases are covering what requirement. 
* For higher grade, focus on coverage, clarity, and test-traceability.


***

## Task 3, ­­ Unit tests
Decide on one method(function) in your system with preferably simple input and output. Create two automated unit-tests for this method each in its own test method. The tests should be orthogonal (test different things). Also write one automated unit test of a method that is not yet complete, (perhaps the method only returns false). The test should use the incomplete but compiling method and "detect" that the code does not work (ie. this test should fail). 

I prefer the following format for your tests (pseudo code):
```
//system code (in some system file)
class MathHelper {
...
   bool isEven(int number) {
      ...
   }
}
```
```
//test code (in a test file)

class MathHelperTests { 
...
   void shouldReturnTrueIfEven() {
       //setup and test-input-output definitions
       MathHelper sut = new MathHelper(); //System Under Test (sut), often an instance of the class we are testing
       int input = 4; //the test input data an even number
       bool expected = true; //the expected return value for a succeeding test

       //running the method that we are testing, this is called "exercise the sut"
       bool actual = sut.isEven(input); //the return value is the "actual" output of the system

       //compare the actual result with the expected value and report (done by framework)
       AssertEquals(expected, actual); //note could use AssertTrue for more compact code
   }
}

```


### Rules for the Automated tests
* To be approved, you need four succeeding automated unit tests that are testing two methods used in the hangman sourceccode. 
* To be approved, all tests must be useful and make make sense. There should be a bug for which the test fails. 
* To be approved, you also need one failing automated unit test that is testing an unfinished method you added for this exercise. 
* To be approved, you must run all tests and take a screenshot of the test-result, and include that in your document-report. This should showcase that one test fail.
* To be approved, include your automated unit-test-cases in the test-plan document under its own heading. 
* To be approved, Make the code readable (perhaps best with screenshots from your editor).

For higher grade, you need to submit more unit tests covering your system. These tests should also make sense.
* Good: Two classes with a dependency have tests for all methods. Report is easy to read and reasonable. And above...
* Excellent: All hangman sourcecode (all methods and all classes (at least 5 classes with dependencies) are covered by tests. Show this by running a Coverage tool and include screenshot of that. Report is excellent written. And above...


***


### Include in the submission
All text/diagrams must be handed in a single multipage PDF file. The following should be included in the submission that you hand in via Moodle:
* Test plan
* Manual Test cases with test result (they may fail)
* Automated unit tests code screenshots, test result screenshots.
* A short reflection (100 words)