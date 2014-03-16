package gui_orang2;
public class Matrix4x4 
{
	public double values [][] = new double [4][4];	
	private double theta, alpha;
	private double a, d;


	//Constructor - initializes to identity
	//| 1 0 0 0 |
	//| 0 1 0 0 |
	//| 0 0 1 0 |
	//| 0 0 0 1 |
	
	public Matrix4x4 ()
	{
		this.initialize();
		this.setParameters(0, 0, 0, 0);
	}
	
	
	//Constructor - makes a prismatic joint matrix (transformation matrix) based on the
	//four DH parameters (Theta, Alpha, A, D)
	public Matrix4x4 (double Theta, double Alpha, double A, double D)
	{
	
		this.initialize();
		this.setParameters(Theta, Alpha, A, D);
		
		//Convert degrees to radians
		double radTheta = Theta * Math.PI / 180;
		double radAlpha = Alpha * Math.PI / 180;
		
		double cosT = Math.cos(radTheta);
		double sinT = Math.sin(radTheta);
		double cosA = Math.cos(radAlpha);
		double sinA = Math.sin(radAlpha);
		
		values [0][0] = cosT;
		values [0][1] = -cosA*sinT;
		values [0][2] = sinA*sinT;
		values [0][3] = a*cosT;
		values [1][0] = sinT;
		values [1][1] = cosA*cosT;
		values [1][2] = -sinA*cosT;
		values [1][3] = a*sinT;
		values [2][1] = sinA;
		values [2][2] = cosA;
		values [2][3] = d;
		
	}
	
	public void changeTheta(double Theta)
	{
		theta = Theta;
		double radTheta = Theta * Math.PI / 180;
		double radAlpha = alpha * Math.PI / 180;
		
		double cosT = Math.cos(radTheta);
		double sinT = Math.sin(radTheta);
		double cosA = Math.cos(radAlpha);
		double sinA = Math.sin(radAlpha);
		
		values [0][0] = cosT;
		values [0][1] = -cosA*sinT;
		values [0][2] = sinA*sinT;
		values [0][3] = a*cosT;
		values [1][0] = sinT;
		values [1][1] = cosA*cosT;
		values [1][2] = -sinA*cosT;
		values [1][3] = a*sinT;
	}
	
	public double getTheta()
	{
		return theta;
	}
	
	
	private void initialize()
	{
		int i, j;
		for (i = 0; i < 4; i++)
			for (j = 0; j < 4; j++)
				values[i][j] = (i == j) ? 1.0 : 0.0;	
	}
	
	private void setParameters(double Theta, double Alpha, double A, double D )
	{
		theta = Theta;
		alpha = Alpha;
		a = A;
		d = D;
		
	}
	

	//Multiply current matrix and return result
	public Matrix4x4 multiply(Matrix4x4 M)
	{
		Matrix4x4 result = new Matrix4x4();
		int i, j, k;
		
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
				result.values[i][j] = 0;
				for (k = 0; k < 4; k++)
					result.values[i][j] += this.values[i][k] * M.values[k][j];
			}
		}
		return result;		
	}
	

	
	//set a value of the matrix
	public void setValue (int i, int j, double value)
	{
		this.values[i][j] = value;
	}
	
	//get value of the matrix
	public double getValue (int i, int j)
	{
		return this.values[i][j];
	}
	
	//print matrix
	public void printMatrix()
	{
		int i, j;
		
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
				System.out.print(this.values[i][j] + "   ");
			}
			System.out.println();
		}
				
	}
}