/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Text;

import controller.ControllerArquivoTexto;

/**
 *
 * @author biga
 */
public class ClientController extends ControllerArquivoTexto {

    public ClientController(int typeFile) {
        setFile("Clients", typeFile);
    }

}
