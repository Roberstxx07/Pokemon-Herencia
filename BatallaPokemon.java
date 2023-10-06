public class BatallaPokemon {
    
     public static void main(String[] args) {
        // Ejemplo de uso
         pokemos_Fuego = new pokemos_Fuego ("Fuego", "Planta/Veneno", 15, 50);

        System.out.println("Estado de Fuego:");
        System.out.printf("Nombre: %s\n", Fuego.getNombre());
        System.out.printf("Tipo: %s\n", Fuego.getTipo());
        System.out.printf("Nivel: %d\n", Fuego.getNivel());
        System.out.printf("HP: %d\n", Fuego.getHP());
        System.out.printf("Experiencia: %d\n", Fuego.getExperiencia());

        Fuego.atacar("Látigo Cepa", new Pokemon("Rt", "Normal", 10));
        Fuego.ganarExperiencia(25);

        System.out.println("Estado de Fuego después de un ataque y ganar experiencia:");
        System.out.printf("HP: %d\n", Fuego.getHP());
        System.out.printf("Experiencia: %d\n", Fuego.getExperiencia());
    }
}
