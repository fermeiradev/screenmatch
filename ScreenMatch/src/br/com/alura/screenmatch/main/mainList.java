package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulos;

import java.util.ArrayList;

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

        ArrayList<Titulos> listaDeAssistidos = new ArrayList<>();
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
    }
}
