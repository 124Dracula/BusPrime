/**
 * Licensee: ruial(Universidade do Minho)
 * License Type: Academic
 */
package backend.BD;

import org.orm.*;
public class DropBusPrimeDatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(BusPrimePersistentManager.instance());
				BusPrimePersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
