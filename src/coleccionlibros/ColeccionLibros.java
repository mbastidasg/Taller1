/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionlibros;
import java.util.*;

/**
 *
 * @author ESTUDIANTE
 */
public class ColeccionLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        ConjuntoLibros conjunto = new ConjuntoLibros (10);
        Scanner in = new Scanner(System.in);
        int continuar = 1, opcion = 0;
        
        do{
            System.out.println("1. Anadir libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar informacion de la mayor y menor calificacion");
            System.out.println("4. Mostrar informacion de un libro");
            opcion = in.nextInt();
            if(opcion == 1){
                System.out.println("Ingrese el nombre del libro");
                String Titulo = in.next();
                System.out.println("Ingrese el nombre del autor del libro");
                String autor = in.next();
                System.out.println("Ingrese el numero de paginas que tiene el libro");
                int numPags= in.nextInt();
                System.out.println("Ingrese la calificacion que merece el libro");
                int calificacion= in.nextInt();
                boolean resultado = conjunto.anadir(Titulo, autor, numPags, calificacion);
                if(resultado == true){
                    System.out.println("Se ha añadido satisfactoriamente el libro");
                }else{
                    System.out.println("Problemas al añadir el libro");
                }
    }
            if (opcion == 2){
                System.out.println("Ingrese el titulo o  del libro que desea eliminar");
                String Titulo  = in.next();
                System.out.println("Ingrese el autor");
                String autor = in.next();
                boolean resultado2 = conjunto.eliminar(Titulo, autor);
                if(resultado2 == true){
                    System.out.println("Se ha eliminado satisfactoriamente el libro");
                }else{
                    System.out.println("Problemas al eliminar el libro");
                }
            }
            if (opcion == 3){
               Libros libro=conjunto.mostrarMM(Titulo, opcion);
            }
    
}
}
}
