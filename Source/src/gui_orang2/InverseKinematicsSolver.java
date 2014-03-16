package gui_orang2;

import gui_orang2.Matrix4x4;
import gui_orang2.Properties;
/**
 * The class provides all methods for calculating the joint angles given the end effector
 * coordinates
 * 
 * Version 4
 * Stephan Auderset
 * Last modified: 12/9/2012
 */

public class InverseKinematicsSolver {

	//Version 12/3/12
	//Instance Variables
	double d1; 			//length of link 1
	double d3 = 149;                //offset (Shoulder)
        double d4 = 75;                 //offset (Gripper)
	double a2;			//length of link 2
	double a3;			//length of link 3
	double theta1, theta2, theta3, theta4, theta5, theta6;   //joint angles 1-6
	double x, y, z;                 //coordinates of end effector
        double maxDistance;             //defines the maximum reach of the robot
        double maxAngleJoint2;          //Defines the maximum angle of joint 2 so that the elbow doesn't touch the ground
        Boolean solutionExists;           
        String errorMessage;
	
	//Constructor
	//Gets robot link properties
	public InverseKinematicsSolver (Properties p)
	{
            d1 = p.getValueLink1();
            a2 = p.getValueLink2();
            a3 = p.getValueLink3() + d4;
            x = 0;
            y = 0;
            z = 0;
            maxDistance = (a2+a3)*(a2+a3) + d3*d3;         
	}
	
	public void calculateAngles(Properties p)
	{
		
            //get coordinates of end effector
            x = p.getValueX();
            y = p.getValueY();
            z = p.getValueZ();
            solutionExists = true;
            errorMessage = "";
            
            //check if z-coordinate is negative
            if(z < 0)
            {
                solutionExists = false;
                errorMessage = "Invalid z-coordinate";
            }
                
            //check whether point is too close shoulder
            if ((x*x + y*y) < d3*d3)
            {
                solutionExists = false;
                errorMessage = "The point is outside the configuration space";
            }
            
            //check whether point is beyond the configuration space
            if ((x*x + y*y + (z-d1)*(z-d1)) > maxDistance)
            {
                solutionExists = false;
                errorMessage = "The point is outside the configuration space";
                
            }
            
            if (solutionExists)
            {
                p.setCanReach(true);
                calculate(p);
            }
            else
            {
                p.setCanReach(false);
                p.setErrorMessage(errorMessage);
            }
            
         }
        
        
        public void calculate(Properties p)   
        {   
            
                
                //check we
		
		double r = Math.sqrt(x*x + y*y - d3*d3);
		double alpha = Math.atan(d3/r);
		double beta = Math.atan(y/x);
		theta1 = (beta - alpha) * 180 / Math.PI ;
		
		if (x < 0 && y >=0)
			theta1 = 180 + theta1;
		
		if (x < 0 && y < 0)
			theta1 = 180 + theta1;
		
		if (x >=0 && y < 0)
			theta1 = 360 + theta1;
		
		
		//Calculate angle joint 3		
		double dz = d1 - z;
		double s = (r*r + dz*dz - a2*a2 - a3*a3)/(2*a2*a3);
		theta3 = Math.acos(s);
                //double q = Math.sqrt(1-s*s);
		//double t = q/s;
		//theta3 = Math.atan(t);

		
		//Calculate angle joint 2
		double a = dz/r;
		double b = (a3*Math.sin(theta3))/(a2 + a3*Math.cos(theta3));
		theta2 = Math.atan(a) - Math.atan(b);
		theta2 = theta2 * 180 / Math.PI;
		theta3 = theta3 * 180 / Math.PI;
		
                
                //check if link2 (elbow) hits ground
                maxAngleJoint2 = Math.acos(d1/a2);
                if (((theta2 <= 90 + maxAngleJoint2) && (theta2 >= 90 - maxAngleJoint2 ))
                    ||  ((theta2 <= -270 + maxAngleJoint2) && (theta2 >= -270 - maxAngleJoint2 ))) 
                {
                    theta2 = theta2 + theta3;
                    theta3 = -theta3;
                }
                
		//save angles in properties class
		p.setValueJoint1(theta1);
		p.setValueJoint2(theta2);
		p.setValueJoint3(theta3);

		
		
	}
        
 
}
