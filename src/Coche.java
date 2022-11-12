public class Coche{
    public static int puertas = 0;

    public static void main(String[] args) {
        Coche MiCoche = new Coche();
        MiCoche.incrementarPuertas();
        System.out.println("MiCoche tiene " +MiCoche.puertas + " puertas.");
    }

    public static void incrementarPuertas(){
       puertas ++;
    }

}
