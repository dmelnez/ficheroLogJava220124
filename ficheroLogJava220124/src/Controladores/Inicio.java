package Controladores;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Dtos.AltaCliente;
import Servicios.ClienteOperativaImplementacion;
import Servicios.ClienteOperativaInterfaz;
import Servicios.EmpleadoOperativaImplementacion;
import Servicios.EmpleadoOperativaInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.ValidadoresImplementacion;
import Servicios.ValidadoresInterfaz;

public class Inicio {

	
	
	public static void main(String[] args) {
		
		   MenuInterfaz me = new MenuImplementacion();

	       ValidadoresInterfaz val = new ValidadoresImplementacion();

	       ClienteOperativaInterfaz cli = new ClienteOperativaImplementacion();

	       EmpleadoOperativaInterfaz em = new EmpleadoOperativaImplementacion();

	       List<AltaCliente> listaClientes = new ArrayList<>();


	        File archivo = new File("logJava.txt");
	        
	         
	       
	       // -------------------------------------------------------------------------------
	       int seleccionMenuPrincipal;
	       Boolean cerrarMenuPrincipal = false;


	       try {
	    	   FileWriter escritorDeFichero = new FileWriter(archivo);        
	    	   
	       while (!cerrarMenuPrincipal)
	       {
	    	   
	           seleccionMenuPrincipal = me.menuPrincipal();

	           switch (seleccionMenuPrincipal)
	           {
	               case 0:

	                   cerrarMenuPrincipal = true;

	                   break;

	               case 1:
	            	   escritorDeFichero.write("Entrar en modo Empleado");
	                   // Entrar en modo Empleado
	                   // Se muestra el siguiente menu
	                   int seleccionMenuEmpleado = me.menuEmpleado();

	                   switch (seleccionMenuEmpleado)
	                   {

	                       case 0:
	                    	   escritorDeFichero.write("El empleado se le enviara al Menu Principal");
	                           // El empleado se le enviara al Menu Principal
	                    	  
	                           break;

	                       case 1:
	                    	   escritorDeFichero.write("Metodo que validara a un Cliente");

	                           // Metodo que validara a un Cliente
	                    	   
	                           break;

	                       case 2:
	                    	   escritorDeFichero.write("Metodo que Borrara a un Cliente");

	                           // Metodo que Borrara a un Cliente

	                           break;

	                       case 3:
	                    	   escritorDeFichero.write("Metodo que Mostrara los datos de los clientes");

	                           // Metodo que Mostrara los datos de los clientes
	                           /*em.mostrarCliente(listaClientes);*/
	                           
	                           for ( AltaCliente alt : listaClientes) { 
	                           System.out.println(alt.toString());
	                           }


	                           break;



	                   }
	                 

	                   break;

	               case 2:
	                   // Entrar en modo Cliente
	                   // Se muestra el siguiente Menu
	              

	                   int seleccionMenuCliente = me.menuCliente();

	                   switch (seleccionMenuCliente)
	                   {

	                       case 0:
	                    	   escritorDeFichero.write("El cliente se le enviara al Menu Principal");

	                           // El cliente se le enviara al Menu Principal
	                           break;
	                       case 1:
	                    	   escritorDeFichero.write("Metodo de registra al Cliente");

	                           // Metodo de registra al Cliente

	                           cli.registroCliente(listaClientes);

	                           break;

	                       case 2:
	                    	   escritorDeFichero.write("Metodo que logea al cliente y comprueba si es valido");

	                           //Metodo que logea al cliente y comprueba si es valido

	                           val.validadorAccesoCliente(listaClientes);


	                           break;


	                   }

	                   break;

	               default:
	                   break;




	           }


	           escritorDeFichero.close();
	       }
	       }
	       
	       catch (Exception e) {
			// TODO: handle exception
		}
		

	}
	
	
	
	
	  

       // -------------------------------------------------------------------------------

}

