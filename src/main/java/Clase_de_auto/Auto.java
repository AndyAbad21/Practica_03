/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clase_de_auto;

/**
 * 
 * @author Andy Abad
 */
public class Auto {
    private String color, modelo;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean esClasico(){
        var retorno = false;
        if(this.year<=1980) {
            retorno = true;
        }else {
            retorno = false;
        }
        return retorno;
    }


    
}
