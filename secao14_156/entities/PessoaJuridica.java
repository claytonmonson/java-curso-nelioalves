package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroDeFuncionarios = 0;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double impostoPago() {
		return this.numeroDeFuncionarios >= 10 ? this.getRendaAnual() * 0.14 : this.getRendaAnual() * 0.16;
	}

}
