public class Prueba{
	public static void main(String[] args){
		Humano daniel = new Humano(24, 176, 70, 'm', 100);	
		Humano rosa = new Humano();		
		Gato felix= new Gato();
		daniel.respirar();
		felix.respirar();
		System.out.println(daniel.getEdad());
		System.out.println(rosa.getEdad());
		System.out.println(felix.getEdad());
	}
}