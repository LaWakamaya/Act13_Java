/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act13java;

/**
 *
 * @author Alan Franco
 */
public class MyComparator implements java.util.Comparator<String>{
    
    public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    
}
