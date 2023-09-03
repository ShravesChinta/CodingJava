import java.util.*;
public class StackUsingQueue
{
    Queue<Integer> q;
    public StackUsingQueue()
    {
        q=new LinkedList<>();
    }
    
    public void push(int ele)
    {
        q.add(ele);
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
    }
    
    public int pop()
    {
        return q.remove();
    }
    public int peek()
    {
        return q.peek();
    }
}
