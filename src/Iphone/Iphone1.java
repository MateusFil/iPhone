package Iphone;

class iPhone implements Itunes, AparelhoTelefonico, Safari {
    private String modelo;
    private int armazenamento;
    private int bateria;
    private boolean ligado;
    private boolean status;

    public iPhone(String modelo, int armazenamento, int bateria) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.bateria = bateria;
        this.ligado = false;
        this.status = false;

    }

    public void UsuarioStatus() {
        if (status == true){
            System.out.println("O dispotivo está ocupado, deixe uma mensagem no correio de voz");
        }else System.out.println("Chamada em andamento:");


    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public String getStatus() {
        return ligado ? "Ligado" : "Desligado";
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando a música.");
    }

    @Override
    public void stop() {
        System.out.println("Parando a música...");
    }

    @Override
    public void skipTrack() {
        System.out.println("Avançando para a próxima faixa de música...");
    }

    @Override
    public void previousTrack() {
        System.out.println("Retornando para a faixa anterior");
    }

    @Override
    public void realizarChamada(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void receberMensagem(String remetente, String mensagem) {
        System.out.println("Mensagem recebida de " + remetente + ": " + mensagem);
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Carregando página : " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando a página da web atual");
    }

    @Override
    public void navegarParaFrente() {
        System.out.println("Navegando para a próxima página");
    }

    @Override
    public void navegarParaTras() {
        System.out.println("Voltando para a página anterior...");
    }

    @Override
    public void pesquisar(String PalavraChave) {
        System.out.println("Pesquisando na web por: " + PalavraChave);
    }
}

class Main {
    public static void main(String[] args) {
        iPhone iPhoneTeste = new iPhone("iPhone 15", 512, 60);
        iPhoneTeste.ligar();
        System.out.println("Status do iPhone: " + iPhoneTeste.getStatus());
        iPhoneTeste.realizarChamada("(15)99707-4313");
        iPhoneTeste.UsuarioStatus();
        iPhoneTeste.enviarMensagem("(15)99707-4313","Olá me de uma oportunidade de estágio, preciso muito aprender");
        iPhoneTeste.play();
        iPhoneTeste.abrirPagina("https://github.com/MateusFil");
    }
}
