package patron_prototype;

import conexion.duplicable_dato;

public class Dato_Prototype implements duplicable_dato {
    private String categoria = "USUARIO";
    private double valor;

    public Dato_Prototype() {}

    public duplicable_dato duplicar() {
        Dato_Prototype copia = null;

        try {
            copia = (Dato_Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copia;
    }

    public String toString() {
        return "Dato{categoria= " + this.categoria + ", valor= " + this.valor + "}";
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
