import javax.swing.JOptionPane;

public class numberToWeekDay {
	public static String weekday(int day) {
		switch (day) {
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		case 7:
			return "Sunday";
		default:
			return "Not a vaild number";
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number 1-7", "0"));
		
		String day = weekday(num);
		System.out.println(day);
	}

}
