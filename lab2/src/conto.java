
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ardizzone.pietro
 */
public class conto {
 int totale;
 int tasse = 100;

    public conto(int totale) {
        this.totale = totale;
    }
  synchronized void versa (int versa){
      totale = totale +versa - tasse;
  }
  synchronized int saldo(){
  return totale;
  }
 
}
