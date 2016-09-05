import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author Ramón Samayoa
 */
public class Factory {
    public Set<String> getStackType (int seleccion){
        
        if(seleccion == 1){
            return new HashSet<String>();
        }
        
        else if(seleccion == 2){
            return new TreeSet<String>();
        }
        
        else if(seleccion == 3){
            return new LinkedHashSet<String>();
        }
        
        return null;
    }
}
