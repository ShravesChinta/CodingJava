public class Main
{
	public static void main(String[] args) {
	
	CQueue q=new CQueue(10);
	q.Enqueue(1);
	q.Enqueue(2);
	q.Enqueue(3);
	q.Enqueue(4);
	q.Enqueue(5);
	q.Enqueue(6);
	q.Enqueue(7);
	System.out.println(q.Dequeue());
	System.out.println(q.Dequeue());
	
	
	}
}


public class CQueue
{
    private int capacity;
    private int front;
    private int rear;
    private int[] q;
    
    public CQueue(int capacity)
    {
        this.capacity=capacity;
        this.rear=-1;
        this.front=-1;
        this.q=new int[capacity];
    }
    
    public boolean isEmpty()
    {
        if(front==-1 && rear==-1)
        return true;
        
        return false;
    }
    
    public boolean isFull()
    {
        if((rear+1)%capacity==front)
        {
            return true;
        }
        return false;
    }
    
    public void Enqueue(int ele)
    {
     if(isFull())
     return;
     else if(isEmpty())
     {
         front=0;
         rear=0;
     }
     else{
         rear=(rear+1)%capacity;
     }
     
     q[rear]=ele;
     }
        
 
    
    public int Dequeue()
    {
        
        if(isEmpty())
        return -1;
         int ele=q[front];
        if(rear==front)
        {
            rear=-1;
            front=-1;
        }
        else{
            front=(front+1)%capacity;
        }
        return ele;
        
    }
    
}
