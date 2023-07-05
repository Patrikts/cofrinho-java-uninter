package empresa;

//Aluno - Patrik Teixeira Saraiva
//RU - 3925726

public class Real extends Moeda {
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}
	
	@Override
	public double converter() {
		return this.valor;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		} 
		
		Real objetoDeReal = (Real) objeto;
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
			return true;
	}
}
