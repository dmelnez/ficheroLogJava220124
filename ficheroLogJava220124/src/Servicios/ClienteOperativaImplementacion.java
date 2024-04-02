package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.AltaCliente;

public class ClienteOperativaImplementacion implements ClienteOperativaInterfaz{

	
	Scanner sc = new Scanner(System.in);
	
	 public void registroCliente(List<AltaCliente> listaClientes)
     {
         
         AltaCliente nuevoCliente = new AltaCliente();

         System.out.println("################################");
         System.out.println("# Se dara de alta como cliente #");
         System.out.println("################################");

         System.out.println("DNI: ");
         nuevoCliente.setDniCliente(sc.next()) ;
         System.out.println("NOMBRE COMPLETO: ");
         String nombreCompleto = sc.next();
         nuevoCliente.setNombreCompletoCliente(nombreCompleto);

         System.out.println("EMAIL: ");

         nuevoCliente.setEmailCliente(sc.next());

         System.out.println("CONTRASEÑA: ");
         nuevoCliente.setContraseniaCliente(sc.next());

         // Asignacion de los campos mediante la division de los mismos en el nombre Completo


         String caracter = ",";
         String[] nombreSeparado = nombreCompleto.split(caracter);

         for (String trozo : nombreSeparado)
         {
             System.out.println(trozo);
         }
         
         nuevoCliente.setApellido2Cliente(nombreSeparado[0]);
         String apellidoPrimeroSeparado;
         String apellidoSegundoSeparado;


         
         nuevoCliente.setNombreCliente(nombreSeparado[0]);
         nuevoCliente.setApellido1Cliente(nombreSeparado[1]);
         nuevoCliente.setApellido2Cliente(nombreSeparado[2]);
         

         // Añadir un nuevo cliente a la lista de los clientes en su totalidad
         listaClientes.add(nuevoCliente);






     }
}
