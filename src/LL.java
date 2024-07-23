import java.util.*;

public class LL {
Node head ;
int size = 0;
    class  Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add first in list
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    // add last in list
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return ;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        size++;

    }
    // delete first Node of list

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is already empty");
            return ;
        }
        head=head.next;
        size--;
    }

    // delete last Node of list

    public void deleteLast(){
        if(head==null){
            System.out.println("List is already empty");
            return ;
        }
        Node curr = head;
        while(curr.next.next !=null){
            curr=curr.next;
        }
        curr.next=null;
        size--;
    }
    //print list
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return ;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return  size;
    }

    public static  void main (String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("haril");
        list.addLast("barot");
        list.addLast("samaj");
        list.addLast("no");
        list.addLast("poiro");
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println("List Size is : " + list.getSize());
    }
}
