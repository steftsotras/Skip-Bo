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
public class Drawpile extends Pile{
    
    //DHLWSH METABLHTWN
    protected boolean check_Stockpiles;
    //DHLWSH THS STOIBAS DRAWPILE
    Stack <Card> Drawpile;
    
    //DEFAULT CONSTRUCTOR
    public Drawpile(){
        check_Stockpiles=false;
        Drawpile =new Stack <Card>();
    }
    
    //H ISEMPTY TSEKAREI AN H STOIBA EINAI KENH
    //KAI AN EINAI KANEI THN CHECK_STOCKPILES TRUE
    public void isEmpty(){
        if(Drawpile.empty())
            check_Stockpiles=true;
    }
    
    //EDW ULOPOIOUNTAI OI ABSTRACT METHODOI POU UPARXOUN SE
    //KATHE PAIDI THS PILE
    @Override
    public void Put_Card(Card num) {
        Drawpile.push(num);
    }

    @Override
    public Card Remove_card() {
        Card a=(Card) Drawpile.pop();
        return a;
    }
    
}
