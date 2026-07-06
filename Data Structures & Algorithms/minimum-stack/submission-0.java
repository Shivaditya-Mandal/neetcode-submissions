class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> minStack; 

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            minStack.push(Math.min(val,minStack.peek()));
        }
    }   
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        int val = stack.peek();
        return val;
    }
    
    public int getMin() {
        int min = minStack.peek();
        return min;
    }
}
