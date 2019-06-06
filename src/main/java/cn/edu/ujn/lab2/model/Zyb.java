package cn.edu.ujn.lab2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Zyb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zyb", catalog = "xscj")
public class Zyb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String zym;
	private Integer rs;
	private String fdy;

	// Constructors

	/** default constructor */
	public Zyb() {
	}

	/** minimal constructor */
	public Zyb(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Zyb(Integer id, String zym, Integer rs, String fdy) {
		this.id = id;
		this.zym = zym;
		this.rs = rs;
		this.fdy = fdy;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "zym", length = 12)
	public String getZym() {
		return this.zym;
	}

	public void setZym(String zym) {
		this.zym = zym;
	}

	@Column(name = "rs")
	public Integer getRs() {
		return this.rs;
	}

	public void setRs(Integer rs) {
		this.rs = rs;
	}

	@Column(name = "fdy", length = 8)
	public String getFdy() {
		return this.fdy;
	}

	public void setFdy(String fdy) {
		this.fdy = fdy;
	}

}