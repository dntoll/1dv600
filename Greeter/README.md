# The greeter application
This application is a example for 1DV600 and should showcase how to write manual and automated tests for an applicaton given use-cases. The example is very simple just to show the basic components of assignment 3. Please note that you need to fill in the gaps yourself by listening to the lectures, read the book, and ask in Slack.

## Vision
The greeter application shows a friendly greeting message in the user console. This can, for example, be run when a user logs into a console based system. For example ssh into a server.

## Use-Cases
This is a simple application with two use-cases.


### UC1 Store a Name
Precondition: none.

Postcondition: a __name__ is stored

#### Main scenario
1. Starts when a user wants to store their name into Greeter application
2. The system asks for a name
3. The __User__ provides the name
4. The system stores the __name__ and presents that it has been stored

#### Alternate scenarios
* 3a The user provides an empty name
 * The system shows an error message
 * Goto Step 2. in Main Scenario

#### Activity Diagram
![UC1](http://yuml.me/10e85680.png) http://yuml.me

### UC2 Be Greeted
Precondition: none.
Postcondition: A user has been greeted

#### Main scenario
* 1. The user starts the greeter application
* 2. The system shows a greeting message including the __name__ and the current date.
 
#### Alternate scenarios
* 2a The user has not stored a name
 * Goto "UC1 Store a Name"
 * Goto Step 2. in Main scenario

#### Activity Diagram
![UC1](http://yuml.me/df63b63e.png) http://yuml.me


# Test Plan

## Objective
The objective is to test the code that was implemented the last iteration.

## What to test and how.
We intend to test UC1 by writing and running dynamic manual test-cases. We wait with testing UC2 until code for UC2 has been implemented.
We also write automated unit tests for all [NameDAL](https://github.com/dntoll/1dv600/blob/master/Greeter/src/Greetings/NameDAL.java)-methods in the class [NameDALTest](https://github.com/dntoll/1dv600/blob/master/Greeter/tests/Greetings/NameDALTest.java). Each sut-method should have at least two tests.
Finally we examine the code by static inspection to see how we can add unit tests to all classes and methods in the future.

## Time plan

| Task          | Estimated | Actual  |
| ------------- |:---------:| -----:|
| Manual TC     | 1h        | 55m    |
| Unit tests    | 1h        | 56m |
| Running manualtests    | 20m        | 5m |
| Code inspection | 1h | 20m |
| Test report     | 1h        | 5m |

## Manual Test-Cases

### TC1.1 Store name successful
Use case: UC1 Store a Name

Scenario: Store name successful

![Scenario](http://yuml.me/567ad1fe.png)

The main scenario of UC1 is tested where a user stores their name successfully. 

Precondition: There must NOT be a name.txt file in ./Greeter/data, remove it if its there.

#### Test steps
* Start the app
* System shows "Fill in a username:"
* Enter the name "Johnny" and press enter

### Expected 
* The system should show the text "Name Johnny Stored" 
* Also output from UC2.

### TC1.2 Store empty name force reprompt
Use case: UC1 Store a Name

Scenario: Store empty name force reprompt. The alternate scenario where the user enters an empty username and is forced to enter a new username.

![Scenario](http://yuml.me/ad6e0e55.png)

 

Precondition: There must NOT be a name.txt file in ./Greeter/data, remove it if its there.

#### Test steps
* Start the app
* System shows "Fill in a username:"
* press enter without entering a name

### Expected 
* The system should show the text "A username must have at least one character, try again" 
* System shows "Fill in a username:" and waits for input

## Test Report


Test traceability matrix and success

| Test      | UC1 | UC2  | 
| --------- |:----:| :---:|
| TC1.1     | 1/OK | 0    |
| TC1.2     | 1/OK | 0    |
| COVERAGE & SUCCESS   | 2/OK    | 0    |



Automated unit test coverage and success

| Test          | ConsoleView | GreetController  | Main | NameDAL |
| ------------- |:----:| :---:|:---:|:---:|
| NameDALTest   | 0 | 0| 0 | 100%/OK |
| COVERAGE & SUCCESS      | 0/NA | 0/NA | 0/NA |  100%/OK |

### Comment

All tests pass, next iteration we need to focus on UC2. 

We examined the code and most classes require mocks to be testable.
