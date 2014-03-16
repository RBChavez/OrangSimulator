package gui_orang2;

import gui_orang2.Matrix4x4;
import gui_orang2.Properties;
        
/**
 * The class provides all methods for calculating the coordinates of the end-effector
 * given all six joint angles of the robot. The Denavit-Hartenberg representation is
 * used for each link.
 * 
 * Version 4
 * Stephan Auderset
 * Last modified: 12/9/2012
 */
public class ForwardKinematicsSolver {
	
	//Instance variables
	
	private Matrix4x4 result, t1, t2, t3, t4, t5, t6;  //Matrices t1-t6 store the transformation matrix for each link
	private Boolean angleChanged = false;               //indicates whether a joint angle has been changed
	private Boolean reachable = true;                   //indicates whether an endpoint can be reached
	private int offsetShoulder = 149;                   //offset link1 to link2 
	private int offsetGripper = 75;                     //half the distance from link3 to middle of gripper
	private double theta2;
	private String errorMessage;
	private double maxAngleJoint2;
	
	//Constructor method
	public ForwardKinematicsSolver (Properties p)
	{
		result = new Matrix4x4();
		t1 = new Matrix4x4(p.getValueJoint1(), -90, 0, p.getValueLink1());
		t2 = new Matrix4x4(p.getValueJoint2(), 0, p.getValueLink2(), 0);           
		t3 = new Matrix4x4(p.getValueJoint3(), -90, p.getValueLink3(), offsetShoulder); 
		t4 = new Matrix4x4(p.getValueJoint4(), 90, offsetGripper, 0);
		t5 = new Matrix4x4(p.getValueJoint5(), -90, 0, 0);
		t6 = new Matrix4x4(p.getValueJoint6(), 0, 0, 0); 
		calcResult(p);
	}
	
	//Accessor methods
	public double getX()
	{
		return result.getValue(0,3);
	}
	
	public double getY()
	{
		return result.getValue(1,3);
	}
	
	public double getZ()
	{
		return result.getValue(2,3);
	}
	
	public Boolean getAngleChanged()
	{
		return this.angleChanged;
	}
	
	public Boolean getReachable()
	{
		return this.reachable;
	}
	
	//Helper method to display the coordinates
	public void displayEndCoordinates()
	{
		System.out.println("X: " + this.getX());
		System.out.println("Y: " + this.getY());
		System.out.println("Z: " + this.getZ());
	}
	
	//If any of the six joint angles have changed the result matrix is calculated
	//Any joint angle changes are stored in the transformation matrices
	//Method returns true if any angle has been changed
	public boolean calcEndCoordinates(Properties p)
	{
		//indicates whether an angle changed
		angleChanged = false;
  
		//check if angle for each joint has changed. If yes, calculate the new matrix
		if (t1.getTheta() != p.getValueJoint1())
		{
			t1.changeTheta(p.getValueJoint1());
			angleChanged = true;
		}
	
		if (t2.getTheta() != p.getValueJoint2())    
		{
			t2.changeTheta( p.getValueJoint2());  
			angleChanged = true;
		}
	
		if (t3.getTheta() != p.getValueJoint3()) 
		{
			t3.changeTheta(p.getValueJoint3());  
			angleChanged = true;
		}
	
		if (t4.getTheta() != p.getValueJoint4())
		{
			t4.changeTheta(p.getValueJoint4());
			angleChanged = true;
		}
	
		if (t5.getTheta() != p.getValueJoint5())
		{
			t5.changeTheta(p.getValueJoint5());
			angleChanged = true;
		}
	
		if (t6.getTheta() != p.getValueJoint6())
		{
			t6.changeTheta(p.getValueJoint6());
			angleChanged = true;
		}
		
		if (angleChanged)
			calcResult(p);
		
		return angleChanged;
	}
	
	// Calculates the transformation matrix by multiplying all joint matrices
	// End coordinates are stored in the properties class if the end coordinates are
	// within the reachable space. An error message is produced if the end coordinates
	// cannot be reached.
	private void calcResult (Properties p)
	{
	
		result = t1.multiply(t2);
		result = result.multiply(t3);
		result = result.multiply(t4);
		result = result.multiply(t5);
		result = result.multiply(t6);
	
		
		double x = result.getValue(0,3);
                if (x < 0.00001 && x > -0.0001)
                    x = 0.0;
		double y = result.getValue(1,3);
                if (y < 0.00001 && y > -0.0001)
                    y = 0.0;
		double z = result.getValue(2,3);
                if (z < 0.00001 && z > -0.0001)
                    z = 0.0;
		
	
		//Stores new end coordinates in properties class if point can be reached
                theta2 = p.getValueJoint2(); 
                maxAngleJoint2 = (Math.acos(p.getValueLink1()/p.getValueLink2()) * 180 / Math.PI);
                reachable = reachEndPoint();
		
		if(reachable)
		{
                    p.setValueX(x);
                    p.setValueY(y);
                    p.setValueZ(z);
                    p.setCanReach(true);

		}
		
		else
		{
                    p.setCanReach(false);
                    p.setErrorMessage(errorMessage);
		}
		
	}
	
	//Method to check whether an end point can be reached by the robot
	private Boolean reachEndPoint ()
	{
            reachable = true;
            errorMessage = "";
               
            if (getZ() <= 0)
            {
		reachable = false;
                errorMessage = "Point is out of configuration space";
            }
            
            if (((theta2 <= 90 + maxAngleJoint2) && (theta2 >= 90 - maxAngleJoint2 ))
               ||  ((theta2 <= -270 + maxAngleJoint2) && (theta2 >= -270 - maxAngleJoint2 ))) 
            {
                reachable = false;
                errorMessage = "Point cannot be reached with current angles";
            }
            

            return reachable;
			
	}
	
	
}