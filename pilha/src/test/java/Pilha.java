public class Pilha {

    private Object myElement;
    private int quantity;

    public boolean isEmpty() {
        return (myElement == null) ;
    }

    public int mySize() {
        return quantity;
    }


    public void pushing(Object myElement) {
        this.myElement = myElement;
        quantity++;

    }

    public String top() {
        return this.myElement.toString();
    }
}
