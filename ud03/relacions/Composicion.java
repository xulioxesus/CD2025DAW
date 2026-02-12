import java.util.List;
import java.util.ArrayList;

// Clase Habitacion
public class Habitacion {
    private String nome;

    public Habitacion(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Clase Casa (compón habitacións)
public class Casa {
    private List<Habitacion> habitacions;

    public Casa() {
        habitacions = new ArrayList<>();
        // A casa crea as habitacións
        habitacions.add(new Habitacion("Cociña"));
        habitacions.add(new Habitacion("Salón"));
        habitacions.add(new Habitacion("Dormitorio"));
    }

    public void mostrarHabitacions() {
        for (Habitacion h : habitacions) {
            System.out.println(h.getNome());
        }
        }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.mostrarHabitacions();
    }
}