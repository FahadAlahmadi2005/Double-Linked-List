/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms1;

/**
 *
 * @author fhad4
 * @param <E>
 */
public class DoubleNode <E>{
    
    E data;
    DoubleNode<E> next = null;
    DoubleNode<E> prev = null;
    
    DoubleNode(E data){
    
        this.data = data;
    }
}
