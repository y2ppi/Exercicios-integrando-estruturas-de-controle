import java.util.*;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCandidatas = 0;
        int numCandidatos = 0;
        String sexo;
        int idade, experiencia;
        double somaIdadeM = 0;
        double somaIdadeFEX = 0;
        int maiorTempoExperiencia = Integer.MIN_VALUE;
        int mulheresComExperiencia = 0;
        String resposta;
        int totalCandidatos = 0;

        do {
            System.out.println("\n=== Bem-vindo a seleção de funcionários===\n");

            System.out.println("\n== Responda as seguintes perguntas: ==\n");

            System.out.println("Insira seu genero (M ou F): ");
            sexo = sc.nextLine().toLowerCase();

            System.out.println("Insira sua idade: ");
            idade = sc.nextInt();

            if(idade < 0) {
                System.out.println("Idade inválida. Tente novamente.");
                break;
            }

            System.out.println("Insira sua experiencia (em anos): ");
            experiencia = sc.nextInt();

            totalCandidatos++;

            if(sexo.equalsIgnoreCase("f")){
                numCandidatas++;
                System.out.println("Número de candidatos do sexo feminino: " + numCandidatas);

                if (experiencia > 0) {
                    somaIdadeFEX += idade;
                    mulheresComExperiencia++;
                }
                }

            if(sexo.equalsIgnoreCase("m")){
                numCandidatos++;
                System.out.println("Número de candidatos do sexo masculino: " + numCandidatos);
            }

            if(numCandidatos > 0){
                somaIdadeM += idade;
                System.out.printf("Média de idades entre os candidatos do sexo masculino: %.2f\n", somaIdadeM / numCandidatos);
            } else {
                System.out.println("Nenhum candidato masculino foi registrado.");
            }

            if (mulheresComExperiencia > 0 && experiencia > maiorTempoExperiencia) {
                maiorTempoExperiencia = experiencia;
                somaIdadeFEX += idade;
                System.out.printf("Média de idades entre os candidatos do sexo feminino com experiencia: %.2f\n", somaIdadeFEX / mulheresComExperiencia);
            }

            System.out.println("Total de candidatos: " + totalCandidatos);

            System.out.println("Deseja cadastrar outro candidato? (SIM/NAO): ");
            resposta = sc.nextLine().toLowerCase();

            } while (resposta.equalsIgnoreCase("sim"));

            sc.close();
            }

        }