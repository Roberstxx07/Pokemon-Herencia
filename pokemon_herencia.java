

public class Pokemon {
    public int hp;
    public int nivel;
    public String nombre;
    public String tipo;

    // Constructor
    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.hp = 100;
        
}

    // Métodos getter
    public int getHP() {
        return hp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    // Método privado para calcular el daño
    private void calculaDanio(int danio) {
        this.hp -= danio;
        System.out.printf("%s recibe %d puntos de daño\n", this.getNombre(), danio);
    }

    // Método para recibir un ataque
    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        int danio = (int) (Math.random() * 10 + 1);
        calculaDanio(danio);
    }

    // Método para atacar a otro Pokémon
    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }
}
