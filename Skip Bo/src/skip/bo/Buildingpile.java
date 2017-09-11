/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skip.bo;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Chris
 */
public class Buildingpile extends Pile{
    
    //DHLWSH THS STOIBAS BUILDINGPILE
    Stack <Card> Buildingpile;
    
    //DEFAULT CONSTRUCTOR
    public Buildingpile(){
        Buildingpile =new Stack <Card>();
    }
    
    //H SETVISIBILITY ALLAZEI TO VISIBILITY THS PRWTHS KARTAS
    public void SetVisibility(){
        Buildingpile.get(0).visibility=true;
    }
    
    public void isFull(){
        
    }

    @Override
    public void Put_Card(Card num) {
        
        if(Buildingpile.empty()){
            if(num.number==1){
                Buildingpile.push(num);
            }
            else if(num.number==14){
                String Number=JOptionPane.showInputDialog("Give one number from 1-12");
                int numnum=Integer.parseInt(Number);
                while(numnum<1 || numnum>12){
                    Number=JOptionPane.showInputDialog("Give one number from 1-12");
                    numnum=Integer.parseInt(Number);
                }
                num.number=numnum;
                Buildingpile.push(num);
            }
            else if(num.number==13){
                num.number=1;
                Buildingpile.push(num);
            }
        }
        else{
            int previous=Buildingpile.get(Buildingpile.size()-1).number;
            if(num.number==13 || num.number==14){
                num.number=previous+1;
                Buildingpile.push(num);
            }
            else if(num.number==15){
                Buildingpile.clear();
            }
            else if(num.number-1==previous){
                Buildingpile.push(num);
            }
        }
    }

    @Override
    public Card Remove_card() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
