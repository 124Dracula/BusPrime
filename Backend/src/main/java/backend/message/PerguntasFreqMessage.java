package backend.message;

import java.util.ArrayList;

public class PerguntasFreqMessage {
    private ArrayList<PerguntaFreqMessage> perguntas;

    public PerguntasFreqMessage(ArrayList<PerguntaFreqMessage> perguntas) {
        this.perguntas = perguntas;
    }

    public ArrayList<PerguntaFreqMessage> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(ArrayList<PerguntaFreqMessage> perguntas) {
        this.perguntas = perguntas;
    }
}
