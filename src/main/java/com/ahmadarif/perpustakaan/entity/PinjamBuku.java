package com.ahmadarif.perpustakaan.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_pinjam")
public class PinjamBuku {
	
	@Id
	@GenericGenerator(name="uuid", strategy="uuid2")
	@GeneratedValue(generator="uuid")
	private String id;

	@Column(name="tanggal_pinjam", nullable=false)
	private Date tanggalPinjam;
	
	@Column(name="tanggal_kembali", nullable=false)
	private Date tanggalKembali;
	
	@Column(name="sudah_kembali", nullable=false)
	private Boolean kembali;
	
	@JoinColumn(name="kode_anggota", nullable=false)
	@OneToOne
	private Anggota anggota;
	
	@JoinColumn(name="kode_buku", nullable=false)
	@OneToOne
	private Buku buku;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTanggalPinjam() {
		return tanggalPinjam;
	}

	public void setTanggalPinjam(Date tanggalPinjam) {
		this.tanggalPinjam = tanggalPinjam;
	}

	public Date getTanggalKembali() {
		return tanggalKembali;
	}

	public void setTanggalKembali(Date tanggalKembali) {
		this.tanggalKembali = tanggalKembali;
	}

	public Boolean getKembali() {
		return kembali;
	}

	public void setKembali(Boolean kembali) {
		this.kembali = kembali;
	}

	public Anggota getAnggota() {
		return anggota;
	}

	public void setAnggota(Anggota anggota) {
		this.anggota = anggota;
	}

	public Buku getBuku() {
		return buku;
	}

	public void setBuku(Buku buku) {
		this.buku = buku;
	}
	
}