import java.util.HashMap;
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

    public Persona obtenerPersonaPorDNI(String dni) {
        //personaMapDni.key();
        //personaMapDni.values();
        //personaMapDni.remove();
        return personaMapDni.get(dni);
    }

}
