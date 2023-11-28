import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> estudantes;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.estudantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void adicionarEstudante(Aluno estudante) {
        estudantes.add(estudante);
        System.out.println(estudante.getNome() + " adicionado à turma " + codigo + " da disciplina " +
                disciplina.getNome() + " com professor " + professor.getNome());
    }
}
