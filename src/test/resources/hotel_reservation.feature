Feature: Hotel Reservation

  Scenario: Reserve a hotel for 1 adult
    Given the user opens the hotel booking application
    When the user searches for hotels with the following information:
      | location | checkIn       | checkOut      | adults | rooms | children | ageChildren |
      | Cusco    | 12 March 2023 | 15 March 2023 | 1      | 1     | 1        | 5           |
    And the user completes the reservation form with the following details:
      | First Name | Last Name | Email               | Country  | Mobile Phone | Purpose  |
      | Jaime      | Velasquez | jimmy9625@gmail.com | Colombia | 3225225155   | Business |
    And the user completes the payment form with the following information:
      | Card Number      | Expiration Date | CCV |
      | 4970100000000014 | 02/25           | 122 |
    Then the system should confirm the reservation and display the total cost in USD ($4,423).

