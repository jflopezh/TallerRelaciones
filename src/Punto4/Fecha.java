package Punto4;

public class Fecha {
    
    private int dia;
    private int mes;
    private int año;
    
    public static String[] nombresDias = {"Lunes", "MArtes", "Miercoles", "Jueves",
                                          "Viernes", "Sabado", "Domingo"};
    public static String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril",
                                           "Mayo", "Junio", "Julio", "Agosto",
                                           "Septiembre", "Octubre", "Noviembre",
                                           "Diciembre"};

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public boolean esAñoBisiesto(int año) {
        String a = String.valueOf(dia);
        return año % 4 == 0 && !(a.charAt(2) == '0' && a.charAt(3) == '0');
    }
    
}
