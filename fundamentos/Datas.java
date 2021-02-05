package fundamentos;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;



	public class Datas {
		public static void main(String[] args) {
			
			Calendar c = new GregorianCalendar(2021,2,3);
			
			c.add(Calendar.DAY_OF_MONTH, 3);
			c.add(Calendar.MONTH, 3);
			
			System.out.println(c.getTime());
		}
	}

