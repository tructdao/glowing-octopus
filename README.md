#glowing-octopus
## Bayan Berri, Truc Dao, Arif Roktim

### Our Design

#### Ticket
First, we generically typed our ArrayPriorityQueue class and implemented the Comparable interface so that it would work with any object that is Comparable.
We then created the Ticket class which includes instance variables for the following:

* VIP level- This is how we will keep our Array Priority queue organized. It is a random number from 0 to 10. 0 being the highest priority.  

* ID number- This ID number is a number that shows the chronological order in which each of the tickets were added to the queue.

* Description- This is a description of the problem that the user is experiencing based on reader input. 
* Name- This will be the name of the person that is experiencing the problem and will be decided based on reader input.

* Solution Description

* Solved- This instance variable is a boolean and if it is true, then the problem has been solved and can be removed from the queue of tickets.

#### HelpDesk
After getting the Ticket class to compile and work with the Array Priority Queue class we began working on our implementation of HelpDesk. Help Desk includes these instance variables:
* Tickets- This is an ArrayPriorityQueue of type Ticket which will prioritize tickets with a lower integer VIP level value.
* numPpl- This instance variable will be used to assign ID numbers/ticket numbers because it will keep track of the chronological order each person visited the help desk.

### Embellishments

In addition to the basic design that we collaboratively developed in class, our implementation categorizes the problems into two categories, A)broken computer or B) inter net issues. Based on the problem our HelpDesk suggests solutions.  


