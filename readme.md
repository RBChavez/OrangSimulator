This Java program simulates the operation of a Orang robotic arm. This project contain 3 engines. They are Robot 3D Rendering engine, Kinematics engine, and Log engine.

The interface includes a 3D representation of the arm and animates it according to input. The input includes kinematic values where you can specify the length of each section of the arm and the angle of the joints and reverse kinematic values where you only specify the X, Y, Z coordinates of the final position. A log of previous movement commands is recorded so previous commands can be reexecuted.



Execute the jar in the Source\dist folder: java -jar "GUI_Orang-final.jar"