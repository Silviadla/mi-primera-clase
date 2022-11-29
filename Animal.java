public class Animal {

    // El estado del animal
    private boolean vivo;
    // El nombre completo del animal
    private String nombre;
    // La edad del animal
    private int edad;

    /**
     * Crea un animal
     */
    public Animal(String nombreAnimal, int edadAnimal, boolean vida) {
        nombre = nombreAnimal ;
        edad = edadAnimal;
        vivo = vida;
    }

    /**
     * Devuelve el nombre completo del animal
     */
    public String getNombreAnimal() {
        return nombre;
    }

    /**
     * Devuelve la edad del animal
     */
    public int getEdadAnimal() {
        return edad;
    }

    /**
     * Devuelve el nombre completo del animal
     */
    public void setNombreAnimal(String nombreAnimal) {
        nombre = nombreAnimal;
    }

    /**
     * Devuelve la edad del animal
     */
    public void setEdadAnimal(int edadAnimal) {
        edad = edadAnimal;
    }

    /**
     * Devuelve el estado del animal
     */
    public void setEstadoAnimal() {
        if(vivo){
            System.out.println( "El animal, está vivo ");   }
        else{
            System.out.println( "El animal, no está vivo ");
        }
    }

    /**
     * Imprime por pantalla los detalles del animal
     */
    public void imprimirEstadisticas() {
        if(vivo){
            System.out.println( "El animal se llama: " + nombre + ",tiene " + edad + " años" +" y está vivo ");   }
        else{
            System.out.println( "El animal se llama: " + nombre + ",tiene " + edad + " años" +" y no está vivo ");
        }
    }

    /**
     * Devuelve por pantalla los detalles del animal
     */
    public void getEstadisticas() {
        if(vivo){
            System.out.println( "El animal se llama: " + nombre + ",tiene " + edad + " años" +" y está vivo ");   }
        else{
            System.out.println( "El animal se llama: " + nombre + ",tiene " + edad + " años" +" y no está vivo ");
        }
    }

}

