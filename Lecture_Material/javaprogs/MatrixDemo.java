public class MatrixDemo {
    public static void main(String [] args) {
	/*int [][] matrix;
        matrix = new int[3][3];*/
        int [][] matrix = {{4,2},{5,2,9,6},{9,2,1}};
        for(int i= 0;i<matrix.length;i++) {
             for(int j=0;j<matrix[i].length;j++) {
	         System.out.print(matrix[i][j]+" ");
	     }	
	     System.out.println();
	}
    }
}
