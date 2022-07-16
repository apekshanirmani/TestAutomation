#Author: Apeksha Nirmani
@LoginScenario
Feature: Admin login

 // Background: User navigation

  @AdminLogin1
    Scenario Outline: Check login function with valid credentials
      Given user open the IB url
      Given user type username <UserName>
      And user type password <PassWord>
      When user clicks login button
      Then user navigate to dashboard <text>

    Examples:
      | URL    | UserName    | PassWord   | text |
      | DL_URL | DL_username | DL_password |DL_savingstxt|

    @AdminLogin2
    Scenario Outline: Verify the fields and button names are correct in Login page
      Then user verify <Login> text is correct in Login page
      And user verify <paragraph> text is correct in Login page
      And user verify <Username_field> text is correct in Login page
      And user verify <Passcode_field> text is correct in Login page
      And user verify <Login_button> text is correct in Login page
      And user verify <forgot_password> link text is correct in Login page
      And user verify <Register_button> text is correct in Login page

     Examples:
      |Login      | paragraph |Username_field | Passcode_field | Login_button | forgot_password| Register_button |
      |Login_text |Login_paragraph_text | Username_field | Passcode_field | Login_button_text | forgot_password_text |Register_button_text |

      @AdminLogin3
      Scenario Outline: Verify User can see and hide the passcode by clicking on the show passcode button
        Given user type username <UserName>
        And user type password <PassWord>
        When I click on the Show PassCode button on PassCode field in Login page
        Then I can see the entered passcode on PassCode field in Login page
        When I click on the Show PassCode button on PassCode field in Login page
        Then I cannot see the entered passcode on PassCode field in Login page

        Examples:
        | Username | Passcode |
        | DL_username | DL_password |

      @AdminLogin4
      Scenario Outline: Verify the field validations are correct in Login page
        Then I click on UserName field in Login page
        When I click outside of the form in Login page
        Then The UserName field validation text is displayed in Login page
        And I click on PassCode field in Login page
        When I click outside of the form in Login page
        Then the PassCode field validation text is displayed in Login page
        Given user type username <UserName>
        Then The UserName field validation text is not displayed in Login page
        Given user type password <PassWord>
        Then The PassCode field validation text is not displayed in Login page

        Examples:
          | Username | Passcode |
          | DL_username | DL_password |

      @AdminLogin5
      Scenario Outline: Verify Login button enabling and disabling with given inputs for login fields
        Then I verify the Login button is disable in Login page
        Given user type username <UserName>
        Then I verify the Login button is disable in Login page
        Given user type password <PassWord>
        Then I verify the Login button is enable in Login page

        Examples:
          | Username | Passcode |
          | DL_username | DL_password |

      @AdminLogin6
      Scenario Outline: Verify user cannot login with invalid username and passcode to the application
        Given user type username <invalidUserName>
        And user type password <invalidPassWord>
        When user clicks login button
        Then The register user popup is displayed in Login page
        When I click on Not Now button on register user popup in Login page
        Then The Login page is loaded

        Examples:
          | invalidUsername | invalidPasscode |
          | DL_username_invalid | DL_password_invalid |

      @AdminLogin7
      Scenario Outline: Verify user cannot login with valid username and wrong passcode to the application
        Given user type username <UserName>
        And user type password <invalidPassWord>
        When user clicks login button
        Then The Login Incorrect popup is displayed in Login page
        When I click on Ok button on Login Incorrect popup in Login page
        Then The Login page is loaded

        Examples:
          | Username | invalidPasscode |
          | DL_username | DL_password_invalid |