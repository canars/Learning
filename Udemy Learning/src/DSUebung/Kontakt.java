package DSUebung;

public class Kontakt {
	private int telefonnummer;
	private String name;

	public int getTelefonummer() {
		return telefonnummer;
	}

	public void setTelefonummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Kontakt(int telefonummer, String name) {
		this.name = name;
		this.telefonnummer = telefonummer;
	}

	public static Kontakt erstelleKontakt(String name, int telefonnummer) {
		return new Kontakt(telefonnummer, name);
	}

}
