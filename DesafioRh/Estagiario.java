package DesafioRh;

public class Estagiario extends Funcionario {
    private double duracaoEstagio;
    private String instituicao;
    private String curso;
    public Estagiario() {
        super();
    }
    public void realizarTarefa(String tarefa) {
        System.out.println("Realizando tarefa: " + tarefa);
        //O método realizarTarefa() recebe uma String representando uma tarefa e imprime uma mensagem indicando que o estagiário está realizando essa tarefa.
    }

    public void solicitarAvaliacao() {
        System.out.println("Solicitando avaliação");
        //O método solicitarAvaliacao() imprime uma mensagem indicando que o estagiário está solicitando uma avaliação.
    }
    @Override
    public void solicitarFerias(String nome, int cpf) {
        System.out.println("O estagiário " + getNome() + " solicitou férias");
    }
    @Override
    public void solicitarAumento(double valor) {
        System.out.println("O estagiário " + getNome() + " solicitou aumento");

    }
    @Override
    public void solicitarPromocao(String cargo) {
        System.out.println("O estagiário " + getNome() + " solicitou uma contratação");

    }
    public double getDuracaoEstagio() {
        return duracaoEstagio;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDuracaoEstagio(double duracaoEstagio) {
        this.duracaoEstagio = duracaoEstagio;
    }
}
