import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- CLT ---
        System.out.println("Digite os dados do CLT:");
        System.out.print("Nome: ");
        String nomeCLT = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfCLT = scanner.nextLine();
        
        Clt clt = new Clt(nomeCLT, cpfCLT);
        System.out.print("Salário Mensal: R$ ");
        clt.setSalarioMensal(scanner.nextDouble());
        scanner.nextLine(); // Consumir quebra de linha

        // --- Horista ---
        System.out.println("\nDigite os dados do Horista:");
        System.out.print("Nome: ");
        String nomeHorista = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfHorista = scanner.nextLine();
        
        Horista horista = new Horista(nomeHorista, cpfHorista);
        System.out.print("Salário por Hora: R$ ");
        horista.setSalarioPorHora(scanner.nextDouble());
        System.out.print("Horas Trabalhadas: ");
        horista.setHorasTrabalhadas(scanner.nextInt());
        scanner.nextLine(); // Consumir quebra de linha

        // --- Comissionado ---
        System.out.println("\nDigite os dados do Comissionado:");
        System.out.print("Nome: ");
        String nomeComissionado = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfComissionado = scanner.nextLine();
        
        Comissionado comissionado = new Comissionado(nomeComissionado, cpfComissionado);
        System.out.print("Total de Vendas: R$ ");
        comissionado.setTotalVendas(scanner.nextDouble());
        System.out.print("Percentual de Comissão (%): ");
        comissionado.setPercentualComissao(scanner.nextDouble());
        scanner.nextLine(); // Consumir quebra de linha

        // --- Exibição dos Resultados ---
        System.out.println("\n=== Vencimentos ===");
        System.out.printf("CLT (%s): R$ %.2f%n", clt.getNome(), clt.vencimento());
        System.out.printf("Horista (%s): R$ %.2f%n", horista.getNome(), horista.vencimento());
        System.out.printf("Comissionado (%s): R$ %.2f%n", comissionado.getNome(), comissionado.vencimento());

        scanner.close();
    }
}