package patron_prototype;
/**
 * Ejemplo de uso del patrón Prototype.
 * Se crea un objeto de tipo Dato_Prototype (registro de usuario), se configura,
 * y luego se crea una copia exacta utilizando el método duplicar(),
 * demostrando cómo se puede clonar objetos sin conocer su clase exacta.
 */
public class Aplicacion {
    public Aplicacion() {}

    public static void main(String[] args) {
        Dato_Prototype registro_usuario = new Dato_Prototype();
        registro_usuario.setValor(150.0);

        Dato_Prototype registro_usuario_2 = new Dato_Prototype();

        Dato_Prototype registro_copia = (Dato_Prototype) registro_usuario.duplicar();

        System.out.println("Registro original = " + registro_usuario);
        System.out.println("Registro nuevo vacío = " + registro_usuario_2);
        System.out.println("Registro duplicado = " + registro_copia);
    }
}

