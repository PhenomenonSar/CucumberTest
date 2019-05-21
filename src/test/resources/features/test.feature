Feature: taskCucumber.Calculator
@all
  Scenario Outline: Sum of the two numbers
    Given two numbers <a> and <b>
    When we try to find sum of our numbers
    Then result should be <result>

  Examples:
  | a | b | result  |
  | 3 | 2 | 5       |
  | 4 | 2 | 6       |
  | 5 | 2 | 7       |
  | 6 | 2 | 8       |
  | 7 | 2 | 10       |
