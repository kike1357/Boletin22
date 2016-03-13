package boletin22;

import java.util.ArrayList;


public class Libros {
    
    private static ArrayList<Metodos>libros= new ArrayList();
    private String nombre;
    private String autor;
    private float precio;
    private int unidades;
    
    public Libros(String nome,String autor,float prezo, int unidades){
        this.nombre=nome;
        this.autor=autor;
        this.precio=prezo;
        this.unidades=unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nome) {
        this.nombre = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float prezo) {
        this.precio = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Metodos> getLibreria() {
        return libros;
    }

    public void setLibreria(ArrayList<Metodos> libreria) {
        Libros.libros = libreria;
    }

    @Override
    public String toString() {
        return "Libro{" + "nome=" + nombre + ", autor=" + autor + ", prezo=" + precio + "€" + ", unidades=" + unidades + '}';
    }
    
    public int compareTo(Libros t) {
        if(this.nombre.compareTo(t.nombre)>0){
            return 1;
        }else if(this.nombre.compareTo(t.nombre)==0){
            return 0;
        }else{
            return -1;
        }
        }
        }

