public class Horista extends Funcionario{

  private double salarioPorHora;
  private int horasTrabalhadas;

  public Horista(String nome, String cpf) {
    super(nome, cpf);
    //TODO Auto-generated constructor stub
  }

  public String getNome(){
    return nome;
  }

  public void setSalarioPorHora(double salarioPorHora){
    this.salarioPorHora = salarioPorHora;
  }
  
  public void setHorasTrabalhadas(int horasTrabalhadas){
    this.horasTrabalhadas = horasTrabalhadas;
  }

  @Override
  public double vencimento(){
    return salarioPorHora*horasTrabalhadas;
  }
}
