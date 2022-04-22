/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clase_de_equipo;

/**
 * 
 * @author Andy Abad
 */
public class Jugador 
{
    private String nombre;
    private int edad;
    private int habilidades;
    
    public boolean validarEdadMaxParaJugar()
    {
        boolean llave;
        if(edad>40)
        {
            return llave=false;
        }else{
            return llave=true;
        }
    }
    //Getters y Setters
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public int getEdad()
    {
        return edad;
    }
    
    public void setHabilidades(int habilidades)
    {
        this.habilidades=habilidades;
    }
    public int getHabilidades()
    {
        return habilidades;
    }
}
