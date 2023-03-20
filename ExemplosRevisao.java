import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc = new Scanner(System.in);

    //CRIAR METODOS DA CLASSE

    public void exemplo1(){
        //CRIAR UM PROJETO PRA LER 2 NOTAS E A FREQUENCIA
        //E FALAR SE O ALUNO ESTA APROVADO OU REPROVADO

        //1. ler a primeira nota;
        System.out.println("Informa a Primeira Nota Do Aluno: ");
        int nota1 = sc.nextInt();

        //2. ler a segunda nota;
        System.out.println("Informe a Segunda Nota Do Aluno: ");
        int nota2 = sc.nextInt();

        //3. calcular a media das notas;
        double media = (nota1 + nota2)/2;

        //4. mostrar a media calculada;
        System.out.println("A Media Do Aluno É: " + media);

        //5. digite o total de aulas;
        System.out.println("Professor, Digite o Total De Aulas Do Aluno: ");
        int aulasDadas = sc.nextInt();

        //6. digite o numero de faltas do aluno;
        System.out.println("Professor, Digite o Total De Faltas Do Aluno: ");
        int nfaltas = sc.nextInt();

        //7. calcular a % de frequencia;
        double frequencia = (aulasDadas - nfaltas)*100/aulasDadas;

        //8. mostrar a % de frequencia;
        System.out.println("O Aluno Teve: " +frequencia +"% De Frequencia");

        //9. se ( media >= 50 e frequencia>=75%) Entao Aluno Aprovado } senao { Entao Aluno Reprovado
        if (media>= 50 && frequencia>=75){
            System.out.println("O Aluno Está APROVADO");
        } else if (media<50 && frequencia>=75){
            System.out.println("O Aluno Está De RECUPERAÇÃO");
        } else {
            System.out.println("O Aluno Está REPROVADO");
        }

    }
}
