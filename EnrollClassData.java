import java.util.*;
/*
Project: Print Class Data.
Purpose: This program is meant to calculate and retrieve info from the PrintData
         Class. This class contains six fields, five constructors and eleven methods.
Author : Usher Lib.
*/

//Header Class
public class EnrollData 
{
    //Created six private fields that are meant to hold data.
    private String instructors;
    private double enrollCost;
    private int credits;
    private long capacity;
    private int enroll;
    private double costTotal;
    
    
// Created constructors demonstrating each fields purpose.
// Created five to be used for an ArrayList size declarator.
    public EnrollData(String[] name)
    {
        instructors = name[0];
    }
    public EnrollData(int cost)
    {
        enrollCost = cost;
    }
    
    public EnrollData(long[] available, int[] taken)
    {
        capacity = available[0];
        enroll = taken[0];
    }
    public EnrollData(short[] numbers)
    {
        credits = numbers[0];
    }
    public EnrollData(double amount)
    {
        costTotal = 0;
    }
    
/** The setCost method sets the tuition cost again and 
 * initialize the cost with a combined assignment operator.
 * @param cost switched argument to double. It holds 
 * two arrays multiplication total.
 */
    public void setCost(double cost)
    {
        enrollCost = 2500.00;
        enrollCost *= cost;
    }
/** The setNames method sets the names 
 * of the instructors using an increment
 * @param names has access to an array with names.
 * @param index holds each increment value.
 */
    public void setNames(String[] names, int index)
    {
        instructors = names[index];
    }
/** The setCredits method sets the credits using an increment
 * @param cred has access to an array with values.
 * @param index holds each increment value.
 */
    public void setCredits(short[] cred, int index)
    {
        credits = cred[index];
    }
/** The setCapacity method sets the capacity using an increment
 * @param cap has access to an array with values.
 * @param index holds each increment value.
 */
    public void setCapacity(long[] cap, int index)
    {
        capacity = cap[index];
    }
    
    public void setSum(double amount)
    {
        costTotal = amount;
    }
/** The setEnrolled method sets the value of enrollment using an increment
 * @param enrollment has access to an array with values.
 * @param index holds each increment value.
 */
    public void setEnrolled(int[] enrollment, int index)
    {
        enroll = enrollment[index];
    }
/** The getCredits method retrieves the value in the credits field
 * @return credits returns the value.
 */
    public int getCredits()
    {
        return credits;
    }
/** The getCapacity method retrieves the value in the capacity field
 * @return capacity returns the value.
 */
    public long getCapacity()
    {
        return capacity;
    }
/** The getEnrolled method retrieves the value in the enroll field
 * @return enroll returns the value.
 */
    public int getEnrolled()
    {
        return enroll;
    }
/** The getCost method retrieves the value in the enrollCost field
 * @return enrollCost returns the value.
 */
    public double getCost()
    {
        return enrollCost;
        
    }
/** The getNames method retrieves the names in the enrollCost field
 * @return instructors returns the value.
 */
    public String getNames()
    {
        return instructors;
    }
/** The setGetSum method retrieves the value from the getCost method
 * @return costTotal returns the value.
 */
    public double setGetSum()
    {
        costTotal += getCost();
        return costTotal;
    }
    
 
}
