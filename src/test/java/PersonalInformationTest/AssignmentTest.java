package PersonalInformationTest;

import PersonalInformation.Assignment2;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AssignmentTest {

    @Test
            public void test() throws InterruptedException, IOException {
        System.out.println("Login to Progressive");
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./HtmlReports/my_test.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
       ExtentTest user=extent.createTest("LoginTest");
       user.log(Status.INFO,"Login to Progressive");
       user.log(Status.PASS,"Title verified");
       extent.flush();



// invoking browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.progressive.com/");
        driver.manage().window().maximize();
        String pageTitle = driver.getTitle();
        if(pageTitle.equals("Quote Auto Insurance, Home-Auto Bundles, & More | Progressive")) {
            System.out.println("Progressive page Lunched as Expected");
        }else{
            System.out.println("invalid page-----"+ "---was Lunched");
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Assignment2 assignment2 = new Assignment2(driver);
        assignment2.setSelectingAuto();

        assignment2.setSelectingZipCode("40511");

        assignment2.setStartAQuote();
        Thread.sleep(1000);


        assignment2.setFirstName("Ram");
        assignment2.setLastName("Kumar");
        assignment2.setDateOfBirth("12/101990");
        assignment2.setSuffix(3);
        Thread.sleep(1000);
        assignment2.setStreetName("2764 Sandersville Rd");
        Thread.sleep(2000);

        File ScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot, new File("C:\\Users\\mohan\\IdeaProjects\\ProgressiveAutomation\\Screenshot\\image.png"));
        Thread.sleep(3000);

        assignment2.setStartMyQuote();
        Thread.sleep(3000);

        // second page test
        assignment2.setSelectYear("2018");
        Thread.sleep(500);
        assignment2.setSelectModel("BMW");
        Thread.sleep(500);
        assignment2.setSelectMake("330 Hybrid");
        Thread.sleep(500);
        assignment2.setPrimaryUse(2);
        Thread.sleep(500);
        assignment2.setOwnOrLease(2);
        assignment2.setHowLong(2);
        assignment2.setHowLong(4);
        Thread.sleep(500);
        assignment2.setPrimaryGaraging();
        Thread.sleep(500);
        assignment2.setEquippedDevice();
        Thread.sleep(500);
        assignment2.setHasBlindSpots();
        Thread.sleep(1000);

        File ScreenShot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot1, new File("C:\\Users\\mohan\\IdeaProjects\\ProgressiveAutomation\\Screenshot\\image1.png"));
        Thread.sleep(3000);


        assignment2.setNextPage();
        Thread.sleep(2000);
        assignment2.setGoToOther();
        Thread.sleep(2000);
        // third page test

        Thread.sleep(2000);
        assignment2.setSelectGender();
        Thread.sleep(1000);
        assignment2.setMaritalStatus(2);
        Thread.sleep(500);
        assignment2.setLevelOfEducation(2);
        Thread.sleep(500);
        assignment2.setEmployeeStatus(3);
        Thread.sleep(500);
        assignment2.setPrimaryResidence(1);
        Thread.sleep(500);
        assignment2.setMovedIn(1);
        Thread.sleep(500);
        assignment2.setLicenceStatus(2);
        Thread.sleep(1000);
        assignment2.setYearLicensed(1);
        Thread.sleep(500);
        assignment2.setHadClaims();
        Thread.sleep(500);
        assignment2.setTicketOrViolation();
        Thread.sleep(500);

        File ScreenShot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot2, new File("C:\\Users\\mohan\\IdeaProjects\\ProgressiveAutomation\\Screenshot\\image2.png"));
        Thread.sleep(3000);


        assignment2.setClickNext();
        Thread.sleep(1000);
        //startPage.setDriverImprovement();
        //Thread.sleep(500);
//        startPage.setContinueNext();
//        Thread.sleep(1000);



        //fourth page spouse details
        Thread.sleep(1000);
        assignment2.setSpouseFirstName("Sita");
        Thread.sleep(500);
        assignment2.setSpouseGender();
        Thread.sleep(500);
        assignment2.setSpouseDateOfBirth("12/10/1995");
        Thread.sleep(500);
        assignment2.setPersonOnThePolicy();
        Thread.sleep(500);
        assignment2.setSpouseEducation(2);
        Thread.sleep(500);
        assignment2.setSpouseEmployeeStatus(3);
        Thread.sleep(500);
        assignment2.setSpouseLicenseStatus(0);
        Thread.sleep(500);
        assignment2.setSpouseYearLicenced(1);
        Thread.sleep(500);
        assignment2.setSpouseArmy();
        Thread.sleep(500);
        assignment2.setSpouseClaims();
        Thread.sleep(500);
        assignment2.setSpouseTicket();
        Thread.sleep(500);

        File ScreenShot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot3, new File("C:\\Users\\mohan\\IdeaProjects\\ProgressiveAutomation\\Screenshot\\image3.png"));
        Thread.sleep(3000);


        assignment2.setSpouseNextPage();
        Thread.sleep(3000);
        assignment2.setSemiFinalPage();
        Thread.sleep(3000);
        assignment2.setPersonalPageNext();
        Thread.sleep(3000);
        assignment2.setsNext();
        Thread.sleep(3000);



        /// final detail page
        assignment2.setHaveAutoInsurance();
        Thread.sleep(500);
        assignment2.setCurrentCompany(2);
        Thread.sleep(500);
        assignment2.setInjuryLimits(2);
        Thread.sleep(500);
        assignment2.setPolicyWithProgressive();
        Thread.sleep(500);
        assignment2.setHadAuto();
        Thread.sleep(1000);
        assignment2.setStartPolicy("01/30/2021");
        Thread.sleep(3000);
        assignment2.setEmailAddress("potterharry@yahoo.com");
        Thread.sleep(500);
        assignment2.setHousehold(3);
        Thread.sleep(500);
        assignment2.setInjuryClaims(0);
        Thread.sleep(4000);

        File ScreenShot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot4, new File("C:\\Users\\mohan\\IdeaProjects\\ProgressiveAutomation\\Screenshot\\image4.png"));
        Thread.sleep(3000);



        assignment2.setGoNext();
        Thread.sleep(5000);
        assignment2.setSnapShot();
        Thread.sleep(5000);
        assignment2.setFinalClick();
        Thread.sleep(3000);
        assignment2.setNoThanks();
        Thread.sleep(5000);
        File ScreenShot5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot5, new File("C:\\Users\\mohan\\IdeaProjects\\ProgressiveAutomation\\Screenshot\\image5.png"));
        Thread.sleep(3000);
        assignment2.setFinishAndBuy();
        Thread.sleep(3000);

    }
}
