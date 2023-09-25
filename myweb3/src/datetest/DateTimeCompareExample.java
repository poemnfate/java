package datetest;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime=LocalDateTime.of(2021, 1,1,0,0,0);
		System.out.println("시작일 : "+startDateTime.format(dtf));
		
		LocalDateTime endDateTime=LocalDateTime.of(2021,12,31,0,0,0);
		System.out.println("종료일 : "+endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("아직 진행중입니다.");
		}else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		}else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료합니다");
		}
		
		long remainYear=startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth=startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay=startDateTime.until(endDateTime, ChronoUnit.DAYS);
		
		System.out.println("남은 해 : "+remainYear);
		System.out.println("남은 달 : "+remainMonth);
		System.out.println("남은 일 : "+remainDay);
		
		
			

	}

}
