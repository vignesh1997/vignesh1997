package dto.service;
import dto.Person;
public class LuckyNos {

	public Person[] toGetTheLuckyNo(String args[]) {
	Person person[]=new Person[args.length/3];
	
	int j=0;
	for(int i=0;i<person.length;i++) {
		person[j]=new Person();
		person[j].officialName=args[i];
		person[j].petName=args[i+1];
		person[j].dob=args[i+2];
		
	
		person[j].LuckyNumber1=toFindTheLuckyNumberInofficialName(person[0].officialName);
		person[j].LuckyNumber2=	toFindTheLuckyNumberInpetName(person[0].petName);
	    person[j].LuckyNumber3=toFindTheLuckyNoInDay(person[0].dob);
	    person[j].LuckyNumber4=toFindTheLuckyNoInDate(person[0].dob);
	    j++;
	}
	    
	    return person;
	    
}

	public int toFindTheLuckyNumberInofficialName(String officialName) {
		
		int LuckyNumber1=toConvertTheStringtoSmallNo(officialName);
		return LuckyNumber1;
	}
	
	
		public int toFindTheLuckyNumberInpetName(String petName ){
			
		int LuckyNumber2=toConvertTheStringtoSmallNo(petName);
		 return LuckyNumber2;
		
	}
		
		public int toFindTheLuckyNoInDay(String dob){
			
		String x=dob.substring(0,2);
		int day=Integer.parseInt(x);
		
		int LuckyNumber3=toConvertBigNoToSmallNo(day);
		return LuckyNumber3;
			
		}
		
		public int  toFindTheLuckyNoInDate(String dob) {
			int totalDate=0;
			String x=dob.substring(0,2);
			String y=dob.substring(3,5);
			String z=dob.substring(6,10);
			int day=Integer.parseInt(x);
			int month=Integer.parseInt(y);
			int year=Integer.parseInt(z);
			
			totalDate=day + month + year;
			int LuckyNumber4=toConvertBigNoToSmallNo(totalDate);
			return LuckyNumber4;
			
		}
	
	public int toConvertTheStringtoSmallNo(String name){
		
		char a[]=name.toCharArray();
		
		int smallNumber=toConvertTheCharArrayToNumber(a);
		return smallNumber;
	}
	public int toConvertTheCharArrayToNumber(char letters[]){
		int bigNumbers=0;
		
		char alphabets[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int numbers[]= {1,2,3,4,5,8,3,4,1,1,2,3,4,5,7,8,1,2,3,4,6,6,6,7,1,7};
	
		for(int i=0;i<letters.length;i++) {
			for(int j=0;j<alphabets.length;j++) {
				if(letters[i]==alphabets[j]) {
					bigNumbers=bigNumbers + numbers[j];
				}
			}
		}
		int smallNumbers=toConvertBigNoToSmallNo(bigNumbers);
		return smallNumbers;
	}
	public int toConvertBigNoToSmallNo(int finalNumbers){
		
		int bigNo=0;
		int smallNo=0;
		int superNo=0;
			do{
				bigNo=finalNumbers/10;
				smallNo=finalNumbers%10;
				superNo=bigNo + smallNo;
				finalNumbers=superNo;
			}while(superNo>9);
			
			return finalNumbers;
			}
		
		
	}
	

	
	
	
	
	
	
	
	
