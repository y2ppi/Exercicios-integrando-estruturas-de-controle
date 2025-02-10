import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> respostas = new ArrayList<>();
        String sexo;
        int corOlhos;
        String corCabelos;
        int idade;
        int somaIdade = 0;
        int olhosAzuisRuivos = 0;
        float altura, peso;
        float somaAltura = 0;
        float somaPeso = 0;
        int totalHabitantes = 0;
        int homens = 0;
        String continuar;

        do {
            System.out.println("\n=== BEM-VINDO À PESQUISA ===\n");

            while (true) {
                System.out.println("Insira seu sexo (F ou M): ");
                sexo = sc.nextLine().toLowerCase();
                
                if (sexo.equals("f") || sexo.equals("m")) {
                    respostas.add("Sexo: " + sexo);
                    break;
                } else {
                    System.out.println("Sexo inválido, tente novamente.");
                }
            }

            System.out.println("Deseja continuar a pesquisa? (sim/nao): ");
            continuar = sc.nextLine().toLowerCase();
            if (!continuar.equals("sim")) break;

            while (true) {
                System.out.println("Insira a cor de seus olhos (1 para azuis, 2 para verdes e 3 para castanhos): ");
                
                if (sc.hasNextInt()) {
                    corOlhos = sc.nextInt();
                    sc.nextLine();

                    if (corOlhos >= 1 && corOlhos <= 3) {
                        respostas.add("Cor dos Olhos: " + corOlhos);
                        break;
                    }
                } else {
                    sc.nextLine();
                }
                System.out.println("Cor dos olhos inválida, tente novamente.");
            }

            System.out.println("Deseja continuar a pesquisa? (sim/nao): ");
            continuar = sc.nextLine().toLowerCase();
            if (!continuar.equals("sim")) break;

            while (true) {
                System.out.println("Insira a cor de seus cabelos (L para louros, C para castanhos, P para pretos, R para ruivos): ");
                corCabelos = sc.nextLine().toLowerCase();

                if (corCabelos.equals("l") || corCabelos.equals("c") || corCabelos.equals("p") || corCabelos.equals("r")) {
                    respostas.add("Cor dos Cabelos: " + corCabelos);
                    break;
                }
                System.out.println("Cor dos cabelos inválida, tente novamente.");
            }

            System.out.println("Deseja continuar a pesquisa? (sim/nao): ");
            continuar = sc.nextLine().toLowerCase();
            if (!continuar.equals("sim")) break;

            while (true) {
                System.out.println("Insira sua idade: ");
                if (sc.hasNextInt()) {
                    idade = sc.nextInt();
                    sc.nextLine();
                    respostas.add("Idade: " + idade);
                    break;
                } else {
                    sc.nextLine();
                    System.out.println("Idade inválida, tente novamente.");
                }
            }

            System.out.println("Deseja continuar a pesquisa? (sim/nao): ");
            continuar = sc.nextLine().toLowerCase();
            if (!continuar.equals("sim")) break;

            while (true) {
                System.out.println("Insira sua altura (em metros, ex: 1.75): ");
                if (sc.hasNextFloat()) {
                    altura = sc.nextFloat();
                    sc.nextLine();
                    respostas.add("Altura: " + altura);
                    break;
                } else {
                    sc.nextLine();
                    System.out.println("Altura inválida, tente novamente.");
                }
            }

            System.out.println("Deseja continuar a pesquisa? (sim/nao): ");
            continuar = sc.nextLine().toLowerCase();
            if (!continuar.equals("sim")) 
            break;

            while (true) {
                System.out.println("Insira seu peso (em kg, ex: 70.5): ");
                if (sc.hasNextFloat()) {
                    peso = sc.nextFloat();
                    sc.nextLine();
                    respostas.add("Peso: " + peso);
                    break;
                } else {
                    sc.nextLine();
                    System.out.println("Peso inválido, tente novamente.");
                }
            }

            System.out.println("Deseja continuar a pesquisa? (sim/nao): ");
            continuar = sc.nextLine().toLowerCase();
            if (!continuar.equals("sim")) 
            break;

            totalHabitantes++;
            somaIdade += idade;
            somaAltura += altura;
            somaPeso += peso;

            if (sexo.equalsIgnoreCase("m")) homens++;
            if (corOlhos == 1 && corCabelos.equalsIgnoreCase("r")) olhosAzuisRuivos++;

            System.out.println("\n=== RESULTADOS INTERNOS DA PESQUISA ===\n");

            if (totalHabitantes > 0) {
                System.out.printf("Média de idade: %.2f anos\n", (double) somaIdade / totalHabitantes);
                System.out.printf("Média de altura: %.2f metros\n", somaAltura / totalHabitantes);
                System.out.printf("Média de peso: %.2f kg\n", somaPeso / totalHabitantes);
                System.out.printf("Porcentagem de participantes do sexo masculino: %.2f%%\n", (double) homens / totalHabitantes * 100);
                System.out.println("Total de pessoas com olhos azuis e cabelos ruivos: " + olhosAzuisRuivos);
            } else {
                System.out.println("Nenhum participante foi registrado.");
            }

        } while (continuar.equals("sim"));

        System.out.println("\n=== RESULTADOS FINAIS DA PESQUISA ===");
        for (String resposta : respostas) {
            System.out.println(resposta);
        }

        sc.close();
    }
}