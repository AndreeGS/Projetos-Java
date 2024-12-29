package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double impostoPago() {
		
		if(numeroDeFuncionarios < 10) {
			return super.getRendaAnual() * 0.16;
		}
		else {
			return super.getRendaAnual() * 0.14;
		}
	}
}
