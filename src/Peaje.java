public class Peaje {
    private String nombre;
    private String departamento;
    private int valorTotalPeaje;

    public Peaje(String nombre, String departamento){
        this.nombre = nombre;
        this.departamento = departamento;
        this.valorTotalPeaje = 0;
    }

    public void cobrarPeaje(Vehiculo vehiculo){
        int valorPeaje = vehiculo.calcularPeaje();
    }

}
