public class Animal{
	private int edad;
	private int estatura;
	private int peso;
	private char sexo;
	Animal(){
		this.edad=0;
		this.estatura=0;
		this.peso=0;
		this.sexo='j';
	}
	Animal(int edad, int estatura, int peso, char sexo){
		this.edad=edad;
		this.estatura=estatura;
		this.peso=peso;
		this.sexo=sexo;
	}
	public int getEdad(){
		return edad;
	}
	public void caminar(){
		System.out.println("Estoy caminando");
	}
	public void comer(){
		System.out.println("Estoy Comiendo");
	}
	public void dormir(){
		System.out.println("Estoy Durmiendo");
	}
	public void respirar(){
		System.out.println("Estoy Respirando");
	}
}