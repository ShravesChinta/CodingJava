public class Queue
{
    private int capacity;
    private int front;
    private int rear;
    private int[] q;
    
    public Queue(int capacity)
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
        if(rear==q.length-1)
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
     q[rear++]=ele;
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
            front++;
        }
        return ele;
        
    }
    
}
