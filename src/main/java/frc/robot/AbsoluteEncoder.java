package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.simulation.AnalogInputSim;

public class AbsoluteEncoder {
    // fields
    private AnalogInput m_analogIn;
    private AnalogInputSim m_analogInputSim;

    private double m_offset;

    // constructor
    public AbsoluteEncoder(int channel, double offset) { 
        m_analogIn = new AnalogInput(channel);
        m_analogInputSim = new AnalogInputSim(m_analogIn);

        m_offset = offset;
    }

    /**
     * Returns the angle radian.
     * @todo check if this is equal to the 0
     * @return the angle radian
     */
    public double getAngleRadians() {
        return ((m_analogInputSim.getVoltage() % 5 / 5) * 2 * Math.PI) + m_offset;
    }

    public double getAngleDegrees() {
        return getAngleRadians() / (2 * Math.PI) * 360;
    }
}
