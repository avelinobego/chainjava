package br.com.picpay.chain;

public abstract class Chain<T> {
    private Chain<T> next;

    public abstract boolean execute(T context);

    public void start(T context) {
        if (execute(context) && this.next != null) {
            next.start(context);
        }
    }

    public void setNext(Chain<T> next) {
        this.next = next;
    }

}
