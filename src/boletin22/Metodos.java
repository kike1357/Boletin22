package boletin22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Metodos {
     ArrayList <Libros> lista= new ArrayList();
    
    public void crearArray(){
        Libros lib1= new Libros("LibroA","Pepe",50,15);
        Libros lib2=new Libros("LibroB","Jose",35,20);
        Libros lib3=new Libros("LibeoC","Manuel",22,30);
        Libros lib4=new Libros("LibroD","Almudena",17,40);
        lista.add(lib1);
        lista.add(lib2);
        lista.add(lib3);
        lista.add(lib4);
    }
     public void crearFichero(String nomeFich) {
        File f= new File(nomeFich);
        PrintWriter escribir=null;
        
        try {
            escribir=new PrintWriter(f);
            for(int i=0;i<lista.size();i++){
            escribir.println(lista.get(i));
            }      
      } catch (FileNotFoundException ex) {
            System.out.println("erro escritura"+ex.getMessage());
        }
        finally{
            escribir.close();
        }
        
    }
      public void leerFicheiro(String nomeFich){
        Scanner sc=null;
        try {
          
            File f= new File(nomeFich);
            sc=new Scanner(f);
            while(sc.hasNextLine()){
                String res=sc.nextLine();
                System.out.println(res);}
        } catch (FileNotFoundException ex) {
            System.out.println("erro na lectura do ficheiro"+ex.getMessage());
            
            }finally{
            sc.close();
        }
        
    }
      public void engadir(String nomeFich, Libros dato){
        FileWriter fw = null;
        PrintWriter escribir=null;
        
        try {
            fw = new FileWriter(nomeFich,true);//añadir si es false lo sobre escribe
            escribir=new PrintWriter(fw);
            //escribir.append("\n");            
            escribir.append(dato.toString());
            
        } catch (IOException ex) {
            System.out.println("Erro añadir datos"+ex.getMessage());
        }finally{
            try {
                fw.close();
                escribir.close();
            } catch (IOException ex) {
                System.out.println("Erro de pechado"+ex.getMessage());
            }
            
        }
        
    }
    
   
    public void consultarTitulo(){
        String res=JOptionPane.showInputDialog("Introduaca el titulo del libro");
        for(int i =0;i<lista.size();i++){
            if(lista.get(i).getNombre().equals(res))
                System.out.println("\n"+lista.get(i).toString()+"\n");
           }
    }
    public void eliminar(){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getUnidades()==0)
               lista.remove(i);
        }
    }
    public void modificar(){
        String res=JOptionPane.showInputDialog("Introduzca el titulo del libro");
        Float prezo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio"));
                for(int i =0;i<lista.size();i++){
            if(lista.get(i).getNombre().equals(res))
                lista.get(i).setPrecio(prezo);
            
        }
    }
    public void buscarAutor(){
        String acLibros="";
        String res=JOptionPane.showInputDialog("Introduzca el autor "); 
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getAutor().equals(res))
                acLibros+=lista.get(i).getNombre()+"\n";
        }
        System.out.println(acLibros);
    }

}


