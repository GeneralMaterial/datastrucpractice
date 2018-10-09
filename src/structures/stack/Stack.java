package structures.stack;

public interface Stack<T> {

  T access(T item);

  void push(T item);

  T pop();

  int size();

  boolean contains(T item);
}
