package Punto2;

import java.util.Date;

public class Cuenta {
    
    private int _NumeroDeCuenta;
    private double _BalanceActual;
    private Date _FechaDeCreacion;
    private String _NombreCliente;
    
    public int getNumeroCuenta(){
        return this._NumeroDeCuenta;
    }
    
    public double getBalanceActual(){
        return this._BalanceActual;
    }
    
    public Date getFechaCreacion(){
        return this._FechaDeCreacion;
    }
    
    public String getNombreCliente(){
        return this._NombreCliente;
    }
    
    public void setNumeroCuenta(int NumeroCuenta){
        this._NumeroDeCuenta = NumeroCuenta;
    }
    
    public void setBalanceActual(double BalanceActual){
        this._BalanceActual = BalanceActual;
    }
    
    public void setFechaCreacion(Date FechaCreacion){
        this._FechaDeCreacion = FechaCreacion;
    }
    
    public void setNombreCliente(String NombreCliente){
        this._NombreCliente = NombreCliente;
    }
  
}
