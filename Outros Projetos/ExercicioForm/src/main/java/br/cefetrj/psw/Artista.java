package br.cefetrj.psw;

public class Artista {
	
	private Integer id;
	private String nomeArtistico;
	private String banda;
	private String anosDeCarreira;
	private String estiloMusical;
	
	public Artista(){
		
	}
	
	

	public Artista(Integer id, String nomeArtistico, String banda, String anosDeCarreira, String estiloMusical) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.banda = banda;
		this.anosDeCarreira = anosDeCarreira;
		this.estiloMusical = estiloMusical;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getAnosDeCarreira() {
		return anosDeCarreira;
	}

	public void setAnosDeCarreira(String anosDeCarreira) {
		this.anosDeCarreira = anosDeCarreira;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	
	
	
}
