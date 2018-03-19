
public class Esfera extends Formas{
	Esfera(){
		super();
	}
	public double volumenEsfera() throws Exception{
		if(Formas.getRadio()<=0){
			throw new Exception("Radio no puede ser Negativo");
		}
		else{
			double resultado = (4*Math.PI*Math.pow(Formas.getRadio(), 3))/3;
			setVolumen(resultado);
			return Formas.getVolumen();	
		}
	}
	public double areaEsfera() throws Exception{
		if(Formas.getRadio()<=0){
			throw new Exception("Radio no puede ser Negativo");
		}
		else{
			double resultado = 4*Math.PI*Math.pow(Formas.getRadio(), 2);
			setArea(resultado);
			return Formas.getArea();
		}
	}
}
