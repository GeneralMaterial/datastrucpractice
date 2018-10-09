package structures.stack;

public class BasicStack<X> implements Stack<X> {

  private X[] data;

  private int stackPointer;

  @SuppressWarnings("unchecked")
  public BasicStack() {
    data = (X[]) new Object[1000];
    stackPointer = 0;
  }

  @Override
  public void push(X newItem) {
    if (stackPointer == 999) {
      throw new IllegalStateException("No space left for items");
    }
    data[stackPointer++] = newItem;
  }

  @Override
  public X pop() {

    if (stackPointer == 0) {
      throw new IllegalStateException("No more items on the stack");
    }
    return data[--stackPointer];
  }

  @Override
  public boolean contains(X searchItem) {
    boolean found = false;
    for (X item : data) {
      if (searchItem.equals(item)) {
        found = true;
        break;
      }
    }

    return found;
  }

  @Override
  public X access(X item) {
    while (stackPointer > 0) {
      X tmp = pop();
      if (tmp.equals(item)) {
        return tmp;
      }
    }
    throw new IllegalArgumentException("Could not found item on the stack " + item);
  }

  @Override
  public int size() {
    return stackPointer;
  }
}
