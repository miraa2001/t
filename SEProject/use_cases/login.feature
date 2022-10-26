Feature: Login
Actor: Customer
Description: The customer's login process to the system
Background: The hotel has customers
And these are the users
|miraj|1212001|
|talahamad|tala2001|
|areenateeq|areen2002|

Scenario: Customer can login
Given that the customer "miraj" is not logged in
When customer tries to login
And username is "miraj" and password is "1212001"
Then the login succeeds
And the customer is logged in

Scenario: Customer cannot login
Given that the customer "miraj" is not logged in
When customer tries to log in
And username is "miraj" and password is "wrongpassword"
Then the login fails
And the user is not logged in