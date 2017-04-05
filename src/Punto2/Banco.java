package Punto2;

import java.util.*;

public class Banco {

    public Banco() {
        this._Tipos = new ArrayList();
        this._Cuentas = new ArrayList();
    }

    private String _codigo;

    public String getCodigo() {
        return this._codigo;
    }

    public void setCodigo(String codigo) {
        this._codigo = codigo;
    }

    private ArrayList _Tipos;

    public ArrayList getTipos() {
        return this._Tipos;
    }

    public void setTipos(ArrayList tipos) {
        this._Tipos = tipos;
    }

    private ArrayList _Cuentas;

    public ArrayList getCuentas() {
        return this._Cuentas;
    }

    public void setCuentas(ArrayList cuentas) {
        this._Cuentas = cuentas;
    }

}
