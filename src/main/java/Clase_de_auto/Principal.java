/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase_de_auto;

/**
 *
 * @author Andy Abad
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("(.../(T-T)/...)\n");

        var propietario = new Propietario();
        propietario.setNombre("D...W...");propietario.setEdad(29);propietario.setNacionalidad("Ecuatoriano");

        System.out.printf("\nPropietario: "+propietario.getNombre()+"\nEdad: "+propietario.getEdad()+"\nID: "+
                propietario.getNacionalidad());

        var auto = new Auto();
        auto.setYear(1970);auto.setColor("black");auto.setModelo("Impala");

        System.out.printf("\nModelo del auto: "+auto.getModelo()+"\nAño: "+auto.getYear()+"\nColor: "+auto.getColor());

        var matricula = new Matricula();
        matricula.setProvincia("Azuay");matricula.setCiudad("Cuenca");matricula.setPlaca("ATU193");
        System.out.printf("\nProvincia: "+matricula.getProvincia()+"\nplaca: "+matricula.getPlaca());

        var esClasico=false;
        esClasico=auto.esClasico();
        if(esClasico==true){
            System.out.println("\nEl auto "+auto.getModelo()+ " es un Clasico");
        }else {
            System.out.println("\nEl auto " + auto.getModelo() + " NO es un Clasico");
        }

        var esDeNacionalidad = "";
        System.out.printf("La persona es de Nacionalidad: " +propietario.esDeNacionalidad());

    }   
}
