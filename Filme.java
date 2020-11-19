public class Filme {
       // Atributos
       private int duracao;
       private String idiomaAudio;
       private String idiomaLegenda;
       private boolean estaPausado;
       private String nome;
       private int genero;
   
       // metodos construtores
       public Filme(String nomeFilme, int duracaoFilme, String generoFilme ){
           this.nome = nomeFilme;
           this.duracao = duracaoFilme;
           this.genero = generoFilme;
           this.idiomaAudio = "Portugês(Brasil)";
           this.idiomaLegenda = "Portugês(Brasil)";
           this.estaPausado = false;
       }
   
       // metodos especifico da classe 
       public void execultar(){
           if(estaPausado == false){
               System.out.println("Iniciou o filme: "+ getNome());
           }else{
               System.out.println("Processando");
           }
       }
   
       public void pausar(){
           estaPausado = true; 
           System.out.println("O filme está pausado.");
           }
           
           public void mudarAudio(){
               if(idiomaAudio == "Inglês(Original)"){
                   idiomaAudio = "Português(Brasil)";
               }else{
                   idiomaAudio = "Inglês(Original)";
               }    
               
               System.out.println("Idioma alterado para: " + idiomaAudio);
           
           }
   
           public void mudarLegenda(){
               if(idiomaLegenda == "Filme sem legenda"){
                   idiomaLegenda = "Português(Brasil)";
               }else{
                   idiomaLegenda = "Filme sem legenda";
               }
               System.out.println("Legenda alterada para: "+ idiomaLegenda);
           }
             
           public void exibirDetalhes(){
            System.out.println("Detalhes do filme: " + getNome() + " Autor do Filme: " + getAutor() + " Duracao do Filme: " + getDuracao() + " Minutos" );
           }
       
       
       
           // Getter e setters
       
           public int getDuracao() {
               return duracao;
           }
       
           public void setDuracao(int duracaoFilme) {
               this.duracao = duracaoFilme;
           }
       
           public String getNome() {
               return nome;
           }
       
           public void setNome(String nomeFilme) {
               this.nome = nomeFilme;
           }
       
           public int getGenero() {
               return genero;
           }
       
           public void setgeneros(int generoFilme) {
               this.genero = generoFilme;
           }
       
             
       
       }
