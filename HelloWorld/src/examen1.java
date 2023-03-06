//Ej1
public class examen1 {
 public static void main(String[]args) {
	 System.out.println("Buenos dias");
	 System.out.println("8*13");
	 int a= 8;
	 int b= 13;
	 int c= 8*13;
	 System.out.printf("%d",c).println();
	 
//Ej2
	 int d= 1;
	 int e =2;
	 int f=3;
	 int g= 1+2+3;
	 System.out.printf("%d + %d + %d = %d", d, e, f, g).println();
//Ej3
	 int h = 1;
	 int i = 1;
	 int j= 1;
	 int k= h + i + j;
	 System.out.printf("El resultado de h + i + j es= %d", k).println();
	 j = 2;
	 k= h + i + j; 
	 System.out.printf("El resultado de h + i + j es= %d", k).println();
//Ej4
	 int ang1=60;
	 int ang2=60;
	 int ang3=60;
	 int sumaAngulos= ang1 + ang2 + ang3;
	 
	 if(sumaAngulos==180) {
	 	System.out.println("Los angulos suman 180 grados");
	 	}
	 	else {
	 		System.out.println("Los angulos no suman 180 grados");
	 	}
//Ej5 
	 int num1= 10;
	 int num2= 4;
	 int num3= 8;
	 int num4= 0;
	 	 if(num1>num2 && num1>num3 && num1>num4) {;
	 		System.out.printf("El num1 = %d es el numero mas grande",num1).println();
	 		}
	 		else {
		 if(num2>num1 && num2>num3  && num3>num4 ) {
			 System.out.printf("El num2 = %d es el numero mas grande",num2).println();
		 }
		 else if(num3>num1 && num3>num2  && num3>num4 ) {
			 System.out.printf("El num3 = %d es el numero mas grande",num3).println();
		 }
		 else {
			 System.out.printf("El num4= %d es el numero mas grande",num4).println();
		 }
	 }
//Ej6
	 
}
}


	
