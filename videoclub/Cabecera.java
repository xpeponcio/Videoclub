package videoclub;

import java.util.Date;

public class Cabecera {
    Cliente Cliente;
    Date Fecha_entrega;
    
    void insertarCabecera(Cliente Cliente, Date Fecha_entrega){
        this.Cliente = Cliente;
        this.Fecha_entrega = Fecha_entrega;
    }
    
    void eliminarCabecera(){
        
    }
}
