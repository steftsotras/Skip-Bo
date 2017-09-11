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
public class Initialpile extends Pile{
    
    //DHLWSH THS STOIBAS INITIALSTACK
    Stack <Card> initial_stack =new Stack <Card>();
    
    public void Create_initial_stack(){
        int j=1;
        for(int i=0;i<24;i++){
            if(j==13)
                j=1;
            initial_stack.push(new Card(j));
            j++;
        }       
        j=13;
        for(int i=0;i<8;i++){
            initial_stack.push(new Card(j));
        }
        j=14;
        for(int i=0;i<4;i++){
            initial_stack.push(new Card(j));
        }
        j=15;
        for(int i=0;i<4;i++){
            initial_stack.push(new Card(j));
        }
    }

    @Override
    public void Put_Card(Card num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Card Remove_card() {
        int randnum;
        Random tyxaioi=new Random();
        randnum=tyxaioi.nextInt(initial_stack.size());
        
        Card a= initial_stack.get(randnum);
        initial_stack.remove(randnum);
        return a;
    }
}
