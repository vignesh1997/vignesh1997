package Controller;
import dto.Person;
import dto.service.LuckyNos;
public class GettingNames {

	public static void main(String[] args) {
		
		LuckyNos results=new LuckyNos(); 
		 Person[] luckyNos=results.toGetTheLuckyNo(args);

		 for(int i=0;i<luckyNos.length;i++) {
			 System.out.println("lucky number of official name:"+ luckyNos[i].LuckyNumber1 +",  "+ luckyNos[i].officialName);
			 System.out.println("lucky number of pet name:" + luckyNos[i].LuckyNumber2 +",  "+ luckyNos[i].petName);
			 System.out.println("lucky number of day:" + luckyNos[i].LuckyNumber3 +",   "+ luckyNos[i].dob);
			 System.out.println("lucky number of date:" + luckyNos[i].LuckyNumber4 +",   "+ luckyNos[i].dob);
		 }
	}

}
