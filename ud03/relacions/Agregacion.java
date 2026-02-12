import java.util.List;
import java.util.ArrayList;

// Clase Xogador
public class Xogador {
    private String nome;

    public Xogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Clase Equipo (agrega xogadores)
public class Equipo {
    private String nome;
    private List<Xogador> xogadores;

    public Equipo(String nome) {
        this.nome = nome;
        this.xogadores = new ArrayList<>();
    }

    public void engadirXogador(Xogador x) {
        xogadores.add(x);
    }

    public void mostrarXogadores() {
        System.out.println("Equipo: " + nome);
        for (Xogador x : xogadores) {
            System.out.println("- " + x.getNome());
        }
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        Xogador x1 = new Xogador("Carlos");
        Xogador x2 = new Xogador("Lucía");

        Equipo equipo = new Equipo("Deportivo");
        equipo.engadirXogador(x1);
        equipo.engadirXogador(x2);

        equipo.mostrarXogadores();
    }
}