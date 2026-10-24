package UsoDeInterfaces;
import java.util.Scanner;

public class MinhaData implements ClasseComparavel{
	private int dia;
	private int mes;
	private int ano;
	
	public MinhaData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
	}
	
	@Override
	public int comparacao(Object obj) {
		MinhaData data = (MinhaData) obj;
			if (this.ano != data.ano) {
				return this.ano < data.ano ? -1 : 1;
			}
			if (this.mes != data.mes) {
				return this.mes < data.mes ? -1 : 1;
			}
			if (this.dia != data.dia) {
				return this.dia < data.dia ? -1 : 1;
			}
			return 0;
		}
	
	public static MinhaData ler(Scanner input, String rotulo) {
		while(true) {
			System.out.println(rotulo + " (DD/MM/YYYY): ");
			String[] partes = input.nextLine().trim().split("/");
			
			if (partes.length == 3) {
				int dia = Integer.parseInt(partes[0].trim());
				int mes = Integer.parseInt(partes[1].trim());
				int ano = Integer.parseInt(partes[2].trim());
			 
				if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1) {
					return new MinhaData(dia, mes, ano);
				}
				
			}
		}
	}
}







