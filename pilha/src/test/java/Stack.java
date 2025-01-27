public class Stack {

    private Object[] myElements;
    private int quantity = 0;



    public Stack() {
        this.myElements = new Object[10];

    }
    public Stack( int max) {
        this.myElements = new Object[max];
    }

    public boolean isEmpty() {
        return (this.quantity == 0) ;
    }
    public boolean isFull() {
        return (this.quantity == myElements.length);
    }

    public int mySize() {
        return quantity;
    }


    public void pushing(Object myElement) {

        if(isFull()) {
                throw new FullStackException("Is full, cannot push elements");
        }

        this.myElements[quantity] = myElement;
        quantity++;

    }

    public Object pop() {
        if (this.isEmpty()) {
            throw new RemoveMyEmptyStackException("No elements in stack");
        }
        quantity--;
        return myElements[quantity];
    }

    public Object top() {
        return myElements[quantity - 1];
    }
}
