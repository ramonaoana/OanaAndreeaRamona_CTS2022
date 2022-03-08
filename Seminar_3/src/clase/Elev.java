package clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private Integer clasa;
	private String tutore;

	public Elev() {
		super();
	}

	public void setClasa(Integer i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	@Override
	public String toString() {
		final StringBuilder sb=new StringBuilder("{Elev");
		sb.append( super.toString());
		sb.append("Clasa=" + clasa + ", tutore=" + tutore);
		sb.append("}");
		return sb.toString();
	}

}
