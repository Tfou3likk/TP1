package tp1plus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectureEcritureFichier {

	public static String LectureEcriture() throws IOException {
		File ressources = new File(
				"C:\\Users\\ACER\\Documents\\fares\\java l3\\TP1\\src\\main\\ressources\\ressources.txt");

		System.out.println("Le nom du fichier est " + ressources.getName());

		FileReader fr = new FileReader(ressources);

		BufferedReader br = new BufferedReader(fr);

		StringBuilder sb = new StringBuilder();
		String l;

		while ((l = br.readLine()) != null) {
			sb.append(l).append("\n");
		}
		br.close();
		System.out.println(sb.toString());

		File ressources2 = new File(
				"C:\\Users\\ACER\\Documents\\fares\\java l3\\TP1\\src\\main\\ressources\\ressources2.txt");
		FileWriter fw = new FileWriter(ressources2);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(sb.toString());

		bw.close();
		
		return sb.toString();
		

	}

	public static void main(String[] args) throws IOException {
		
		 LectureEcriture();

	}

}
