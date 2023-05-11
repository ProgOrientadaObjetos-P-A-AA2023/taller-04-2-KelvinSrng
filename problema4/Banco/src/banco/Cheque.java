package banco;


public class Cheque {
    
    private Cliente clt;
    private Banco bnc;
    
    public Cheque(Cliente ct, Banco bn){
        clt = ct;
        bnc = bn;
        
    }
    
    public void setClt(Cliente x) {
        clt = x;
    }
    
    public void setBnc(Banco x) {
        bnc = x;
    }
    
    public Cliente getClt() {
        return clt;
    }
    
    public Banco getBnc() {
        return bnc;
    }
}
