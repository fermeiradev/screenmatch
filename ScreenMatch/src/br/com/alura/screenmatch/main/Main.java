package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme oPoderosoChefao = new Filme("O Poderoso Chefão", 1970);
        oPoderosoChefao.setDuracaoEmMinutos(180);


        oPoderosoChefao.exibeFichaTecnica();
        oPoderosoChefao.avalia(8);
        oPoderosoChefao.avalia(5);
        oPoderosoChefao.avalia(10);

        // System.out.println(oPoderosoChefao.somaDasAvaliacoes);
        // System.out.println(oPoderosoChefao.totalDeAvaliacoes);
        System.out.println("Total de avaliações: " + oPoderosoChefao.getTotalDeAvaliacoes());
        System.out.println(oPoderosoChefao.retornaMedia());
        System.out.println("Duração do filme: " + oPoderosoChefao.getDuracaoEmMinutos());
        System.out.println();

        // Definindo o objeto lost, colocando suas informações e imprimindo sua duração com base no número de temporadas e minutos por episodio
        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do para maratonar Lost: " + lost.getDuracaoEmMinutos());
        System.out.println();

        // Definindo o objeto avatar e colocando suas informações e notas
        Filme avatar = new Filme("Avatar", 2023);
        avatar.setDuracaoEmMinutos(200);
        avatar.avalia(10);
        avatar.avalia(8);
        avatar.avalia(7);
        System.out.println();

        // Definindo o nome do objeto da classe CalculadoraDeTempo. Calculando o tempo dos seguintes objetos: Filmes "meuFIlme" , "avatar" e da Serie "lost"
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(oPoderosoChefao);
        calculadora.inclui(avatar);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        System.out.println();

        // Definindo como vai ser o nome do objeto da classe FiltroRecomendacao e filtrando o filme "avatar"
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.print(avatar.getNome() +  " - ");
        filtro.filtra(avatar);
        System.out.println();

        // Definindo algumas informações do episodio 1 da serie lost e filtrando ele para ver se é bom ou não
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setNome("Piloto");
        episodio.setTotalDeVisualizacoes(300);
        System.out.print(episodio.getNome() +  " - ");
        filtro.filtra(episodio);
        System.out.println();

        // Definindo atributos do filmeDoFernando com base na classe Filme
        Filme filmeDoFernando = new Filme("Dogville", 2003);
        filmeDoFernando.setDuracaoEmMinutos(300);
//        filmeDoFernando.setNome("Dogville");
//        filmeDoFernando.setAnoDeLancamento(2003);
        filmeDoFernando.avalia(10);
        System.out.println();

        //Criando o primeiro ArrayList

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoFernando);
        listaDeFilmes.add(oPoderosoChefao);
        listaDeFilmes.add(avatar);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());

        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());

    }
}