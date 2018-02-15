/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author hamkTeam4/deeqkko
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        yadda foo = new yadda();
        String teksti = "vajakki";
        foo.sendTCP(teksti);
        //System.out.println("Sisään " + foo.getSentence());
        System.out.println(foo.getModifiedSentence());
   
}
}

