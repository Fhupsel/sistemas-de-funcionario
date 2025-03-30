public class Clt extends Funcionario{

  private double salarioMensal;

  public Clt(String nome, String cpf) {
    super(nome, cpf);
  }

  public String getNome(){
    return nome;
  }

  public void setSalarioMensal(double salario){
    this.salarioMensal = salario;
  }
    
  @Override
  public double vencimento(){
    return salarioMensal;
  }
  
}
