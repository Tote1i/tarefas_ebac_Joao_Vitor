package com.ebac.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class Streams {
    private static List<Contato> listaDeContatos = new ArrayList<>();
    private static List<Contato> contatosFemininos = new ArrayList<>();
    private static List<Contato> contatosMasculinos = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite o nome e o gênero do contato (ou 'sair' para encerrar): ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("sair")) {
                    break;
                }

                String[] partes = entrada.split(" - ");

                if (partes.length != 2) {
                    System.out.println("Formato inválido. Use 'Nome - Gênero'.");
                    continue;
                }

                String nome = partes[0].trim();
                String genero = partes[1].trim();

                Contato contato = new Contato(nome, genero);
                listaDeContatos.add(contato);
            }
        }

        contatosFemininos = listaDeContatos.stream()
                .filter(contato -> contato.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        contatosMasculinos = listaDeContatos.stream()
                .filter(contato -> contato.getGenero().equalsIgnoreCase("Masculino"))
                .collect(Collectors.toList());

        System.out.println("Contatos Femininos:");
        contatosFemininos.forEach(contato -> System.out.println("Nome: " + contato.getNome() + ", Gênero: " + contato.getGenero()));

        System.out.println("\nContatos Masculinos:");
        contatosMasculinos.forEach(contato -> System.out.println("Nome: " + contato.getNome() + ", Gênero: " + contato.getGenero()));
    }

    public static List<Contato> getContatosFemininos() {
        return contatosFemininos;
    }
        public static List<Contato> getContatosMasculinos() {
        return contatosMasculinos;
    }
}
