
import java.util.Scanner; 

public class WiFiDriver {
	/**
	 * This programs guides you through troubleshooting WiFi issue
	 * using a number of interactive questions that help you
	 * diagnose and fix issues with your Wifi connection
	 * 
	 */

	public static void main(String[] args) {
		// Create a Scanner object here 
		Scanner sc = new Scanner(System.in); 
		// Output: If you have a problem with Internet connectivity, this WiFi Diagnosis might work.
		System.out.println("If you have a problem with Internet connectivity, this WiFI Diagnosis might work.");
		// Output: First step: reboot your computer
		System.out.println("First step: reboot your computer");
		// Output: Are you able to connect with the Internet? (yes or no)
		System.out.println("Are you able to connect with the Internet? (yes or no)");
		// Input: Store response in variable (answer)
		String answer = sc.nextLine();
		// If answer is yes then 
		if (answer.equalsIgnoreCase("yes")) {
			// Output: Rebooting your computer seemed to work
			System.out.println("Rebooting your computer seemed to work");
		} else { // Else:	
			// Output: Second step: reboot your router
			System.out.println("Second step: reboot your router");
			// Output: Now are you able to connect with the Internet? (yes or no)
			System.out.println("Now are you able to connect with the Internet? (yes or no)");
			// Input: Store response in variable (answer)
			answer = sc.nextLine();
			
			if (answer.equalsIgnoreCase("yes")) { // If answer is yes then:
				// Output: Rebooting your router seemed to work
				System.out.println("Rebooting your router seemed to work");
			} else { // else:
				// Output: Third step: make sure the cables to your router are plugged in firmly and your router is getting power
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
				// Output: Now are you able to connect with the Internet? (yes or no)
				System.out.println("Now are you able to connect with the Internet? (yes or no)");
				// Input: Store response in variable (answer)
				answer = sc.nextLine();
				if (answer.equalsIgnoreCase("yes")) { // If answer is yes then:
					// Output: Checking the router's cables seemed to work
					System.out.println("Checking the router's cables seemed to work");
				} else { // Else:
					// Output: Fourth step: move your computer closer to your router
					System.out.println("Fourth step: move your computer closer to your router");
					// Output: Now are you able to connect with the Internet? (yes or no)
					System.out.println("Now are you able to connect with the Internet? (yes or no)");
					// Input: Store response in variable (answer)
					answer = sc.nextLine();
					if (answer.equalsIgnoreCase("yes")) { // If answer is yes then:
						// Output: Moving closer seemed to work
						System.out.println("Moving closer seemed to work");
					} else { // Else:
						// Output: Fifth step: contact your ISP
						System.out.println("Fifth step: contact your ISP");
						// Output: Make sure your ISP is hooked up to your router
						System.out.println("Make sure your ISP is hooked up to your router");
						
					}
					
				}
				
			}
			
		}

	}

}
