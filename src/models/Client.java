/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author biga
 */
public class Client implements java.io.Serializable{
    public int id;
    public String nome;
    public String endereço;

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}