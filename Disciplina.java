import java.util.List;

public class Disciplina {
    private String nome;
    private int codigo;

    public Disciplina(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void listarEstudantesMatriculados(List<Aluno> estudantes) {
        System.out.println("Estudantes matriculados em " + nome + ":");
        for (Aluno estudante : estudantes) {
            if (estudante.estaMatriculado(this)) {
                System.out.println("- " + estudante.getNome());
            }
        }
    }
}
