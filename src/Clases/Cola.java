/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class Cola <T> {
    private Node First;
    private Node Last;
    private int size;

    public Cola() {
        this.First = null;
        this.Last = null;
        this.size = 0;
    }
    
    
    //verifica que la cola es vacia
    public boolean isEmpty(){
        return getFirst() == null;
    }

    
    /**
     * @return the First
     */
    public Node getFirst() {
        return First;
    }

    /**
     * @param First the First to set
     */
    public void setFirst(Node First) {
        this.First = First;
    }

    /**
     * @return the Last
     */
    public Node getLast() {
        return Last;
    }

    /**
     * @param Last the Last to set
     */
    public void setLast(Node Last) {
        this.Last = Last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
  
    
    
    /**
     * Metodo para insertar un elemento en la cola
     * @param elem Elemento a insertar
     */
    
    public void InsertInFinal(Object elem){
        Node nuevo = new Node(elem);
        if (isEmpty()){
            First = nuevo;
            First.setNext(Last);
            Last = nuevo;
            size++;
        }else{
            Last.setNext(nuevo);
            Last= nuevo;
            size++;    
        }
    }
    
 
    
    public void imprimir(){
        if (!isEmpty()){
            Node aux = this.getFirst();
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getElement()+" ");
                aux = aux.getNext();
            }
            
        }else{
            System.out.println("Lista vacía");
        }
    }
    
    //dispatch lo que hace es quitar de la cola y devolver el objeto que quito 
    
    public T dispatch() {
        if (!isEmpty()) {
            Node pointer = getFirst();
            setFirst(pointer.getNext());
            pointer.setNext(null);
            size--;
            return (T) pointer.getElement();
        }
        return null;
    }
    
    //remove lo que hace es quitar de la cola
    public void remove() {
        if (!isEmpty()) {
            Node pointer = getFirst();
            setFirst(pointer.getNext());
            pointer.setNext(null);
            size--;
        }
    }
    
}
