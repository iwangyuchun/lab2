package cn.edu.ujn.lab2.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dlb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "dlb", catalog = "xscj")
public class Dlb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String xh;
	private String kl;
	private Date addtime;

	// Constructors

	/** default constructor */
	public Dlb() {
	}

	/** full constructor */
	public Dlb(String xh, String kl, Date addtime) {
		this.xh = xh;
		this.kl = kl;
		this.addtime = addtime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "xh", length = 6)
	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	@Column(name = "kl", length = 20)
	public String getKl() {
		return this.kl;
	}

	public void setKl(String kl) {
		this.kl = kl;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "addtime", length = 10)
	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

}