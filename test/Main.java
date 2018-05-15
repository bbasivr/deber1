
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kborb
 */
public class Main {

    static PersonasRepository repository = new PersonasRepository();

    public static void main(String[] args) {
        int op;
        comienzo();
        do {
            op = Opcion();
            switch (op) {
                case 1:
                    Ingresar();
                    comienzo();
                    break;
                case 2:
                    Busqueda_Edad();
                    comienzo();
                    break;
                case 3:
                     Busqueda_ID();
                    comienzo();
                    break;
                case 4:
                     Busqueda_Nombre();
                    comienzo();
                    break;

                case 5:
                    
                    System.out.println("EJECUCION TERMINADA");
                    System.exit(0);
                    break;
            }
        } while (op != 0 && op != 5);
    }

    public static void Ingresar() {
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("Ingresar Nombre");
        persona.setNombre(sc.next());
        System.out.println("Ingresar Codigo");
        persona.setCodigo(Integer.parseInt(sc.next()));
        System.out.println("ingrese destino");
        persona.setDestino(sc.next());
        System.out.println("Ingresar Edad");
        persona.setEdad(Integer.parseInt(sc.next()));

        repository.agregar(persona);

    }

    public static void Busqueda_Edad() {
        List<Persona> result= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Rango  Inicio");
        int inicio= sc.nextInt();
        System.out.println("Rango Fin");
        int fin= sc.nextInt();
        result=repository.getPorRangoEdad(inicio, fin);
        
        if(result.size()==0){
            System.out.println("No");
            
        }else{
            System.out.println(result.toString());
        }
    }
    
    public static void Busqueda_ID(){
        List<Persona> result= new ArrayList<>();
        Persona persona;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese id");
        System.out.println(persona=repository.getPersona(sc.nextInt()));
        
    }
    
    public static void Busqueda_Nombre(){
        List<Persona> result= new ArrayList<>();
        Persona persona;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        System.out.println(repository.getPersonaPorNombre(sc.next()));
        
    }
    
    
    

    static void comienzo() {
        Presentacion2();
        Menu();
    }

    static void Presentacion2() {
        System.out.println("==========================MENU=====================");

    }

    static void Menu() {
        System.out.println("Opcion 1: ingrese datos                       ||");
        System.out.println("Opcion 2: busqueda por edad                   ||");
        System.out.println("Opcion 3: busqueda por ID                     ||");
        System.out.println("Opcion 4: busqueda por nombre                 ||");
        System.out.println("Opcion 5: salir                               ||");
        System.out.println("================================================");
        System.out.println("================================================");
    }

    static int Opcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de Opcion a Seleccionar");
        int op;
        op = entrada.nextInt();
        while (op < 1 || op > 15) {
            System.out.println("Error.!Ingrese sola las Opciones Deseada(1 al 5)");
            op = entrada.nextInt();
        }
        return op;
    }
}
