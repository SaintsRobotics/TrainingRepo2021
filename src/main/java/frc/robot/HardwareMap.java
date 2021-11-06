package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
  
public class HardwareMap {
    public class IntakeHardware{ 
        public VictorSPX intake_arm = new VictorSPX(1); 
        public VictorSPX intake_motor = new VictorSPX(2);

        public IntakeHardware(){
            
        }
    }

    public class ShooterHardware{

        
        // motors to run the flywheel, combined in a speedcontrollergroup
        private CANSparkMax leftFlywheel;
        private CANSparkMax rightFlywheel;
        public SpeedControllerGroup flywheel;
        // motors for the feeder system, combined in a speedcontrollergroup
        private WPI_VictorSPX wheels;
        private WPI_VictorSPX kicker;
        public SpeedControllerGroup feeder;



        public ShooterHardware(){ 
            
            leftFlywheel = new CANSparkMax(16,MotorType.kBrushless); 
            rightFlywheel = new CANSparkMax(17, MotorType.kBrushless);   

            leftFlywheel.setInverted(true);



            wheels = new WPI_VictorSPX(27); 
            kicker = new WPI_VictorSPX(26);  

            wheels.setInverted(true);

            feeder = new SpeedControllerGroup(wheels, kicker); 
            flywheel = new SpeedControllerGroup(leftFlywheel, rightFlywheel); 

            
        }
    }

    public ShooterHardware Shooter_Hardware = new ShooterHardware();
    public  IntakeHardware Intake_Hardware = new IntakeHardware(); 

    public HardwareMap(){
        
    } 
}
