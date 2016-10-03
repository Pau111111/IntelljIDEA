import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeguridadSocialHashMap {
    private Map<String, Persona> personaMapDni = new HashMap<>();
    private Map<String, Persona> personaMapSs = new HashMap<>();

    public void altaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDni()) && !personaMapSs.containsKey(persona.getNumSS())) {
            //vincula la clave dni con la persona
            personaMapDni.put(persona.getDni(), persona);
            personaMapSs.put(persona.getNumSS(), persona);
        }
    }

    public void bajaPersona(String dni) {
        if (!personaMapDni.containsKey(dni)) {
            //vincula la clave dni con la persona
            Persona persona = personaMapDni.get(dni);
            personaMapSs.remove(dni);
            personaMapDni.remove(persona.getNumSS());
        }
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        //personaMapDni.key();
        //personaMapDni.values();
        //personaMapDni.remove();
        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        //personaMapDni.key();
        //personaMapDni.values();
        //personaMapDni.remove();
        return personaMapSs.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial (double min, double max){
        List<Persona> aux = new ArrayList<>();

        for (Persona persona : personaMapDni.values()) {
            if (persona.getSalario() >= min && persona.getSalario() <= max) {
                aux.add(persona);
            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue ( int edad){

        List<Persona> aux = new ArrayList<>();

        for (Persona persona : personaMapDni.values()) {
            if (persona.getEdad() > edad) {
                //al hacer return ya sale del "for";
                aux.add(persona);
            }
        }
        return aux;
    }

    public List<Persona> obtenerTodas () {

        List<Persona> aux = new ArrayList<>();

        for (Persona persona : personaMapDni.values()) {
            aux.add(persona);
        }
        return aux;
    }
}
