
public class Matrices {
	
	//int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
	int[][] myMatrix1;
	int[][] myMatrix2;
	int[][] solMatrix;
	
	public Matrices(int[][] myMatrix1, int[][] myMatrix2) {
		this.myMatrix1 = myMatrix1;
		this.myMatrix2 = myMatrix2;
	}
	
	public int[][] sumMatrix() {
		
		if(myMatrix1.length == myMatrix2.length && myMatrix1[0].length == myMatrix2[0].length) {
			for(int i = 0; i < myMatrix1.length; i++) {
				for(int j = 0;  j < myMatrix1[i].length; j++) {
					solMatrix[i][j] = myMatrix1[i][j] + myMatrix2[i][j];
				}
			}
			return solMatrix;
		}else {
			System.out.println("Las matrices no son cuadradas");
			return myMatrix1;
		}
	}
	
	public int[][] multiplytMatrix() {
		
		if(myMatrix1[0].length == myMatrix2.length) {
			for(int i = 0; i < myMatrix1.length; i++) {
				for(int j = 0; j < myMatrix1[0].length; j++) {
					int product = 0;
					for(int k = 0; k < myMatrix1[0].length; k++) {
						product += (myMatrix1[i][k]*myMatrix2[k][i]);
					}
					solMatrix[i][j] = product;
				}
			}
			return solMatrix;
		}else {
			System.out.println("El número de columnas de la matriz 1 no es igual al "
					+ "número de filas de la matriz 2.");
			return myMatrix1;
		}
		
	}
	
	
}
