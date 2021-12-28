package co.com.sofka.domain.procesamiento.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Fecha;
import co.com.sofka.domain.procesamiento.EstadoProcesamiento;
import co.com.sofka.domain.procesamiento.OrdenParaAlistamiento;
import co.com.sofka.domain.procesamiento.Pedido;
import co.com.sofka.domain.procesamiento.values.Procesador;
import co.com.sofka.domain.procesamiento.values.ProcesamientoId;

public class ProcesamientoCreado extends DomainEvent {

    private final ProcesamientoId procesamientoId;
    private final EstadoProcesamiento estadoProcesamiento;
    private final OrdenParaAlistamiento ordenParaAlistamiento;
    private final Pedido pedido;
    private final Fecha fecha;
    private final Procesador procesador;

    public ProcesamientoCreado(
            ProcesamientoId procesamientoId,
            EstadoProcesamiento estadoProcesamiento,
            OrdenParaAlistamiento ordenParaAlistamiento,
            Pedido pedido,
            Fecha fecha,
            Procesador procesador) {
        super("sofka.procesamiento.procesamientoCreado");
        this.procesamientoId = procesamientoId;
        this.estadoProcesamiento = estadoProcesamiento;
        this.ordenParaAlistamiento = ordenParaAlistamiento;
        this.pedido = pedido;
        this.fecha = fecha;
        this.procesador = procesador;
    }

    public ProcesamientoId getProcesamientoId() {
        return procesamientoId;
    }

    public EstadoProcesamiento getEstadoProcesamiento() {
        return estadoProcesamiento;
    }

    public OrdenParaAlistamiento getOrdenParaAlistamiento() {
        return ordenParaAlistamiento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Procesador getProcesador() {
        return procesador;
    }
}
