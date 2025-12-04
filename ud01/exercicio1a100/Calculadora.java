/**
 * Clase Calculadora con operaciones básicas.
 */
public class Calculadora {

	/** Suma dos números. */
	
    public void sumar(int a, int b) {
        int resultado = a + b;
		System.out.println(resultado);
	}

    public double sumar(double a, double b) {
		double resultado = a + b;
        System.out.println(resultado);
        return resultado;
	}

	/** Resta b de a. */
	public double restar(double a, double b) {
		return a - b;
	}

	/** Multiplica dos números. */
	public double multiplicar(double a, double b) {
		return a * b;
	}

	/**
	 * Divide a entre b. Lanza ArithmeticException si b es 0.
	 */
	public double dividir(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("División por cero");
		}
		return a / b;
	}

	/** Pequeña demostración en la linea de comandos. */
	public static void main(String[] args) {

		double suma;
		double resta;
		double res;

		Calculadora calc = new Calculadora();

		suma = calc.sumar(2.0, 3);
		resta = calc.restar(5, 1);
		res = suma * resta;


		System.out.println("Sumar 2 + 3 = " + calc.sumar(2.0, 3));
		System.out.println("Restar 5 - 1 = " + calc.restar(5, 1));
		System.out.println("Multiplicar 4 * 2.5 = " + calc.multiplicar(4, 2.5));
		try {
			System.out.println("Dividir 10 / 2 = " + calc.dividir(10.0, 2));
			System.out.println("Intento dividir por cero...");
			System.out.println(calc.dividir(1, 0));
		} catch (ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}





    

}
