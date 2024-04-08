package controller.Binary;

import controller.ControllerArquivoBinary;
import java.util.Iterator;
import models.Product;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author biga
 */
public class ProductBinaryController extends ControllerArquivoBinary {
    public ProductBinaryController(int typeFile) {
        setFile("Products", typeFile);
    }
    
    public boolean remove(int id) {
        int check = genericList.size();
        
        Iterator iterator = genericList.iterator(); 
        
        while (iterator.hasNext()) 
        { 
            Product x = (Product)iterator.next();
            
            if (x.getId() == id) {
                iterator.remove(); 
                write(false);
            }
        }             
        
        return check != genericList.size() ? true : false;
    }
    
    public boolean Update(Product model) {
        try {
            genericList.forEach((item) -> {
                Product edited = (Product) item;
                if (edited.getId() == model.getId()) {
                    edited.nome = model.nome;
                    edited.tipo = model.tipo;
                    write(false);
                }
            });
            
            return true;
            
        } catch (Exception e){
            return false;
        }
    }
    
}
