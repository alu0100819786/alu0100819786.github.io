import java.io.*;
import java.util.ArrayList;

public class Clock extends GameOfLife{
		Clock(){
		super();
	}
		
	public static long start(long timeStart){
		
		return timeStart;
	}
	public static long stop(long timeStop){
		
		return timeStop;
	}
	
	public static long timeElapsed(long timeStart, long timeStop){
		
		return timeStart - timeStop;
	}
	
	public static void main(String[] args) throws IOException{
	
		int k;
		String aux;
		FileReader entrada = null;
		FileWriter salida = null;
		int size = args.length;
		ArrayList<String> a = new ArrayList<>();
			for (k=0; k < size; k++){
			
			a.add(new String(args[k]));
			aux= a.get(k);
		}
		int iteraciones = Integer.valueOf(a.get(0));
		int filas = Integer.valueOf(a.get(1));
		int columnas = Integer.valueOf(a.get(2));
		entrada = new FileReader(a.get(3));
		salida = new FileWriter(a.get(4));
		
		GameOfLife prueba=new GameOfLife();
	
		long timeStart = System.currentTimeMillis();
		start(timeStart);
		prueba.setGame(entrada,salida,iteraciones,filas,columnas);
		long timeStop = System.currentTimeMillis();
		stop(timeStop);
		entrada.close();
		salida.close();
		System.out.println("La ejecución ha tardado: "+ ( timeElapsed(stop(timeStop), start(timeStart)) ) +" milisegundos");
	}
}
