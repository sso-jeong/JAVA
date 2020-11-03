import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;;

public class OkJavaGolnHomeInput{

	public static void main(String[] args) {
		
		String id = args[0]; //JOptionPane.showInputDialog("Enter a ID");
		String bright = args[1]; //JOptionPane.showInputDialog("Enter a Bright level");
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); // 1√˛¿∏∑Œ ø§∏Æ∫£¿Ã≈Õ ∫∏≥ø
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + "moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // n∆€ºæ∆Æ π‡±‚ ƒ—±‚
		moodLamp.on();
		
		

	}

}
