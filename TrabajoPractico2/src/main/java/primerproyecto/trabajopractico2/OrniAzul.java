package primerproyecto.trabajopractico2;

public class OrniAzul extends Castor {

    private int propulsion;

    public OrniAzul(double longitudCola, int velocidadNado, int propulsion) {
        super(longitudCola, velocidadNado);
        this.propulsion = propulsion;
    }

    @Override
    public void nadar() {
        System.out.println("Estoy nadando a " + (this.propulsion + super.getVelocidadNado()) + " km/h");

    }

    public int getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(int propulsion) {
        this.propulsion = propulsion;
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

    @Override
    public String toString() {
        return "OrniAzul{" + "propulsion=" + propulsion + '}';
    }

}
