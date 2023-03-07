Feature: Hotel Reservation

  Scenario Outline: Successful Hotel Reservation
    Given the user opens the hotel booking application
    When the user searches for their desired <location> and selects the <checkIn> and <checkOut> dates
    And selects <rooms>  and <adults> adults
    And enters the age of any accompanying children <childrenAge>
    And searches for the <hotelName>
    And completes the reservation form with the following details:
      | firstName   | lastName   | email   | country   | mobilePhone   | purpose   | city   | zipCode   | addres             |
      | <firstName> | <lastName> | <email> | <country> | <mobilePhone> | <purpose> | <city> | <zipCode> | Carrera 47 44 a 41 |
    And completes the payment form with the following information:
      | cardNumber   | expirationDate   | holderName  |
      | <cardNumber> | <expirationDate> | <firstName> |
    Then the system should confirm the reservation and display the total cost in US$1,403

    Examples:
      | location | checkIn       | checkOut      | rooms | adults | childrenAge | hotelName                                   | firstName | lastName  | email               | country  | mobilePhone | purpose  | city     | zipCode | cardNumber    | expirationDate |
      | Cusco    | 12 April 2023 | 14 April 2023 | 1     | 2      | 5           | Palacio del Inka, a Luxury Collection Hotel | Jaime     | Velasquez | jimmy9625@gmail.com | Colombia | 3225225155  | business | Medellin | 5004    | 5004485221155 | 12/28          |

