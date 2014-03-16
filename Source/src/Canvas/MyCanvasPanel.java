/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Canvas;
import Canvas.Robot;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.beans.*;
 
// import j3d stuff - note they must be correctly installed on your system - typicall in ~\jdk1.3\jre\lib\ext\
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GraphicsConfiguration;
import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.geometry.ColorCube;
import gui_orang2.Properties;

public class MyCanvasPanel extends JPanel {

    SimpleUniverse su;
    Canvas3D canvas3D;
    private TransformGroup objTrans;
    Robot aRobot = new Robot();
    float red = 1.0f;
    float green = 1.0f;
    float blue = 1.0f;
    int zoom = 6;
    
    BoundingSphere bounds;
    
    Transform3D View_Transform3D = new Transform3D();
    TransformGroup View_TransformGroup = new TransformGroup();
    
    gui_orang2.Properties myProps;
    

  public void runSim(int base, int joint2, int joint3,int joint4, int joint5, int joint6)
  {
      aRobot.Simulate(base, joint2, joint3,joint4, joint5, joint6);
  }
  public void setColor(float newRed, float newGreen, float newBlue)
  {
      this.red = newRed/100;
      this.green = newGreen/100;
      this.blue = newBlue/100;
  }
  public void setZoom(int newZoom)
  {
      this.zoom = newZoom;
      View_Transform3D.setTranslation(new Vector3f(0.2f, 0.50f, 2f+zoom*1.0f/2));
      View_TransformGroup.setTransform(View_Transform3D);
  }
  public void zoomUp()
  {
      if(this.zoom<=10)
      {
          setZoom(this.zoom+1);
      }
  }
  public void zoomDown()
  {
      if(this.zoom>=1)
      {
          setZoom(this.zoom-1);
      }
  }
  public void setSpeed(int newSpeed)
  {
      aRobot.setSpeed(newSpeed);
  }
  public void initRobot()
  {
      aRobot = new Robot();
      aRobot.setProperties((float)myProps.getValueLink1(),(float)myProps.getValueLink2(),(float)myProps.getValueLink3());
      Color myColor = myProps.getColorRobot();
      setColor(myColor.getRed(), myColor.getGreen(), myColor.getBlue()); //TODO: GET NEW COLOR
      aRobot.newRobot();
      
  }
  public MyCanvasPanel(Properties props,int joint1Begin, int joint2Begin, int joint3Begin, int joint4Begin, int joint5Begin, int joint6Begin, int joint1End, int joint2End, int joint3End, int joint4End, int joint5End, int joint6End)
  {
      myProps = props;
            canvas3D = new Canvas3D(SimpleUniverse.getPreferredConfiguration());
            add("Center", canvas3D);
            su = new SimpleUniverse(canvas3D);

            //experimental usage of canvas
            canvas3D.setSize(575,500);
            canvas3D.setBackground(Color.WHITE);
            BranchGroup contents = createSceneGraph();
            
            ViewingPlatform vp = su.getViewingPlatform();
            
            View_TransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
            View_TransformGroup = vp.getMultiTransformGroup().getTransformGroup(0);
            
            
            View_TransformGroup.getTransform(View_Transform3D);

            Transform3D rot = new Transform3D();
            Transform3D rot2 = new Transform3D();
            rot.rotX(Math.PI * -.05);
//            rot2.rotY(Math.PI * .00);
            View_Transform3D.setTranslation(new Vector3f(0.2f, 0.50f, 2f+zoom*1.0f/2));
            View_Transform3D.mul(rot);
            View_Transform3D.mul(rot2);
            View_TransformGroup.setTransform(View_Transform3D);
            su.addBranchGraph(contents);
//            su.getViewingPlatform().setNominalViewingTransform();
            aRobot.setSpeed(1000);
            runSim(joint1Begin, joint2Begin, joint3Begin, joint4Begin, joint5Begin, joint6Begin);    
            aRobot.setSpeed(4);
             
  }
  public MyCanvasPanel(Properties props) 
  {
      if(!Beans.isDesignTime())
      {
          myProps = props;
            canvas3D = new Canvas3D(SimpleUniverse.getPreferredConfiguration());
            add("Center", canvas3D);
            su = new SimpleUniverse(canvas3D);

            //experimental usage of canvas
            canvas3D.setSize(575,500);
            canvas3D.setBackground(Color.WHITE);
            BranchGroup contents = createSceneGraph();
            
            ViewingPlatform vp = su.getViewingPlatform();
            
            View_TransformGroup.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
            View_TransformGroup = vp.getMultiTransformGroup().getTransformGroup(0);
            
            
            View_TransformGroup.getTransform(View_Transform3D);

            Transform3D rot = new Transform3D();
            Transform3D rot2 = new Transform3D();
            rot.rotX(Math.PI * -.05);
//            rot2.rotY(Math.PI * .00);
            View_Transform3D.setTranslation(new Vector3f(0.2f, 0.50f, 2f+zoom*1.0f/2));
            View_Transform3D.mul(rot);
            View_Transform3D.mul(rot2);
            View_TransformGroup.setTransform(View_Transform3D);
            su.addBranchGraph(contents);
//            su.getViewingPlatform().setNominalViewingTransform();
            aRobot.setSpeed(100);
            runSim(0,-0,0,0,0,0);    
            aRobot.setSpeed(5);
      }
  }
  
  public BranchGroup createSceneGraph()
  {
   // Create the root of the branch graph
   BranchGroup objRoot = new BranchGroup();
   objTrans = new TransformGroup();
   objTrans.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
   
   initRobot();
   
   objTrans = aRobot.getBase();
   objRoot.addChild(objTrans);
   
   bounds =
      new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
   Color3f light1Color = new Color3f(red, green, blue);
   Vector3f light1Direction = new Vector3f(4.0f, -7.0f, -1.0f);
   DirectionalLight light1
      = new DirectionalLight(light1Color, light1Direction);
   
       Background background = new Background(new Color3f(1.0f,1.0f,1f));
        BoundingSphere sphere = new BoundingSphere(new Point3d(0,0,0), 100000);
        background.setApplicationBounds(sphere);
        objRoot.addChild(background); 

   light1.setInfluencingBounds(bounds);

   objRoot.addChild(light1);

   // Set up the ambient light

   Color3f ambientColor = new Color3f(1.0f, 1.0f, 1.0f);

   AmbientLight ambientLightNode = new AmbientLight(ambientColor);

   ambientLightNode.setInfluencingBounds(bounds);

   objRoot.addChild(ambientLightNode);

   return objRoot;

    }

}
