package enums;

/**
 * @author Ernesto Escalier 
 * Hier wird das Datumformat definiert für das Objekt Calendar.
 */

public enum DatumFormat {
	DATUM_SCHWEIZ {
		@Override
		public String getFormat() {
			return "dd.MM.yyyy";
		}
	},
	ZEIT_SCHWEIZ {
		@Override
		public String getFormat() {
			return "HH:mm:ss";
		}
	},
	DATUM_ZEIT_SCHWEIZ {
		@Override
		public String getFormat() {
			return "dd.MM.yyyy HH:mm:ss";
		}
	};

	public abstract String getFormat();
}
