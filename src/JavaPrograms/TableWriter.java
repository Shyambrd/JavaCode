package JavaPrograms;

public class TableWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//in this program we will write tables from 1 to 100
		
		createTable();
		
	}

	private static void createTable() {
		// TODO Auto-generated method stub
		int  [][] a= new int [10][10];
		
		for (int i=0; i<10;i++)
		{
			for (int j=0;j<10;j++)
			{
				a[i][j]=(i * 10 + j + 1);
				
				
			}
		}
			
		for (int i=0; i<10;i++)
		{
			for (int j=0;j<10;j++)
			{
			System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}
		}
		
	}


