package application;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		List<Lesson> lessons = new ArrayList<>();
		System.out.println("How many classes does the course have? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Data to the " + i + "a class: ");
			System.out.println("Task content (c/t)? ");
			Character type = sc.next().charAt(0);
			
			System.out.print("Title: ");
			String title = sc.nextLine();
			sc.nextLine();
			
			if (type == 'c') {
				
				System.out.print("Video URL: ");
				String url = sc.next();
				System.out.print("Seconds video time: ");
				Integer seconds = sc.nextInt();
				
				lessons.add(new Video(title, url, seconds));
			} else {
			
				System.out.print("Description: ");
				String description = sc.nextLine();
			
				System.out.print("Quantity of quetions: ");
				Integer taskQuantity = sc.nextInt();
				
				lessons.add(new Task(title, description, taskQuantity));
			}
			
		}
		Integer sum = 0;
		for (Lesson lesson : lessons) {
			sum += lesson.duration();
			
		}
		
		System.out.println();
		System.out.println("TOTAL DURATION OF THE COURSE = " + sum);
		
	}

}
