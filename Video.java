public class Video {
    
    Filme filme1 = new Filme ("O Poco", 90, "Cenas e momentos");
    filme1.exibirDetalhes();
    filme1.executar();
    filme1.pausar();
    filme1.executar();
    filme1.mudarAudio();
    filme1.mudarAudio();
    filme1.mudarLegenda();
    filme1.mudarLegenda();
    System.out.println();

    System.out.println("");
    Filme filme2 = new Filme ("Power",115, "Acao");
    System.out.println();
    filme2.exibirDetalhes();
    filme2.executar();
    filme2.pausar();
    filme2.executar();
    filme2.mudarAudio();
    filme2.mudarAudio();
    filme2.mudarLegenda();
    filme2.mudarLegenda();
    System.out.println();

    System.out.println("");
    Serie serie1 = new Serie ("O Atirador", 3, 31, "Acao" );
    System.out.println();
    serie1.exibirDetalhes();
    serie1.executar();
    serie1.pausar();
    serie1.executar();
    serie1.mudarAudio();
    serie1.mudarAudio();
    serie1.mudarLegenda();
    serie1.mudarLegenda();
    System.out.println();

    System.out.println("");
    Serie serie2 = new Serie ("Perdidos no Espaco", 2, 20, "Ficcao cientifica e aliens");
    System.out.println();
    serie2.exibirDetalhes();
    serie2.executar();
    serie2.pausar();
    serie2.executar();
    serie2.mudarAudio();
    serie2.mudarAudio();
    serie2.mudarLegenda();
    serie2.mudarLegenda();
}
