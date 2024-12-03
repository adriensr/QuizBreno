import java.util.Scanner;

// Classe para representar uma questão do quiz
class Questao {
    private String pergunta, opcaoA, opcaoB, opcaoC, opcaoD, opcaoE, respostaCorreta;

    public Questao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String respostaCorreta) {
        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.opcaoE = opcaoE;
        this.respostaCorreta = respostaCorreta.toUpperCase();
    }

    public void escrevaQuestao() {
        System.out.println(pergunta);
        System.out.println(opcaoA);
        System.out.println(opcaoB);
        System.out.println(opcaoC);
        System.out.println(opcaoD);
        System.out.println(opcaoE);
    }

    public String leiaResposta(Scanner scanner) {
        System.out.print("Digite sua resposta (A, B, C, D ou E): ");
        return scanner.nextLine().trim().toUpperCase();
    }

    public boolean isCorreta(String resposta) {
        return resposta.equals(respostaCorreta);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("******************************");
        System.out.println("* Faculdade UNIFAN             *");
        System.out.println("* Nome do Aluno: ADRIEN DO SANTOS    *");
        System.out.println("* Nome do Professor: Prof. BRENNO *");
        System.out.println("******************************");
        System.out.println("Bem-vindo ao Quiz de Carros!");
        System.out.println("Você responderá 15 perguntas de múltipla escolha.");
        System.out.println("Boa sorte!\n");

        // Array com as 15 questões
        Questao[] questoes = new Questao[15];
        preencherQuestoes(questoes);

        int acertos = 0;

        // Loop para exibir e processar as 15 perguntas
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Pergunta " + (i + 1) + ":");
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta(scanner);
            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            }
        }

        // Resultado
        double percentualAcertos = ((double) acertos / questoes.length) * 100;
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Você acertou " + acertos + " questões.");
        System.out.println("Sua porcentagem de acertos foi: " + String.format("%.2f", percentualAcertos) + "%");

        scanner.close();
    }

    // Método para preencher as questões
    private static void preencherQuestoes(Questao[] questoes) {
        questoes[0] = new Questao(
                "Qual é o carro mais vendido no mundo?",
                "A) Toyota Camry",
                "B) Ford F-Series",
                "C) Honda Civic",
                "D) Volkswagen Golf",
                "E) Chevrolet Silverado",
                "A"
        );

        questoes[1] = new Questao(
                "Qual carro foi considerado o mais rápido em 2020?",
                "A) Bugatti Veyron",
                "B) Koenigsegg Agera",
                "C) Hennessey Venom GT",
                "D) SSC Tuatara",
                "E) McLaren P1",
                "D"
        );

        questoes[2] = new Questao(
                "Quem é o fabricante do carro modelo Mustang?",
                "A) Chevrolet",
                "B) Ford",
                "C) Dodge",
                "D) Toyota",
                "E) Volkswagen",
                "B"
        );

        questoes[3] = new Questao(
                "Qual é o nome do carro famoso com o logotipo de um cavalo empinado?",
                "A) Chevrolet",
                "B) Ford",
                "C) Ferrari",
                "D) Porsche",
                "E) ford",
                "C"
        );

        questoes[4] = new Questao(
                "Qual é o nome do carro mais rápido da Ferrari?",
                "A) Ferrari LaFerrari",
                "B) Ferrari 458",
                "C) Ferrari 488 Pista",
                "D) Ferrari 812 Superfast",
                "E) Ferrari Portofino",
                "A"
        );

        questoes[5] = new Questao(
                "Em que país a BMW foi fundada?",
                "A) Alemanha",
                "B) Estados Unidos",
                "C) França",
                "D) Japão",
                "E) China",
                "A"
        );

        questoes[6] = new Questao(
                "Qual o modelo de carro que é mais associado à marca Tesla?",
                "A) Model X",
                "B) Model 3",
                "C) Model S",
                "D) Model Y",
                "E) Roadster",
                "B"
        );

        questoes[7] = new Questao(
                "Qual foi o primeiro carro híbrido da Toyota?",
                "A) Toyota Prius",
                "B) Toyota Camry Hybrid",
                "C) Toyota RAV4 Hybrid",
                "D) Toyota Yaris Hybrid",
                "E) Toyota Highlander Hybrid",
                "A"
        );

        questoes[8] = new Questao(
                "Qual é o carro mais vendido na história dos Estados Unidos?",
                "A) Honda Accord",
                "B) Ford F-Series",
                "C) Toyota Camry",
                "D) Chevrolet Silverado",
                "E) Dodge Ram",
                "B"
        );

        questoes[9] = new Questao(
                "Qual é o nome do carro que inspirou o filme 'De Volta para o Futuro'?",
                "A) Chevrolet Corvette",
                "B) Ford Mustang",
                "C) DeLorean DMC-12",
                "D) Porsche 911",
                "E) Lamborghini Miura",
                "C"
        );

        questoes[10] = new Questao(
                "Em que ano a Ferrari foi fundada?",
                "A) 1920",
                "B) 1939",
                "C) 1947",
                "D) 1951",
                "E) 1960",
                "C"
        );

        questoes[11] = new Questao(
                "Qual é o maior fabricante de carros do mundo em termos de volume de vendas?",
                "A) Toyota",
                "B) Volkswagen",
                "C) Ford",
                "D) General Motors",
                "E) Honda",
                "A"
        );

        questoes[12] = new Questao(
                "Qual carro foi o primeiro a ultrapassar 400 km/h?",
                "A) Bugatti Veyron",
                "B) Koenigsegg Agera RS",
                "C) McLaren F1",
                "D) SSC Tuatara",
                "E) Hennessey Venom GT",
                "B"
        );

        questoes[13] = new Questao(
                "Qual é o carro mais vendido do Brasil?",
                "A) Chevrolet Onix",
                "B) Volkswagen Gol",
                "C) Fiat Uno",
                "D) Toyota Corolla",
                "E) Honda Civic",
                "A"
        );

        questoes[14] = new Questao(
                "Qual é o carro mais caro já produzido?",
                "A) Bugatti La Voiture Noire",
                "B) Rolls-Royce Sweptail",
                "C) Lamborghini Veneno",
                "D) Ferrari 250 GTO",
                "E) McLaren Speedtail",
                "A"
        );
    }
}
