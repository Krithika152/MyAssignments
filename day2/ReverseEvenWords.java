package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String input="I am a software tester";
        String[] split = input.split(" ");
        
        for (int i = 0; i < split.length; i++) {
            if(i%2==0) {
                
                System.out.print(split[i]);
                
                System.out.print(" ");
            }
            else {
                
                char[] charArray = split[i].toCharArray();
                
                for (int j =charArray .length-1; j>=0 ; j--) {
                    
                    System.out.print(charArray[j]);
                    
                }
                System.out.print(" ");
            }
                
            
            }

	}

}
