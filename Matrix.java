package JavaProgmmer;
public class Matrix 
{
	public static int[][] transpose(int[][]m)
	{
		for(int i=0;i<m.length;i++)
		{
			for(int j=i;j<m[0].length;j++)
			{
				int x=m[i][j];
				m[i][j]=m[j][i];
				m[j][i]=x;
			}
		}
		return m;
	}
	public static int[][] rotateLeft(int[][]m)
	{
		int mt[][]=transpose(m);
		for(int i=0;i<mt.length/2;i++)
		{
			for(int j=0;j<mt[0].length;j++)
			{
				int x=mt[i][j];
				mt[i][j]=mt[mt.length-1-i][j];
				mt[mt.length-1-i][j]=x;
			}
		}
		return mt;
	}
	public static int[][] rotateRight(int[][]m)
	{
		int mt[][]=transpose(m);
		for(int i=0;i<mt.length/2;i++)
		{
			for(int j=0;j<mt[0].length;j++)
			{
				int x=mt[j][i];
				mt[j][i]=mt[j][mt.length-1-i];
				mt[j][mt.length-1-i]=x;
			}
		}
		return mt;
	}
	

}
