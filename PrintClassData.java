import java.util.*;
/*
Project: Print Class Data.
Purpose: This program is meant to calculate and print info from the EnrollData
         Class.
Author : Usher Lib.
*/

//Header Class
public class PrintData {


    public static void main(String[] args) 
    {
// Declare and assign a reference to the string object.         
        String[] names = {"Mary Cooper      ", "Sean Williams    ", "Matthew Johnson  ", 
            "Jane Brown       ", "Emily Parker      "};

// Declare and assigns data types and arrays.
        int tuition = 2500;
        final short[] credits = {3, 4, 4, 5, 5};
        final long[] cap = {25, 45, 50, 35, 15};
        final int[] enrolled = {10, 25, 30, 18, 8};
        int classId = 2990;
        double holdAmount = 0;
        
// Declare and assigns an ArrayList and calling constructors.        
        ArrayList array = new ArrayList<EnrollData>();
        
        array.add(new EnrollData(names));
        array.add(new EnrollData(cap, enrolled));
        array.add(new EnrollData(tuition));
        array.add(new EnrollData(credits));
        array.add(new EnrollData(holdAmount));
   
       
// Print the data header.
        System.out.print("Class\t" + "Instructor" 
        + "\tCredits" + "\tCapacity" + "\tEnrollment" + "\tAvailable Seats" 
                + "\tEnrollment Tuition");
        
// Created a for loop to print data.
// Declare and assign a reference to an 
// object while also calling methods.
        for(int index = 0; index < array.size(); index++)
        {
         
            EnrollData enrollRef = (EnrollData) array.get(index);
            
            enrollRef.setCost((credits[index] * enrolled[index]));
            enrollRef.setCapacity(cap, index);
            enrollRef.setCredits(credits, index);
            enrollRef.setEnrolled(enrolled, index);
            enrollRef.setNames(names, index);
            holdAmount += enrollRef.getCost();
            enrollRef.setSum(holdAmount);
            
            System.out.printf("\nCOP %d --- %s     %d \t     %d \t\t %d "
                    + "\t\t %d \t\t $%,.2f", (classId += 10),
                    enrollRef.getNames(), enrollRef.getCredits(),  enrollRef.getCapacity(), 
                    enrollRef.getEnrolled(), (cap[index] - enrolled[index]), 
                    enrollRef.getCost());
            
            
            if (index == 4)
            {
            System.out.printf("\n\nThe Total Enrollment Tuition "
                    + "for all classes is $%,.2f", enrollRef.setGetSum());
            }
        }
        
        
    }
    
}
