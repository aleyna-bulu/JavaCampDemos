package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		
		String internetSubeButonu ="İnternet Şubeye gir";
		double dolarDün = 8.20;
		double dolarBugün= 8.20;
		int vade =36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugün<dolarDün) {
			System.out.println("Dolar düştü resmi");
			
		}else if(dolarBugün>dolarDün) {
			System.out.println("Dolar yükseldi resmi");
			
		}
		
		else {
			System.out.println("Dolar eşittir  resmi");
		}
		
		String kredi1 ="Hızlı Kredi";
		String kredi2 ="Mutlu emekli Kredisi";
		String kredi3 ="Konut Kredisi";
		String kredi4 ="Çiftçi Kredisi";
		String kredi5 ="Msb Kredisi";
		String kredi6 ="Meb Kredisi";
		String kredi7 ="Kültür bakanlığı Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler = {
				
				"Hızlı Kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Çiftçi kredisi",
				"Msb Kredisi",
				"Meb kredisi",
				"Kültür bakanlığı kredisi"
				};
		//foreach benim listemdekiler kadar dönecek 
		for(String kredi: krediler) {
			System.out.println(kredi);
		}
		for(int i=0; i<krediler.length;i++ ) {
			System.out.println(krediler [i]);
			
		}
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
				
		
		
		
	}

}
