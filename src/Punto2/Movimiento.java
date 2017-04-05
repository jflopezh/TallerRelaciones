package Punto2;

import java.util.Date;

public class Movimiento {

    private Date _Fecha;
    private Double _BalanceAnterior;
    private Double _Cantidad;

    public Date getFecha() {
        return this._Fecha;
    }

    public Double getBalanceAnterior() {
        return this._BalanceAnterior;
    }

    public Double getCantidad() {
        return this._Cantidad;
    }

    public void setFecha(Date fecha) {
        this._Fecha = fecha;
    }

    public void setBalanceActual(Double BalanceActual) {
        this._BalanceAnterior = BalanceActual;
    }

    public void setCantidad(Double cantidad) {
        this._Cantidad = cantidad;
    }

}
