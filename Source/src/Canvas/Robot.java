package Canvas;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import com.sun.j3d.utils.geometry.*;
import javax.swing.Timer;

public class Robot implements ActionListener{
        //robot variables
	TransformGroup base = new TransformGroup();
	Transform3D basem = new Transform3D();
	TransformGroup joint2 = new TransformGroup();
        TransformGroup joint2s = new TransformGroup();
	Transform3D joint2m = new Transform3D();
        Transform3D joint2sm = new Transform3D();
	TransformGroup link1 = new TransformGroup();
	Transform3D link1m = new Transform3D();
	TransformGroup joint3 = new TransformGroup();
	Transform3D joint3m = new Transform3D();
	TransformGroup link2 = new TransformGroup();
	Transform3D link2m = new Transform3D();
	TransformGroup joint4 = new TransformGroup();
	Transform3D joint4m = new Transform3D();
	TransformGroup joint5 = new TransformGroup();
	Transform3D joint5m = new Transform3D();
	TransformGroup joint6 = new TransformGroup();
	Transform3D joint6m = new Transform3D();
	TransformGroup endPoint = new TransformGroup();
	Transform3D endPointm = new Transform3D();
	Transform3D someRotation = new Transform3D();
        
        Cylinder link2x;
        Timer link2XTimer;
        Cylinder link1x;
        Timer link1XTimer;
        Cylinder basex;
        Timer baseXTimer;
       
        //animation variables
        Timer baseTimer;
        boolean baseWorking = false;
        int currentBaseAngle;
        int baseDirection;
        Timer joint2Timer;
        boolean joint2Working = false;
        int currentJoint2Angle;
        int joint2Direction;
        Timer joint3Timer;
        boolean joint3Working = false;
        int currentJoint3Angle;
        int joint3Direction;
        Timer joint4Timer;
        boolean joint4Working = false;
        int currentJoint4Angle;
        int joint4Direction;
        Timer joint5Timer;
        boolean joint5Working = false;
        int currentJoint5Angle;
        int joint5Direction;
        Timer joint6Timer;
        boolean joint6Working = false;
        int currentJoint6Angle;
        int joint6Direction;
        int speed = 1;
        float zoom = 0;
        
        Timer robotTimer;
        boolean robotWorking = false;
	
	float baseLength = .679f;
	float baseOffset = (baseLength - .5f)/2;
	float link1Length = 0.4318f;
	float link1Offset = (link1Length - .5f)/2;
	float link2Length = .4331f;
	float link2Offset = (link2Length - .5f)/2;
	
	int baseAngle = 190;
	int joint2Angle = -90;
	int joint3Angle = 150;
        int joint4Angle = 0;
	int joint5Angle = 0;
	int joint6Angle = -00;
	
        public void setSpeed(double newSpeed){
            this.speed = (int)newSpeed;
        }

	public void newRobot()
	{
		//create endLeft
		Cylinder endLeftx = new Cylinder(.020f, .15f);
		TransformGroup endLeft = new TransformGroup();
		Transform3D endLeftm = new Transform3D();
		endLeft.addChild(endLeftx);
		endLeftm.setTranslation(new Vector3f(0.075f,0.05f,.0f));
		someRotation = new Transform3D();
		someRotation.rotZ(-90 * (Math.PI/180));
		endLeftm.mul(someRotation);
		endLeft.setTransform(endLeftm);
		
		//create endright
		Cylinder endRightx = new Cylinder(.020f, .15f);
		TransformGroup endRight = new TransformGroup();
		Transform3D endRightm = new Transform3D();
		endRight.addChild(endRightx);
		endRightm.setTranslation(new Vector3f(0.075f,-0.05f,0.0f));
		someRotation = new Transform3D();
		someRotation.rotZ(-90 * (Math.PI/180));
		endRightm.mul(someRotation);
		endRight.setTransform(endRightm);
		
		//create endpoint
		Cylinder endPointx = new Cylinder(.020f, .1f);
		someRotation = new Transform3D();
		someRotation.rotZ(90 * (Math.PI/180));
		endPointm.mul(someRotation);
		endPoint.addChild(endPointx);
		endPoint.addChild(endRight);
		endPoint.addChild(endLeft);
		endPoint.setTransform(endPointm);
		
		//create joint6 sphere
		joint6.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		Sphere joint6x = new Sphere(.02f);
		joint6.addChild(joint6x);
		joint6m.setTranslation(new Vector3f(-.0f,0.27f,0.0f));
		someRotation = new Transform3D();
		someRotation.rotX(joint6Angle * (Math.PI/180));		
		joint6m.mul(someRotation);
		joint6.setTransform(joint6m);
		joint6.addChild(endPoint);
		
		//create joint4 sphere
		joint4.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		Sphere joint4x = new Sphere(.02f);
		joint4.addChild(joint4x);
		joint4m.setTranslation(new Vector3f(-.0f,0.0f + link2Offset,0.0f));
		someRotation = new Transform3D();
		someRotation.rotY(joint4Angle * (Math.PI/180));		
		joint4m.mul(someRotation);
		joint4.setTransform(joint4m);
		joint4.addChild(joint6);
		
		//create link2
		link2.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		link2x = new Cylinder(.07f, link2Length);
		link2.addChild(link2x);
		link2m.setTranslation(new Vector3f(-.05f,0.2f  + link2Offset,0.0f));
		someRotation = new Transform3D();
		//someRotation.rotX(Math.PI *.5);
		link2m.mul(someRotation);
		link2.setTransform(link2m);
		link2.addChild(joint4);
		
		//create joint3 sphere
		joint3.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		Sphere joint3x = new Sphere(.03f);
		joint3.addChild(joint3x);
		joint3m.setTranslation(new Vector3f(-.075f,.20f + link1Offset,0.0f));
		someRotation = new Transform3D();
		someRotation.rotX(joint3Angle * (Math.PI/180));		
		joint3m.mul(someRotation);
		joint3.setTransform(joint3m);
		joint3.addChild(link2);
		
		//create link1
		link1.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		link1x = new Cylinder(.07f, link1Length);
		link1.addChild(link1x);
		someRotation = new Transform3D();
		someRotation.rotZ(Math.PI *.5);
		link1m.mul(someRotation);
		link1m.setTranslation(new Vector3f(-0.20f - link1Offset,0.05f,-0.0f));
		link1.setTransform(link1m);
		link1.addChild(joint3);
		
		//sphere for joint 2
		joint2s.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		Sphere joint2sx = new Sphere(.03f);
		joint2s.addChild(joint2sx);
		joint2sm.setTranslation(new Vector3f(.02f,.09f,0.0f));
		someRotation = new Transform3D();
		someRotation.rotY(joint2Angle * (Math.PI/180));
		joint2sm.mul(someRotation);
		joint2s.setTransform(joint2sm);
		joint2s.addChild(link1);
	
		//create joint 2
		Cylinder joint2x = new Cylinder(0.075f,.2f);
		joint2x.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		joint2.addChild(joint2x);
		joint2m.setTranslation(new Vector3f(-0.01f,0.20f+baseOffset,0.0f));
		someRotation = new Transform3D();
		someRotation.rotZ(Math.PI * -1.0);
                joint2m.mul(someRotation);
                someRotation.rotX(Math.PI * -.5); //
		joint2m.mul(someRotation);
		joint2.setTransform(joint2m);
		joint2.addChild(joint2s);
		
		
		//create base
		base.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		
		basex = new Cylinder(0.07f,baseLength);
		basex.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
		someRotation = new Transform3D();
		someRotation.rotY(baseAngle * (Math.PI/180));
		basem.mul(someRotation);
		basem.setTranslation(new Vector3f(0.0f,0.0f,0.0f + zoom));
		base.setTransform(basem);
		base.addChild(basex);
		base.addChild(joint2);
	}
	
	public TransformGroup getBase()
	{
		return this.base;
	}
	
	public void setProperties(float base, float link1, float link2)
	{
		this.link1Length = (link1*2/2000);
		this.link2Length = (link2*2/2000);
		this.baseLength = (base*2/2000);
		this.link1Offset = (link1Length - .5f)/2;
		this.link2Offset = (link2Length - .5f)/2;
		this.baseOffset = (baseLength - .5f)/2;
		
	}
        
        public void transformJoint6(final int degree)
        {
           if(!joint6Working) 
           {
                joint6Direction = 0;
                if(degree <= joint6Angle)
                {
                    joint6Direction = -1;
                }
                else
                {
                    joint6Direction = 1;
                }

           
            joint6Working = true;
            currentJoint6Angle = joint6Angle;
            joint6Angle = degree;
            ActionListener action = new ActionListener(){
                @Override
                public  void  actionPerformed(ActionEvent e ){
                    if(currentJoint6Angle != degree)
                    {
                        someRotation = new Transform3D();
                        someRotation.rotX(1 *joint6Direction * (Math.PI/180));
                        joint6m.mul(someRotation);
                        joint6.setTransform(joint6m);
                        currentJoint6Angle = currentJoint6Angle + 1 * joint6Direction;
                    }
                    else if(currentJoint6Angle==degree)
                    {
                        joint6Timer.stop();
                        joint6Working = false;
                    }
                }
            }; 
            joint6Timer = new Timer(50/speed,action);
                if(!joint6Timer.isRunning())
                    joint6Timer.start(); 
            System.out.println(joint6Angle);
           }

        }
        
         public void transformJoint4(final int degree)
        {
            if(!joint4Working) 
            {
                 joint4Direction = 0;
            if(degree <= joint4Angle)
            {
                joint4Direction = -1;
            }
            else
            {
                joint4Direction = 1;
            }
            
          
            joint4Working = true;
            currentJoint4Angle = joint4Angle;
            joint4Angle = degree;
            ActionListener action = new ActionListener(){
                @Override
                public  void  actionPerformed(ActionEvent e ){
                    if(currentJoint4Angle != degree)
                    {
                        someRotation = new Transform3D();
                        someRotation.rotY(1 *joint4Direction * (Math.PI/180));
                        joint4m.mul(someRotation);
                        joint4.setTransform(joint4m);
                        currentJoint4Angle = currentJoint4Angle + 1 * joint4Direction;
                    }
                    else if(currentJoint4Angle==degree)
                    {
                        joint4Timer.stop();
                        joint4Working = false;
                    }
                }
            }; 
            joint4Timer = new Timer(50/speed,action);
                if(!joint4Timer.isRunning())
                    joint4Timer.start(); 
            System.out.println(joint4Angle);
           }

        }

        public void transformJoint3(final int degree)
        {
           if(!joint3Working) 
           {
            joint3Direction = 0;
            if(degree <= joint3Angle)
            {
                joint3Direction = -1;
            }
            else
            {
                joint3Direction = 1;
            }
            
            joint3Working = true;
            currentJoint3Angle = joint3Angle;
            joint3Angle = degree;
            ActionListener action = new ActionListener(){
                @Override
                public  void  actionPerformed(ActionEvent e ){
                    if(currentJoint3Angle != degree)
                    {
                        someRotation = new Transform3D();
                        someRotation.rotX(1 *joint3Direction * (Math.PI/180));
                        joint3m.mul(someRotation);
                        joint3.setTransform(joint3m);
                        currentJoint3Angle = currentJoint3Angle + 1 * joint3Direction;
                    }
                    else if(currentJoint3Angle==degree)
                    {
                        joint3Timer.stop();
                        joint3Working = false;
                    }
                }
            }; 
            joint3Timer = new Timer(50/speed,action);
                if(!joint3Timer.isRunning())
                    joint3Timer.start(); 
            System.out.println(joint3Angle);
           }

        }
          
        public void transformJoint2(final int degree)
        {
           if(!joint2Working) 
           {
            joint2Direction = 0;
            if(degree <= joint2Angle)
            {
                joint2Direction = -1;
            }
            else
            {
                joint2Direction = 1;
            }
            
            joint2Working = true;
            currentJoint2Angle = joint2Angle;
            joint2Angle = degree;
            ActionListener action = new ActionListener(){
                @Override
                public  void  actionPerformed(ActionEvent e ){
                    if(currentJoint2Angle != degree)
                    {
                        someRotation = new Transform3D();
                        someRotation.rotY(1 *joint2Direction * (Math.PI/180));
                        joint2sm.mul(someRotation);
                        joint2s.setTransform(joint2sm);
                        currentJoint2Angle = currentJoint2Angle + 1 * joint2Direction;
                    }
                    else if(currentJoint2Angle==degree)
                    {
                        joint2Timer.stop();
                        joint2Working = false;
                    }
                }
            }; 
            joint2Timer = new Timer(50/speed,action);
                if(!joint2Timer.isRunning())
                    joint2Timer.start(); 
            System.out.println(joint2Angle);
           }
        }
        public void transformBase(final int degree)
        {
           if(!baseWorking) 
           {
            baseDirection = 0;
            if(degree <= baseAngle )
            {
                baseDirection = -1;
            }
            else
            {
                baseDirection = 1;
            }
            
           
            baseWorking = true;
            currentBaseAngle = baseAngle;
            baseAngle = degree;
            ActionListener action = new ActionListener(){
                @Override
                public  void  actionPerformed(ActionEvent e ){
                    if(currentBaseAngle != degree)
                    {
                        someRotation = new Transform3D();
                        someRotation.rotY(1 *baseDirection * (Math.PI/180));
                        basem.mul(someRotation);
                        base.setTransform(basem);
                        currentBaseAngle = currentBaseAngle + 1 * baseDirection;
                    }
                    else if(currentBaseAngle==degree)
                    {
                        baseWorking = false;
                        baseTimer.stop();                        
                    }
                }
                
            }; 
            baseTimer = new Timer(50/speed,action);
                if(!baseTimer.isRunning())
                    baseTimer.start(); 
            System.out.println(baseAngle);
           }
        }
    public void Simulate(int base, int joint2, int joint3,int joint4, int joint5, int joint6)
    {
        if(!robotWorking)
        {
            robotWorking = true;
            transformBase(base);
            transformJoint2(joint2);
            transformJoint3(joint3);
            transformJoint4(joint4);
            //transformJoint5(joint5);
            transformJoint6(joint6);
        }
        
        robotWorking = false;
       
    
    }
    
    public void setBase(final double size)
        {
//          System.out.println(this.baseLength);
            ActionListener action = new ActionListener(){
                @Override
                public  void  actionPerformed(ActionEvent e ){
                    setProperties((float)size, link1Length, link2Length);
                    basex = new Cylinder(0.07f,baseLength);
                    basex.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
                    someRotation = new Transform3D();
                    someRotation.rotY(baseAngle * (Math.PI/180));
                    //basem.mul(someRotation);
                    basem.setTranslation(new Vector3f(0.0f,0.0f,0.0f));
                    base.setTransform(basem);
//                    base.addChild(basex);
                }
            }; 
            baseXTimer = new Timer(5/speed,action);
            baseXTimer.setRepeats(false);
            baseXTimer.start(); 
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

