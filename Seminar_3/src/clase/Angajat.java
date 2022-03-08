package clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private Integer salariu;

	public Angajat() {
		super();
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(Integer salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		final StringBuilder sb=new StringBuilder("{Angajat");
		sb.append( super.toString());
		sb.append("Ocupatie=" + ocupatie + ", salariu=" + salariu);
		sb.append("}");
		return sb.toString();
	}


}