// Clase Curso
public class Curso {
    private String nome;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Clase Profesor
public class Profesor {
    private String nome;

    public Profesor(String nome) {
        this.nome = nome;
    }

    public void impartirCurso(Curso curso) {
        System.out.println(nome + " imparte o curso de " + curso.getNome());
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        Profesor prof = new Profesor("Ana");
        Curso curso = new Curso("Programación en Java");

        prof.impartirCurso(curso);
    }
}