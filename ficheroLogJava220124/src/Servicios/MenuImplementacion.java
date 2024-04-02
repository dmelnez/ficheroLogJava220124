package Servicios;

import java.io.Console;
import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);
	
	public int menuPrincipal() {

        System.out.println("############################");
        System.out.println("# [0] -> Cerrar Aplicacion #");
        System.out.println("# [1] -> Acceso Empleado   #");
        System.out.println("# [2] -> Acceso Cliente    #");
        System.out.println("############################");

        int seleccionMenuPrincipal = sc.nextInt();


        return seleccionMenuPrincipal; }

    public int menuEmpleado() {

        System.out.println("###############################");
        System.out.println("# [0] -> Cerrar Ventana       #");
        System.out.println("# [1] -> Validar Cliente      #");
        System.out.println("# [2] -> Borrado de Cliente   #");
        System.out.println("# [3] -> Mostrar Cliente      #");
        System.out.println("###############################");

        int seleccionMenuEmpleado = sc.nextInt();

        return seleccionMenuEmpleado; }

    public int menuCliente() {

        System.out.println("#################################");
        System.out.println("# [0] -> Cerrar Ventana         #");
        System.out.println("# [1] -> Registro Cliente       #");
        System.out.println("# [2] -> Acceso Cliente (Login) #");
        System.out.println("#################################");
        
        int seleccionMenuCliente = sc.nextInt();


        return seleccionMenuCliente; }
}

