public class occurences {

	public static void countoccuences() {
		String s="banana";
		
		
		for(int i=0;i<s.length();i++) {
			int count=0;
		for(int j=1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				
				count++;
			}
			
		}
		System.out.println(s.charAt(i)+" count "+count);
		
		}
		
	}
	




		public static void main(String[] args) {
	// TODO Auto-generated method stub
			
	
			countoccuences();
	
}


}