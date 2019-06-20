package it.prova.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titolo;
	private String genere;
	private Integer numeroPagine;
	@Temporal(TemporalType.DATE)
	private Date dataPubblicazione;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autore_id", nullable = false)
	private Autore autore;

	public Libro() {
	}

	public Libro(Long id, String titolo, String genere, Integer numeroPagine, Date dataPubblicazione, Autore autore) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.numeroPagine = numeroPagine;
		this.dataPubblicazione = dataPubblicazione;
		this.autore = autore;
	}

	public Libro(Long id, String titolo, String genere, Integer numeroPagine, Date dataPubblicazione) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.numeroPagine = numeroPagine;
		this.dataPubblicazione = dataPubblicazione;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public Date getDataPubblicazione() {
		return dataPubblicazione;
	}

	public void setDataPubblicazione(Date dataPubblicazione) {
		this.dataPubblicazione = dataPubblicazione;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

}
