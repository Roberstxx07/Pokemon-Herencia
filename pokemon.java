

public class Pokemon {
    public int hp;
    private final int nivel;
    final String nombre;
    private final String tipo;

    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.hp = 100;
    }

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

     private void calculaDanio(int danio) {
        this.hp -= danio;
        System.out.printf("%s recibe %d puntos de daño\n", this.getNombre(), danio);
    }

    public void recibirAtaque(String movimiento) {
        int danio = (int) (Math.random() * 10 + 1); // Genera un daño aleatorio entre 1 y 10
        calculaDanio(danio);
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        System.out.printf("%s tiene ahora %d puntos de vida.\n", this.getNombre(), this.hp);
    }

    public void atacar(String movimiento, Pokemon pokemon) {
        int danio = (int) (Math.random() * 10 + 1); // Genera un daño aleatorio entre 1 y 10
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
        System.out.printf("%s tiene ahora %d puntos de vida.\n", pokemon.getNombre(), pokemon.getHP());
    }
}
