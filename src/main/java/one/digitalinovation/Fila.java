package one.digitalinovation;

public class Fila {

    private No refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public

    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }
}
