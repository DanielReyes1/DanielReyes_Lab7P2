
package danielreyes_lab7p2;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class Barra extends Thread {
    private JProgressBar barra;
    private boolean estado;
    private double peso;

    public Barra(JProgressBar barra, double peso) {
        this.barra = barra;
        this.peso = peso;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        estado = true;
        while(estado == true){
            barra.setMaximum((int) peso);
            barra.setValue(barra.getValue()+ 10);
            if(barra.equals(barra.getMaximum())){
                estado = false;
            }
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
        }
    }
}
