package primerproyecto.trabajopractico2;

import java.util.Scanner;

public interface MamaPata {

    public double pico = 6.8;
    public double patas = 7.5;

    default void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Esta a punto de tocar el organo");
        System.out.println("Do-Re-Mi");

        System.out.print("Presiona cualquier tecla y dale Enter: ");
        String presionarTecla = sc.nextLine();

        if (presionarTecla != null) {
            System.out.println("Fa-Sol-La-Si");
        }
    }
}
