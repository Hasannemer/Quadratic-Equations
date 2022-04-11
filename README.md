# Quadratic-Equations
 A program that solves quadratic  equation a𝑥^2 + bx + c = 0
/////////////////////////////////////////////////////////////
(Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic 
equation a𝑥^2 + bx + c = 0. The class contains: 
a. Private data fields a, b, and c that represent three coefficients. 
b. A constructor for the arguments for a, b, and c. 
c. Three get methods for a, b, and c. 
d. A method named getDiscriminant() that returns the discriminant, which is 𝑏^2 − 4𝑎𝑐
e. The methods named getRoot1() and getRoot2() for returning two roots of the equation 
𝑟1 =−𝑏+√𝑏2−4𝑎𝑐 / 2𝑎
𝑟2 =−𝑏−√𝑏2−4𝑎𝑐 / 2𝑎
These methods are useful only if the discriminant is nonnegative. Let these methods return 
0 if the discriminant is negative. Draw the UML diagram for the class and then implement 
the class. Write a test program that prompts the user to enter values for a, b, and c and 
displays the result based on the discriminant. If the discriminant is positive, display the two 
roots. If the discriminant is 0, display the one root. Otherwise, display “The equation has no 
roots.”
