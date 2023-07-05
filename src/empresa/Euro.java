package empresa;

//Aluno - Patrik Teixeira Saraiva
//RU - 3925726

public class Euro extends Moeda {
	
	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
	}

	@Override
	public double converter() {
		return this.valor * 4.5;
	}

@Override
public boolean equals(Object objeto) {
	if (this.getClass() != objeto.getClass()) {
		return false;
	} 
	
	Euro objetoDeEuro = (Euro) objeto;
	
	if (this.valor != objetoDeEuro.valor) {
		return false;
	}
		return true;
	}
}