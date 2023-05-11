package banco;


public class Ejecutor {

    public static void main(String[] args) {
        
        Cliente clt = new Cliente("Alex","Morales", "1922649881");
        
        Banco bn = new Banco("Banco de Loja",16 );
        
        Cheque cq = new Cheque(clt, bn, 35000);
        
        
        Cliente clt1 = new Cliente("Gabriel","Salinas", "19096415");
        
        Banco bn1 = new Banco("Banco del Pacifico", 1077);
        
        Cheque cq1 = new Cheque(clt1, bn1, 10000);
        
        
        cq.calcularComision();
        
        System.out.printf("%s\n", cq);
        System.out.printf("%s\n", cq1);
    }
    
}
