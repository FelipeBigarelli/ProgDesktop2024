package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author biga
 */
public class ControllerArquivoBinary extends ControllerArquivo {
    
    private ObjectInputStream reader = null;
    private ObjectOutputStream writer = null;
    public ArrayList<Object> genericList = null;
    
    @Override
    public String read() {
        try {
            reader = new ObjectInputStream(new FileInputStream(file));
            genericList = (ArrayList<Object>) reader.readObject();
            reader.close();
            return "1";
        } catch (ClassNotFoundException error) {
            System.err.println(error.getMessage());

        } catch (IOException error) {
            System.err.println(error.getMessage());
        }
        genericList = new ArrayList<Object>();
        return "0";
    }

    @Override
    public boolean write(boolean append) {
        if (file != null) {
            try {
                writer = new ObjectOutputStream(new FileOutputStream(file, false)); //False por default, pois sempre está salvando a estrutura inteira do Array.
                writer.writeObject(genericList);
                writer.close();
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage());
            }
        }
        return false;
    }
}
