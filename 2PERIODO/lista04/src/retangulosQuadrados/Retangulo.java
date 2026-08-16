package retangulosQuadrados;

public class Retangulo {
	private int base;
	private int altura;
	
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	public void setBase(int novaBase) {
		base = novaBase;
	}
	public void setAltura(int novaAltura) {
		altura = novaAltura;
	}
	
	public int perimetro() {
		return (base * 2) + (altura * 2);
	}
	public int area() {
		return base * altura;
	}
	public boolean isQuadrado() {
		return base == altura;
	}
	
	public boolean eIgual(Retangulo r) {
		if( getBase() == r.getBase() && getAltura() == r.getAltura()) {
			return true;
		} else if (getBase() == r.getAltura() && getAltura() == r.getBase()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void autoDesenhar() {
		for(int linha = 0; linha < getAltura(); linha++) {
			for(int coluna =0; coluna < getBase(); coluna++) {
				System.out.print("O");
			}
			System.out.println();
		}
	}
	
}
