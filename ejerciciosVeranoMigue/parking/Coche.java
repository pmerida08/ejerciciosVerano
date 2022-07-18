package ejerciciosVerano.parking;

public class Coche {
	
	private String matricula;
	private String bastidores;
	private int ruedas;
	
	public Coche(String matricula, String bastidores) {
		super();
		this.matricula = matricula;
		this.bastidores = bastidores;
		this.ruedas = 4;
	}
	
	public Coche(String matricula) {
		super();
		this.matricula = matricula;
		this.bastidores = "1234";
		this.ruedas = 4;
	}
	
	public Coche() {
		super();
		this.matricula = "12345";
		this.bastidores = "bastidor";
		this.ruedas = 4;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public String getBastidores() {
		return bastidores;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setBastidores(String bastidores) {
		this.bastidores = bastidores;
	}
	
	@Override
	public String toString(){
		return "Matricula: " + matricula + ", bastidor: " + bastidores + " y ruedas " + ruedas;
	}
	
	
}
