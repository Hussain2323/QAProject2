
import cinemabookingsystem.Ticket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ChildTicket  extends Ticket {
    
      public ChildTicket() {
      price = 4;
    }
    
    @Override
    public void setP(int p) {
        price = p;
    }
    
    @Override
    public void setQ(int q) {
        quant = q;
    }
     
    
    //Accessors
    @Override
    public int getPrice() {
        return price;
    }
    
    @Override
    public int getQuant() {
        return quant;
    }
    
    
}
