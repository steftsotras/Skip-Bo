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
public class Discardpile extends Pile{
    
    //DHLWSH THS STOIBAS DISCARDPILE
    Stack <Card> Discardpile;
    
    //DEFAULT CONSTRUCTOR
    public Discardpile(){
        Discardpile=new Stack <Card>();
    }
    
    //H SETVISIBILITY ALLAZEI TO VISIBILITY THS PRWTHS KARTAS
    public void SetVisibility(){
        Discardpile.get(0).visibility=true;
    }

    @Override
    public void Put_Card(Card num) {
        Discardpile.push(num);
    }

    @Override
    public Card Remove_card() {
        Card a=(Card) Discardpile.pop();
        return a;
    }
    
    
}
