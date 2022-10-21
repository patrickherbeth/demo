package com.projeto.demo.model;

public class SuperHeroi {

	String hora;
	String superHeroi;
	String nVolta;
	String tempoVolta;
	String velocidadeMediaDaVolta;

	/**
	 * @param hora
	 * @param superHeroi
	 * @param nVolta
	 * @param tempoVolta
	 * @param velocidadeMediaDaVolta
	 */
	public SuperHeroi(String hora, String superHeroi, String nVolta, String tempoVolta, String velocidadeMediaDaVolta) {
		super();
		this.hora = hora;
		this.superHeroi = superHeroi;
		this.nVolta = nVolta;
		this.tempoVolta = tempoVolta;
		this.velocidadeMediaDaVolta = velocidadeMediaDaVolta;
	}

	/**
	 * @return
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * @param hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * @return
	 */
	public String getSuperHeroi() {
		return superHeroi;
	}

	/**
	 * @param superHeroi
	 */
	public void setSuperHeroi(String superHeroi) {
		this.superHeroi = superHeroi;
	}

	/**
	 * @return
	 */
	public String getnVolta() {
		return nVolta;
	}

	/**
	 * @param nVolta
	 */
	public void setnVolta(String nVolta) {
		this.nVolta = nVolta;
	}

	/**
	 * @return
	 */
	public String getTempoVolta() {
		return tempoVolta;
	}

	/**
	 * @param tempoVolta
	 */
	public void setTempoVolta(String tempoVolta) {
		this.tempoVolta = tempoVolta;
	}

	/**
	 * @return
	 */
	public String getVelocidadeMediaDaVolta() {
		return velocidadeMediaDaVolta;
	}

	/**
	 * @param velocidadeMediaDaVolta
	 */
	public void setVelocidadeMediaDaVolta(String velocidadeMediaDaVolta) {
		this.velocidadeMediaDaVolta = velocidadeMediaDaVolta;
	}

	/**
	 * @return
	 */
	@Override
	public String toString() {
		return "SuperHeroi [hora=" + hora + ", superHeroi=" + superHeroi + ", nVolta=" + nVolta + ", tempoVolta="
				+ tempoVolta + ", velocidadeMediaDaVolta=" + velocidadeMediaDaVolta + "]";
	}

}
