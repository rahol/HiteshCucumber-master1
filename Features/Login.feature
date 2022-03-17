Feature: Login

  Scenario: Validate title of GCR shop site
    Given User launch chrome browser
    When User opens GCR shop site
    Then User verify the title of page
    And close browser


#  Scenario: Validate login with valid credential
#    Given User launch chrome browser
#    When User opens GCR shop site
#    Then User verify the title of page
#    When User click on Account button
#    And User enter Email as "xyz@gmail.com" and Password as "Hitesh@123"
#    And User click on SignIn button
#    Then Home page title should be "My Account Information"
#    When user click on logOff
#    Then Page title should be "Log Off"
#    And close browser



  Scenario Outline: Validate login with valid credential
    Given User launch chrome browser
    When User opens GCR shop site
    Then User verify the title of page
    When User click on Account button
    And User enter Email as "<username>" and Password as "<password>"
    And User click on SignIn button
    Then Home page title should be "<loggedInMessage>"
    When user click on logOff
    Then Page title should be "<LoggedOffMessage>"
    And close browser

    Examples:
      |username     |password  |loggedInMessage       |LoggedOffMessage|
      |xyz@gmail.com|Hitesh@123|My Account Information|Log Off|
 #     |abc@gmail.com|Hitesh@123|My Account Information|Log Off|