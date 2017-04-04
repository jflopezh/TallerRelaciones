package Punto1;

public class Main {

    public static void main(String[] args) {
        Persona p = new Persona("Felipe", "3154149014", "Cll 45 No. 28-12");
        
        Rueda[] r = new Rueda[4];
        r[0] = new Rueda(75, "Michelin");
        r[1] = new Rueda(75, "Michelin");
        r[2] = new Rueda(75, "Michelin");
        r[3] = new Rueda(75, "Michelin");
        Rueda[] r2 = new Rueda[4];
        r2[0] = new Rueda(80, "Dunlop");
        r2[1] = new Rueda(80, "Dunlop");
        r2[2] = new Rueda(80, "Dunlop");
        r2[3] = new Rueda(80, "Dunlop");
        
        Motor m = new Motor("x152", 700, 500);
        Motor m2 = new Motor("x478", 700, 500);
        
        Carro c = new Carro("WER521", "Chevrolet", "Aveo", r, m);
        c.setChasis("Acero", "Autoportante");
        Carro c2 = new Carro("FDA451", "BMW", "X4", r2, m2);
        c.setChasis("Oro", "Autoportante");        
        
        p.addCarro(c);
        p.addCarro(c2);
        
        System.out.println(p.ListarCarros());
    }
    
}
