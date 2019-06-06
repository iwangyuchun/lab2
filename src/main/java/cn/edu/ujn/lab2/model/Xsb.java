package cn.edu.ujn.lab2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Xsb entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "xsb", catalog = "xscj")
public class Xsb implements java.io.Serializable {

	// Fields

	private String xh;
	private String xm;
	private String xb;
	private String cssj;
	private Integer zyId;
	private Integer zxf;
	private String bz;
	private String zp;

	// Constructors

	/** default constructor */
	public Xsb() {
	}

	/** minimal constructor */
	public Xsb(String xh, String xm, Integer zyId) {
		this.xh = xh;
		this.xm = xm;
		this.zyId = zyId;
	}

	/** full constructor */
	public Xsb(String xh, String xm, String xb, String cssj, Integer zyId,
			Integer zxf, String bz, String zp) {
		this.xh = xh;
		this.xm = xm;
		this.xb = xb;
		this.cssj = cssj;
		this.zyId = zyId;
		this.zxf = zxf;
		this.bz = bz;
		this.zp = zp;
	}

	// Property accessors
	@Id
	@Column(name = "xh", unique = true, nullable = false, length = 6)
	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	@Column(name = "xm", nullable = false, length = 8)
	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	@Column(name = "xb", length = 1)
	public String getXb() {
		return this.xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	@Column(name = "cssj", length = 12)
	public String getCssj() {
		return this.cssj;
	}

	public void setCssj(String cssj) {
		this.cssj = cssj;
	}

	@Column(name = "zy_id", nullable = false)
	public Integer getZyId() {
		return this.zyId;
	}

	public void setZyId(Integer zyId) {
		this.zyId = zyId;
	}

	@Column(name = "zxf")
	public Integer getZxf() {
		return this.zxf;
	}

	public void setZxf(Integer zxf) {
		this.zxf = zxf;
	}

	@Column(name = "bz", length = 500)
	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	@Column(name = "zp")
	public String getZp() {
		return this.zp;
	}

	public void setZp(String zp) {
		this.zp = zp;
	}

}