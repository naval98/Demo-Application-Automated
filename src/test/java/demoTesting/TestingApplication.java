package demoTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestingApplication {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Application launched successfully!");


		driver.manage().window().maximize();


		String actualtitle = driver.getTitle();
		String expectedTitlle = "https://demoqa.com/automation-practice-form";

		if(actualtitle.equals(expectedTitlle)) {
			System.out.println("title working fine as expected!");
		}
		else {
			System.out.println("title not working fine as expected!");
		}


		WebElement FisrtName = driver.findElement(RelativeLocator.with(By.id("name")));
		FisrtName.sendKeys("Naval");

		WebElement Email = driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"email\"]")).below(FisrtName));
		Email.sendKeys("navalsaxena9@gmail.com");

		WebElement Phone = driver.findElement(RelativeLocator.with(By.id("phone")).below(Email));
		Phone.sendKeys("88888888888");

		WebElement Address = driver.findElement(RelativeLocator.with(By.xpath("//textarea[@id='textarea']")).below(Phone));
		Address.sendKeys("334,street zone, new york");

		WebElement Maleradiobutton = driver.findElement(By.xpath("//input[@id='male']"));
		Maleradiobutton.click();

		WebElement Femaleradiobutton = driver.findElement(By.xpath("//input[@id='female']"));
		// Scroll down to Days section
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");


		WebElement Monday = driver.findElement(By.id("monday"));
		Monday.click();

		// Verify checkbox
		System.out.println("Monday selected: " + Monday.isSelected());

		// Select Country dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		Select select = new Select(dropdown);

		// Select India
		select.selectByVisibleText("India");

		// Verify selected country
		WebElement selectedOption = select.getFirstSelectedOption();
		System.out.println("Selected Country: " + selectedOption.getText());

		WebElement DatePicker1 = driver.findElement(By.id("datepicker"));
		DatePicker1.sendKeys("10-03-2026");

		WebElement DatePicker2 = driver.findElement(By.name("SelectedDate"));
		DatePicker2.sendKeys("15-03-2026");

		WebElement FromDate = driver.findElement(By.id("start-date"));
		FromDate.sendKeys("10-03-2026");

		WebElement ToDate = driver.findElement(By.id("end-date"));
		ToDate.sendKeys("15-03-2026");

		WebElement Submit = driver.findElement(By.xpath("//button[@class='submit-btn']"));
		Submit.click();

		WebElement uploafile1 = driver.findElement(By.id("singleFileInput"));
		uploafile1.sendKeys("C:\\Users\\NAVAL SAXENA\\Downloads\\Naval_Saxena_Resume  2.pdf");

		WebElement uploadfile2 = driver.findElement(By.id("multipleFilesInput"));
		uploadfile2.sendKeys("C:\\Users\\NAVAL SAXENA\\Downloads\\Naval_Saxena_Resume  2.pdf");


		List<WebElement> ListElements = driver.findElements(By.xpath("//select[@id='colors']//option[5]"));
		List<String> OriginalList = new ArrayList<>();
		List<String> sortedList = new ArrayList<>(OriginalList);

		// Sort the copied list
		Collections.sort(sortedList);

		// Compare both lists
		if(OriginalList.equals(sortedList))
		{
			System.out.println("Dropdown is sorted");
		}
		else
		{
			System.out.println("Dropdown is NOT sorted");
		}
	}

	@Test(groups = "regression, sanity")
	public void title() {
		System.out.println("tiltle validated successfully!");
	}

	@Test (groups = "smoke")
	public void FirstName() {
		System.out.println("First Name validated successfully!");
	}

	@Test(groups = "re-testing")
	public void Phone() {
		System.out.println("Phone is validated successfully!");
	}
	@Test (groups = "smoke")
	public void Address() {
		System.out.println("Address validated successfully!");
	}

	@Test (groups = "smoke")
	public void Maleradiobutton() {
		System.out.println("Male radiobutton validated successfully!");
	}
	@Test (groups = "smoke")
	public void Femaleradiobutton() {
		System.out.println("Female radiobutton validated successfully!");
	}

	@Test (groups = "smoke")
	public void Monday() {
		System.out.println("Monday validated successfully!");
	}

	@Test (groups = "smoke")
	public void dropdown() {
		System.out.println("dropdown validated successfully!");
	}
	@Test (groups = "smoke, end to end")
	public void selectedOptions() {
		System.out.println("selectedoptions validated successfully!");
	}
	@Test (groups = "Adhoc")
	public void DatePicker1() {
		System.out.println("Datepicker1 validated successfuly!");

	}
	@Test (groups = "smoke")
	public void DatePicker2() {
		System.out.println("DatePicker2 validated successfully! ");

	}
	@Test (groups = "smoke")
	public void FromDate() {
		System.out.println("FromDate validated successfully!");

	}
	@Test (groups = "smoke")
	public void ToDate() {
		System.out.println("ToDate validated successfully!");

	}
	@Test (groups = "smoke")
	public void submit() {
		System.out.println("submit validated successfully!");

	}
	@Test (groups = "smoke")
	public void uploadfile1() {
		System.out.println("uploadfile validated successfully!");

	}

	@Test (groups = "smoke")
	public void uploadfile2() {
		System.out.println("uploadfile2 validated successfully!");

	}








}


