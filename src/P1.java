
import javax.swing.JProgressBar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rubens
 */
public class P1 implements Runnable{
    JProgressBar P1;
    int i;
public P1 (JProgressBar Barp1){
 this.P1 = Barp1;   
}

    public void run() {
       for(i=0; i<=100; i++) {
           System.out.println("Proceso tal ejecutandose");           
       }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }      
}