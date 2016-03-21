package br.com.fiap.modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private int rm;
	private List<Double> nacs = new ArrayList<>();
	private double am;
	private double ps;
	private double mediaNacs = 0D;
	private double mediaFinal = 0D;

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public List<Double> getNacs() {
		return nacs;
	}

	public void setNacs(List<Double> nacs) {
		this.nacs = nacs;
	}

	public double getAm() {
		return am;
	}

	public void setAm(double am) {
		this.am = am;
	}

	public double getPs() {
		return ps;
	}

	public void setPs(double ps) {
		this.ps = ps;
	}

	public double getMediaNacs() {
		return mediaNacs;
	}

	public void setMediaNacs(double mediaNacs) {
		this.mediaNacs = mediaNacs;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public void adicionarNac(double nac) {
		nacs.add(nac);
	}

	public void calcularMediaNacs() {
		for (Double nac : nacs) {
			mediaNacs += nac;
		}
		mediaNacs = mediaNacs/nacs.size();
	}

	public void calcularMediaFinal() {
		mediaFinal = (0.2 * mediaNacs) + (0.3 * am) + (0.5 * ps);
	}
}
