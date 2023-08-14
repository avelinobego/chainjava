package br.com.picpay;

import br.com.picpay.chain.Chain;

public class Etapa1 extends Chain<Context> {

    @Override
    public boolean execute(Context context) {
        if (context.getValue() == 1){
            context.setPassou(Boolean.FALSE);
            return false;
        }
        return true;
    }

    
}
