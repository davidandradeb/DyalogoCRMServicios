
import com.dyalogo.crm.servicio.Servicio;
import com.dyalogo.crm.servicios.bd.dao_general.ExcepcionBd;
import com.dyalogo.crm.servicios.config.Configuracion;
import com.dyalogo.crm.servicios.general.Constantes;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class PrimerServicioDyalogo extends Servicio {

    
    
    public PrimerServicioDyalogo() {
        try {
            Constantes.CONFIGURACION_C = new Configuracion(PrimerServicioDyalogo.class);
        } catch (Exception e) {
            log.error("", e);
        }
    }

    public static void main(String[] args) throws ExcepcionBd, Exception {
        PrimerServicioDyalogo servicio = new PrimerServicioDyalogo();

        new HAsignacionDinamica().start();
        
        servicio.start();
    }
}
