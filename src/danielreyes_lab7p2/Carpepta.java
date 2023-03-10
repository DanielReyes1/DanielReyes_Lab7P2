
package danielreyes_lab7p2;

import java.util.ArrayList;


public class Carpepta {
    private String nombre;
    private String link;
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Carpepta> carpetas = new ArrayList();

    public Carpepta() {
    }

    public Carpepta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Carpepta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpepta> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
