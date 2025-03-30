public class Funcionario{
  protected String nome;
  protected String cpf;

  public Funcionario(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome(String nome){
    return nome;
  }

  public double vencimento(){
    return 0.0;
  }
}

