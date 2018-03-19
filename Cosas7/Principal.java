import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Principal extends Esfera{
Principal(){
	super();
}

public static void main(String[] args) throws Exception {
	int k;
	String aux;
	FileReader entrada = null;
	FileWriter salida;
	int size = args.length;
	ArrayList<String> a = new ArrayList<>();
		for (k=0; k < size; k++){	
			a.add(new String(args[k]));
			aux= a.get(k);
		}
	entrada = new FileReader(a.get(0));
	salida = new FileWriter("salida.txt");
	salidaFormas(entrada, salida);
	entrada.close();
	salida.close();
}
}
