/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and /open the template in the editor.
 */
package excpciones;

import java.util.Date;

/**
 *
 * @author Frank
 */
public class Excpciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aritmeticException();
        arrayException();
    }
    public static void aritmeticException(){
       try{
        int i = 5/0;
    }
       catch(ArithmeticException ex){
           System.out.println("Error al dividir entre cero");
       }
}
    public static void arrayException (){
     try{ 
int numero[]=new int[5];
  numero[7]=0;
}
     catch(ArrayIndexOutOfBoundsException ex){
         System.out.println("Se genero una excepcion al acceder al arreglo");
     }
} 
  public static void classcastException (){
     try{ 
    Object fecha = new Date();
Integer numero = (Integer)fecha;
}
  
     catch(ClassCastException ex){
         System.out.println("No puedes comvertir el arreglo de uno a otro");
     }  
}

    private static void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void go() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

