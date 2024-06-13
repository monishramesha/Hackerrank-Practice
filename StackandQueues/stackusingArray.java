
class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    top++;
	    arr[top] = a;
	    //System.out.println(arr);
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
	    if(top<0)   return -1;
	    int ret = arr[top];
	    top--;
	    //System.out.println(arr);
	    return ret;
        
	}
}
