/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        //StausUser t= new StausUser();
       // t.statusDetail(code); 
       
     //  StausUser st = StausUser.values();
       
       // code = code.toUpperCase();
       for(StausUser s: StausUser.values()){
               System.out.println(s + " Status is " + s.getSt());
       }
    }
}
