package br.com.picpay;

public class Context {
    private Integer value;
    private Boolean passou = Boolean.TRUE;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Boolean getPassou() {
        return passou;
    }

    public void setPassou(Boolean passou) {
        this.passou = passou;
    }

}
