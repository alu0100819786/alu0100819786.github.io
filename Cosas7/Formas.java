import java.io.*;
import java.util.Scanner;

public abstract class Formas {
	
	protected static double volumen;
	protected static int caras;
	protected static String color;
	protected static double area;
	protected static int radio;
	protected static int vertices;
	
	public Formas(){
	}
	public static void setVolumen(double volumenF){
		volumen = volumenF;
	}
	public static double getVolumen(){
		return volumen;
	}
	public static void setCaras(int carasF){
		caras = carasF;
	}
	public static int getCaras(){
		return caras;
	}
	public static void setColor(String colorF){
		color = colorF;
	}
	public static String getColor(){
		return color;
	}
	public static void setArea(double areaF){
		area = areaF;
	}
	public static double getArea(){
		return area;
	}
	public static void setRadio(String radioF){
		radio = Integer.valueOf(radioF);
	}
	public static double getRadio(){
		return radio;
	}
	public static void setVertices(String verticesF){
		vertices = Integer.valueOf(verticesF);
	}
	public static double getVertices(){
		return vertices;
	}
	public abstract double volumenEsfera() throws Exception;
	public abstract double areaEsfera() throws Exception;
	
	public static void salidaFormas(FileReader entrada, FileWriter salida) throws Exception{
		int j;
		int numeroTokens;
		Scanner s = null;
		s = new Scanner(entrada);
		while(s.hasNextLine()){
			String linea = s.nextLine();
			String[] lineaActual = linea.split(" ");
			numeroTokens = lineaActual.length;
			
			for(j = 0; j < numeroTokens; j++){
				String palabra = lineaActual[j];
				if(palabra.charAt(0) == 'E'){
					Esfera esfera = new Esfera();
					setColor(lineaActual[j+1]);
					setRadio(lineaActual[j+5]);
					salida.write(lineaActual[j] + " " + getColor() + " <" + lineaActual[j+2] + "," + lineaActual[j+3] + "," + lineaActual[j+4] + "," + "radio " + getRadio() + ">" + " area: " + String.format("%.2f",esfera.areaEsfera()) + " volumen: " + String.format("%.2f",esfera.volumenEsfera()) + "\n");
				}
				else{
					if(palabra.charAt(0) == 'C' && palabra.charAt(1) == 'u'){
						setColor(lineaActual[j+1]);
						
					}
				}
			}
		}
		s.close();
	}
}
	