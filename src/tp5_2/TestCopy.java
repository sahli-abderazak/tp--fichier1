package tp5_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
//ex3
public class TestCopy {
public static void main(String[] args) throws IOException {
	
		BufferedReader bf =new BufferedReader(new FileReader("D:\\fichiers\\in.txt"));
		String car;
		int line=0;
		int nbC=0;
		int nbM=0;
		try {
			while((car=bf.readLine())!=null) {
				line++;
				nbC+=car.length();
				
				StringTokenizer tok=new StringTokenizer(car);
				nbM+=tok.countTokens();
			}
			bf.close();
			System.out.println("nombre de lignes :"+line);
			System.out.println("nombre de colonne :"+nbC);
			System.out.println("nombre de mots :"+nbM);	
	}catch (IOException e) {
		e.printStackTrace();}
	
}
}
//ex1

//File inputFile = new File("D:\\fichiers\\in.txt");
//File outputFile = new File("D:\\fichiers\\out.txt");
//try {
//	FileReader bf=new FileReader(inputFile);
//	FileWriter bw=new FileWriter(outputFile);
//	int caractere;
//	while ((caractere = bf.read()) != -1) {
//		bw.write(caractere); }
//	System.out.println("Copie terminée avec succès.");
//	} catch (IOException e) {
//	e.printStackTrace();}}


//ex2

//Scanner scanner = new Scanner(System.in);
//System.out.print("Entrez le login : ");
//String login = scanner.nextLine();
//System.out.print("Entrez le mot de passe : ");
//String password = scanner.nextLine();
//
//
//
//try {
//    BufferedReader bf= new BufferedReader(new FileReader("D:\\fichiers\\in.txt"));
//    String line;
//   while ((line=bf.readLine())!=null) 
//   {
//	   String [] s=line.split("/");
//	   if(s.length==2 && s[0].equals(login)&&s[1].equals(password))
//	   {
//		   System.out.println("validee");
//		   return ;
//	   }
//   }
//   System.out.println("non validee");
//   
//} catch (IOException e) {
//    e.printStackTrace();
//}	
