/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabookingsystem;

/**
 *
 * @author akboir
 */
public abstract class Ticket {
    protected int price;
    protected int quant;
    
    
     //Mutators
    public abstract void setP(int p);
    
    public abstract void setQ(int q);
    
    //Accessors
    public abstract int getPrice();
    
    public abstract int getQuant();
    
    
    
}
