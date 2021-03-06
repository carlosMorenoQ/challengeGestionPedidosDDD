package co.com.sofka.domain.alistamiento.command;

import co.com.sofka.domain.alistamiento.values.Etapa;
import co.com.sofka.domain.alistamiento.values.IdAlistamiento;
import co.com.sofka.domain.alistamiento.values.IdEtapaDelAlistamiento;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.genericvalues.Fecha;

public class ModificarEtapaEnEtapaDelAlistamiento extends Command {

    private final IdAlistamiento idAlistamiento;
    private final IdEtapaDelAlistamiento idEtapaDelAlistamiento;
    private final Fecha fecha;
    private final Etapa etapa;

    public ModificarEtapaEnEtapaDelAlistamiento(
            IdAlistamiento idAlistamiento,
            IdEtapaDelAlistamiento idEtapaDelAlistamiento,
            Fecha fecha,
            Etapa etapa) {
        this.idAlistamiento = idAlistamiento;
        this.idEtapaDelAlistamiento = idEtapaDelAlistamiento;
        this.fecha = fecha;
        this.etapa = etapa;
    }

    public IdAlistamiento getIdAlistamiento() {
        return idAlistamiento;
    }

    public IdEtapaDelAlistamiento getIdEtapaDelAlistamiento() {
        return idEtapaDelAlistamiento;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Etapa getEtapa() {
        return etapa;
    }
}
