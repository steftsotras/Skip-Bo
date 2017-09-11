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
public class Stockpile extends Pile{
    
    //DHLWSH METABLHTWN
    protected boolean win=false;
    //DHLWSH THS STOIBAS STOCKPILE
    Stack <Card> Stockpile;  
    
    //DEFAULT CONSTRUCTOR
    public Stockpile(){
        win=false;
        Stockpile =new Stack <Card>();
    }
    
    //H SETVISIBILITY ALLAZEI TO VISIBILITY THS PRWTHS KARTAS
    public void SetVisibility(){
        Stockpile.get(0).visibility=true;
    }
    
    //H ISEMPTY TSEKAREI AN H STOIBA EINAI KENH
    //KAI AN EINAI KANEI THN WIN TRUE
    public void isEmpty(){
        if(Stockpile.empty())
            win=true;
    }
    
    //H SHOWCARDSLEFT DEIXNEI POSES KARTES EXOUN MEINEI STH STOIBA
    public void ShowCardsLeft(){
        System.out.println("Cards Left :"+Stockpile.size());
    }

    //EDW ULOPOIOUNTAI OI ABSTRACT METHODOI POU UPARXOUN SE
    //KATHE PAIDI THS PILE
    @Override
    public void Put_Card(Card num) {
        Stockpile.push(num);
    }

    @Override
    public Card Remove_card() {
        Card a=(Card) Stockpile.pop();
        return a;
    }
    
    
}
