import java.util.Set;

/**
 *
 * @author Ramón Samayoa
 */
public class HashTable {
    //Se crea la clase Facory
    Factory factory = new Factory(); 
    
    // Se crean las variables a utilizar
    private Set<String> Conjunto;
    private Set<String> SubConjunto;
    private String ConjuntoMayor;
    
    
    //Constructor para inicizlizar los conjuntos y variables
    public HashTable(int seleccion){
        Conjunto = factory.getStackType(seleccion);
        SubConjunto = factory.getStackType(seleccion);
        ConjuntoMayor = "";
    }
    
    
    //Metodo para agregar un elemento al conjunto
    public void setTable(String elemento){
        Conjunto.add(elemento);
        
    }
    
    //Metodo para retornar el conjunto.
    public Set<String> getConjunto(){
        return Conjunto;
    }
    
    
    //Metodo que devuelve la interseccion de tres conjuntos
    public Set<String> InterseccionTriple(Set<String> conj1 ,Set<String> conj2, Set<String> conj3){
        SubConjunto.clear();
        SubConjunto.addAll(conj1);
        SubConjunto.retainAll(conj2);
        SubConjunto.retainAll(conj3);
        
        return SubConjunto;
    }
    
    
    //Metodo donde se ingresan dos conjuntos y se retorna todos los elementos de A que no estan contenidos en B
    public Set<String> Inclusion(Set<String> conj1, Set<String> conj2){
        SubConjunto.clear();
        SubConjunto.addAll(conj1);
        SubConjunto.removeAll(conj2);
        return SubConjunto;
    }
    
    
    //Metodo donde se ingresan dos conjuntos y se retorna la interseccion de ambos.
    public Set<String> InterseccionDoble(Set<String> conj1, Set<String> conj2){
        SubConjunto.clear();
        SubConjunto.addAll(conj1);
        SubConjunto.retainAll(conj2);
        return SubConjunto;
    }
    
    
    //Metodo donde se ingresan dos conjuntos y se retorna un conjunto con la union de estos dos
    public Set<String> Union(Set<String> conj1, Set<String> conj2){
        SubConjunto.clear();
        SubConjunto.addAll(conj1);
        SubConjunto.addAll(conj2);
        return SubConjunto;
    }
    
    
    //Metodo para determinar si un conjunto esta contenido en otro.
    public boolean VefSubConjunto(Set<String> conj1, Set<String> conj2){
        SubConjunto.clear();
        SubConjunto.addAll(conj1);
        SubConjunto.retainAll(conj2);
        
        if (SubConjunto.size() == conj1.size()){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    //Metodo que compara tres conjuntos y devuelve el conjunto mas grande.
    public Set<String> ConjuntoGrande(Set<String> conj1, Set<String> conj2, Set<String> conj3){
        SubConjunto.clear();
        if (conj1.size() >= conj2.size()){
            SubConjunto.addAll(conj1);
            ConjuntoMayor = "    Desarrolladores Java";
        }
        else if(conj2.size() >= conj1.size()){
            SubConjunto.addAll(conj2);
            ConjuntoMayor = "    Desarrolladores Web";
        }
        else if (SubConjunto.size() >= conj3.size()){
            return SubConjunto;
        }
        else{
           ConjuntoMayor = "    Desarrolladores Celulares";
           SubConjunto = conj3; 
        }
        System.out.println(ConjuntoMayor);
        return SubConjunto;
    }
    
    
    //Metodo para imprimir un conjunto de manera ascendente.
    public String PrintConjuntoAsc(Set<String> conj1){
        String cadena = conj1.toString();
        cadena=cadena.replace("]", "");
        cadena=cadena.replace("[", " ");
        cadena=cadena.replace(",", "\n");
        return cadena;
        
    }
}
