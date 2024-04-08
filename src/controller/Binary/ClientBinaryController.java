/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Binary;

import controller.ControllerArquivoBinary;
import java.util.Iterator;
import models.Client;

/**
 *
 * @author biga
 */
public class ClientBinaryController extends ControllerArquivoBinary {
    
    public ClientBinaryController(int typeFile) {
        setFile("Clients", typeFile);
    }

    public boolean remove(int id) {
        int check = genericList.size();
        
        Iterator iterator = genericList.iterator(); 
        
        while (iterator.hasNext()) 
        { 
            Client x = (Client)iterator.next(); 
            
            if (x.getId() == id) {
                iterator.remove(); 
                write(false);
            }
        }
        
        return check != genericList.size() ? true : false;
    }
    
    public boolean Update(Client model) {
        try {
            genericList.forEach((item) -> {
                Client edited = (Client) item;
                
                if (edited.getId() == model.getId()) {
                    edited.nome = model.nome;
                    edited.endereço = model.endereço;
                    write(false);
                }
            });
            
            return true;
            
        } catch (Exception e){
            return false;
        }
    }
}
