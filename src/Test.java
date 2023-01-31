import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count total Number of names starting with A letter
		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Nikhil");
//		names.add("Abhi");
//		names.add("Abhijeet");
//		names.add("Deep");
//		names.add("Anushka");
//		names.add("Adam");
//		int count=0;
//		
//		for(int i=0;i<names.size();i++) {
//			String actualName=names.get(i);
//			if(actualName.startsWith("A")) {
//				count++;
//			}
//		}
//		System.out.println(count);
		streamPractice();
		
	
		
		
	}
	 public static void Stream() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Nikhil");
		names.add("Abhi");
		names.add("Abhijeet");
		names.add("Deep");
		names.add("Anushka");
		names.add("Adam");
		//Stream are extremely powerful so that it can scan collection parelly not one by one.
		//Return type of Count is Long
		//.filter is intermediate Operation
		//.count is terminal Operation
		//There is no Life in intermediate Operation without Terminal Operation
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//Print Names which length is greater than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//But Now I want only one result
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//Practice
	
	}
	 
	 public static void StreamMap() {
		
		 //Print names which end with a and convert to UpperCase
			ArrayList<String> names = new ArrayList<String>();
			names.add("Nikhila");
			names.add("Abhi");
			names.add("Abhijeet");
			names.add("Deep");
			names.add("Anushka");
			names.add("Adam");
			//names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			//Print the Name which have first Letter as a with Uppercase and sort that
			names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			//Check Weather Name is present or not
			boolean falg=names.stream().anyMatch(s->s.equalsIgnoreCase("Nikhila"));
			System.out.println(falg);
	 }
	 
	 public static void streamCollect() {
		 //Collect Method is used to collect result and convert it result back to new List
		 ArrayList<String> names = new ArrayList<String>();
			names.add("Nikhila");
			names.add("Abhi");
			names.add("Abhijeet");
			names.add("Deep");
			names.add("Anushka");
			names.add("Adam");
			
			List<String>  newList=names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			System.out.println(newList.get(0));
	 }
	 
	 public static void streamPractice() {
		 //Task is to print unique Number;
	     List<Integer> values=Arrays.asList(2,3,2,4,5,3,1,2,5,3);
	     values.stream().distinct().sorted().forEach(s->System.out.println(s));
	     
		 
	 }
	 
	 

}
