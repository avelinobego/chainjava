package br.com.picpay;

public class Main {
    public static void main(String[] args) {

        Etapa1 etapa1 = new Etapa1();
        Etapa2 etapa2 = new Etapa2();
        Etapa3 etapa3 = new Etapa3();

        etapa1.setNext(etapa2);
        etapa2.setNext(etapa3);

        Context context = new Context();
        context.setValue(2);

        etapa1.start(context);

        System.out.println(context.getPassou());

    }
}