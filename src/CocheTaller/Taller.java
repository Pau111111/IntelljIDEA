package CocheTaller;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Taller {
    //en el treemap el primer valor es la KEY i el segon es el value
                //-key   -value
    private Map<Persona, Coche> reparaciones =
            new TreeMap<>(Comparator.comparing(Persona::getNumSS)); //aixo es java 1.8

    public void registrarReparacion(Persona persona, Coche coche){


            reparaciones.putIfAbsent(persona, coche);

    }


    public Coche obtenerCoche(Persona persona){
//al fer .get returna el value de la key
          return reparaciones.get(persona);

    }

    public Set<Persona> obtenerClientes(){

       return reparaciones.keySet();
    }
}

// aixo fa el mateix que "new TreeMap<>(Comparator.comparing(Persona::getNumSS));" pero amb java 1.7
//class PersonComparatorBySS implements Comparator<Persona>
//{
//    @Override
//    public int compare(Persona persona, Persona anotherPerson)
//    {
//        return persona.getNumSS().compareTo(anotherPerson.getNumSS());
//    }
//}


//Hashmap funciona més ràpid, el treemap ordena y el HashSet no permet repetir