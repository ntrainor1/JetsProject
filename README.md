# JETS PROJECT

## Skill Distillery - Week 2

### Project Description

This program is designed to create an array of jets which the user can access, examine, and execute certain methods with. Comments throughout to guide programmer through program progress in addition to README.md.

Technologies Used:

 - Objects in Classes
 - Object Initialization
 - Inheritance in Java
 - Polymorphism
 - Abstract Classes
 - Interfaces
 - Primitive-Type Wrapper Classes

### Project Operation

1. This program begins by welcoming the user and presenting them with a menu with options.

2. The scanner will interpret the first character of the user'sinput and generate an answer according to the available options. If the first character does not respond to an appropriate option, the user is asked to input a correct option and is taken back to the menu.

3. If you press option 1, it allows the user to see the entire fleet of jets on the airfield, displaying their specifications.

4. If you press option 2, it calls the fly() method on the entire fleet of jets, showing the time and distance they would be able to cover before running out of fuel.

5. If you press option 3, it displays the fastest jet in the fleet.

6. If you press option 4, it displays the jet with the longest range in the whole fleet.

7. If you press option 5, it allows the user to add their own custom jet to the fleet, to choose whether it is a regular jet, a fighter jet, or a cargo jet, as well as other specifications. The jet will then appear, if the user chooses to list the fleet again.

8. If you press option 6, the user can start a dog-fight which calls up ONLY the fighter jets in the fleet.

9. If you press option 7, the user can call up ONLY the cargo jets in the fleet and load them up.

9. If you press option 8, the program will tell the user "GOODBYE" and ends.

### Lessons Learned

 - The order in which you put your "if" statements matter!
 - DecimalFormat allows you to control how many decimal places a certain number runs to.
 - There's a big difference between next() and nextLine() if your model name is multiple words!
 - Pressing the enter button with the Scanner without inputting anything else causes Java to treat it as "" and not as null.