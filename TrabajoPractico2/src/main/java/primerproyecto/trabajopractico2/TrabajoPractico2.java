package primerproyecto.trabajopractico2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TrabajoPractico2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Datos de Green
        int colaOrniVerde;
        int velocidadOrniVerde;

        do {
            System.out.print("Ingresa la longitud de la cola del OrniVerde en cm: ");
            colaOrniVerde = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa la velocidad del OrniVerde en km/h (maximo 8): ");
            velocidadOrniVerde = sc.nextInt();
            sc.nextLine();
        } while (velocidadOrniVerde > 8);

        OrniVerde green = new OrniVerde(colaOrniVerde, velocidadOrniVerde);

        green.nadar();
        green.tocarGuitarra();
        green.tocarOrgano();
        green.tocarGuitorgan();

        int colaBlue;
        int velocidadBlue;
        int propulsionBlue;

// Datos de Blue
        do {
            System.out.print("Ingresa la longitud de la cola del OrniAzul Blue en cm: ");
            colaBlue = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa la velocidad del OrniAzul Blue en km/h (maximo 8): ");
            velocidadBlue = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa la propulsión del OrniAzul Blue (entre 5 y 10): ");
            propulsionBlue = sc.nextInt();
            sc.nextLine();
        } while (velocidadBlue > 8 || propulsionBlue < 5 || propulsionBlue > 10);

        OrniAzul blue = new OrniAzul(colaBlue, velocidadBlue, propulsionBlue);
        blue.tocarGuitarra();
        blue.nadar();

// Datos de Blui
        int colaBlui;
        int velocidadBlui;
        int propulsionBlui;

        do {
            System.out.print("Ingresa la longitud de la cola del OrniAzul Blui en cm: ");
            colaBlui = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa la velocidad del OrniAzul Blui en km/h (maximo 8): ");
            velocidadBlui = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingresa la propulsión del OrniAzul Blui (entre 5 y 10): ");
            propulsionBlui = sc.nextInt();
            sc.nextLine();
        } while (velocidadBlui > 8 || propulsionBlui < 5 || propulsionBlui > 10);

        OrniAzul blui = new OrniAzul(colaBlui, velocidadBlui, propulsionBlui);
        blui.tocarGuitarra();
        blui.nadar();

        //Array
        Castor[] Ornis = new Castor[3];
        try {
            Ornis[0] = green;
            Ornis[1] = blue;
            Ornis[2] = blui;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("No existe el indice.");
        } finally {
            System.out.println("los ornitohermanos estan juntos al fin…");
        }

        ArrayList<OrniAzul> nadadores = new ArrayList<>();

        for (Castor c : Ornis) {
            if (c instanceof OrniAzul) {
                nadadores.add((OrniAzul) c);
            }
        }

        Collections.sort(nadadores, new ComparatorPropulsion());

        for (OrniAzul o : nadadores) {
            System.out.println(o);
        }
    }

}
