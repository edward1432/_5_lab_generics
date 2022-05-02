package _3_todo;

public interface GenericInterface<T, U> {

    U doSomeOperations(T t);
    T doReverseOperations(U u);
}
