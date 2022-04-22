/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clase_de_equipo;
/**
 * 
 * @author Andy Abad
 */
public class Partido 
{
    private String estadio;
    private int tiempoExtra;
    private String lugarPartido;
    private Equipo equipo;
    
    public int calcularTiempoTotal()
    {
        int tiempoT;
        tiempoT=tiempoExtra+90;
        return tiempoT;
    }
    
    //Getters y Setters
    public void setEstadio(String estadio)
    {
        this.estadio=estadio;
    }
    public String getEstadio()
    {
        return estadio;
    }
    
    public void setTiempoExtra(int tiempoExtra)
    {
        this.tiempoExtra=tiempoExtra;
    }
    public int getTiempoExtra()
    {
        return tiempoExtra;
    }
    
    public void setLugarPartido(String lugarPartido)
    {
        this.lugarPartido=lugarPartido;
    }
    public String getLugarPartido()
    {
        return lugarPartido;
    }
    
    public void setEquipo(Equipo equipo)
    {
        this.equipo=equipo;
    }
    public Equipo getEquipo()
    {
        return equipo;
    }
}
