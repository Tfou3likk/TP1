package tp1duo;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LectureEcritureTable {
	
	
	public static ArrayList<Recettes> read() throws ClassNotFoundException  {
		
		ArrayList<Recettes> recettes = new ArrayList<>();
		
		try {
			
			String requete = "SELECT * FROM recette";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/recettes", "root2", "");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(requete);
			
			while(rs.next()) {
				Recettes recette = new Recettes(rs.getInt("idRecette"), rs.getString("nom"), rs.getInt("tempsPreparation"), rs.getInt("tempsCuisson"), rs.getInt("nbParts"), rs.getString("texte"), rs.getInt("idType"), rs.getDate("dateInsertion"));
				recettes.add(recette);
			}
			
			
			
		}catch(SQLException e) {
			System.err.print("Erreur SQL");
			e.printStackTrace();
		}
		
		//System.out.println(nomRecettes.toString());
		return recettes;
		
		
		
	}
	
	
	public static void main (String[] args) throws ClassNotFoundException {
		read();
	}
	
	

}
