package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ligne_vente")
public class LigneVente implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idVente")
	private Vente vente1;

	public Vente getVente() {
		return vente1;
	}

	public void setVente(Vente vente) {
		this.vente1 = vente;
	}

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public Article getArticle() {
		return article;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
