# Cash Register - Scanner

Design and implement a cash register application that scans item and calculates prices.
Further define requirements, assumptions, etc. with group...
Constraints: Don't have to worry about keypad input, screen, external hardware.
Focus shoud be class level taking in scanned items and accumulating a total and receipt.

Public Interface:
Adding:
- SKU
- Quantity

Deleting:
- SKU
- Quantity

Receipt format: TBD

Pricing Scenarios:
- Regular price
- Buy 1 get one free
- Buy 1 get one 50% off
- Buy 1 get one for [fixed price]
- Buy 1 for 2.00 buy 10 for 15.00
- Buy 2 get third free
- Buy 2 get three MORE free (total of 5)
- Discount for one

Bonus:
- Buy [scenarios] get "money" back

Bonus:
- Buy 2 of [scenario (category or brand)] reap benefits [scenario] (save, rebate, etc)

Questions/Consideration:
- Weight vs count

- Keep classes small (single responsibility) and simple to understand!!!
- Abstraction and encapsulation!
- Testability
- Keep in mind that what we have defined here is only PART of this system!!! Is there anything else that should be taken into consideration? What else not listed here could affect design and implementation?

1. First pass is class structure. No real functionality.


