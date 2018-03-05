public class Tiempo {

		private static int segundo;
		private static int minuto;
		private static int hora;
		
		
		public Tiempo(int horas, int minutos, int segundos){
			this.hora = horas;
			this.minuto = minutos;
			this.segundo = segundos;
		}
		public void setSegundo(int s){
			
			segundo = s;
		}
		
		public void setMinuto(int m){
			
			minuto = m;
		}
		
		public void setHora(int h){
			
			hora = h;
		}
		
		public int getSegundo(){
			
			return segundo;
		}

		public int getMinuto(){
			
			return minuto;
		}

		public int getHora(){
		
			return hora;
		}
		public void siguienteSegundo(){
		
			segundo++;
		
			if(segundo>=60){
				
				int valorMin = segundo/60;
				segundo = 0;
				minuto+= valorMin;
			
				if(minuto>=60){

					minuto = 0 + valorMin;
					hora++;
				}
				if(hora>=Integer.MAX_VALUE){
					hora=0;
				}
			}
		
		}
		public void siguienteMinuto(){
		
			minuto++;
		
			if(minuto>=60){
			
				minuto = 0;
				hora++;
			}
		}
		public void siguienteHora(){
			hora++;
			if(hora>=Integer.MAX_VALUE){
				hora=0;
			}
		
		}
		public void anteriorSegundo(){
			segundo--;
		
			if(segundo<0){
				segundo = 59;
				minuto--;
				if(minuto<0){
					minuto = 59;
					hora--;
				}
			}
		
		}
		public void anteriorMinuto(){
			minuto--;
		
			if(minuto<0){
				minuto = 59;
				hora--;
			}
			if(hora<0){
				segundo = 0;
				minuto = 0;
				hora = 0;
			}
		
		}
		public void anteriorHora(){
			hora--;
			if(hora<0){
				
				segundo = 0;
				minuto = 0;
				hora = 0;
			}
		}
		
		public String toString(){
			
			return String.valueOf(hora) + " Horas, " + String.valueOf(minuto) + " minutos, " + String.valueOf(segundo) + " segundos.";
		}
		public static void main(String[] args) {
			
			int iteraciones = 5;
			Tiempo fecha1 = new Tiempo(1,10,20);
			System.out.println(fecha1 + "\n");
			for(int i=0; i < iteraciones ; i++){
				segundo = segundo + 1000;
				fecha1.siguienteSegundo();
				System.out.println(fecha1 + "\n");
			}
			
			
		}
	
}
