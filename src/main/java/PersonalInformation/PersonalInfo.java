package PersonalInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class PersonalInfo {
    WebDriver driver;
    By selectAuto = By.xpath("//a[@data-qs-product='AU']");
    By enterZipCode = By.xpath("//input[@id='zipCode_overlay']");
    By getAQuote = By.xpath("//input[@id='qsButton_overlay']");

    By firstName = By.xpath("//input[@analytics-id='NameAndAddressEdit_FirstName']");
    By lastName = By.xpath("//input[@analytics-id='NameAndAddressEdit_LastName']");
    By suffix = By.xpath("//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']");
    By dateOfBirth = By.xpath("//input[@analytics-id='NameAndAddressEdit_DateOfBirth']");
    By enterStreetName = By.xpath("//input[@analytics-id='NameAndAddressEdit_MailingAddress']");
    By startMyQuote = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");

    By selectVehicleYear = By.xpath("//li[@role='option']");
    By selectMake = By.xpath("//li[@role='option']");
    By selectModel = By.xpath("//li[@role='option']");
    By primaryUse = By.xpath("//select[@analytics-id='VehiclesNew_VehicleUse']");
    By ownOrLease = By.xpath("//select[@analytics-id='VehiclesNew_OwnOrLease']");
    By howLongHaveYou = By.xpath("//select[@analytics-id='VehiclesNew_LengthOfOwnership']");
    By isPrimaryGaragingAddress = By.xpath("//input[@analytics-id='VehiclesNew_GaragingSameAsMailingAddress_Y']");
    By equippedDevice = By.xpath("//input[@analytics-id='VehiclesNew_AutomaticEmergencyBraking_N']");
    By hasBlindSpots = By.xpath("//input[@analytics-id='VehiclesNew_BlindSpotWarning_N']");
    By enterNextPage = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By goToOther = By.xpath("//div[@class='divider-and-nav-buttons ng-star-inserted']");

    By selectGender = By.xpath("//input[@analytics-id='DriversAddPniDetails_Gender_M']");
    By maritalStatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_MaritalStatus']");
    By levelOfEdu = By.xpath("//select[@analytics-id='DriversAddPniDetails_HighestLevelOfEducation']");
    By employmentStatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_EmploymentStatus']");
    By primaryResident = By.xpath("//select[@analytics-id='DriversAddPniDetails_PrimaryResidence']");
    By movedIn = By.xpath("//select[@analytics-id='DriversAddPniDetails_HasPriorAddress']");
    By usLicenceStatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_LicenseStatus']");
    By yearsOfLicensed = By.xpath("//select[@analytics-id='DriversAddPniDetails_DriverYearsLicensed']");
    //By usArmedForces = By.xpath("//input[@analytics-id='DriverAddPniDetails_MilitaryStatus_N']");
    By otherDamages = By.xpath("//input[@analytics-id='DriversAddPniDetails_HasAccidentsOrClaims_N']");
    By ticketOrViolations = By .xpath("//input[@analytics-id='DriversAddPniDetails_HasTicketsOrViolations_N']");
    By clickNxt = By.xpath("//loading-button[@class='blue']");
    By driverImprovement = By .xpath("//input[@analytics-id='DriversEditDriverAdditionalDetails_SafetyCourseTaken_N']");
    By continueNext = By.xpath("//navigation-container[@class='navigation-container ng-star-inserted']");

    By spouseFirstName = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_FirstName']");
    By spouseGender = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_Gender_F']");
    By spouseDateOfBirth = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_DateOfBirth']");
    By insureThisPerson = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_DriverIncluded_Y']");
    By spouseEduLevel = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_HighestLevelOfEducation']");
    By spouseEmploymentStats = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_EmploymentStatus']");
    By spouseLicenseStatus = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_LicenseStatus']");
    By spouseYearsOfLicense = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_DriverYearsLicensed']");
    By spouseArmyStatus = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_MilitaryStatus_N']");
    By spouseViolationsAndClaims = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_HasAccidentsOrClaims_N']");
    By spouseTicketOrViolations = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_HasTicketsOrViolations_N']");
    By spouseNxtPage = By.xpath("//navigation-container[@class='navigation-container ng-star-inserted']");
    By semiFinalPage = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By personalPageNext = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By sNext = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");



    public PersonalInfo(WebDriver driver) {
        this.driver = driver;
    }

    public void selectAuto() {
        driver.findElement(selectAuto).click();
    }

    public void setEnterZipCode(String zipCode) {
        driver.findElement(enterZipCode).sendKeys(zipCode);
    }

    public void getAQuote() {
        driver.findElement(getAQuote).click();
    }

    public void firstName(String firstName1) {
        driver.findElement(firstName).sendKeys(firstName1);
    }

    public void lastName(String lastName1) {
        driver.findElement(lastName).sendKeys(lastName1);
    }

    public void suffix(int index) {
        WebElement element = driver.findElement(suffix);
        Select suffix = new Select(element);
        suffix.selectByIndex(index);
    }

    public void dateOfBirth(String dateOfBirth1) {
        driver.findElement(dateOfBirth).sendKeys(dateOfBirth1);
    }

    public void setEnterStreetName(String enterStreetName1) {
        driver.findElement(enterStreetName).sendKeys(enterStreetName1);
    }
    public void startMyQuote() {
        driver.findElement(startMyQuote).click();
    }
    public void selectVehicleYear(String selectVehicleYear1) {
        List<WebElement> yearList = driver.findElements(selectVehicleYear);
        for (WebElement webElement : yearList) {
            if (webElement.getText().contains(selectVehicleYear1)) {
                webElement.click();
                break;
            }
        }
    }
    public void selectMake(String selectMake1) {
        List<WebElement> makeList = driver.findElements(selectMake);
        for (WebElement webElement : makeList) {
            if (webElement.getText().contains(selectMake1)) {
                webElement.click();
                break;
            }
        }
    }
    public void selectModel(String selectModel1) {
        List<WebElement> modelList = driver.findElements(selectModel);
        for (WebElement webElement : modelList) {
            if (webElement.getText().contains(selectModel1)) {
                webElement.click();
                break;

            }

        }
    }

    public void setPrimaryUse(int index) {
        WebElement element = driver.findElement(primaryUse);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void ownOrLease(int index) {
        WebElement element = driver.findElement(ownOrLease);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void howLongHaveYou(int index) {
        WebElement element = driver.findElement(howLongHaveYou);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void isPrimaryGaragingAddress() {
        driver.findElement(isPrimaryGaragingAddress).click();
    }
    public void setEquippedDevice() {

        driver.findElement(equippedDevice).click();
    }
    public void setHasBlindSpots() {
        driver.findElement(hasBlindSpots).click();
    }
    public void enterNextPage() {
        driver.findElement(enterNextPage).click();
    }
    public void setGoToOther() {
        driver.findElement(goToOther).click();
        driver.findElement(goToOther).submit();
    }
    public void setSelectGender(){
        driver.findElement(selectGender).click();
    }
    public void maritalStatus(int index){
        WebElement element = driver.findElement(maritalStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void levelOfEdu(int index){
        WebElement element = driver.findElement(levelOfEdu);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void setEmploymentStatus(int index){
        WebElement element = driver.findElement(employmentStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void primaryResident(int index){
        WebElement element = driver.findElement(primaryResident);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void movedIn(int index){
        WebElement element = driver.findElement(movedIn);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void usLicenceStatus(int index){
        WebElement element = driver.findElement(usLicenceStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void setYearsOfLicensed(int index){
        WebElement element = driver.findElement(yearsOfLicensed);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
//    public void usArmedForces(){
//        driver.findElement(usArmedForces).click();
//    }
    public void otherDamages(){
        driver.findElement(otherDamages).click();
    }
    public void ticketOrViolations(){
        driver.findElement(ticketOrViolations).click();
    }
    public void clickNxt(){
        driver.findElement(clickNxt).click();
    }
    public void setDriverImprovement(){
        driver.findElement(driverImprovement).click();
    }
    public void setContinueNext(){
        driver.findElement(continueNext).click();
    }
   public void setSpouseFirstName(String spouseFirstName1){
        driver.findElement(spouseFirstName).sendKeys(spouseFirstName1);
   }
    public void setSpouseGender(){
        driver.findElement(spouseGender).click();
    }
   public void setSpouseDateOfBirth(String spouseDateOfBirth1){
        driver.findElement(spouseDateOfBirth).sendKeys(spouseDateOfBirth1);
   }
   public void setInsureThisPerson(){
        driver.findElement(insureThisPerson).click();
   }
   public void setSpouseEduLevel(int index){
        WebElement element = driver.findElement(spouseEduLevel);
        Select select = new Select(element);
        select.selectByIndex(index);
   }
   public void setSpouseEmploymentStats(int index){
        WebElement element = driver.findElement(spouseEmploymentStats);
        Select select = new Select(element);
        select.selectByIndex(index);
   }
   public void setSpouseLicenseStatus(int index){
        WebElement element = driver.findElement(spouseLicenseStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
   }
   public void setSpouseYearsOfLicense(int index){
        WebElement element = driver.findElement(spouseYearsOfLicense);
        Select select = new Select(element);
        select.selectByIndex(index);
   }
   public void setSpouseArmyStatus(){
        driver.findElement(spouseArmyStatus).click();
   }
   public void setSpouseViolationsAndClaims(){
        driver.findElement(spouseViolationsAndClaims).click();
   }
   public void setSpouseTicketOrViolations(){
        driver.findElement(spouseTicketOrViolations).click();
   }
   public void setSpouseNxtPage(){
        driver.findElement(spouseNxtPage).click();
   }
   public void setSemiFinalPage(){
        driver.findElement(semiFinalPage).click();
   }
   public void setPersonalPageNext(){
        driver.findElement(personalPageNext).click();
   }
   public void setsNext(){
        driver.findElement(sNext).click();}
}

