package SeguridadSocial;

import java.util.*;

public class SeguridadSocialTreeMap {
    private Map<String, Persona> personaMapDni = new TreeMap<>();
    private Map<String, Persona> personaMapSs = new TreeMap<>();

    public void altaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDni()) && !personaMapSs.containsKey(persona.getNumSS())) {
            //vincula la clave dni con la persona
            personaMapDni.put(persona.getDni(), persona);
            personaMapSs.put(persona.getNumSS(), persona);
        }
    }

    public void bajaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDni())) {
            //vincula la clave dni con la persona
            personaMapDni.remove(persona.getDni(), persona);
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
