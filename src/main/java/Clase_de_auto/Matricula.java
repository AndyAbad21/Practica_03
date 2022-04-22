/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clase_de_auto;

/**
 * 
 * @author Andy Abad
 */
public class Matricula {
    private String provincia, ciudad, placa;
    private Auto auto;
    private Propietario propietario;

    public boolean obtenerProvincia(){
        var retorno = false;

        var primeraLetraProvincia=provincia.substring(0,1);
        var primeraLetraPlaca=this.placa.substring(0,1);

        if (provincia == "Azuay" && primeraLetraPlaca == "A")
            retorno = true;
        if (provincia == "Bolibar" && primeraLetraPlaca== "B")
            retorno = true;
        if (provincia == "Cañar" && primeraLetraPlaca == "U")
            retorno = true;
        if (provincia == "Carchi" && primeraLetraPlaca == "C")
            retorno = true;



        return retorno;

    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }


    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
