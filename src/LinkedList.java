public class LinkedList<T> {
    
    private Node<T> head;

    LinkedList()
    {
        this.head=null;
    }

    Node<T> get_head()
    {
        return this.head;
    }

    void add(T data)
    {
        Node<T> newNode = new Node<T>(data);
        if(head==null)
            head=newNode;
        else 
        {
            Node<T> tmp = head;
            while(tmp.next!=null)
                tmp=tmp.next;
            tmp.next=newNode;
        }
    }

    void display()
    {
        Node<T> tmp=head;
        while(tmp!=null)
        {
            System.out.print(tmp.data + "->");
            tmp=tmp.next;
        }
        System.out.println("null");
    }

    void reverse()
    {
        Node<T> prev2=null,prev1=null,curr=head;
        while(curr!=null)
        {
            prev2=prev1;
            prev1=curr;
            curr=curr.next;
            prev1.next=prev2;
        }
        head=prev1;
    }
}
