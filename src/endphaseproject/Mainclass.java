package endphaseproject;

public class Mainclass {

		public static void main(String[] args) {
			
			// Create "main" folder if not present in current folder structure
			Fileoperation.createMainFolderIfNotPresent("phaseend");
			
			Menu.printWelcomeScreen("LockedMe Project", "Sathi Reddy");
			
			Controloptions.handleWelcomeScreenInput();
		}

		
	}

