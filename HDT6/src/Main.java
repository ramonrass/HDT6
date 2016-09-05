
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ramón Samayoa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seleccion = 0;
        int opcion = 0;
        
        System.out.println("Bienvenido al Programa\n Paso 1: Seleccionar la implementacion que se desea utilizar");
        
        while(seleccion == 0){
            System.out.print("    1. HashSet\n    2. TreeSet\n    3. LinkedHashSet\n  Ingrese la opcion: ");    
            opcion = sc.nextInt();
            
            if(opcion == 1){
                seleccion = 1;
                System.out.println("\n Se ha seleccionado HashSet...");
            }
            else if(opcion == 2){
                seleccion = 1;
                System.out.println("\n Se ha seleccionado TreeSet...");
            }
            else if(opcion == 3){
                seleccion = 1;
                System.out.println("\n Se ha seleccionado LinkedHashSet...");
            }
            else{
                System.out.println(" Ingrese una opcion valida...\n");
            }
        }
        
        System.out.println(" Paso 2: Ingresar a los desarrolladores");
        
        String nombre = "";
        String exp = "";
        String resp = "";
        boolean seguir = true;
        HashTable ConjJava = new HashTable(seleccion);
        HashTable ConjWeb = new HashTable(seleccion);
        HashTable ConjCel = new HashTable(seleccion);
        
        while(seguir == true){
            System.out.print("\n  Ingrese el nombre del desarrollador: ");
            nombre = sc.next();
            
            System.out.println("  Ingrese las opciones donde se ha tenido experiencia: [y/n]");
            
            System.out.print("   1. Java: ");
            exp = sc.next();
            if(exp.equals("y")){
                ConjJava.setTable(nombre);
            }
            
            System.out.print("   2. Web: ");
            exp = sc.next();
            if(exp.equals("y")){
                ConjWeb.setTable(nombre);
            }
            
            System.out.print("   3. Celulares: ");
            exp = sc.next();
            if(exp.equals("y")){
                ConjCel.setTable(nombre);
            }
            
            System.out.print("\n Desea ingresar otro desarrollador? [y/n]: ");
            resp = sc.next();
            if(resp.equals("n")){
                seguir = false;
            }
        }
        
        Set Conj1 = ConjJava.getConjunto();
        Set Conj2 = ConjWeb.getConjunto();
        Set Conj3 = ConjCel.getConjunto();
        
        
        System.out.print("\n RESULTADOS:\n");
        
        
        System.out.println("  1. Desarrolladores con Experiencia en Java, Web y Celulares:");
        System.out.println("     "+ConjJava.InterseccionTriple(Conj1, Conj2, Conj3));
        
        
        System.out.println("  2. Desarrolladores con Experiencia en Java y Celulares:");
        System.out.println("     "+ConjJava.InterseccionDoble(Conj1, Conj3));
        
        
        System.out.println("  3. Desarrolladores con Experiencia en Web y Celulares:");
        System.out.println("     "+ConjJava.InterseccionDoble( Conj2, Conj3));
        
        
        System.out.println("  4. Desarrolladores con Experiencia en Web o Celulares:");
        System.out.println("     "+ConjJava.Union( Conj2, Conj3));
        
        
        if (ConjJava.VefSubConjunto(Conj1, Conj2) == true){
            System.out.println("  5. Los Desarrolladores Java SI son un subconjunto de los Desarrolladores Web");
        }
        else{
            System.out.println("  5. Los Desarrolladores Java NO son un subconjunto de los Desarrolladores Web");
        }
        
        
        System.out.println("  6. Conjunto con mayor cantidad de Desarrolladores:");
        System.out.println("     "+ConjJava.ConjuntoGrande(Conj1, Conj2, Conj3));
        
        
        System.out.print("     ");
        ConjJava.PrintConjuntoAsc(ConjJava.ConjuntoGrande(Conj1, Conj2, Conj3));
    }
    
}
