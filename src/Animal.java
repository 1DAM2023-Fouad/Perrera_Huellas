public class Animal{
private String coidoUnico;
private String nombre;
private String fechaNacimiento;
private Adopcion adopcion;

    public String getCoidoUnico() {
        return coidoUnico;
    }

    public void setCoidoUnico(String coidoUnico) {
        this.coidoUnico = coidoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Adopcion getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(Adopcion adopcion) {
        this.adopcion = adopcion;
    }
}
