package adaitw.java;

public class Empleado {
    private Bono bono;
    private Integer antiguedad;
    private Double salario;

    public Empleado(Integer antiguedad, Double salario){
        this.antiguedad = antiguedad;
        this.salario = salario;
        // instanciar un bono con el constructor, desde la clase Bono, para cada objeto bono
        this.bono = new Bono(antiguedad, salario);
    }

    public void informarBono() {
        System.out.println("El bono es: $ " + bono.obtenerValor());
    }
}
