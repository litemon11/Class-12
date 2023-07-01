/*Page 465; 26 Program 12.9
A super class Worker has been defined to store the details of a worker. Define a subclass Wages to compute
the monthly wages for the worker. The details/specifications of bouth the classe are given below.

    Class Name       :                            Worker
Data Members/instance variables:
    Name             :    to store the name of the worker
    Basic            :    to store the basic pay in decimals
Member functions:
    Worker(...)      :    Parameterised constructor to assign values to the instance variables
    void display()   :    display the workers details

    Class name       :                            Wages
Data Members/instance variables:
    hrs              :    stores the hourse worked
    rate             :    stores rate per hour
    wages            :    stores the overall wage of the worker
Member functions:
    Wages(...)       :    Parameterised constructor to assign values to the instance variables of both
                          the classes
    double overtime():    Calculates and returns the overtime amount as (hours*rate)
    void display.    :    Calculates the wage using the formula wage = overtime amount + Basic pay
                          and display it along with the other details

Specify the class Worker giving details of the constructor() and void display(). Using the concept of
inheritance specify the class Wages giving details of constructor(), double overtime() and void display().
The main() function need not be written.
*/
class Worker  {
    String Name;
    double Basic;
    Worker(String nm, double bas)  {
        Name = nm;
        Basic = bas;
    }
    void display()  {
        System.out.println("NAME :"+Name);
        System.out.println("BASIC :"+Basic);
    }
}
public class Wages extends Worker  {
    int hrs;
    double rate;
    double wage;
    Wages(String nm,double bas, int hr, double rt) {
        super(nm, bas);
        hrs = hr ;
        rate = rt ;
    }
    double overtime () {
        return hrs*rate ;
    }
    void display() {
        super.display() ;
        wage = overtime()+Basic;
        System.out.println("Hours worked :"+hrs) ;
        System.out.println("Rate : "+rate) ;
        System.out.println("Wage : "+wage) ;
    
    }
}
import java.util.*;
class Employee
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);

        String nm;
        int hr;
        double bas,rt;

        System.out.println("Enter name, Basic salary, Hours, and Rate");

        nm=in.nextLine();
        bas=Double.parseDouble(in.readLine());
        rt=Double.parseDouble(in.readLine());
        hr=Integer.parseInt(in.readLine());

        wages obj=new wages(nm,bas,hr,rt);//invokes the subclass constructor

        obj.display();
    }
}