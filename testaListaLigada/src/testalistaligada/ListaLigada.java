
package testalistaligada;


public class ListaLigada {
    // endereço inicial da lista
    // ou seja o primeiro elemento da lista
    private No inicio;
    public ListaLigada(){
        this.inicio = null;
    }
    public void addInicio( int elemento ){
        this.inicio = new No(elemento,this.inicio); 
    }
    // retira o primeiro elemento da lista e
    // retorna o valor do elemento removido
    public int remInicio(){
        
        int elemento = this.inicio.getElemento();
        this.inicio = this.inicio.getProx();
        return elemento;
    
    }
    /*
    Implemente um método que faz a remoção no final da lista ligada.
    Tentar Fazer
    */
    public int remFinal(){
        
        return 0;
    }
    // se inicio igual a null lista vazia
    public boolean isEmpty(){
        return this.inicio == null;   
    } 
    
    public int buscaLinear(int x){
        No aux = this.inicio;
        int idx = 0;
        while( aux != null ){
            if( x == aux.getElemento())
                return idx;
            
            aux = aux.getProx();
            idx++;
        }
        return -1;        
    }
    public int buscaLinearFor(int x){
        int idx=0;
        for(No aux = this.inicio;aux != null;aux = aux.getProx(),idx++)
            if( x == aux.getElemento())
                return idx;
        
        return -1;        
    }
    
    @Override
    public String toString() {
        return "ListaLigada:" + inicio ;
    }
    
    public void enfileira(int E){
        No Aux, Ant;
        Ant = null;
        Aux = this.inicio;
        while (Aux != null){
        Ant = Aux;
        Aux = Aux.getProx();
    }
        No Novo = new No(E,null);
        if(Ant == null)// Lista vazia
            this.inicio = Novo;
        else
            Ant.setProx(Novo);
    }
    
    public void insereOrdenado(int E){
        No Aux, Ant;
        Ant = null;
        Aux = this.inicio;
        while (Aux != null && Aux.getElemento() < E){
            Ant = Aux;
            Aux = Aux.getProx();
        }
        
        No Novo = new No(E,Aux);
        if(Ant == null)// Lista vazia
            this.inicio = Novo;
        else
            Ant.setProx(Novo);
    }
    
}

