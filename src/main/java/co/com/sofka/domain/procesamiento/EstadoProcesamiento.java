package co.com.sofka.domain.procesamiento;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generics.Fecha;
import co.com.sofka.domain.procesamiento.values.EstadoProcesamientoId;
import co.com.sofka.domain.procesamiento.values.EstadoProcesamientov;
import co.com.sofka.domain.procesamiento.values.ProcesamientoId;

public class EstadoProcesamiento extends Entity<EstadoProcesamientoId> {

    private Fecha fecha;
    private EstadoProcesamientov estadoProcesamientov;


    public EstadoProcesamiento(
            EstadoProcesamientoId entityId,
            Fecha fecha,
            EstadoProcesamientov estadoProcesamientov) {
        super(entityId);
        this.fecha = fecha;
        this.estadoProcesamientov = estadoProcesamientov;
    }


    public void modificarEstadoProcesamiento(
            EstadoProcesamientov estadoProcesamientov){
        this.estadoProcesamientov=estadoProcesamientov;
    }

    public Fecha fecha() {
        return fecha;
    }

    public EstadoProcesamientov estadoProcesamiento() {
        return estadoProcesamientov;
    }

}
