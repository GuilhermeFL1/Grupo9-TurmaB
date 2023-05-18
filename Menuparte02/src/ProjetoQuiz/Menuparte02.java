/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuparte02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menuparte02 {

    static int pontuacaoQuiz = 0;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Inicio();
    }

    public static void Menu() {
        System.out.println();
//() vazios apenas para ter um espaço entre o dado(Nº) de entrada do "Jogador" e o texto//
        System.out.println("------------------");
        System.out.println("SEJA BEM-VINDO!!!");
        System.out.println("------------------");
        System.out.println();
        System.out.println("Escolha uma opção: ");
        System.out.println("[1] Instruções");
        System.out.println("[2] Jogar");
        System.out.println("[3] Créditos");
        System.out.println("[4] Sair");
    }

    public static void Jogar() {
        System.out.println();
        System.out.println("------------");
        System.out.println("Iniciando...");
        System.out.println("------------");
        System.out.println();
        pergunta01();
        pergunta02();
        System.out.println("Sua pontuação atual:" + pontuacaoQuiz);
//A cada duas(02) perguntas, a pontuação do "Jogador" irá aparecer//
        pergunta03();
        pergunta04();
        System.out.println("Sua pontuação atual:" + pontuacaoQuiz);
        pergunta05();
        pergunta06();
        System.out.println("Sua pontuação atual:" + pontuacaoQuiz);
        pergunta07();
        pergunta08();
        System.out.println("Sua pontuação atual:" + pontuacaoQuiz);
        pergunta09();
        pergunta10();
        System.out.println("Sua pontuação final: " + pontuacaoQuiz);
        System.out.println("Obrigado por jogar! ");
        System.out.println("Você esta voltando ao menu...");

        Inicio();

    }

    public static void Instrucoes() {
        System.out.println("  INSTRUÇÕES");
        System.out.println("--------------------------------------------");
        System.out.println("Não pode colar da NET!!!");
        System.out.println("--------------------------------------------");
        System.out.println("Você terá duas chances de acertar a resposta");
        System.out.println("--------------------------------------------");
        System.out.println("Este quiz contém 10 perguntas \nCada resposta correta vale 1 ponto");
        System.out.println("---------------------------------------------");
        System.out.println();
        teclaContinuar();

    }

    public static void Creditos() {
        System.out.println("-------------------");
        System.out.println(" Criadores do Game");
        System.out.println("-------------------");
        System.out.println("Diana Lina Emidio");
        System.out.println("--------------------");
        System.out.println("Fernando Matheus Ribeiro");
        System.out.println("--------------------------");
        System.out.println("Guilherme Fernandes Lopes");
        System.out.println("---------------------------");
        System.out.println("Nicolas Gomes Araújo");
        System.out.println("---------------------------");
        System.out.println("Vinicius Santos Lima Silva");
        System.out.println("----------------------------");
        teclaContinuar();
    }

    public static void Sair() {
        System.out.println();
        System.out.println("Obrigado por jogar!");
        System.out.println("Saindo...");

    }

    public static void Inicio() {

        int opcao;
        do {
            Menu();
            opcao = entrada.nextInt();
            switch (opcao) {

                case 1:
                    Instrucoes();
                    break;

                case 2:
                    Jogar();
                    break;

                case 3:
                    Creditos();
                    break;

                case 4:
                    Sair();
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (opcao != 4 && opcao != 2);
    }

    public static void teclaContinuar() {

        System.out.println("-----------------------------------");
        System.out.println("Aperte qualquer tecla pra continuar");
        System.out.println("-----------------------------------");
        try {
            System.in.read();
            entrada.nextLine();
        } catch (Exception e) {
        }
    }

    public static void pergunta01() {
        char resposta;
        int chances = 0;
        boolean acertou = false;

        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Vaticano");
        alternativas.add("Tuvalu");
        alternativas.add("Nauru");
        alternativas.add("Palau");
        alternativas.add("San Marino");

        do {
            Collections.shuffle(alternativas);

            System.out.println(" 1) Qual destes países tem o menor número de habitantes?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa: ");
            resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();
//Var declarada como "char" p/ pegar o 1º Caractere digitado pelo User//
//"charAt(0)", caractereNaPosição(0), vai pegar o primeiro Caractere//

            String respostaCorreta = "Vaticano";
//Note que p/ não dar erro, o tipo da Var(String) está em Maiúsculo//
            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);
    }

    static void msgOpcaoInvalida() {
//Essa mensagem será chamada tanto nos blocos de perguntas quanto no bloco Menu//
        System.out.println("\n+------------------------+");
        System.out.println("     Opção inválida!      ");
        System.out.println("+------------------------+\n");
    }

    static void msgRespostaCorreta() {
        System.out.println("\n+------------------------+");
        System.out.println("     Resposta Correta!      ");
        System.out.println("+------------------------+\n");

    }

    static void msgRespostaIncorreta() {
        System.out.println("\n+------------------------+");
        System.out.println("     Resposta Incorreta!      ");
        System.out.println("+------------------------+\n");
    }

    public static void pergunta02() {
        int chances = 0;
        boolean acertou = false;
        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Lesoto");
        alternativas.add("Andorra");
        alternativas.add("Vanuatu");
        alternativas.add("Sri Lanka");
        alternativas.add("Luxemburgo");

        do {
            Collections.shuffle(alternativas);

            System.out.println("2) Qual destes países não faz fronteira com nenhum outro país?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta02 = "Vanuatu";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta02)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta02)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta02)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta02)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta02)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);

    }

    public static void pergunta03() {
        int chances = 0;
        boolean acertou = false;

        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Sidney");
        alternativas.add("Melbourne");
        alternativas.add("Brisbane");
        alternativas.add("Perth");
        alternativas.add("Camberra");

        do {
            Collections.shuffle(alternativas);

            System.out.println("3) Qual a capital da Austrália?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta03 = "Camberra";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta03)) {
                        msgRespostaCorreta();
                        System.out.println();

                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;

                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta03)) {
                        msgRespostaCorreta();
                        System.out.println();

                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta03)) {
                        msgRespostaCorreta();
                        System.out.println();

                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta03)) {
                        msgRespostaCorreta();
                        System.out.println();

                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta03)) {
                        msgRespostaCorreta();
                        System.out.println();

                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();

            }
        } while (chances <= 1 && !acertou);
    }

    public static void pergunta04() {
        char resposta;
        int chances = 0;
        boolean acertou = false;

        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Itália");
        alternativas.add("Alemanha");
        alternativas.add("França");
        alternativas.add("Espanha");
        alternativas.add("Rússia");

        do {
            Collections.shuffle(alternativas);

            System.out.println(" 4) Qual destes países é conhecido por ter uma cultura rica em contos de fadas?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa: ");
            resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta = "Alemanha";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);
    }

    public static void pergunta05() {
        int chances = 0;
        boolean acertou = false;

        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Brasil");
        alternativas.add("Canadá");
        alternativas.add("Austrália");
        alternativas.add("Africa do Sul");
        alternativas.add("Rússia");

        do {
            Collections.shuffle(alternativas);

            System.out.println("5) Qual destes países é conhecido por suas florestas e sua grande biodiversidade?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta05 = "Brasil";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta05)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta05)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta05)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta05)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta05)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);

    }

    public static void pergunta06() {
        int chances = 0;
        boolean acertou = false;
        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Alemanha");
        alternativas.add("França");
        alternativas.add("Japão");
        alternativas.add("Reino Unido");
        alternativas.add("Estados Unidos");

        do {
            Collections.shuffle(alternativas);

            System.out.println("6) Qual destes países tem um famoso sistema de transporte público com trens de alta velocidade?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta06 = "Japão";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta06)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta06)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta06)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta06)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta06)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);
    }

    public static void pergunta07() {
        int chances = 0;
        boolean acertou = false;
        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Brasil");
        alternativas.add("EUA");
        alternativas.add("Índia");
        alternativas.add("China");
        alternativas.add("Chile");

        do {
            Collections.shuffle(alternativas);

            System.out.println("7) Qual o país mais populoso do mundo?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta07 = "China";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta07)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta07)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta07)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta07)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta07)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);
    }

    public static void pergunta08() {
        int chances = 0;
        boolean acertou = false;
        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Indonésia");
        alternativas.add("Filipinas");
        alternativas.add("Japão");
        alternativas.add("Malásia");
        alternativas.add("Grécia");

        do {
            Collections.shuffle(alternativas);

            System.out.println("8) Qual destes países têm o maior número de ilhas?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta08 = "Indonésia";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta08)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta08)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta08)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta08)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta08)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);
    }

    public static void pergunta09() {
        int chances = 0;
        boolean acertou = false;
        List<String> alternativas = new ArrayList<String>();
        alternativas.add("Itália");
        alternativas.add("França");
        alternativas.add("Espanha");
        alternativas.add("Holanda");
        alternativas.add("Alemanha");

        do {
            Collections.shuffle(alternativas);

            System.out.println("9) Qual destes países é conhecido por seus canais e gôndolas?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();

            String respostaCorreta09 = "França";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta09)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta09)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta09)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta09)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta09)) {
                        msgRespostaCorreta();
                        System.out.println();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);
    }

    public static void pergunta10() {
        int chances = 0;
        boolean acertou = false;
        List<String> alternativas = new ArrayList<String>();
        alternativas.add("EUA");
        alternativas.add("Canadá");
        alternativas.add("Rússia");
        alternativas.add("China");
        alternativas.add("Brasil");

        do {
            Collections.shuffle(alternativas);

            System.out.println("10) Qual é o maior país em área territorial do mundo?");
            System.out.println("[A]" + alternativas.get(0));
            System.out.println("[B]" + alternativas.get(1));
            System.out.println("[C]" + alternativas.get(2));
            System.out.println("[D]" + alternativas.get(3));
            System.out.println("[E]" + alternativas.get(4));

            System.out.println("Escolha a alternativa:");
            char resposta = entrada.next().toUpperCase().charAt(0);
            System.out.println();
            String respostaCorreta10 = "Rússia";

            switch (resposta) {
                case 'A':
                    if (alternativas.get(0).equals(respostaCorreta10)) {
                        msgRespostaCorreta();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                case 'B':
                    if (alternativas.get(1).equals(respostaCorreta10)) {
                        msgRespostaCorreta();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                case 'C':
                    if (alternativas.get(2).equals(respostaCorreta10)) {
                        msgRespostaCorreta();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'D':
                    if (alternativas.get(3).equals(respostaCorreta10)) {
                        msgRespostaCorreta();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;

                case 'E':
                    if (alternativas.get(4).equals(respostaCorreta10)) {
                        msgRespostaCorreta();
                        acertou = true;
                        pontuacaoQuiz++;
                    } else {
                        msgRespostaIncorreta();
                        chances++;
                    }
                    break;
                default:
                    msgOpcaoInvalida();
            }
        } while (chances <= 1 && !acertou);

    }

}
