/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;

/**
 *
 * @author biga
 */
public abstract class ControllerArquivo {
    String rootFolder = System.getProperty("user.home");
    
    protected File path = null;
    protected String model = "";

    protected File file = null;
    public abstract String read();
    public abstract boolean write(boolean append);


    public File getFile() {
        return file;
    }
        
    // types: 0 (binary),  1 (text)
    public void setFile(String model, int typeFile ) {
        if (typeFile == 0) {
            rootFolder += "/binaryFolder/";
            
        } else if (typeFile == 1) {
            rootFolder += "/textFolder/";
            
        } 
        
        path = new File(rootFolder);
        
        if(!path.exists()){
            path.mkdir();
        }
        
        if (model.isEmpty()) {
            // arquivo vazio
        }
        this.model = model;
        file = new File(path,model);
    }
}
