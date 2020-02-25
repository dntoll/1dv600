Large chunk of text ahead, read early and carefully, and ask questions in Slack!

# Testing

The focus of this assignment is to perform tests on the system you are building. 

Do not forget to work with your time log, make estimations, track actual time, learn.

Remember that all assignments are individual!

I have written an example application, "Greeter", that can be used as an example of how to write Manual Tests from the use-cases as well as writing automated unit tests (in Java).
https://github.com/dntoll/1dv600/tree/master/Greeter

## Task 1: Test Plan
To get an overall structure to test, the first task is to create a test plan. Make use of your requirements (and possibly additional material as needed) from the previous assignment. Don’t forget that the quality requirements will require special treatment. 

Your test plan should include:

Information about the test effort in this iteration of your system, note that some of what it should include is specified in this assignment so read the entire assignment before planning.

* What are the objectives of the testing in this iteration?
* What to test? Include a short rationale for why you choose to test these objects and not others. (Look in Task 2, 3 for this...)
* How this testing is going to be done, what should be dynamically or statically tested, what testing techniques are going to be used. (Look in Task 2, 3 for this...)
* Make a time plan for this including time-estimations and measure. Finally, fill in actual time taken when you execute your plan. 

An approved test-plan must include all of the items above.

***

## Task 2: Manual Test Cases using the client application
Take two use cases that you identified in assignment 2, and create manual test cases for the two that are using the application's interface. Describe what it is you are going to test, how you are going to do it and what outcome you expect from different tests. The test case should include:

* Name and id of the test-case
* Reference to what requirement (use-case) that is tested
* Short description of what is tested and why.
* Preconditions that need to be fulfilled before this test is can be started (can be other test-cases or things like "Server must be started")
* Test-steps including test-data. This is an exact description of what the tester is supposed to do. "Click 'Send' button". Make sure to be clear and *unambigous*! For example do not write things like "enter a name" and instead specify the name! Write "Using the keyboard, write 'Daniel' in name-box so that each time the test is done, it's done in the exact same way.
* A description of the expected result that should happen if the system works as specified. This should also be exact description of the expected output. For example "The text 'Welcome Daniel' is shown on the screen"
* Checkboxes if the test did succeed or fail. These are filled in when the test has been conducted.
* A space for comments by the tester, fill this in also if you detect something during testing that should be noted.

### Rules for the Manual tests
* To be approved, you must submit **TWO** test-cases that include all of the above for two different use-cases (one each). 
* To be approved, you must include your test-cases in the report document under its own heading.
* To be approved, manual tests should be understandable (the reader should be able to understand how to run the test) and make sense (be motivated, have value, is realistic, etc.)
* For a higher grade, add more manual test-cases for each use-case. Each should test different things.
* For a higher grade, the tests should test different paths (*scenarios*) through the use-case and have different test-data. 
* For a higher grade, include a test-matrix that clearly shows what test-cases are covering what requirements. 
* For a higher grade, focus on coverage (all paths taken), clarity (understandability), and test-traceability (each test is connected to a use-case).

***

## Task 3: Unit tests
Decide on two methods (or functions) in your system that have simple input and simple output. If no code is available or your code is too hard to test, you will have to write new methods to use for this assignment. For example a method "int getNumberofCharactersLeftToFind(String allInput, String hiddenWord)" that takes two strings as input and returns a number. Create two automated unit-tests for each method (for a total of four test methods). The tests should be orthogonal (test different things) and you should be able to manipulate the tested method (by for example adding or removing code) so that these tests can fail independently. When you run these tests against your code all four tests should succeed.

Also write one automated unit test of a method that is not yet complete (for example: right now the method only returns false, but should be able to return true for some inputs). You will likely have to create this method. The test should use the incomplete but compiling method and "detect" that the code does not work (i.e. this test should fail since the code is not complete). The failing test should be able to succeed when the method is implemented. Try this out by changing the implementation to the correct one and run the tests. Before handing in comment the successful implementation out and keep the failing.

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
* To be approved, you need at least four succeeding automated unit tests that are testing two methods used in the hangman source code. All four tests should potentially be able to fail independently for different versions of the system.
* To be approved, you need one failing automated unit test that is testing an unfinished method that you added for this exercise. The unfinished method should contain commented out code that makes the test succeed.
* To be approved, all tests must be useful and make make sense. One should be able to create a bug for which each test fails. 
* To be approved, you must run all tests and take a screenshot of the test-result, and include that in your document-report. This should showcase that one test fail and four tests succeed.
* To be approved, include readable screenshots of your automated unit-test-cases in the test-plan document under its own heading, as subtext include "link" to actual test-code in your repository. 
* To be approved, you must make the code readable (perhaps best with screenshots from your editor).

For higher grade, and in addition to the requirements stated above, you need to submit more unit tests covering your system. These tests should also make sense (be able to fail independently from the other tests).
* Good: Two classes with a dependency have tests for all methods. Report is easy to read and reasonable.
* Excellent: All hangman sourcecode, as in all methods and all classes (at least 5 classes with dependencies), are covered by tests. Show this by running a Coverage tool and include screenshot of that. Report is exceptionally written.


***


### Include in the submission
All text/diagrams must be handed in a single multipage PDF file called "Test.pdf". The following should be included in the submission that you put in the root directory of your gitlab repository.
* Start the pdf document with information about you (Name, lnu-email address and a link to your GitHub repo)
* The pdf should include the test plan.
* The pdf should include Manual Test cases with test result (these may fail)
* The pdf should include Automated unit test code screenshots, test result screenshots, and screenshots from coverage-tool if you used one.
* A short reflection (100 words)

Note that all the above goes into one readable PDF file. 
Your source code, and documents from previous iterations should be available in your git repository which you linked to in your pdf.
Create an issue as the last assignment, name issue Assignment 3.
