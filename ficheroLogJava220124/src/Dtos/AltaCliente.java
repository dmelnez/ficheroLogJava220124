package Dtos;

public class AltaCliente {

	int idCliente = 1;
    String dniCliente = "aaaaa";
    String nombreCliente = "aaaaa";
    String apellido1Cliente = "aaaaa";
    String apellido2Cliente = "aaaaa";
    String nombreCompletoCliente = "aaaaa";
    String emailCliente = "aaaaa";
    String contraseniaCliente = "aaaaa";
    Boolean esValidado = false;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellido1Cliente() {
		return apellido1Cliente;
	}
	public void setApellido1Cliente(String apellido1Cliente) {
		this.apellido1Cliente = apellido1Cliente;
	}
	public String getApellido2Cliente() {
		return apellido2Cliente;
	}
	public void setApellido2Cliente(String apellido2Cliente) {
		this.apellido2Cliente = apellido2Cliente;
	}
	public String getNombreCompletoCliente() {
		return nombreCompletoCliente;
	}
	public void setNombreCompletoCliente(String nombreCompletoCliente) {
		this.nombreCompletoCliente = nombreCompletoCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getContraseniaCliente() {
		return contraseniaCliente;
	}
	public void setContraseniaCliente(String contraseniaCliente) {
		this.contraseniaCliente = contraseniaCliente;
	}
	public Boolean getEsValidado() {
		return esValidado;
	}
	public void setEsValidado(Boolean esValidado) {
		this.esValidado = esValidado;
	}
	
	public AltaCliente(int idCliente, String dniCliente, String nombreCliente, String apellido1Cliente,
			String apellido2Cliente, String nombreCompletoCliente, String emailCliente, String contraseniaCliente,
			Boolean esValidado) {
		super();
		this.idCliente = idCliente;
		this.dniCliente = dniCliente;
		this.nombreCliente = nombreCliente;
		this.apellido1Cliente = apellido1Cliente;
		this.apellido2Cliente = apellido2Cliente;
		this.nombreCompletoCliente = nombreCompletoCliente;
		this.emailCliente = emailCliente;
		this.contraseniaCliente = contraseniaCliente;
		this.esValidado = esValidado;
	}


	
	public AltaCliente() {
		super();
	}
    
    

}
