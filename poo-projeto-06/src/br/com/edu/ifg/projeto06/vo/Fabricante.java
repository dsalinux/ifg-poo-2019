package br.com.edu.ifg.projeto06.vo;

/**
 *
 * @author danilo
 */
class Fabricante {

    private int cnpj;
    private String nome;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.cnpj;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fabricante other = (Fabricante) obj;
        if (this.cnpj != other.cnpj) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "cnpj=" + cnpj + ", nome=" + nome + '}';
    }
    
    
    
    
}
