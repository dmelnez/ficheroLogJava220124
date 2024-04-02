package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.AltaCliente;

public class ValidadoresImplementacion implements ValidadoresInterfaz{

	Scanner sc = new Scanner(System.in);
	
	 public void validadorAccesoCliente (List<AltaCliente> listaClientes)
     {

         System.out.println("#######################");
         System.out.println("######### LOGIN #######");
         System.out.println("#######################");
         System.out.println("EMAIL: ");
         String emailDeComprobacion = sc.next();

         System.out.println("CONTRASEÑA: ");
         String contraseñaDeComprobacion = sc.next();

         /*
         foreach (String email in listaClientes)
         {





         }
         */





     }
}
