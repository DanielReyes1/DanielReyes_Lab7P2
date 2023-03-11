
package danielreyes_lab7p2;

import java.io.Serializable;
import javax.swing.JTree;


public class Binario implements Serializable {
    private JTree arbolito;

    public Binario(JTree arbolito) {
        this.arbolito = arbolito;
    }

    public JTree getArbolito() {
        return arbolito;
    }

    public void setArbolito(JTree arbolito) {
        this.arbolito = arbolito;
    }

    @Override
    public String toString() {
        return "Binario{" + "arbolito=" + arbolito + '}';
    }
    
    
}
