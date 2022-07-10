/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import models.Bus;

/**
 *
 * @author mauricio
 */
public interface BusDAO {
    
   public void Crear(Bus bus);
   public void Read();
   public void Update(Bus newBus);
   public void Delete(int id);  
    
}
