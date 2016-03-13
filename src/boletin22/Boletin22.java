package boletin22;


public class Boletin22 {

    
    public static void main(String[] args) {
        Metodos obx=new Metodos();   
        obx.crearArray();
        obx.crearFichero("Libreria.txt");
        obx.leerFicheiro("Libreria.txt");
        obx.engadir("Libreria.txt",new Libros("Libro5","Pepe",5f,5));
        obx.buscarAutor();
        obx.consultarTitulo();
        obx.modificar();
        obx.eliminar();
       
    }
    }
 
