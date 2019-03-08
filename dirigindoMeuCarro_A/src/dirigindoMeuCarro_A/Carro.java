package dirigindoMeuCarro_A;

public class Carro {
	//Declaração de Atributos
	private String marca;
	private boolean ligado;
	private int velocidae;
	private int marcha;

	//Declaração dos Construtores
	public Carro() {

	}

	public Carro(String marca, boolean ligado, int velocidae, int marcha) {
		this.marca = marca;
		this.ligado = ligado;
		this.velocidae = velocidae;
		this.marcha = marcha;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVelocidae() {
		return velocidae;
	}

	public void setVelocidae(int velocidae) {
		this.velocidae = velocidae;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	//Metodos dos de sistemas progamados pelos alunos.

	public void ligarCarro() {

		if(this.ligado == true) {
			System.out.println("O Carro está ligado");
		}else {
			System.out.println("O Carro está desligado");
		}
	}
}


