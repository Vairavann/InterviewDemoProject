package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Site {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaira\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
	    driver.manage().window().maximize();
	     

	  // login
	     
	     WebElement loginID=  driver.findElement(By.name("uid"));
	     loginID.sendKeys("mngr469952");
	       
	     WebElement loginPassword=driver.findElement(By.name("password"));
	     loginPassword.sendKeys("YtebedY");
	       
	     WebElement button = driver.findElement(By.name("btnLogin"));
       	 button.click();

      // Adding new customer
	
	     WebElement newCustomer= driver.findElement(By.linkText("New Customer"));
	     newCustomer.click();

	     WebElement Customername= driver.findElement(By.name("name"));
	     Customername.sendKeys("Vairavan");

	     WebElement gender= driver.findElement(By.name("rad1"));
	     gender.click();

	     WebElement cusDob=  driver.findElement(By.id("dob"));
	     cusDob.sendKeys("17/05/1997");

	     WebElement address=  driver.findElement(By.name("addr"));
	     address.sendKeys("Madras Street, Chennai Nagar");


	     WebElement city=  driver.findElement(By.name("city"));
	     city.sendKeys("Chennai");

	     WebElement state=  driver.findElement(By.name("state"));
	     state.sendKeys("tamilnadu");

	     WebElement pinCode=  driver.findElement(By.name("pinno"));
	     pinCode.sendKeys("600118");

       	 WebElement number=  driver.findElement(By.name("telephoneno"));
      	 number.sendKeys("9876543210");

	     WebElement mailId=  driver.findElement(By.name("emailid"));
	     mailId.sendKeys("test@gmail.com");

	     WebElement cusPassword=  driver.findElement(By.name("password"));
	     cusPassword.sendKeys("Me@123");
	     
	     
	     WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	     submit.click();
	     
	     // Editing Customer
	     
	     WebElement editCustomer = driver.findElement(By.linkText("Edit Customer"));
	     editCustomer.click();
	     
	     WebElement accountNumber=  driver.findElement(By.name("accountno"));
	     accountNumber.sendKeys("0123456789");
	     
	     WebElement accSubmit = driver.findElement(By.name("AccSubmit"));
	     accSubmit.click();
	     
	     // Deleting Customer
	     
	     
	     WebElement delCustomer = driver.findElement(By.linkText("Delete Customer"));
	     delCustomer.click();
	     
	     WebElement delCustomerId=  driver.findElement(By.name("cusid"));
	     delCustomerId.sendKeys("0123456789");
	     
	     WebElement delaccSubmit = driver.findElement(By.name("AccSubmit"));
	     delaccSubmit.click();
	     
	     
	  // Add New Account
	     WebElement newAcc = driver.findElement(By.linkText("New Account"));
	     newAcc.click();

	     WebElement cusAccount=  driver.findElement(By.name("cusid"));
	     cusAccount.sendKeys("456789");

	     WebElement w = driver.findElement(By.name("selaccount"));
	     Select se=new Select(w);
	     se.selectByIndex(1);

	     WebElement initial=  driver.findElement(By.name("inideposit"));
	     initial.sendKeys("50000");

	     WebElement addNewSub = driver.findElement(By.name("button2"));
	     addNewSub.click();
	     
	     //Edit Account
	     
	     
	     WebElement editAcc = driver.findElement(By.linkText("Edit Account"));
	     editAcc.click();

	     WebElement editAccNo=  driver.findElement(By.xpath("//input[@type='text']"));
	     editAccNo.sendKeys("987654");


        //Deposit

	     WebElement deposit = driver.findElement(By.linkText("Deposit"));
	     deposit.click();
	     
	     WebElement accountDep=  driver.findElement(By.name("accountno"));
	     accountDep.sendKeys("987654");

	     WebElement depAmount=  driver.findElement(By.name("ammount"));
	     depAmount.sendKeys("500000");

	     WebElement description=  driver.findElement(By.name("desc"));
	     description.sendKeys("Main");



	     //delete customer

	     WebElement delCust = driver.findElement(By.linkText("Delete Customer"));
	     delCust.click();

	     WebElement custDeleteId=  driver.findElement(By.name("cusid"));
	     custDeleteId.sendKeys("987654");

	     WebElement delCusSubmit = driver.findElement(By.name("AccSubmit"));
	     delCusSubmit.click();
	     
	     
	     //WithDrawal
	   

	     WebElement withDrawal = driver.findElement(By.linkText("Withdrawal"));
	     withDrawal.click();
	     
	     WebElement wdAccNo=  driver.findElement(By.name("accountno"));
	     wdAccNo.sendKeys("987654");

	     WebElement wdAmount=  driver.findElement(By.name("ammount"));
	     wdAmount.sendKeys("500000");

	     WebElement wdDescription=  driver.findElement(By.name("desc"));
	     wdDescription.sendKeys("Main");
	     
	     WebElement wdSubmit = driver.findElement(By.name("AccSubmit"));
	     wdSubmit.click();
	     
	     //Fund Transfer
	     
	     WebElement fundTransfer = driver.findElement(By.linkText("Fund Transfer"));
	     fundTransfer.click();
	     
	     WebElement payersAcc=  driver.findElement(By.name("payersaccount"));
	     payersAcc.sendKeys("987654");
	     
	     WebElement payeeAcc=  driver.findElement(By.name("payeeaccount"));
	     payeeAcc.sendKeys("123456");
	     
	     WebElement fdAmount=  driver.findElement(By.name("ammount"));
	     fdAmount.sendKeys("200000");

	     WebElement fdDescription=  driver.findElement(By.name("desc"));
	     fdDescription.sendKeys("Main");
	     
	     WebElement fdSubmit = driver.findElement(By.name("AccSubmit"));
	     fdSubmit.click();
	     
	     //Change Password
	     
	     WebElement changePassword = driver.findElement(By.linkText("Change Password"));
	     changePassword.click();
	     
	     WebElement oldPass=  driver.findElement(By.name("oldpassword"));
	     oldPass.sendKeys("me@123");

	     WebElement newPass=  driver.findElement(By.name("newpassword"));
	     newPass.sendKeys("pass@123");

	     WebElement confirmPass=  driver.findElement(By.name("confirmpassword"));
	     confirmPass.sendKeys("pass@123");
	     
	     WebElement cpSubmit = driver.findElement(By.name("sub"));
	     cpSubmit.click();

	     
	     //BalanceEnquiry
	     
	     WebElement balEnquiry = driver.findElement(By.linkText(" Balance Enquiry"));
	     balEnquiry.click();
	     
	     WebElement beAccNo=  driver.findElement(By.name("accountno"));
	     beAccNo.sendKeys("987654");
	     
	     
	     WebElement beSubmit = driver.findElement(By.name("AccSubmit"));
	     beSubmit.click();
	     
	     //MiniStatement
	     
	     WebElement miniStatement = driver.findElement(By.linkText(" Mini Statement"));
	     miniStatement.click();
	     
	     WebElement msAccNo=  driver.findElement(By.name("accountno"));
	     msAccNo.sendKeys("987654");
	     
	     
	     WebElement msSubmit = driver.findElement(By.name("AccSubmit"));
	     msSubmit.click();
	     
	     //CustomisedStatement
	     
	     WebElement customisedStatement = driver.findElement(By.linkText(" Customised Statement"));
	     customisedStatement.click();
	     
	     WebElement csAccNo=  driver.findElement(By.name("accountno"));
	     csAccNo.sendKeys("987654");
	     
	     WebElement fromDate=  driver.findElement(By.name("fdate"));
	     fromDate.sendKeys("15/05/2015");
	     
	     WebElement toDate=  driver.findElement(By.name("tdate"));
	     toDate.sendKeys("15/05/2022");
	     
	     WebElement miniTransValue=  driver.findElement(By.name("amountlowerlimit"));
	     miniTransValue.sendKeys("5000");
	     
	     WebElement noOfTrans=  driver.findElement(By.name("numtransaction"));
	     noOfTrans.sendKeys("52");
	     
	     WebElement csSubmit = driver.findElement(By.name("AccSubmit"));
	     csSubmit.click();
	     
	     //LogOut
	     
	     WebElement logOut = driver.findElement(By.linkText("Log out"));
	     logOut.click();
	     
	     
	    driver.close();
	}






	     }
	     



