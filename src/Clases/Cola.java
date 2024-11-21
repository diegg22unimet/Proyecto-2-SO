/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class Cola<T> {
    private Node<T> First;
    private Node<T> Last;
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
        } else{
            Last.setNext(nuevo);
            Last= nuevo;
        }
        size++;
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
    
    public void removeN(T item) {
        Node current = getFirst();
        Node previous = null;

        while (current != null) {
            if (current.getElement().equals(item)) {
                if (previous == null) {
                    setFirst(current.getNext());
                    if (getFirst() == null) {
                        setLast(null);
                    }
                } else {
                    Node aux = previous.getNext();
                    aux.setNext(current.getNext());
                    if (current.getNext() == null) {
                        setLast(previous);
                    }
                }
                size--;
                return;
            }
            previous = current;
            current = current.getNext();
        }
    }
}
