Feature: Testing of https://hanna.yakubchyk2.20.hosty.by/wordpress/

  Scenario: 01 Check that Become a Volunteer button works
    Given Main page is loaded
    When user clicks on Become a Volunteer button
    Then Volunteer page is loaded

    Scenario: 02 Check that a volunteer form works
      Given volunteer page is loaded
      When user enters name into name field
      And user enters valid email into email address field
      And enters phone into phone field
      And enters message into message field
      And clicks on Send button
      Then message of success sending appears

      Scenario: 03 Check that calculated value appears
        Given Calculator page is loaded
        When user picks a medicine from a dropdown list
        And enters numbers into Body Weight Field and Desired Factor Rise Field
        Then calculated dose appears



