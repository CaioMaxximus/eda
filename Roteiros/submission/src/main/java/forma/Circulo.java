package forma;

public class Circulo implements FormaGeometrica{
	
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}
}
