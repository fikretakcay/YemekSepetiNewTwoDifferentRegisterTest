Feature:Register Test

  Scenario Outline: Create a new Account


    Given Navigate to website
    And choose city
    And click Sign in button
    And click email Text Box
    And type email "<Email>"
    And type password "<password>"
    And type passwordAgain
    And type firstname "<firstname>" and lastname "<lastname>"
    And type birthday "<birthday>"
    And clickDropDownForChooseAdress
    And choose address
    And click memberAgreementButton
    When click Sign up button
    Examples:
      | Email | password | firstname | lastname | birthday |

      |fikret_ant_29@hotmail.com|fik123|Fikret|Akcay|17.09.1995|
      |brandi_allan@gmail.com   |allan234|Brandy|Allan|12.05.1999|



