@tag
Feature: HTTP Requests
  I want to use this template HTTP Requests

  @tag1
  Scenario: Sending Http requests
    Given send Get request
    And send Post request
    And send Put request
    And send Delete request
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
