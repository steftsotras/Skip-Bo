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
public class Card {
    
    //DHLWSH METABLHTWN
    protected int number;
    protected boolean visibility;
    
    //DEFAULT CONSTRUCTOR
    public Card(){
        number=0;
        visibility=false;
    }
    
    //CONSTRUCTOR POU DEXETAI TON
    //ARITHMO THS KARTAS
    public Card(int number){
        this.number=number;
    }
}
