package Modelo;

public class DoubleLink {
    private Movie movie;
    private DoubleLink next;
    private DoubleLink prev;

    public DoubleLink(Movie movie) {
        this.movie = movie;
        this.next = null;
        this.prev = null;
    }

    public Movie getData() {
        return movie;
    }

    public DoubleLink getNext() {
        return next;
    }

    public void setNext(DoubleLink next) {
        this.next = next;
    }

    public DoubleLink getPrev() {
        return prev;
    }

    public void setPrev(DoubleLink prev) {
        this.prev = prev;
    }
    
    public void displayLink() {
        System.out.print(getData().toString());
    }
    
}

