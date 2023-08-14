package br.com.picpay;

import br.com.picpay.chain.Chain;

public class Etapa2 extends Chain<Context> {

    @Override
    public boolean execute(Context context) {
        if (context.getValue() == 2){
            context.setPassou(Boolean.FALSE);
            return false;
        }
        return true;
    }
    
}
