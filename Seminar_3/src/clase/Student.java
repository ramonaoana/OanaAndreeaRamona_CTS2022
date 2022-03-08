package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected Integer an_studii;

	public Student() {
		super();
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAn_studii(Integer an_studii) {
		this.an_studii = an_studii;
	}

	@Override
	public String toString() {
		final StringBuilder sb=new StringBuilder("{Student:");
		sb.append( super.toString());
		sb.append("Facultate=" + facultate + ", an_studii=" + an_studii);
		sb.append("}");
		return sb.toString();
	}
}