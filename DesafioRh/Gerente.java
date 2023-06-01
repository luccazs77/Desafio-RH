package DesafioRh;

public class Gerente extends Funcionario{
    private String departamento;
    private String contrato;
    private String distrato;
    private double promocao;
    private boolean aprovar;
    public Gerente() {
        super();
    }
    public void aprovarFerias(Funcionario funcionario) {
        if (aprovar == true){
            System.out.println("Gerente " + getNome() + " aprovou as férias para o funcionário " + funcionario.getNome());
        }
        else {
            System.out.println("Gerente " + getNome() + " negou as férias para o funcionário " + funcionario.getNome());
        }
    }
    public void realizarContratacao(String nomeFuncionario) {
        System.out.println("Gerente " + getNome() + " realizou a contratação do funcionário " + nomeFuncionario);
    }
    public void realizarDemissao(String nomeFuncionario, int cpf) {
        System.out.println("Gerente " + getNome() + " realizou a demissão do funcionário " + nomeFuncionario);
    }
    @Override
    public void solicitarFerias(String nome, int cpf) {

    }
    @Override
    public void solicitarAumento(double valor) {
        System.out.println("O gerente " + getNome() + " solicitou aumento");
        setSalario(getSalario() + valor);
    }
    @Override
    public void solicitarPromocao(String cargo) {

    }
    public String getDepartamento() {
        return departamento;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDistrato() {
        return distrato;
    }

    public void setDistrato(String distrato) {
        this.distrato = distrato;
    }

    public double getPromocao() {
        return promocao;
    }

    public void setPromocao(double promocao) {
        this.promocao = promocao;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isAprovar() {
        return aprovar;
    }

    public void setAprovar(boolean aprovar) {
        this.aprovar = aprovar;
    }
}