/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro;

import java.util.ArrayList;

/**
 *
 * @author Mendoza
 */
public class Carro {
    private static ArrayList<Carro> listaCarros = new ArrayList<>();

    private String modelo;
      private String color;
    private String pintura;
     private String placa;
     private String tipo;
     private String año;
     private String modalidad_seguro;
     
     
     
    

    public Carro(String modelo, String color, String pintura, String placa, String tipo, String año, String modalidad_seguro) {
        this.modelo = modelo;
        this.color = color;
        this.pintura = pintura;
        this.placa = placa;
        this.tipo = tipo;
        this.año = año;
        this.modalidad_seguro = modalidad_seguro;
        listaCarros.add(this);
    }
    public static void IniciaListaCarros(){
        Carro carro= new Carro("Toyota" , "Azul" ,"metalizado" , "ALM-561" ,"MINI","2010","Terceros");
        
    }
    public static Carro buscarCarroPorPlaca(String placa) {
        for (Carro carro : listaCarros) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null;
    }
   
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getPintura() {
        return pintura;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAño() {
        return año;
    }

    public String getModalidad_seguro() {
        return modalidad_seguro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setModalidad_seguro(String modalidad_seguro) {
        this.modalidad_seguro = modalidad_seguro;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", color=" + color + ", pintura=" + pintura + ", placa=" + placa + ", tipo=" + tipo + ", a\u00f1o=" + año + ", modalidad_seguro=" + modalidad_seguro + '}';
    }
    
    }
