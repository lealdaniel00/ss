public class Humano extends Animal{
	private int dinero;
	Humano(int edad, int estatura, int peso, char sexo, int dinero){
		super(edad, estatura, peso, sexo);
		this.dinero=dinero;
	}
	Humano(){
		super();
		this.dinero=0;
	}
}