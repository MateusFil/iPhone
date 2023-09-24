package Iphone;


    // Interface para o ReprodutorMusical
    interface Itunes {
        void play();
        void pause();
        void stop();
        void skipTrack();
        void previousTrack();
    }

    // Interface para o AparelhoTelefonico
    interface AparelhoTelefonico {
        void realizarChamada(String numero);
        void atenderChamada();
        void encerrarChamada();
        void enviarMensagem(String numero, String mensagem);
        void receberMensagem(String remetente, String mensagem);
    }

    // Interface para o NavegadorInternet
    interface Safari {
        void abrirPagina(String url);
        void fecharPagina();
        void navegarParaFrente();
        void navegarParaTras();
        void pesquisar(String termo);
    }



