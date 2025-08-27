package primerproyecto.trabajopractico2;

public class OrniVerde extends Castor implements MamaPata {

    public OrniVerde(double longitudCola, int velocidadNado) {
        super(longitudCola, velocidadNado);
    }

    public void tocarGuitorgan() {
        System.out.println("OrniVerde esta por tocar el guitorgan");
        tocarGuitarra();
        tocarOrgano();
        System.out.println("Cuac cuac!");
    }

    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public int getVelocidadNado() {
        return velocidadNado;
    }

    public void setVelocidadNado(int velocidadNado) {
        this.velocidadNado = velocidadNado;
    }

}
