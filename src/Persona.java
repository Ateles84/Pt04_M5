import java.util.Comparator;

public class Persona {
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", alçada=" + alçada + ", edat=" + edat + "]";
	}

	private String nom;
	private int alçada;
	private int edat;

	private Persona(String nom, int alçada, int edat) {
		super();
		this.nom = nom;
		this.alçada = alçada;
		this.edat = edat;
	}

	public Persona() {}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAlçada() {
		return alçada;
	}

	public void setAlçada(int alçada) {
		this.alçada = alçada;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if (this.alçada > o.alçada) {
			return 1;
		} else {
			return 0;
		}
	};
}

class compareAlçada implements Comparator<Persona> {
	public int compare(Persona o1, Persona o2) {
		return o1.getAlçada() - o2.getAlçada();
	}
}

class compareNom implements Comparator<Persona> {
	public int compare(Persona o1, Persona o2) {
		return o1.getNom().compareTo(o2.getNom());
	}
}

class compareEdat implements Comparator<Persona> {
	public int compare(Persona o1, Persona o2) {
		return o1.getEdat() - o2.getEdat();
	}
}
