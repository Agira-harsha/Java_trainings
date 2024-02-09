package Genrics;

public class GenricsClass<T> {
    private  T data;

    public GenricsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
