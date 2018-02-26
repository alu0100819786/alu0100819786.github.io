import java.util.ArrayList;

public class Adivina {

	
	
	public static int Aleatorio(){
		
		int numero = (int)(Math.random() * 899) + 100;
		return numero;

	}
	public static void main(String[] args) {
		int k;
		int aux;
		int numeroIntroducido;
		int numeroAdivinar;
		int size = args.length;
		ArrayList<Integer> a = new ArrayList<>();
		
		for (k=0; k < size; k++){
			
			a.add(new Integer(args[k]));
			aux= a.get(k);
		}
		numeroIntroducido = a.get(0);
		numeroAdivinar = Aleatorio();
		System.out.println("Numero a adivinar: " + numeroAdivinar);
		System.out.println("Numero introducido: " + numeroIntroducido);
		
		if(numeroAdivinar == numeroIntroducido){
			
			System.out.println("Has Acertado el numero: Ganas 10.000 Euros");
		}
		else{
			
			int terceroAdi = numeroAdivinar%10;
	        numeroAdivinar = numeroAdivinar/10;
	        int segundoAdi = numeroAdivinar%10;
	        numeroAdivinar = numeroAdivinar/10;
	        int primeroAdi = numeroAdivinar%10;
	        int terceroIntro = numeroIntroducido%10;
	        numeroIntroducido = numeroIntroducido/10;
	        int segundoIntro = numeroIntroducido%10;
	        numeroIntroducido = numeroIntroducido/10;
	        int primeroIntro = numeroIntroducido%10;
	        
	        if((terceroAdi == terceroIntro || terceroAdi == segundoIntro || terceroAdi == primeroIntro) && (segundoAdi == terceroIntro || segundoAdi == segundoIntro || segundoAdi == primeroIntro) && (primeroAdi == terceroIntro || primeroAdi == segundoIntro || primeroAdi == primeroIntro)){
	        
	        	System.out.println("Todos Los Dígitos coinciden: Ganas 3.000 Euros");
	        }
	        else{
	        	if(((terceroAdi == terceroIntro || terceroAdi == segundoIntro || terceroAdi == primeroIntro) && (segundoAdi == terceroIntro || segundoAdi == segundoIntro || segundoAdi == primeroIntro)) || (terceroAdi == terceroIntro || terceroAdi == segundoIntro || terceroAdi == primeroIntro) && (primeroAdi == terceroIntro || primeroAdi == segundoIntro || primeroAdi == primeroIntro) || (primeroAdi == terceroIntro || primeroAdi == segundoIntro || primeroAdi == primeroIntro) && (segundoAdi == terceroIntro || segundoAdi == segundoIntro || segundoAdi == primeroIntro)){
	        		System.out.println("Dos digito coincide: Ganas 2.000 Euros");
	        	}
	        	else{
	        		if((terceroAdi == terceroIntro || terceroAdi == segundoIntro || terceroAdi == primeroIntro) || (segundoAdi == terceroIntro || segundoAdi == segundoIntro || segundoAdi == primeroIntro) || (primeroAdi == terceroIntro || primeroAdi == segundoIntro || primeroAdi == primeroIntro)){
	        
	        		System.out.println("Un digito coincide: Ganas 1.000 Euros");
	        	}
	        	else{
	        		System.out.println("No Has acertado ningun numero: Ganas 0 Euros");
	        	}
	        }
	        }
		}

	}

}
