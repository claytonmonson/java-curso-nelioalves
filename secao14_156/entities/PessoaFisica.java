package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosComSaude = 0.0;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	private double descontoSaude() {
		return this.gastosComSaude > 0.0 ? this.gastosComSaude * 0.5 : 0.0;
	}

	@Override
	public double impostoPago() {
		double impostoPago;
		if (this.getRendaAnual() >= 20000.0) {
			impostoPago = this.getRendaAnual() * 0.25 - descontoSaude();
		} else {
			impostoPago = this.getRendaAnual() * 0.15 - descontoSaude();
		}

		return impostoPago;
	}

}
