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
      
    