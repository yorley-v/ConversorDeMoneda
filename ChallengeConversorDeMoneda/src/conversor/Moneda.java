package conversor;

public class Moneda {
    public String codigo;
    public String nombre;

    public Moneda(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ")";
    }
}
