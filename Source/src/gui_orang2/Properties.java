/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_orang2;
import java.awt.Color;
/**
 *
 * @author aom
 */
public class Properties {
	/**
	 Properties Orangs 2012 by Rattanaphan Boonbutra 
	 **/
	//Initial value--------------------------------------------------------------------------
	//Home x,y,z-->from Ola
	public double homeX = 939;
	public double homeY = 149;
	public double homeZ = 670;
        public Boolean canReach = true;
	// Initial value of joints
	public double initValueJoint1 = 0;
	public double initValueJoint2 = 0;
	public double initValueJoint3 = 0;
	public double initValueJoint4 = 0;
	public double initValueJoint5 = 0;
	public double initValueJoint6 = 0;
	//Initial value of Length links
	public double initValueLink1 = 670;
	public double initValueLink2 = 431;
	public double initValueLink3 = 433;	
	//Initial value of speed
	public int initialValueSpeed = 1;
	//Object value----------------------------------------------------------------------------
	// coordinator
	public double valueX_before;
	public double valueY_before;
	public double valueZ_before;
	// Joints
	public double valueJoint1_before = initValueJoint1;
	public double valueJoint2_before = initValueJoint2;
	public double valueJoint3_before = initValueJoint3;
	public double valueJoint4_before = initValueJoint4;
	public double valueJoint5_before = initValueJoint5;
	public double valueJoint6_before = initValueJoint6;
	// Links
	public double valueLink1_before = initValueLink1;
	public double valueLink2_before = initValueLink2;
	public double valueLink3_before = initValueLink3;
	// kinematics type	
	public String kinematicsType;
	// coordinator
	public double valueX;
	public double valueY;
	public double valueZ;
	// Joints
	public double valueJoint1 = initValueJoint1;
	public double valueJoint2 = initValueJoint2;
	public double valueJoint3 = initValueJoint3;
	public double valueJoint4 = initValueJoint4;
	public double valueJoint5 = initValueJoint5;
	public double valueJoint6 = initValueJoint6;
	// Links
	public double valueLink1 = initValueLink1;
	public double valueLink2 = initValueLink2;
	public double valueLink3 = initValueLink3;
	// speed
	public int valueSpeed;
	// get/set object value---------------------------------------------------------------------------------
	// Limit of Link length
	public int MinLink1 = 670;
	public int MaxLink1 = 800;
	public int MinLink2 = 431;
	public int MaxLink2 = 500;
	public int MinLink3 = 433;
	public int MaxLink3 = 500;
	// Limit of Angle value---------------------------------------------------------------------------------
	public int MinJoint1 = -360;
	public int MaxJoint1 = 360;
	public int MinJoint2 = -360;
	public int MaxJoint2 = 360;
	public int MinJoint3 = -360;
	public int MaxJoint3 = 360;
	// Limit of x,y,z value--------------------------------------------------------------------------------
	public int MinX = 0;
	public int MaxX = 15;
	public int MinY = 5;
	public int MaxY = 10;
	public int MinZ = 5;
	public int MaxZ = 20;
	// Limit of speed--------------------------------------------------------------------------------------
	public int MinSpeed = 1;
	public int MaxSpeed = 100;
	// Color Object (Nov 30, 2012 by Aom)-----------------------------------------------------------------------------------------
	public Color ColorRobot;
	// log number
	public int NewLogNumber= 0;
	// List For replay
	public String[] List_Replay;
	// List of Simulate
	public String[] List_AfterSim;
	//Value of List after simulate
	public void setList_AfterSim (String[] value)
	{
		List_AfterSim = value;
	}
	public String[] getList_AfterSim ()
	{
		return List_AfterSim;
	}
	// Value of List for replay-------------------------------------------------------------------------------------
	public void setList_Replay (String[] value)
	{
		List_Replay = value;
	}
	public String[] getList_Replay ()
	{
		return List_Replay;
	}
	// Value of New Log Number------------------------------------------------------------------------------------
	public void setNewLogNumber (int value)
	{
		NewLogNumber = value;
	}
	public int getNewLogNumber ()
	{
		return NewLogNumber;
	}  
	// Value of Trunk color------------------------------------------------------------------------------------
	public void setColorRobot (Color value)
	{
		ColorRobot = value;
	}
	public Color getColorRobot ()
	{
		return ColorRobot;
    }    
	// value of kinematics type
	public void setKinematicsType (String value)
	{
		kinematicsType = value;
	}
	public String getKinematics ()
	{
		return kinematicsType;
	}
	
	// Accessors for Initial Values
	public double getInitValueJoint1()
	{
		return this.initValueJoint1;
	}
	
	public double getInitValueJoint2()
	{
		return this.initValueJoint2;
	}
	
	public double getInitValueJoint3()
	{
		return this.initValueJoint3;
	}
	
	public double getInitValueJoint4()
	{
		return this.initValueJoint4;
	}
	
	public double getInitValueJoint5()
	{
		return this.initValueJoint5;
	}
	
	public double getInitValueJoint6()
	{
		return this.initValueJoint6;
	}
	
	public double getInitValueLink1()
	{
		return this.initValueLink1;
	}
	
	public double getInitValueLink2()
	{
		return this.initValueLink2;
	}
	
	public double getInitValueLink3()
	{
		return this.initValueLink3;
	}
	
	// Value of X
	public void setValueX (double value)
	{
		this.valueX = value;
	}
	public double getValueX()
	{
		return this.valueX;
	}
	// Value of Y
	public void setValueY (double value)
	{
		this.valueY = value;
	}
	public double getValueY()
	{
		return this.valueY;
	}
	// Value of Z
	public void setValueZ (double value)
	{
		this.valueZ = value;
	}
	public double getValueZ()
	{
		return this.valueZ;
	}	
	// Value of Joint1
	public void setValueJoint1 (double value)
	{
		this.valueJoint1 = value;
	}
	public double getValueJoint1()
	{
		return this.valueJoint1;
	}
	// value of Joint2
	public void setValueJoint2 (double value)
	{
		this.valueJoint2 = value;
	}
	public double getValueJoint2()
	{
		return this.valueJoint2;
	}
	// value of Joint3
	
	public void setValueJoint3 (double value)
	{
		this.valueJoint3 = value;
	}
	public double getValueJoint3()
	{
		return this.valueJoint3;
	}
	// value of Joint4
	public void setValueJoint4 (double value)
	{
		this.valueJoint4 = value;
	}
	public double getValueJoint4()
	{
		return this.valueJoint4;
	}
	// value of Joint5
	public void setValueJoint5 (double value)
	{
		this.valueJoint5 = value;
	}
	public double getValueJoint5()
	{
		return this.valueJoint5;
	}
	// value of Joint6
	public void setValueJoint6 (double value)
	{
		this.valueJoint6 = value;
	}
	public double getValueJoint6()
	{
		return this.valueJoint6;
	}
	// value of Link1
	public void setValueLink1 (double value)
	{
		this.valueLink1 = value;
	}
	public double getValueLink1()
	{
		return this.valueLink1;
	}
	// value of Link2
	public void setValueLink2 (double value)
	{
		this.valueLink2 = value;
	}
	public double getValueLink2()
	{
		return this.valueLink2;
	}
	// value of Link3
	public void setValueLink3 (double value)
	{
		this.valueLink3 = value;
	}
	public double getValueLink3()
	{
		return this.valueLink3;
	}
	//---------------------------------------------------------------------------------------------Dec 5,2012
	public void setValueX_beforeChange (double value)
	{
		this.valueX = value;
	}
	public double getValueX_beforeChange()
	{
		return this.valueX;
	}
	// Value of Y
	public void setValueY_beforeChange (double value)
	{
		this.valueY = value;
	}
	public double getValueY_beforeChange()
	{
		return this.valueY;
	}
	// Value of Z
	public void setValueZ_beforeChange (double value)
	{
		this.valueZ = value;
	}
	public double getValueZ_beforeChange()
	{
		return this.valueZ;
	}	
	// Value of Joint1
	public void setValueJoint1_beforeChange (double value)
	{
		this.valueJoint1 = value;
	}
	public double getValueJoint1_beforeChange()
	{
		return this.valueJoint1;
	}
	// value of Joint2
	public void setValueJoint2_beforeChange (double value)
	{
		this.valueJoint2 = value;
	}
	public double getValueJoint2_beforeChange()
	{
		return this.valueJoint2;
	}
	// value of Joint3
	
	public void setValueJoint3_beforeChange (double value)
	{
		this.valueJoint3 = value;
	}
	public double getValueJoint3_beforeChange()
	{
		return this.valueJoint3;
	}
	// value of Joint4
	public void setValueJoint4_beforeChange (double value)
	{
		this.valueJoint4 = value;
	}
	public double getValueJoint4_beforeChange()
	{
		return this.valueJoint4;
	}
	// value of Joint5
	public void setValueJoint5_beforeChange (double value)
	{
		this.valueJoint5 = value;
	}
	public double getValueJoint5_beforeChange()
	{
		return this.valueJoint5;
	}
	// value of Joint6
	public void setValueJoint6_beforeChange (double value)
	{
		this.valueJoint6 = value;
	}
	public double getValueJoint6_beforeChange()
	{
		return this.valueJoint6;
	}
	// value of Link1
	public void setValueLink1_beforeChange (double value)
	{
		this.valueLink1 = value;
	}
	public double getValueLink1_beforeChange()
	{
		return this.valueLink1;
	}
	// value of Link2
	public void setValueLink2_beforeChange (double value)
	{
		this.valueLink2 = value;
	}
	public double getValueLink2_beforeChange()
	{
		return this.valueLink2;
	}
	// value of Link3
	public void setValueLink3_beforeChange (double value)
	{
		this.valueLink3 = value;
	}
	public double getValueLink3_beforeChange()
	{
		return this.valueLink3;
	}
//---------------------------------------------------------------------------------------------end Dec 5,2012
// value of speed
	public void setValueSpeed (int value)
	{
		this.valueSpeed = value;
	}
	public int getValueSpeed()
	{
		return this.valueSpeed;
	}
        
        public void setCanReach(Boolean canReach)
        {
            this.canReach = canReach;
        }
        
        public Boolean getCanReach()
        {
            return this.canReach;
        }
        
        String errorMessage = "";
        
        public String getErrorMessage()
        {
            return this.errorMessage;
        }
        
        public void setErrorMessage(String error)
        {
            this.errorMessage = error;
        }
           
}
