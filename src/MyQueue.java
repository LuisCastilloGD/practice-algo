import java.util.Stack;

class MyQueue {

  private Stack firstStack;
  private Stack secondStack;

  public MyQueue() {
    firstStack = new Stack();
    secondStack = new Stack();
  }

  public void push(int x) {
    firstStack.push(x);
  }

  public int pop() {
    while (!firstStack.isEmpty()){
      secondStack.push(firstStack.pop());
    }

    int value = (int) secondStack.pop();

    while (!secondStack.isEmpty()){
      firstStack.push(secondStack.pop());
    }

    return value;
  }

  public int peek() {
    moveFromStack();

    int value = (int) secondStack.peek();

    while (!secondStack.isEmpty()){
      firstStack.push(secondStack.pop());
    }

    return value;
  }

  public boolean empty() {
    return firstStack.isEmpty() && secondStack.isEmpty();
  }

  private void moveFromStack(){
    while (!firstStack.isEmpty()){
      secondStack.push(firstStack.pop());
    }
  }

}