package br.com.starlog.model;

public class Carga {
    private String codigoRstreio;
    private String categoria;
    private double posoKg;
    private double valorSeguro;

    

    public Carga(String codigoRstreio, String categoria, double posoKg, double valorseguro) {
        this.codigoRstreio = codigoRstreio;
        this.categoria = categoria;
        this.posoKg = posoKg;
        this.valorSeguro = valorseguro;

    }

    public String getCodigoRstreio() {
        return codigoRstreio;
    }
    public String getCategoria() {
        return categoria;
    }
    public double getPosoKg() {
        return posoKg;
    }
    public double getValorseguro() {
        return valorSeguro;
    }

    @Override
    public String toString() {
        return "Carga [codigoRstreio=" + codigoRstreio + ", categoria=" + categoria + ", posoKg=" + posoKg
                + ", valorseguro=" + valorSeguro + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoRstreio == null) ? 0 : codigoRstreio.hashCode());
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
        Carga other = (Carga) obj;
        if (codigoRstreio == null) {
            if (other.codigoRstreio != null)
                return false;
        } else if (!codigoRstreio.equals(other.codigoRstreio))
            return false;
        return true;
    }
    
}
