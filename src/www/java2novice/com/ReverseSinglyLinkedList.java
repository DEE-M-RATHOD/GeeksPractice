package www.java2novice.com;

/**
 * Created by deepali on 17-08-2016.
 */
// write a sample code to reverse a singly linked list ny iterating through it only once
/*
Recursive method:

1. Divide the list into two parts : first node and rest of linked list
2. Call reverse for rest of the the linked list
3. Link rest to the first
4. Fix Head pointer*/
/*

3 methods:

1. public void add (T element)
2. public void traverse()
3. public void reverse()
*/

public class ReverseSinglyLinkedList<T> {
    private Node<T> headObject;
    Node<T> tempObject;
    public void add(T element){

        Node<T> nodeObject = new Node<T>();
        nodeObject.setValue(element);
        System.out.println("Adding :"+element);
        tempObject = headObject;

        while (true){
            if(tempObject == null){
                // since there is only one object, both head and tail points to the same object
                headObject = nodeObject;
                break;
            } else if (tempObject.getNextRef() == null){
                tempObject.setNextRef(nodeObject);
                break;
            } else{
                tempObject = tempObject.getNextRef();
            }
        }
    }
    public void traverse(){
        tempObject = headObject;
        while(true){
            if(tempObject == null){
                break;
            }
            System.out.println(tempObject.getValue() + "\t");
            tempObject = tempObject.getNextRef();
        }
    }
    public void reverse(){
        System.out.println("REversing linked list");
        Node<T> prev = null;
        Node<T> current = headObject;
        Node<T> next = null;

        while(current!= null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        headObject = prev;
    }
    public static void main(String[] args) {
        ReverseSinglyLinkedList<Integer> s1 = new ReverseSinglyLinkedList<>();
        s1.add(6);
        s1.add(5);
        s1.add(4);
        s1.add(3);
        s1.add(2);
        s1.add(1);
        System.out.println();
        s1.traverse();
        System.out.println();;
        s1.reverse();
        s1.traverse();

    }
}
class Node<T>{
    private Node<T> nextRef ;
    private T value;

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public Node<T> getNextRef(){
        return nextRef;
    }
    public void setNextRef(Node<T> nextRef){
        this.nextRef = nextRef;
    }
}
