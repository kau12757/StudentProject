/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 *store and print student details
 * view class - user interaction
 * @author kamal
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // store and print 3 student details
        Student[] list= new Student [3];  //stores student object , no. of objects=3
        
        Student s1= new Student();  //object s1 created
        Student s2= new Student();
        Student s3= new Student();
        s1.setName("Peter");
        s1.setSid(23);
        s2.setName("John");
        s2.setSid(30);
        s3.setName("Riya");
        s3.setSid(20);
        
        //store object in array ---> Array of objects
        list [0]=s1;
        list [1]=s2;
        list [2]=s3;
        
        for(int i=0; i<list.length; i++)
        {
        System.out.println(list[i].getName()+" "+list[i].getSid());
        }
    }
    
}
