package structures.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> implements Stack<T> {

  private List<T> data;
  private int stackPointer;

  public ListStack() {

    data = new ArrayList<T>();
    stackPointer = 0;
  }

  @Override
  public T access(T searchItem) {
    while (stackPointer > 0) {
      T item = pop();
      if (searchItem.equals(item)) {
        return item;
      }
    }
    throw new IllegalArgumentException(" No matching data found");
  }

  @Override
  public void push(T item) {
    data.add(stackPointer++, item);
  }

  @Override
  public T pop() {
    return data.get(--stackPointer);
  }

  @Override
  public int size() {
    return stackPointer;
  }

  @Override
  public boolean contains(T item) {
    return data.contains(item);
  }
}
