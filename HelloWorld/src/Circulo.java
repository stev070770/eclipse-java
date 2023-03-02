public class Circulo extends Figura implements Dibujable {
	public Circulo() {
		super();
	}
	private float radio;
	public void dibujar() {
		System.out.println("Dibujando el ciruclo");
	}
	public float area() {
		return pi* Math.pow(radio,2);
	}
}	
