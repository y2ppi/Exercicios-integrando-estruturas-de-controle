import java.util.*;

public class Q05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> listaDeAlunos = new ArrayList<>();
        int totalDeAlunos = 0;
        int codigoAluno;
        float notaFinal;

        do{
            System.out.println("Insira o código do aluno: \n");
            codigoAluno = sc.nextInt();

            System.out.println("Insira a nota do aluno: \n");
            notaFinal = sc.nextFloat();
                if(notaFinal < 0 || notaFinal < 10){
                    System.out.println("Nota inválida, tente novamente.");
                    continue;
                }


            if(notaFinal > 0 && notaFinal == 2.9){
                listaDeAlunos.add("Aluno: \n" + codigoAluno + "\nConceito: E");
            }

            if(notaFinal >= 3 && notaFinal == 4.9){
                listaDeAlunos.add("Aluno: \n" + codigoAluno + "\nConceito: D");
            }

            if(notaFinal >= 5 && notaFinal == 6.9){
                listaDeAlunos.add("Aluno: \n" + codigoAluno + "\nConceito: C");
            }

            if(notaFinal >= 7 && notaFinal == 8.9){
                listaDeAlunos.add("Aluno: \n" + codigoAluno + "\nConceito: B");
            }
            
            if(notaFinal >= 9 && notaFinal == 10){
                listaDeAlunos.add("Aluno: \n" + codigoAluno + "\nConceito: A");
            }

            totalDeAlunos++;

            System.out.println("\n===RESULTADOS FINAIS===\n");
            System.out.println(listaDeAlunos);

        } while (totalDeAlunos <= 5);

        sc.close();
    }
}