package omg;

public class Variables {
	public static void main (String[] args)throws Exception{
		
		//variables primitivas
		
		int numero1 = 10;
		double numero2;
		numero2 = 3.14D; //Se pone la D o d al final al declarar un double
		float numero3;
		numero3=3.14159F; //Se tiene que poner una F o f de float al final
		char caracter1, caracter2;
		caracter1='A'; //Comillas simples.
		caracter2=64;
		boolean opcion=true;
		long numero4;
		numero4=987654321L; //Poner una L o l al final, para el Long
		byte numero5;
		numero5=126;
		short numero6;
		numero6=128;
		
		System.out.println(numero1);
		System.out.println(numero2); 
		System.out.println(numero3);
		System.out.println(numero4);
		System.out.println(numero5);
		System.out.println(numero6);
		System.out.println(caracter1);
		System.out.println(caracter2);
		System.out.println(opcion);
		
		//Variables de referencia
		
		String mensaje, mensaje2;
		mensaje="Esto es una pillamada real";
		mensaje2="""
				Este 
				es 
				un 
				mensaje 
				multilinea 
				omg :OOOO
				""";
		System.out.println(mensaje);
		System.out.println(mensaje2);
		System.out.println(mensaje+" "+numero1);
		System.out.println(mensaje.toUpperCase());
		
		//Wrappers 
		
		String numero1_string=Integer.toString(numero1);
		System.out.println(mensaje.concat(numero1_string));
		
		//Variable general
		
		var variable1=15;
		var variable2='E';
		var variable3=12.12;

		System.out.println(variable1);
		System.out.println(variable2);
		System.out.println(variable3);

		//Sintaxis para asignar constantes
		
		final var PI=3.141632; 
		System.out.println(PI);

				
	}

}
