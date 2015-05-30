/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.dao;

import java.sql.SQLException;
import java.util.List;
import pearson.cabservice.model.CabService;


/**
 *
 * @author heshanjayasinghe
 */
public interface CabServiceDAO{
     public void AddCabService(CabService cabservice) throws ClassNotFoundException, SQLException;

    public CabService SearchCabService(Integer cabserviceId) throws ClassNotFoundException, SQLException;

    public int UpdateCabService(CabService cabservice) throws ClassNotFoundException, SQLException;

    public void DeleteCabService(Integer cabserviceId) throws ClassNotFoundException, SQLException;

    public List<CabService> SearchCabServiceList() throws ClassNotFoundException, SQLException;
}
