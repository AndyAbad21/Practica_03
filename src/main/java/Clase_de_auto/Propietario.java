/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clase_de_auto;

/**
 * 
 * @author Andy Abad
 */
public class Propietario
{
        private String nombre, nacionalidad;
    private int edad;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }

    public String esDeNacionalidad() {

        var retorno = "EAR";
        var primerCaracterPais = this.nacionalidad.charAt(0);
        switch (primerCaracterPais) {
            case 'E':
                retorno = "ECUATORIANA";
                break;
            case 'U':
                retorno = "AMERICANA";
                break;
            case 'R':
                retorno = "RUSA";
                break;
        }
        return retorno;
    }

}
