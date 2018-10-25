
package testalistaligada;

/**
 *
 * @author fabio.aglubacheski
 */
public class TestaListaLigada {

    
    public static void main(String[] args) {
       ListaLigada lista;
       lista = new ListaLigada();
        
       lista.addInicio(50);
       lista.addInicio(40);
       lista.addInicio(30);
       lista.addInicio(20);
       lista.addInicio(10);
       
       System.out.println(lista);
       
       lista.insereOrdenado(15);
       
       System.out.println(lista);
       //System.out.println("busca linear:"+lista.buscaLinear(40));
       //System.out.println("busca linear:"+lista.buscaLinearFor(40));
    }
    
}
