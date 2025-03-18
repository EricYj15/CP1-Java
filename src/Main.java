class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String verificarAprovacao() {
        if (nota >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("RM: " + matricula);
        System.out.println("Nota: " + nota);
        System.out.println("Status: " + verificarAprovacao());
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eric Yuji", "554969", 7.5);
        Aluno aluno2 = new Aluno("Higor Batista", "554868", 5.8);
        Aluno aluno3 = new Aluno("Fabricio Bettarelo", "554867", 6.0);

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
    }
}