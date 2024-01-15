package case_Statements;

public class SwitchCase_TrafficLight {

	public static void main(String[] args) {
		
		String trafficlight="yellow";
		
		switch (trafficlight) {

		case "red":System.out.println("You have to stop");	
		break;
		
		case "green":System.out.println("You can go now");	
		break;
		
		case "yellow":System.out.println("You have to wait or slow down the speed");	
		break;

		default:System.out.println("Please enter the correct value");
			break;
		}

	}

}
