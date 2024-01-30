package entities;

public class LinkedList<TYPE> {

    private Elemento<TYPE> primeiro;
    private Elemento<TYPE> ultimo;
    private int tamanho;


    public LinkedList() {
        this.tamanho = 0;
    }

    public Elemento<TYPE> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento<TYPE> primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento<TYPE> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento<TYPE> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(TYPE novoValor) {
        Elemento<TYPE> elemento = new Elemento<TYPE>(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = elemento;
            this.ultimo = elemento;
        } else {
            this.ultimo.setProximo(elemento);
            this.ultimo = elemento;
        }
        this.tamanho++;
    }

    public void remover(String valorProcurado) {
        Elemento<TYPE> anterior = null;
        Elemento<TYPE> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valorProcurado)) {
                if (this.tamanho == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();

        }
    }

    public Elemento<TYPE> get(int posição) {
        Elemento atual = this.primeiro;
        for (int i = 0; i < posição; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }


}
