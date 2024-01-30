package entities;

public class Elemento<TYPE> {

    private TYPE valor;

    private Elemento<TYPE> proximo;

    public Elemento(TYPE valor) {
        this.valor = valor;
    }

    public TYPE getValor() {
        return valor;
    }

    public void setValor(TYPE valor) {
        this.valor = valor;
    }

    public Elemento<TYPE> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<TYPE> proximo) {
        this.proximo = proximo;
    }
}
