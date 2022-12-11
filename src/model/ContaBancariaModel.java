package model;

public class ContaBancariaModel {

    private String numeroDoTitular;
    public String nomeDaConta;
    private float saldoDaConta=0.00f;

    public ContaBancariaModel(){}

    public ContaBancariaModel(String nomeDaConta,
                              String numeroDoTitular, Float deposito){
        this.nomeDaConta = nomeDaConta;
        this.numeroDoTitular = numeroDoTitular;
        depositarDinheiro(deposito);
    }

    public String getNomeDaConta(){
        return nomeDaConta;
    }
    public void setNomeDaConta(String nomeDaConta){
        this.nomeDaConta = nomeDaConta;
    }

    public String getNumeroDoTitular(){
        return numeroDoTitular;
    }
    public float getSaldoDaConta(){
        return saldoDaConta;
    }
    public void setNumeroDoTitular(String numeroDoTitular){
        this.numeroDoTitular = numeroDoTitular;
    }

    public void depositarDinheiro(float valorParaDeposito){
        saldoDaConta += valorParaDeposito;

    }

    public void sacarDoDinheiro(float valorParaSacar){
        saldoDaConta = (saldoDaConta - valorParaSacar)-5;

    }

    @Override
    public String toString() {
        return "Dados da conta: Numero: "+numeroDoTitular +", Nome: "
                + nomeDaConta+", "+"Saldo: R$"+ String.format("%.2f", saldoDaConta);
    }
}
