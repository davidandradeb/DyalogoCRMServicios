
import com.dyalogo.crm.servicio.Servicio;
import com.dyalogo.crm.servicios.bd.tablas.Emarec;
import com.dyalogo.crm.servicios.dao.DAOEmarec;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class HAsignacionDinamica extends Servicio {
    
    @Override
    public void run() {
        while (true) {
            DAOEmarec daoEmarec_t = new DAOEmarec();
            
            try {
                for (Emarec mail : daoEmarec_t.getTodos()) {
                    System.out.println("Asunto: " + mail.getEMARECAsuntob());
                    log.info("Asunto: " + mail.getEMARECAsuntob());
                }
                
                sleep(5000);
            } catch (Exception e) {
                log.error("", e);
            }
        }
    }
    
}
