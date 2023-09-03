import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
StackUsingTwoQueues sq=new StackUsingTwoQueues();
sq.push(1);
sq.push(2);
sq.push(3);
sq.push(4);
sq.push(5);

System.out.println(sq.pop());
System.out.println(sq.pop());
System.out.println(sq.pop());
System.out.println(sq.peek());
}


public class StackUsingTwoQueues
{
    Queue<Integer> q1;
    Queue<Integer> q2;
    public StackUsingTwoQueues()
    {
      q1=new LinkedList<>();
      q2=new LinkedList<>();
    }
    
    public void push(int ele)
    {
        q2.add(ele);
        while(q1.size()>0)
        {
            q2.add(q1.remove());
        }
        
        Queue<Integer> q3=new LinkedList<>();
        q3=q1;
        q1=q2;
        q2=q3;
    }
    
    public int pop()
    {
        return q1.remove();
    }
    
    public int peek()
    {
        return q1.peek();
    }
    
}
