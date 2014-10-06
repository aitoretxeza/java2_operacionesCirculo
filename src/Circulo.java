/* Clase para calcular el area y la circunferencia de un circulo */

	public class Circulo {

		private double radio;
		private double area;
		private double circunferencia;


		public void setRadio (double radiointroducido)
 		{
			radio = radiointroducido;
 		}
		

		public double getRadio()
 		{
			return radio;
 		}


		public double area()
 		{
			double result;
			result = 3.1416 * Math.pow(this.radio,2);
			return result;
		}


		public double circunferencia()
 		{
			double result;
			result = 2 * 3.1416 * this.radio;
			return result;
 		}

	}
