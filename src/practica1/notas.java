package practica1;
import java.util.Scanner;

/**
 * La clase Notas permite ingresar, calcular y mostrar notas de un estudiante,
 * y determinar si ha aprobado o no.
 * 
 * @author Juan Pablo
 * @version 1.0
 * @since 2023-03-31 
 * 
 */
public class notas {
	
	//Variables que se utilizan para almacenar las notas y los cálculos
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	
	//Scanner utilizado para introducir datos
	Scanner entrada = new Scanner(System.in);
	
    /**
     * Método para ingresar las notas del estudiante.
     * 
     * @param none
     * @return void
     */
	public void ingresarnotas() {
		//Cuando se ejecuta este método, se pide al usuario que introduzca las notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		uf1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		uf2= entrada.nextDouble();
		
		System.out.print("ingrese nota 3: ");
		uf3= entrada.nextDouble();
	}
	
    /**
     * Método para comprobar que la introducción de notas no tenga notas mayores a
     * 10.
     * 
     * @param none
     * @return void
     */
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
			
	}
	
    /**
     * Método para calcular las notas del estudiante.
     * 
     * @param none
     * @return void
     */
	public void Calculonotas() {
		acu1 = uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
	}
	
    /**
     * Método para mostrar las notas del estudiante.
     * 
     * @param none
     * @return void
     */
	public void Mostrar() {

		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumulado 1 = "+ acu1);
		System.out.println(" acumulado 2 = "+ acu2);
		System.out.println(" acumulado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
	}

    /**
     * Método para determinar si el estudiante ha aprobado o no, y lo indica por pantalla.
     * 
     * @param none
     * @return void
     */
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}
			else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}
				else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/** Método principal que se encarga de llamar a los diferentes métodos necesarios
	 *	para ingresar notas, comprobar que las notas sean válidas, calcular la nota final,
	 *	mostrar las notas ingresadas, y verificar si el estudiante aprobó o no la asignatura.
	 */
	public static void main(String[] args) {
		
		notas fc= new notas();
		
		fc.ingresarnotas();
		
		fc.comprobarcion();
		
		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}