package CocheTaller;

import java.util.*;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7

    public Coche obtenerVehiculo(String matricula) {
        for(Coche coche: coches){
            if(coche.getMatricula().equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    public void eliminarVehiculo(String matricula) {
        Coche aux=null;
        for(Coche coche_actual: coches){
            if(coche_actual.getMatricula().equals(matricula)){
                aux = coche_actual;
            }
        }
        if(aux!=null) {
            coches.remove(aux);
        }
    }

    public Coche obtenerVehiculoPrecioMax(double max) {

        Coche coche_max=null;

        for (Coche coche_actual : coches) {
            if (coche_actual.getPrecio() >= max) {
                coche_max=coche_actual;
            }
        }
        if(coche_max!=null) {
            return coche_max;
        }
        return null;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {
        List<Coche> aux = new ArrayList<>();

        for(Coche coche_actual: coches){
            if(coche_actual.getMarca().equals(marca)){
                aux.add(coche_actual);
            }
        }
        return aux;
    }

    public List<Coche> obtenerTodos() {
        List<Coche> aux = new ArrayList<>();

        for (Coche cocheActual : coches) {
            aux.add(cocheActual);
        }
        return aux;
    }
}
