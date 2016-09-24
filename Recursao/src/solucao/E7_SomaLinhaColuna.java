package solucao;

public class E7_SomaLinhaColuna {

	private static int somaCol(int[][] mapa, int linha, int coluna) {
		if (mapa.length <= linha || mapa[linha].length <= coluna) {
			return 0;
		}
		return mapa[linha][coluna] + 
				somaCol(mapa, linha+1, coluna);
	}
	
	public static void main(String[] args) {
		int[][] mapa = {{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15},
						{21, 22, 23, 24, 25}};
		System.out.println(somaCol(mapa, 0, 3));
	}
}