package enums;

/**
 * @author Viviane Traber 
 * Enumerations fuer den Status der Anwendersicherung. Rueckgabewerte fuers GUI
 */

public enum AnwenderSicherungStatus {
	KEIN {
		@Override
		public String getAnwenderSicherungsStatus() {
			return "Keine Sicherung geladen.";
		}
	},
	SPEICHERN_ERFOLGREICH {
		@Override
		public String getAnwenderSicherungsStatus() {
			return "Profil speichern, war erfolgreich. Noice!";
		}
	},
	SPEICHERN_FEHLGESCHLAGEN {
		@Override
		public String getAnwenderSicherungsStatus() {
			return "Profil speichern, ist fehlgeschlagen!";
		}
	},
	LADEN_ERFOLGREICH {
		@Override
		public String getAnwenderSicherungsStatus() {
			return "Profil laden, war erfolgreich. Noice!";
		}
	},
	LADEN_FEHLGESCHLAGEN {
		@Override
		public String getAnwenderSicherungsStatus() {
			return "Profil laden, ist fehlgeschlagen!";
		}
	};

	public abstract String getAnwenderSicherungsStatus();

}
