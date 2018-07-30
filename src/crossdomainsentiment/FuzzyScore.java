/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossdomainsentiment;

/**
 *
 * @author ADMIN
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.UIManager;

/**
 * A matching algorithm that is similar to the searching algorithms implemented in editors such
 * as Sublime Text, TextMate, Atom and others.
 *
 * <p>
 * One point is given for every matched character. Subsequent matches yield two bonus points. A higher score
 * indicates a higher similarity.
 * </p>
 *
 * <p>
 * This code has been adapted from Apache Commons Lang 3.3.
 * </p>
 *
 * @since 1.0
 */
public class FuzzyScore
   {
      public static void main(String[] args) throws FileNotFoundException, IOException
      {
   	 Scanner in = new Scanner(System.in);
    
   	 String T, P, cand;
   	 int pos;
String filename11="C:/Users/ADMIN/Documents/Txt files/1a.txt";
                        //System.err.println("filename11 ::"+filename11);
InputStream iss = new FileInputStream(filename11);
BufferedReader buff = new BufferedReader(new InputStreamReader(iss));
        
String line1 = buff.readLine();
StringBuilder sbb = new StringBuilder();

while(line1 != null){
   sbb.append(line1).append("\n");
   line1 = buff.readLine();
}
       String TT = sbb.toString();
                        System.err.println("TT :"+TT);
                        
String filename111="C:/Users/ADMIN/Documents/Txt files/1b.txt";
                      //  System.err.println("filename11 ::"+filename111);
InputStream issa = new FileInputStream(filename111);
BufferedReader buffa = new BufferedReader(new InputStreamReader(issa));
        
String line1a = buffa.readLine();
StringBuilder sbba = new StringBuilder();

while(line1a != null){
   sbba.append(line1a).append("\n");
   line1a = buffa.readLine();
}

String PP=sbba.toString();
          System.err.println("PP :"+PP);
   	 
    
   	 for ( pos = 0; pos <= TT.length() - PP.length(); pos++ )
   	 {
   	    cand = TT.substring( pos, pos+PP.length()-1 );  // Try to match this...
            //System.err.println("cand :"+cand);
   	    if ( PP.contains(cand))
   	    {
   	       System.out.println("Found pattern at posistion: " + pos); // Found     
   	    }
            else
            {
                //System.err.println("no");
            }
   	 }
      }
   }