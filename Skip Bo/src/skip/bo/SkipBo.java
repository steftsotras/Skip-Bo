/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skip.bo;
import java.util.*;
/**
 *
 * @author Chris
 */
public class SkipBo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Card card;    
    Initialpile a =new Initialpile();
    Stockpile b=new Stockpile();
    Buildingpile c=new Buildingpile();
    
    a.Create_initial_stack();
    
    for(int i=0;i<15;i++){
        
        b.Put_Card(a.Remove_card());
    }
    
    c.Put_Card(new Card(1));
    c.Put_Card(new Card(2));
    //c.Put_Card(new Card(15));
    
    //for(int i=0;i<5;i++){
        System.out.println(c.Buildingpile.get(0).number);
    //}
    //for(int i=0;i<40;i++)
     //   System.out.println(a.initial_stack.get(i));
    }
    
}
