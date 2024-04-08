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
public class ProductController extends ControllerArquivoTexto {
    public ProductController(int typeFile) {
        setFile("Products", typeFile);
    }
}
