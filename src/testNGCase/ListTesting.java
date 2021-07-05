package testNGCase;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListTesting {	
	@Test 
	public void checkHeader() {
		ArrayList<String> actList = Utility.getListofHeadingLabels();
		//ArrayList<String> expList = Utility.fetchExpList(); 
		System.out.println("actList >> " +actList);
		ArrayList<String> expList = new ArrayList<String>();
		expList.add("#");
		expList.add("Username");
		expList.add("Email");
		expList.add("Mobile");
		expList.add("Course");
		expList.add("Gender");
		expList.add("State");
		expList.add("Action");
		System.out.println("expHeader List >> " + expList);
		Assert.assertEquals(actList, expList);
	}
	@Test
	public void verifyCountOfLabels() throws Exception {
		ArrayList<String> actList = Utility.getListofHeadingLabels();
		ArrayList<String> expList = Utility.fetchExpList();
		Assert.assertEquals(actList.size(), expList.size());
		Thread.sleep(2000);
	}
	@Test
	public void verifySequenceOfLabels() {
		ArrayList<String> actList = Utility.getListofHeadingLabels();
		ArrayList<String> expList = Utility.fetchExpList();	
		System.out.println("actList >>"+actList);
		System.out.println("expList >>"+expList);
		if(actList.size()==expList.size()) {
			ArrayList<Boolean>alFlag = new ArrayList<>();
			for(int i=0; i<expList.size(); i++) {
				String labelExp = expList.get(i);
				String labelAct = actList.get(i);
				if(!labelExp.equals(labelAct)) {
					System.err.println("Label is" +labelAct+ "Label should be"+labelExp);
					alFlag.add(false);
				}else {
					alFlag.add(true);
				}
				}
			boolean checkIfFalseEntryisThr = alFlag.contains(false); //true
				Assert.assertFalse(checkIfFalseEntryisThr);	
			}
		else {
			Assert.assertEquals(false, true);
		}
	}
	
	public static void main(String[] args) {
		
		}
	}


