import java.util.Scanner;

class Lll{
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void insertBeginn(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void insertEnt(int data){
        Node node = new Node(data);
        if(head == null){
            head = tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertrando(int d,int data){
        Node node = new Node(data);
        if(d == 0){
            insertBeginn(data);
            return;
        }
        if(d == size-1){
            insertEnt(data);
            return;
        }
        Node temp = head;
        for(int i = 0; i<d-1 ; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteBegi(){
        Node temp = head;
        head = head.next;
        temp = null;
        size--;
    }

    public void deleteEn(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteRando(int d){
        if(d == 0){
            deleteBegi();
            return;
        }
        if(d == size-1){
            deleteEn();
            return;
        }
        Node temp = head;
        Node temp1 = temp.next;
        for(int i = 0; i<d-1 ; i++){
            temp = temp.next;
            temp1 = temp1.next;
        }
        temp.next = temp1.next;
        temp1.next = null;
        size--;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
class LinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Lll l = new Lll();
        l.insertBeginn(3);
        l.insertBeginn(2);
        l.insertEnt(4);
        l.insertEnt(5);
        l.insertrando(2, 6);
        l.deleteBegi();
        l.deleteEn();
        l.deleteRando(1);
        l.display();
    }
}

