package cn.edu.ujn.lab2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Kcb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "kcb", catalog = "xscj")
public class Kcb implements java.io.Serializable {

	// Fields

	private String kch;
	private String kcm;
	private Short kxxq;
	private Integer xs;
	private Integer xf;

	// Constructors

	/** default constructor */
	public Kcb() {
	}

	/** minimal constructor */
	public Kcb(String kch) {
		this.kch = kch;
	}

	/** full constructor */
	public Kcb(String kch, String kcm, Short kxxq, Integer xs, Integer xf) {
		this.kch = kch;
		this.kcm = kcm;
		this.kxxq = kxxq;
		this.xs = xs;
		this.xf = xf;
	}

	// Property accessors
	@Id
	@Column(name = "kch", unique = true, nullable = false, length = 3)
	public String getKch() {
		return this.kch;
	}

	public void setKch(String kch) {
		this.kch = kch;
	}

	@Column(name = "kcm", length = 12)
	public String getKcm() {
		return this.kcm;
	}

	public void setKcm(String kcm) {
		this.kcm = kcm;
	}

	@Column(name = "kxxq")
	public Short getKxxq() {
		return this.kxxq;
	}

	public void setKxxq(Short kxxq) {
		this.kxxq = kxxq;
	}

	@Column(name = "xs")
	public Integer getXs() {
		return this.xs;
	}

	public void setXs(Integer xs) {
		this.xs = xs;
	}

	@Column(name = "xf")
	public Integer getXf() {
		return this.xf;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

}