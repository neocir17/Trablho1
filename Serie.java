public class Serie {
     //Atributos da classe
     private int duracao, nTemporadas, eTemporadas;
     private String idiomaAudio;
     private String idiomaLegenda;
     private boolean estaPausado;
     private String nome;
     private int lancamento;
        
  
      //metodos Construtores
      public Serie(String nomeSerie, int temporadas, int episodiosPorTemporada, int duracao, int ano){
          this.nome = nomeSerie;
          this.nTemporadas = temporadas;
          this.eTemporadas = episodiosPorTemporada;
          this.lancamento = ano;
          this.duracao = duracao;
          this.idiomaAudio = "Português(Brasil)";
          this.idiomaLegenda = "Português(Brasil)";
          this.estaPausado = false;
      }
  
      //metodos da classe
      public void executar() {
          if(estaPausado == false){
              System.out.println("Iniciando: "+ getNome());
          }else{
              System.out.println("Processando");
          }
      }
  
      public void pausar() {
          estaPausado = true;
          System.out.println("Série pausada.");
      }
  
      public void mudarAudio() {
          if(idiomaAudio == "Inglês(Original)"){
              idiomaAudio = "Português(Brasil)";
          }else{
              idiomaAudio = "Inglês(Original)";
          }    
          
          System.out.println("Idioma alterado para: " + idiomaAudio);
      
      }
  
      public void mudarLegenda() {
          if(idiomaLegenda == "Filme sem legenda"){
              idiomaLegenda = "Português(Brasil)";
          }else{
              idiomaLegenda = "Filme sem legenda";
          }
          System.out.println("Legenda alterada para: "+ idiomaLegenda);
      }
  
      public String exibirDetalhes() {
          System.out.println("Detalhes da Série: " + getNome() + " // Quantidade de Temporadas: " + getNTemporadas() + " // Quantidade de episodios por temporada: " + getETemporadas());
          System.out.println("Media de minutos por episodio: " + getDuracao() +" Minutos" + "  // Ano de Lancamento: " + getLancamento());
          return null;
      }
  
  
  
      // Get & Set
      public int getDuracao() {
          return duracao;
      }
  
      public void setDuracao(int duracao) {
          this.duracao = duracao;
      }
  
      public int getNTemporadas() {
          return nTemporadas;
      }
  
      public void setNTemporadas(int temporadas) {
          this.nTemporadas = temporadas;
      }
  
      public int getETemporadas() {
          return eTemporadas;
      }
  
      public void setETemporadas(int eisodiosPorTemporada) {
          this.eTemporadas = eisodiosPorTemporada;
      }
  
      public String getNome() {
          return nome;
      }
  
      public void setNome(String nomeSerie) {
          this.nome = nomeSerie;
      }
  
      public int getLancamento() {
          return lancamento;
      }
  
      public void setLancamento(int ano) {
          this.lancamento = ano;
      }
    
}
