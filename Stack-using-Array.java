

public class Main
{
	public static void main(String[] args) {
	
	Stack s=new Stack(10);
	s.pop();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	s.push(6);
	System.out.println(s.pop());
		System.out.println(s.pop());
			System.out.println(s.peek());
	
	}
}
import java.util.EmptyStackException;
public class Stack
{
    private int top;
    private int[] stack;
    private int capacity;
    public Stack(int capacity)
    {
        this.top=-1;
        this.capacity=capacity;
        this.stack=new int[capacity];
    }
    
    public boolean isEmpty()
    {
        if(top==-1)
        return true;
        
        return false;
    }
    
    public boolean isFull()
    {
        if(top==stack.length-1)
        {
            return true;
        }
        return false;
        
    }
    
    public void push(int ele)
    {
        if(isFull())
        {
            System.out.println("The stack is full");
        }
        else{
            stack[++top]=ele;
        }
        
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
     
            int pop_ele=stack[top--];
            return pop_ele;
        }
   
    
    public int peek()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
       
            int peek_ele=stack[top];
            return peek_ele;
    }
}
