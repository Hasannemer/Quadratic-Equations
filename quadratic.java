
package Assignment_2;

import java.util.Scanner;

/*
(Algebra: quadratic equations) Design a class named QuadraticEquation for a quadratic
equation a𝑥
2 + bx + c = 0. The class contains:
a. Private data fields a, b, and c that represent three coefficients.
b. A constructor for the arguments for a, b, and c.
c. Three get methods for a, b, and c.
d. A method named getDiscriminant() that returns the discriminant, which is b^2 -4ac
e. The methods named getRoot1() and getRoot2() for returning two roots of the equation 
*/


class QuadraticEquation{
   private double a,b,c;
    
  QuadraticEquation(double a1,double b1,double c1){
      a=a1;
      b=b1;
      c=c1;
  }
  double getA(double n){
  a=n;
  return a;
  }
  double getB(double n){
  b=n;
  return b;
  }
  double getC(double n){
  c=n;
  return c;
  }
  double getDiscriminant(){
  double delta=((Math.pow(b,2))-(4*a*c));
  return delta;
  }
  double getRoot1(){
  return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
  }
  double getRoot2(){
  return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
  }
   
}

class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b and c : ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        QuadraticEquation q=new QuadraticEquation(a,b,c);
        double d=q.getDiscriminant();
        if (d==0) {
            System.out.println("the root is "+q.getRoot1());
        }
        else if (d>0) {
            
            System.out.println("the 1st root is "+q.getRoot1());
            System.out.println("the 2nd root is "+q.getRoot2());
        }
        else if (d<0) {
            System.out.println("The equation has no roots.");   
        }
      
                
    }
}


