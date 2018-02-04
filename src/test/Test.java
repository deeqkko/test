/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Calendar;

/**
 *
 * @author hamkTeam4/deeqkko
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        yadda y1 = new yadda();
        Calendar cal = Calendar.getInstance();
        
        // TODO code application logic here
        System.out.println("That was fun wasn't it?");
        y1.setYadda(3);
        System.out.println("This yadda is worth " + y1.getYadda());
        
        java.util.Date now = cal.getTime();
        System.out.println(cal.getTime());
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        System.out.println(currentTimestamp);
        // Fooling around with a timestamp
    }   // Just some yadda-yadda code
    
    
}
