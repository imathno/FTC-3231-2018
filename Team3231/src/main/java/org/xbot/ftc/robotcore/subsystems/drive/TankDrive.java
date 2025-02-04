package org.xbot.ftc.robotcore.subsystems.drive;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.Range;

public class TankDrive {

    private Drive drive;

    protected TankDrive(Drive drive) {
        this.drive = drive;
    }

    public void drive(Gamepad gamepad) {
        drive.setMotorPowers(Range.clip(gamepad.left_stick_y, -1.0, 1.0),
                                Range.clip(gamepad.right_stick_y, -1.0, 1.0));
    }

    public void stop() {
        drive.setMotorPowers(0);
    }
}
