package co.com.sofka.domain.procesamiento.entities;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.genericvalues.Item;
import co.com.sofka.domain.genericvalues.Cliente;
import co.com.sofka.domain.procesamiento.values.Consecutivo;
import co.com.sofka.domain.genericvalues.DireccionEntrega;
import co.com.sofka.domain.procesamiento.values.IdPedido;

import java.util.HashSet;
import java.util.Set;

public class Pedido extends Entity<IdPedido> {

    private final Consecutivo consecutivo;
    private final Set<Item> items;
    private Cliente cliente;
    private DireccionEntrega direccionEntrega;

    public Pedido(
            IdPedido idPedido,
            Consecutivo consecutivo,
            Cliente cliente,
            DireccionEntrega direccionEntrega) {
        super(idPedido);
        this.consecutivo = consecutivo;
        this.items = new HashSet<>();
        this.cliente = cliente;
        this.direccionEntrega = direccionEntrega;
    }


    public void agregarItem(Item item){
        this.items.add(item);
    }

    public void modificarCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void modificarDireccion(DireccionEntrega direccionEntrega){
        this.direccionEntrega = direccionEntrega;
    }

    public Consecutivo consecutivo() {
        return consecutivo;
    }

    public Set<Item> items() {
        return items;
    }

    public Cliente cliente() {
        return cliente;
    }

    public DireccionEntrega direccionEntrega() {
        return direccionEntrega;
    }
}
