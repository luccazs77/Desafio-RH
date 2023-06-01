package DesafioRh;

public class  Funcionario implements Config{
    private String nome;
    private String email;
    private int cpf;
    private int idade;
    private double telefone;
    private double salario;
    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    // tratamendo de erro
    public void solicitarFerias(String nome, int cpf) {
    	
    }
    public void solicitarAumento(double valor) {
    	
    }
    public void solicitarPromocao(String cargo) {
    	
    }
   }