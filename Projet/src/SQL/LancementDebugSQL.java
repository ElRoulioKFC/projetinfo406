package SQL;

import java.sql.SQLException;

import projetjava.Ressources;

public class LancementDebugSQL {
	
	public static void main(String[] args) {
		try {
			CreationTable.creation();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
