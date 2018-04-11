package died.guia04.ejercicio01;

public class Punto {

	float x,y;
	
	Punto(float xx, float yy) {
		this.setX(xx);
		this.setY(yy);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object p) {
		if(p instanceof Punto ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String [] args) {
		
		Punto l= new Punto(5,10);
		Punto t= new Punto(5,10);
		
		System.out.print(t.equals(l)); 
		
	}


	
	
	
	
	
	
	
}
