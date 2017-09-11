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
public abstract class Pile {
    
    
     
    
    //OI ABSTRACT AUTES METHODOI THA ULOPOIOUNTAI
    //SE KATHE PAIDI THS PILE ,ANALOGA ME TIS 
    //APAITHSEIS THS KATHE KLASHS
    //GENIKOTERA OMWS,ANTIPROSOPEUOUN :
    
    //THN EISODO MIAS KARTAS SE MIA STOIBA KAI
    public abstract void Put_Card(Card num);
    
    //THN EPISTROFH THS TIMHS THS TELEUTAIAS KARTAS
    //OPWS KAI THN AFAIRESH THS APTH STOIBA
    public abstract Card Remove_card();
}
