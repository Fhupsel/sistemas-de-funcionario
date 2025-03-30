public class Comissionado extends Funcionario{

  public double totalVendas;
  public double percentualComissao;

  public Comissionado(String nome, String cpf) {
    super(nome, cpf);
    //TODO Auto-generated constructor stub
  }

  public String getNome(){
    return nome;
  }

  public void setTotalVendas(double totalVendas){
    this.totalVendas = totalVendas;
  }

  public void setPercentualComissao(double percentualComissao){
    this.percentualComissao = percentualComissao;
  }

  @Override
  public double vencimento(){
    return (totalVendas*percentualComissao)/100;
  }
  
}
