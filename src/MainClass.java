
import java.util.Scanner;
public class MainClass {


	public static void main(String[] args) {
		
		boolean oynamaIstegi = true;
		
		System.out.print("Zorda mi oynamak istersin kolayda mi? (1 = kolay, 2 = zor) ");
		
		Scanner input = new Scanner(System.in);
		
		int zorluk = input.nextInt();
		
		boolean zorBoo = zorluk == 1;
		
		if (zorBoo) {
			System.out.print("Calismak istedigin modu sec: Bolme(1), Carpma(2), Toplama(3), Cikarma(4), Faktoriyel(5): ");
			
			String a = input.next();
			a = a.toLowerCase();
			a = a.trim();
						
			String carpma = "carpma";
			String toplama = "toplama";
			String faktoriyel = "faktoriyel";
			String cikarma = "cikarma";
			String bolme = "bolme";
			
			
			if (carpma.equals(a) || 2 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.CarpmaKolay();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else if (toplama.equals(a) || 3 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.ToplamaKolay();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else if (faktoriyel.equals(a) || 5 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.FaktoriyelKolay();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else if (cikarma.equals(a) || 4 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.CikarmaKolay();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else if (bolme.equals(a) || 1 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.BolmeKolay();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else { 
				System.out.println("Oyle bir mod yok!");
				}
		
			
		} else 
			System.out.print("Calismak istedigin modu sec: Bolme(1), Carpma(2), Toplama(3), Cikarma(4), Faktoriyel(5): ");
		
			String a = input.next();
			a = a.toLowerCase();
			a = a.trim();
			
			String carpma = "carpma";
			String toplama = "toplama";
			String faktoriyel = "faktoriyel";
			String cikarma = "cikarma";
			String bolme = "bolme";
			
			
			if (carpma.equals(a) || 2 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.CarpmaZor();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else if (toplama.equals(a) || 3 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.ToplamaZor();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else if (faktoriyel.equals(a) || 5 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.FaktoriyelZor();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else if (cikarma.equals(a) || 4 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.CikarmaZor();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
						if (oynamaInt == 1) {
							oynamaIstegi = true;
							System.out.println(" ");

						} else if (oynamaInt == 2) {
							MainClass.main(args);
							
						}  else if (oynamaInt == 3) {
							oynamaIstegi = false;
							
						} else {
							System.out.println("Oyle bir komut yok!");
							System.exit(0);
						}
					}
			} else if (bolme.equals(a) || 1 == Integer.parseInt(a)) {
				while(oynamaIstegi) {
					Methods.BolmeZor();
					System.out.println(" ");
					System.out.println("Tekrar icin 1 yaz, baska mod icin 2, bitirmek icin 3");
					int oynamaInt = input.nextInt();
					if (oynamaInt == 1) {
						oynamaIstegi = true;
						System.out.println(" ");

					} else if (oynamaInt == 2) {
						MainClass.main(args);
						
					}  else if (oynamaInt == 3) {
						oynamaIstegi = false;
						
					} else {
						System.out.println("Oyle bir komut yok!");
						System.exit(0);
					}
					}
			} else { 
				System.out.println("Oyle bir mod yok!");
				}
		
		
	}
}
 
		
		
		
