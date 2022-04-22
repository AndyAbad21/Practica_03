/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Clase_de_equipo;

/**
 * 
 * @author Andy Abad
 */
public class Equipo
{
    private String nombre;
    private int cantJugadores;
    private int jugadoresLesionados;
    private Jugador jugador;
    
    public boolean validarMinJugadores()
    {
        boolean llave;
        if(cantJugadores>=5)
        {
            return llave=true;
        }else{
            return llave=false;
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
    
    public void setCantJugadores(int cantJugadores)
    {
        this.cantJugadores=cantJugadores;
    }
    public int getCantJugadores()
    {
        return cantJugadores;
    }
    
    public void setJugadoresLesionados(int jugadoresLesionados)
    {
        this.jugadoresLesionados=jugadoresLesionados;
    }
    public int getJugadoresLesionados()
    {
        return jugadoresLesionados;
    }
    
    public void setJugador(Jugador jugador)
    {
        this.jugador=jugador;
    }
    public Jugador getJugador()
    {
        return jugador;
    }
}
