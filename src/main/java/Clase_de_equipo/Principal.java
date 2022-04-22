/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Clase_de_equipo;

/**
 *
 * @author Andy Abad
 */
public class Principal {

    public static void main(String[] args) {
        String texto, texto2;
        Partido partido=new Partido();
        Equipo equipo=new Equipo();
        Jugador jugador=new Jugador();
        
        partido.setEstadio("Estadio Olimpico Atahualpa");
        partido.setLugarPartido("Cuenca");
        partido.setTiempoExtra(10);
        int tiempoT=partido.calcularTiempoTotal();
        
        equipo.setCantJugadores(10);
        equipo.setJugadoresLesionados(1);
        equipo.setNombre("Ecuador");
        boolean llave=equipo.validarMinJugadores();
        if(llave=true)
        {
            texto="El equipo si posee el min de jugadores";
        }else{
            texto="El equipo no posee el min de jugadores";
        }
        jugador.setEdad(18);
        jugador.setHabilidades(7);
        jugador.setNombre("Valencia");
        boolean llave2=jugador.validarEdadMaxParaJugar();
        if(llave2=true)
        {
            texto2="No sobrepasa la edad maxima para jugar";
        }else{
            texto2="Si sobrepasa la edad maxima para jugar";
        }
        
        
        
        partido.setEquipo(equipo);
        partido.getEquipo().setJugador(jugador);
        
        
        
        //impresion de los objeto creados
        System.out.println("Partido 1"+"\n"+
                           "Estadio del partido: "+partido.getEstadio()+"\n"+
                           "Tiempo extra: "+partido.getTiempoExtra()+"\n"+
                           "Lugar Partido: "+partido.getLugarPartido()+"\n"+
                           "Tiempo total: "+tiempoT+"\n"+
                           "Equipo 1"+"\n"+
                           "Nombre: "+partido.getEquipo().getNombre()+"\n"+
                           "Cantidad jugadores: "+partido.getEquipo().getCantJugadores()+"\n"+
                           "Jugadores lesionados: "+partido.getEquipo().getJugadoresLesionados()+"\n"+
                           texto+"\n"+
                           "Jugador 1"+"\n"+
                           "Nombre: "+partido.getEquipo().getJugador().getNombre()+"\n"+
                           "Edad: "+partido.getEquipo().getJugador().getEdad()+"\n"+
                           "Habilidades: "+partido.getEquipo().getJugador().getHabilidades()+"\n"+
                           texto2
        );
    }
}
