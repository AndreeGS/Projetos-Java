package entities;

public class PessoaFisica extends Pessoa {

	private Double gastoComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double gastoComSaude) {
		super(name, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	public Double getGastoComSaude() {
		return gastoComSaude;
	}

	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}

	@Override
	public Double impostoPago() {

	    double valorImposto;

	    if (super.getRendaAnual() < 20000) {
	        valorImposto = super.getRendaAnual() * 0.15; 
	    } else {
	        valorImposto = super.getRendaAnual() * 0.25; 
	    }

	    if (gastoComSaude > 0.1) {
	        return valorImposto - (gastoComSaude * 0.50); 
	    } else {
	        return valorImposto;
	    }
	}

}
