package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulos;

import java.util.*;

public class mainList {
    public static void main(String[] args) {
        Filme oPoderosoChefao = new Filme("O Poderoso Chefão", 1970);
        oPoderosoChefao.avalia(9);
        Filme avatar = new Filme("Avatar", 2023);
        avatar.avalia(6);
        Filme filmeDoFernando = new Filme("Dogville", 2003);
        filmeDoFernando.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(5);

        List<Titulos> listaDeAssistidos = new LinkedList<>();
        listaDeAssistidos.add(filmeDoFernando);
        listaDeAssistidos.add(oPoderosoChefao);
        listaDeAssistidos.add(avatar);
        listaDeAssistidos.add(lost);

        for(Titulos item: listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && item instanceof Serie serie) {
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        System.out.println();

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println("Antes da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Depois da ordenação");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        System.out.println("Orgadando por ano");
        listaDeAssistidos.sort(Comparator.comparing(Titulos::getAnoDeLancamento));
        System.out.println(listaDeAssistidos);


    }
}
