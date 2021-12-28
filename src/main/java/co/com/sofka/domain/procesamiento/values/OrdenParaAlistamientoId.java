package co.com.sofka.domain.procesamiento.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.procesamiento.OrdenParaAlistamiento;

public class OrdenParaAlistamientoId extends Identity {

    public OrdenParaAlistamientoId(String uuid) {
        super(uuid);
    }

    public OrdenParaAlistamientoId() {
    }

    public static OrdenParaAlistamientoId of(String uuid){
        return new OrdenParaAlistamientoId(uuid);
    }
}