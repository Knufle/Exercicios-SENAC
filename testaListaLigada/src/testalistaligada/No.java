
package testalistaligada;


public class No {
    // um elemento do tipo int
    private int elemento;
    // referencia do proximo elemento da lista encadeada,
    // do proximo No da lista
    private No prox;

    public No(int elemento, No prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    @Override
    public String toString() {
        
        return this.elemento + ","+prox;
    }
    public int getElemento() {
        return this.elemento;
    }

    public No getProx() {
        return this.prox;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
