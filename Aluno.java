import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private ArrayList<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
        System.out.println(nome + " foi matriculado em " + disciplina.getNome());
    }

    public boolean estaMatriculado(Disciplina disciplina) {
        return disciplinasMatriculadas.contains(disciplina);
    }

}
