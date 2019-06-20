package it.prova.dto;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import it.prova.model.Libro;

public class LibroDTO {

	private Long id;
	private String titolo;
	private String genere;
	private Integer numeroPagine;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataPubblicazione;
	private AutoreDTO autore;

	public LibroDTO() {
	}
	
	public LibroDTO(Long id, String titolo, String genere, Integer numeroPagine, Date dataPubblicazione,
			AutoreDTO autore) {
		this(titolo, genere, numeroPagine, dataPubblicazione, autore);
		this.id = id;
	}
	
	public LibroDTO(Libro libroInput) {
		this.id = libroInput.getId();
		this.titolo = libroInput.getTitolo();
		this.genere = libroInput.getGenere();
		this.numeroPagine = libroInput.getNumeroPagine();
		this.dataPubblicazione = libroInput.getDataPubblicazione();
		this.autore = new AutoreDTO(libroInput.getAutore());
	}

	public LibroDTO(String titolo, String genere, Integer numeroPagine, Date dataPubblicazione, AutoreDTO autore) {
		super();
		this.titolo = titolo;
		this.genere = genere;
		this.numeroPagine = numeroPagine;
		this.dataPubblicazione = dataPubblicazione;
		this.autore = autore;
	}

	public static Libro buildLibroInstance(LibroDTO libroDTO) {
		return new Libro(libroDTO.getId(), libroDTO.getTitolo(), libroDTO.getGenere(), libroDTO.getNumeroPagine(),
				libroDTO.getDataPubblicazione(), AutoreDTO.buildAutoreInstance(libroDTO.getAutore()));
	}

	public static LibroDTO buildLibroDTOInstance(Libro libro) {
		return new LibroDTO(libro.getId(), libro.getTitolo(), libro.getGenere(), libro.getNumeroPagine(),
				libro.getDataPubblicazione(), AutoreDTO.buildAutoreDTOInstance(libro.getAutore()));
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

	public AutoreDTO getAutore() {
		return autore;
	}

	public void setAutore(AutoreDTO autore) {
		this.autore = autore;
	}

	public static Libro buildLibroInstanceForFindByExample(LibroDTO libroInput) {
		Libro example = new Libro();
		example.setTitolo(StringUtils.isNotBlank(libroInput.getTitolo()) ? libroInput.getTitolo(): null);
		example.setGenere(StringUtils.isNotBlank(libroInput.getGenere()) ? libroInput.getGenere(): null);
//		example.setAutore(libroInput.getAutore() == null ? libroInput.getAutore() : null);
//		example.setDataPubblicazione(libroInput.getDataPubblicazione());
		return example;
	}
	
}
//
//
//package it.prova.dto;
//
//import java.util.Date;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import it.prova.model.Autore;
//import it.prova.model.Libro;
//
//public class LibroDTO {
//
//	private Long id;
//	private String titolo;
//	private String genere;
//	private Integer numeroPagine;
//	@DateTimeFormat(pattern = "dd/MM/yyyy")
//	private Date dataPubblicazione;
//	private Autore autore;
//
//	public LibroDTO() {
//	}
//	
//	public LibroDTO(Long id, String titolo, String genere, Integer numeroPagine, Date dataPubblicazione,
//			Autore autore) {
//		this(titolo, genere, numeroPagine, dataPubblicazione, autore);
//		this.id = id;
//	}
//
//	public LibroDTO(String titolo, String genere, Integer numeroPagine, Date dataPubblicazione, Autore autore) {
//		super();
//		this.titolo = titolo;
//		this.genere = genere;
//		this.numeroPagine = numeroPagine;
//		this.dataPubblicazione = dataPubblicazione;
//		this.autore = autore;
//	}
//
//	public static Libro buildLibroInstance(LibroDTO libroDTO) {
//		return new Libro(libroDTO.getId(), libroDTO.getTitolo(), libroDTO.getGenere(), libroDTO.getNumeroPagine(),
//				libroDTO.getDataPubblicazione(), libroDTO.getAutore());
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getTitolo() {
//		return titolo;
//	}
//
//	public void setTitolo(String titolo) {
//		this.titolo = titolo;
//	}
//
//	public String getGenere() {
//		return genere;
//	}
//
//	public void setGenere(String genere) {
//		this.genere = genere;
//	}
//
//	public Integer getNumeroPagine() {
//		return numeroPagine;
//	}
//
//	public void setNumeroPagine(Integer numeroPagine) {
//		this.numeroPagine = numeroPagine;
//	}
//
//	public Date getDataPubblicazione() {
//		return dataPubblicazione;
//	}
//
//	public void setDataPubblicazione(Date dataPubblicazione) {
//		this.dataPubblicazione = dataPubblicazione;
//	}
//
//	public Autore getAutore() {
//		return autore;
//	}
//
//	public void setAutore(Autore autore) {
//		this.autore = autore;
//	}
//
//	public static Libro buildLibroInstanceForFindByExample(LibroDTO libroInput) {
//		Libro example = new Libro();
//		example.setTitolo(StringUtils.isNotBlank(libroInput.getTitolo()) ? libroInput.getTitolo(): null);
//		example.setGenere(StringUtils.isNotBlank(libroInput.getGenere()) ? libroInput.getGenere(): null);
//		example.setAutore(libroInput.getAutore() == null ? libroInput.getAutore() : null);
//		example.setDataPubblicazione(libroInput.getDataPubblicazione());
//		return example;
//	}
//	
//}
//
