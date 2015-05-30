/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.service;

import java.sql.SQLException;
import java.util.List;
import pearson.cabservice.model.CabService;



/**
 *
 * @author heshanjayasinghe
 */
public interface CabServiceService {
    public void addCabService(CabService cabservice) throws ClassNotFoundException, SQLException;

    public CabService searchCabService(Integer cabserviceId) throws ClassNotFoundException, SQLException;

    public int UpdateCabService(CabService cabservice) throws ClassNotFoundException, SQLException;

    public void deleteCabService(Integer cabserviceId) throws ClassNotFoundException, SQLException;

    public List<CabService> searchCabServiceList() throws ClassNotFoundException, SQLException;
}
