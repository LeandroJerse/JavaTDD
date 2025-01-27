public class Stack {

    private Object[] myElements = new Object[10];
    private int quantity = 0;

    public boolean isEmpty() {
        return (this.quantity == 0) ;
    }

    public int mySize() {
        return quantity;
    }


    public void pushing(Object myElement) {
        this.myElements[quantity] = myElement;
        quantity++;

    }

    public Object pop() {
        if (this.isEmpty()) {
            return null;
        }
        quantity--;
        return myElements[quantity];
    }

    public Object top() {
        return myElements[quantity - 1];
    }
}
