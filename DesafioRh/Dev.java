package DesafioRh;

public class Dev extends Funcionario {
    private String linguagem;
    private String nivel;
    public Dev() {
        super();

    }
    public void promocaoDev(int anosDeimpresa){
        if (anosDeimpresa >= 2){
            setNivel("Junior");
        } else if (anosDeimpresa >= 4) {
            setNivel("Pleno");
        }
        else {
            setNivel("Sênior");
        }
    }
    @Override
    public void solicitarFerias(String nome, int cpf) {
        System.out.println("O dev " + getNome() + " solicitou férias");
    }
    @Override
    public void solicitarAumento(double valor) {
        System.out.println("O dev " + getNome() + " solicitou férias");
        setSalario(getSalario() + valor);
    }
    @Override
    public void solicitarPromocao(String cargo) {
        System.out.println("O dev " + getNome() + " solicitou férias");
    }
    public String getLinguagem() {
        return linguagem;
    }
    public String getNivel() {
        return nivel;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
