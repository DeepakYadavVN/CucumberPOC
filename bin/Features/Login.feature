Feature: Login
  In Order to verify Facebook Login Functionality
  @first
  Scenario: In Order to Verify Facebook Login
    Given User navigate facebook Website
    Then User navigate facebook title
    Then User enter username
    And User enter password
    Then User should be login sucessfully

    #@first
    #Scenario: In Order to Verify Facebook Login
    #Given User navigate Gmail Website
    #Then User navigate Gmail title
    #Then User enter invalid username
    #And User enter invalid password
    #Then User should not be login sucessfully
      
    Scenario: In Order to verify health event entry
Given Navigate to the health event entry
Then Verify there is no default health selected
Then Verify that the add button is disabled
Then Verify illness is selected
Then Verify Stress is selected
Then Verify Feel High is selected
Then Verify Feel Low is selected
Then Verify Cycle is selected
Then Verify Alcohol is selected