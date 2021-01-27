package PersonalInformationTest;

import PersonalInformation.PersonalInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PersonalInfoTest {
    public static void main(String[] args) throws InterruptedException{
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
        PersonalInfo personalInfo = new PersonalInfo(driver);
        personalInfo.selectAuto();
        personalInfo.setEnterZipCode("40511");

        personalInfo.getAQuote();
        Thread.sleep(1000);

        personalInfo.firstName("Ram");
        personalInfo.lastName("Kumar");

        personalInfo.dateOfBirth("12/101990");
        personalInfo.suffix(2);
        Thread.sleep(1000);
        personalInfo.setEnterStreetName("1705 Leestown Rd");
        personalInfo.startMyQuote();


        Thread.sleep(3000);
        personalInfo.selectVehicleYear("2018");
        Thread.sleep(500);
        personalInfo.selectMake("BMW");
        Thread.sleep(500);
        personalInfo.selectModel("330 Hybrid");
        Thread.sleep(500);
        personalInfo.setPrimaryUse(1);
        Thread.sleep(500);
        personalInfo.ownOrLease(2);
        Thread.sleep(500);
        personalInfo.howLongHaveYou(4);
        Thread.sleep(500);
        personalInfo.isPrimaryGaragingAddress();
        Thread.sleep(500);
        personalInfo.setEquippedDevice();
        Thread.sleep(500);
        personalInfo.setHasBlindSpots();
        Thread.sleep(500);
        personalInfo.enterNextPage();
        Thread.sleep(1000);
        personalInfo.setGoToOther();
        Thread.sleep(1000);

        Thread.sleep(500);
        personalInfo.setSelectGender();
        Thread.sleep(500);
        personalInfo.maritalStatus(2);
        Thread.sleep(500);
        personalInfo.levelOfEdu(2);
        Thread.sleep(500);
        personalInfo.setEmploymentStatus(3);
        Thread.sleep(500);
        personalInfo.primaryResident(1);
        Thread.sleep(500);
        personalInfo.movedIn(1);
        Thread.sleep(500);
        personalInfo.usLicenceStatus(2);
        Thread.sleep(500);
        personalInfo.setYearsOfLicensed(2);
        Thread.sleep(500);
        //personalInfo.usArmedForces();
        Thread.sleep(500);
        personalInfo.otherDamages();
        Thread.sleep(500);
        personalInfo.ticketOrViolations();
        Thread.sleep(500);
        personalInfo.clickNxt();
        Thread.sleep(500);
       // personalInfo.setDriverImprovement();
        Thread.sleep(500);
//        personalInfo.setContinueNext();
//        Thread.sleep(1000);

        //Spouse Details
        Thread.sleep(1000);

        personalInfo.setSpouseFirstName("Sita");
        Thread.sleep(500);
        personalInfo.setSpouseGender();
        Thread.sleep(500);
        personalInfo.setSpouseDateOfBirth("12/10/1995");
        Thread.sleep(500);
        personalInfo.setInsureThisPerson();
        Thread.sleep(500);
        personalInfo.setSpouseEduLevel(2);
        Thread.sleep(500);
        personalInfo.setSpouseEmploymentStats(3);
        Thread.sleep(500);
        personalInfo.setSpouseLicenseStatus(0);
        Thread.sleep(500);
        personalInfo.setSpouseYearsOfLicense(1);
        Thread.sleep(500);
        personalInfo.setSpouseArmyStatus();
        Thread.sleep(500);
        personalInfo.setSpouseViolationsAndClaims();
        Thread.sleep(500);
        personalInfo.setSpouseTicketOrViolations();
        Thread.sleep(500);
        personalInfo.setSpouseNxtPage();
        Thread.sleep(500);
//        personalInfo.setSemiFinalPage();
//        Thread.sleep(500);
        personalInfo.setContinueNext();
        Thread.sleep(1000);
        personalInfo.setPersonalPageNext();
        Thread.sleep(500);
        personalInfo.setsNext();
        Thread.sleep(500);
        personalInfo.setContinueNext();
        Thread.sleep(1000);






    }
}
