package interfaces;

public interface PathInterface<T> {
    
    T getFirst();
    PathInterface<T> getRest();
}
