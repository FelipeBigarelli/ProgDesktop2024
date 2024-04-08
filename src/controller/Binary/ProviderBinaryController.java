/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Binary;

import controller.ControllerArquivoBinary;
import java.util.Iterator;
import models.Provider;

/**
 *
 * @author biga
 */
public class ProviderBinaryController extends ControllerArquivoBinary {
    public ProviderBinaryController(int typeFile) {
        setFile("Providers", typeFile);
    }
    
        public boolean remove(int id) {
        int check = genericList.size();
        
        Iterator iterator = genericList.iterator(); 
        
        while (iterator.hasNext()) 
        { 
            Provider x = (Provider)iterator.next(); 
            
            if (x.getId() == id) {
                iterator.remove(); 
                write(false);
            }
        }    
        
        return check != genericList.size() ? true : false;
    }
    
    public boolean Update(Provider model) {
        try {
            genericList.forEach((item) -> {
                Provider edited = (Provider) item;
                if (edited.getId() == model.getId()) {
                    edited.nome = model.nome;
                    edited.cnpj = model.cnpj;
                    write(false);
                }
            });
            
            return true;
            
        } catch (Exception e){
            return false;
        }
    }
}
