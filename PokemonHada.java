public class pokemon_Hada{
    
    public class PokemonTipo extends Pokemon {
public PokemonTipo(String nombre, int nivel) {
super(nombre, "Hada", nivel);

   }
public int getExperiencia() {
    int experiencia = 0;
        return experiencia;
    }

    // Método para ganar experiencia
    public void ganarExperiencia(int cantidad) {
         experiencia += cantidad;
        System.out.printf("%s gana %d puntos de experiencia\n", getNombre(), cantidad);
    } 
}    
    
    
}
