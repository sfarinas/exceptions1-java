package excesoesPersonalizadas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excesoesPersonalizadas.model.exceptions.DomainExcepition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Check-in date (dd/MM/yyyy) : ");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.println("Check-out date (dd/MM/yyyy) : ");
			Date checkOut = sdf.parse(sc.next());
			
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation : " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			
			System.out.println("Reservation: " + reservation);
		}	
		catch (ParseException e){
			System.out.println("Invalid date format");
		}
		catch (DomainExcepition e) {
			System.out.println("Error in reservation : " + e.getMessage());
		}
		catch (RuntimeException e) {
			// TODO: handle exception
			System.out.println("Error Unexpected");
		}
		
		sc.close();

	}

}
