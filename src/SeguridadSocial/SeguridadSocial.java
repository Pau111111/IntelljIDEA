package SeguridadSocial;

import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {

        personasList = new ArrayList<>();

    }

// Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
//Esto es la leche

    //ALTA PERSONA
    public void altaPersona(Persona persona) {

        boolean repetida= false;

        for(Persona personaActual: personasList){
            if(personaActual.getDni().equals(persona.getDni()) || personaActual.getNumSS().equals(persona.getNumSS())){
                repetida = true;
                break;
            }
        }

        if(!repetida){
            personasList.add(persona);
        }
    }

    //BAJA PERSONA
    public void bajaPersona(String dni) {

        Persona aux = null;

        for(Persona personaActual: personasList){
            if(personaActual.getDni().equals(dni)){

                aux = personaActual;
                break;
            }
        }

        if(aux!=null){
            personasList.remove(aux);
        }
        //JAVA 8
      // personasList.removeIf(persona -> persona.getDni().equals(dni));
    }

    //OBTENER PERSONA POR DNI
    public Persona obtenerPersonaPorDNI(String dni) {

        for (Persona personaActual : personasList) {
            if (personaActual.getDni().equals(dni)) {
                //al hacer return ya sale del "for";
                return personaActual;

            }
        }
        return null;
    }

    //OBTENER PERSONA POR NUMERO SEGURIDAD SOCIAL
    public Persona obtenerPersonaPorNumSS(String numSS) {

        for (Persona personaActual : personasList) {
            if (personaActual.getNumSS().equals(numSS)) {
                //al hacer return ya sale del "for";
                return personaActual;

            }
        }
        return null;
    }

    //OBTENER PERSONA POR RANGO SALARIAL
        public List<Persona> obtenerPersonasRangoSalarial ( double min, double max){
            List<Persona> aux = new ArrayList<>();

            for (Persona personaActual : personasList) {
                if (personaActual.getSalario() >= min && personaActual.getSalario() <= max) {

                   aux.add(personaActual);

                }
            }
            return aux;
        }

    //OBTENER PERSONA MAYORES QUE
        public List<Persona> obtenerPersonasMayoresQue ( int edad){

            List<Persona> aux = new ArrayList<>();

            for (Persona personaActual : personasList) {
                if (personaActual.getEdad() > edad) {
                    //al hacer return ya sale del "for";
                    aux.add(personaActual);

                }
            }
            return aux;

        }

    //OBTENER TODAS
        public List<Persona> obtenerTodas () {

            List<Persona> aux = new ArrayList<>();

            for (Persona personaActual : personasList) {
                aux.add(personaActual);
            }
            return aux;
        }

        @Override

        public String toString () {

            return "SeguridadSocial.SeguridadSocial{" +

                    "personasList=" + personasList +

                    '}';

        }
}
