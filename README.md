public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void atribuirNota(Aluno estudante, Disciplina disciplina, double nota) {
        System.out.println("Nota " + nota + " atribuída por " + nome + " a " + estudante.getNome() +
                " na disciplina " + disciplina.getNome());
    }
}
