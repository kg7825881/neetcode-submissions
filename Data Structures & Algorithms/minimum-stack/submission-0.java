class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(mainStack.isEmpty()){
            return;
        }
        int top = mainStack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
        if(mainStack.isEmpty()){
            return 0;
        }

        return mainStack.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty()){
            return 0;
        }

        return minStack.peek();
    }
}
