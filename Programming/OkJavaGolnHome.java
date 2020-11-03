import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;;

public class OkJavaGolnHome {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		// Elevator call
		// org.opentutorials.iot.Elevator : 미리 만들어 놓은 라이브러리를 사용한다.
		Elevator myElevator = new Elevator(id);
		// myElevator 변수는 반드시 Elevator 데이터 타입에 해당하는 데이터만 볼 수 있다.
		myElevator.callForUp(1); // 1층으로 엘리베이터 보냄
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floor Lamp");
		floorLamp.on();
		
		

	}

}
