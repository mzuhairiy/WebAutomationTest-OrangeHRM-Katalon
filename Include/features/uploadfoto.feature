#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Positive
Feature: Upload Photo
  User successfully edit photo profile

  @Positive
  Scenario Outline: User want to edit photo profile
    Given User is on dashboard page
    When User clicks my info's button
    ##And User clicks img profile button
    ##And User upload file
    ##And User clicks button save
    Then User has successfully edited photo profile
    
    Examples: 
      | username | password |
      | Admin    | admin123 |
