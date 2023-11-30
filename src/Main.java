public class Main {
    public static void main(String[] args) {

        // Crear nueva adopcion
        Adopcion adopcion = new Adopcion();
        adopcion.setCodigo("#654910");
        adopcion.setFechaAdopcion("30/11/2023");


        // Crear nueva persona
        Persona persona = new Persona();
        persona.setNombre("Rubén");
        persona.setApellidos("García");
        persona.setDni("41269406-R");
        persona.setTelefono("688269467");
        persona.setAdopcion(persona.getAdopcion());

        // Crear nuevo Animal: Perro
        Perro perro = new Perro();
        perro.setCoidoUnico("#654654");
        perro.setNombre("Rex");
        perro.setFechaNacimiento("02/06/2019");
        perro.setAmigable("Es amigable, se lleva bien con otros perros :)");
        perro.setAdopcion(perro.getAdopcion());

        // Crear nuevo Animal: Gato
        Gato gato = new Gato();
        gato.setCoidoUnico("#548465");
        gato.setNombre("Lope");
        gato.setFechaNacimiento("15/10/2021");
        gato.setVirusLeucemia("Tiene virus de Leucemia :(");
        gato.setAdopcion(gato.getAdopcion());


        // Le pasamos el objeto persona, perro, gato al objeto adopcion,
        //para que pueda mostarar todos sus atributos
        adopcion.setPersona(persona);
        adopcion.setPerro(perro);
        adopcion.setGato(gato);


        //Imrprimir objeto adopcion
        System.out.println(adopcion);
    }

}