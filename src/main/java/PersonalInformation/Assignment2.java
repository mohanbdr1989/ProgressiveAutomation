package PersonalInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Assignment2 {
    // invoking start page

    WebDriver driver;


    By selectingAuto = By.xpath("//a[@data-qs-product='AU']");
    By selectingZipCode = By.xpath("//input[@id='zipCode_overlay']");
    By startAQuote = By.xpath("//input[@id='qsButton_overlay']");
    // start filling  personal infromation
    By firstName = By.xpath("//input[@analytics-id='NameAndAddressEdit_FirstName']");
    By lastName = By.xpath("//input[@analytics-id='NameAndAddressEdit_LastName']");
    By suffix = By.xpath("//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']");
    By dateOfBirth = By.xpath("//input[@analytics-id='NameAndAddressEdit_DateOfBirth']");
    By streetName = By.xpath("//input[@analytics-id='NameAndAddressEdit_MailingAddress']");
    By startMyQuote = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    //                      second page  information
    By selectYear = By.xpath("//li[@role='option']");
    By selectMake = By.xpath("//li[@role='option']");
    By selectModel = By.xpath("//li[@role='option']");
    By primaryUse = By.xpath("//select[@analytics-id='VehiclesNew_VehicleUse']");
    By ownOrLease = By.xpath("//select[@analytics-id='VehiclesNew_OwnOrLease']");
    By howLong = By.xpath("//select[@analytics-id='VehiclesNew_LengthOfOwnership']");
    By primaryGaraging = By.xpath("//input[@analytics-id='VehiclesNew_GaragingSameAsMailingAddress_Y']");
    By equippedDevice = By.xpath("//input[@analytics-id='VehiclesNew_AutomaticEmergencyBraking_N']");
    By hasBlindSpots = By.xpath("//input[@analytics-id='VehiclesNew_BlindSpotWarning_N']");
    By nextPage = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By goToOther = By.xpath("//div[@class='divider-and-nav-buttons ng-star-inserted']");

    //                  third page information
    By selectGender = By.xpath("//input[@analytics-id='DriversAddPniDetails_Gender_M']");
    By maritalStatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_MaritalStatus']");
    By levelOfEducation = By.xpath("//select[@analytics-id='DriversAddPniDetails_HighestLevelOfEducation']");
    By employeeStatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_EmploymentStatus']");
    By primaryResidence = By.xpath("//select[@analytics-id='DriversAddPniDetails_PrimaryResidence']");
    By movedIn = By.xpath("//select[@analytics-id='DriversAddPniDetails_HasPriorAddress']");
    By licenceStatus = By.xpath("//select[@analytics-id='DriversAddPniDetails_LicenseStatus']");
    By yearLicensed = By.xpath("//select[@analytics-id='DriversAddPniDetails_DriverYearsLicensed']");
    //By armedForce = By.xpath("//input[@analytics-id='DriverAddPniDetails_MilitaryStatus_N']");
    By hadClaims = By.xpath("//input[@analytics-id='DriversAddPniDetails_HasAccidentsOrClaims_N']");
    By ticketOrViolation = By.xpath("//input[@analytics-id='DriversAddPniDetails_HasTicketsOrViolations_N']");
    By clickNext = By.xpath("//loading-button[@class='blue']");
    //  By driverImprovement = By.xpath("//input[@analytics-id='DriversEditDriverAdditionalDetails_SafetyCourseTaken_N']");
    By continueNext = By.xpath("//navigation-container[@class='navigation-container ng-star-inserted']");

    // third page about your spouse
    By spouseFirstName = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_FirstName']");
    By spouseGender = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_Gender_F']");
    By spouseDateOfBirth = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_DateOfBirth']");
    By personOnThePolicy = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_DriverIncluded_Y']");
    By spouseEducation = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_HighestLevelOfEducation']");
    By spouseEmployeeStatus = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_EmploymentStatus']");
    By spouseLicenseStatus = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_LicenseStatus']");
    By spouseYearLicenced = By.xpath("//select[@analytics-id='DriversAddSpouseDetails_DriverYearsLicensed']");
    By spouseArmy = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_MilitaryStatus_N']");
    By spouseClaims = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_HasAccidentsOrClaims_N']");
    By spouseTicket = By.xpath("//input[@analytics-id='DriversAddSpouseDetails_HasTicketsOrViolations_N']");
    By spouseNextPage = By.xpath("//navigation-container[@class='navigation-container ng-star-inserted']");
    By semiFinalPage = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By personalPageNext = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By sNext = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");

    //              fifth page tell us about your insurence
    By haveAutoInsurance = By.xpath("//input[@analytics-id='FinalDetailsEdit_InsuranceToday_Y']");
    By currentCompany = By.xpath("//select[@analytics-id='FinalDetailsEdit_RecentAutoInsuranceCompanyPeriod']");
    By injuryLimits = By.xpath("//select[@analytics-id='FinalDetailsEdit_BodilyInjuryLimits']");
    By policyWithProgressive = By.xpath("// input[@analytics-id='FinalDetailsEdit_OtherPolicies_N']");
    By hadAuto = By.xpath("// input[@analytics-id='FinalDetailsEdit_PriorProgressive_N']");
    By startPolicy = By.xpath("//input[@analytics-id='FinalDetailsEdit_AdvancedShopperPolicyEffectiveDate']");
    By emailAddress = By.xpath("// input[@analytics-id='FinalDetailsEdit_PrimaryEmailAddress']");
    By household = By.xpath("//select[@analytics-id='FinalDetailsEdit_TotalResidents']");
    By injuryClaims = By.xpath("//select[@analytics-id='FinalDetailsEdit_TotalPipClaimsCount']");
    By goNext = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");

    By snapShot = By.xpath("//input[@analytics-id='SnapshotEnrollment40Edit_SnapshotPolicyEnrollment_N']");
    // By pluginDevices = By.xpath("//input[@analytics-id='SnapshotEnrollment40Edit_SnapshotEnrollmentExperience_D']");
    By finalClick = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By noThanks = By.xpath("//loading-button[@data-automation-id='forwardNavigation']");
    By finishAndBuy = By.xpath("//loading-button[@id='nyp-blue-button']");


    public Assignment2(WebDriver driver) {

        this.driver = driver;

    }

    public void setSelectingAuto() {
        driver.findElement(selectingAuto).click();

    }

    public void setSelectingZipCode(String zipCode) {
        driver.findElement(selectingZipCode).sendKeys(zipCode);
    }

    public void setStartAQuote() {
        driver.findElement(startAQuote).click();
    }

    public void setFirstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);

    }

    public void setLastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }


    public void setDateOfBirth(String doBirth) {
        driver.findElement(dateOfBirth).sendKeys(doBirth);

    }

    public void setStreetName(String sName) {
        driver.findElement(streetName).sendKeys(sName);

    }

    public void setSuffix(int index) {
        WebElement element = driver.findElement(suffix);
        Select suffix = new Select(element);
        suffix.selectByIndex(index);

    }

    public void setStartMyQuote() {

        driver.findElement(startMyQuote).click();

    }


    public void setSelectYear(String selectYear1) throws InterruptedException {


        List<WebElement> yearList = driver.findElements(selectYear);

        for (int i = 0; i < yearList.size(); i++)

            if (yearList.get(i).getText().contains(selectYear1)) {
                yearList.get(i).click();
                break;
            }


    }

    public void setSelectMake(String selectMake1) {
        List<WebElement> makeList = driver.findElements(selectMake);
        for (int i = 0; i < makeList.size(); i++) {
            if (makeList.get(i).getText().contains(selectMake1)) {
                makeList.get(i).click();
                break;
            }
        }
    }

    public void setSelectModel(String selectModel1) {
        List<WebElement> modelList = driver.findElements(selectModel);
        for (int i = 0; i < modelList.size(); i++) {
            if (modelList.get(i).getText().contains(selectModel1)) {
                modelList.get(i).click();
                break;
            }

        }
    }


    public void setPrimaryUse(int index) {
        WebElement element = driver.findElement(primaryUse);
        Select primaryUse = new Select(element);
        primaryUse.selectByIndex(index);
    }

    public void setOwnOrLease(int index) {
        WebElement element = driver.findElement(ownOrLease);
        Select ownOrLease = new Select(element);
        ownOrLease.selectByIndex(index);
    }

    public void setHowLong(int index) {
        WebElement element = driver.findElement(howLong);

        Select howLong = new Select(element);
        howLong.selectByIndex(index);

    }

    public void setPrimaryGaraging() {

        driver.findElement(primaryGaraging).click();


    }

    public void setEquippedDevice() {


        driver.findElement(equippedDevice).click();

    }

    public void setHasBlindSpots() {

        driver.findElement(hasBlindSpots).click();

    }

    public void setNextPage() {
        driver.findElement(nextPage).click();
    }

    public void setGoToOther() {
        driver.findElement(goToOther).click();
        driver.findElement(goToOther).submit();

    }

    public void setSelectGender() {
        driver.findElement(selectGender).click();
    }


    public void setMaritalStatus(int index) {
        WebElement element = driver.findElement(maritalStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void setLevelOfEducation(int index) {
        WebElement element = driver.findElement(levelOfEducation);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void setEmployeeStatus(int index) {
        WebElement element = driver.findElement(employeeStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void setPrimaryResidence(int index) {
        WebElement element = driver.findElement(primaryResidence);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void setMovedIn(int index) {
        WebElement element = driver.findElement(movedIn);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void setLicenceStatus(int index) {
        WebElement element = driver.findElement(licenceStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void setYearLicensed(int index) {
        WebElement element = driver.findElement(yearLicensed);
        Select select = new Select(element);
        select.selectByIndex(index);

    }

    //    public  void  setArmedForce(){
//        driver.findElement(armedForce).click();
//    }
    public void setHadClaims() {
        driver.findElement(hadClaims).click();
    }

    public void setTicketOrViolation() {
        driver.findElement(ticketOrViolation).click();
    }

    public void setClickNext() {
        driver.findElement(clickNext).click();
    }

//    public void setDriverImprovement() {
//        driver.findElement(driverImprovement).click();
//    }
public void setContinueNext() {
    driver.findElement(continueNext).click();
}




    public void setSpouseFirstName(String spouseFirstName1) {
        driver.findElement(spouseFirstName).sendKeys(spouseFirstName1);
    }

    public void setSpouseGender() {
        driver.findElement(spouseGender).click();
    }

    public void setSpouseDateOfBirth(String spouseDateOfBirth1) {
        driver.findElement(spouseDateOfBirth).sendKeys(spouseDateOfBirth1);

    }

    public void setPersonOnThePolicy() {
        driver.findElement(personOnThePolicy).click();
    }
    public  void setSpouseEducation(int index){
        WebElement element = driver.findElement(spouseEducation);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void setSpouseEmployeeStatus(int index){
        WebElement element = driver.findElement(spouseEmployeeStatus);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void setSpouseLicenseStatus(int index){
        WebElement element = driver.findElement(spouseLicenseStatus);
        Select select = new Select(element);
        select.selectByIndex(index);

    }
    public void setSpouseYearLicenced(int index){
        WebElement element = driver.findElement(spouseYearLicenced);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void setSpouseArmy(){
        driver.findElement(spouseArmy).click();
    }

    public void setSpouseClaims(){
        driver.findElement(spouseClaims).click();

    }
    public void setSpouseTicket(){
        driver.findElement(spouseTicket).click();
    }



    public void setSpouseNextPage(){
        driver.findElement(spouseNextPage).click();
    }

    public void setSemiFinalPage(){
        driver.findElement(semiFinalPage).click();
    }
    public void setPersonalPageNext(){
        driver.findElement(personalPageNext).click();
    }
    public void setsNext(){
        driver.findElement(sNext).click();
    }

    public void setHaveAutoInsurance(){
        driver.findElement(haveAutoInsurance).click();
    }
    public void setCurrentCompany(int index){
        WebElement element = driver.findElement(currentCompany);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void setInjuryLimits(int index){
        WebElement element = driver.findElement(injuryLimits);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public  void  setPolicyWithProgressive(){
        driver.findElement(policyWithProgressive).click();
    }
    public  void  setHadAuto(){
        driver.findElement(hadAuto).click();

    }
    public void setStartPolicy(String startPolicy1){
        driver.findElement(startPolicy).sendKeys(startPolicy1);
    }
    public void  setEmailAddress(String emailId){
        driver.findElement(emailAddress).sendKeys(emailId);
    }
    public  void  setHousehold(int index){
        WebElement element = driver.findElement(household);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void  setInjuryClaims(int index){
        WebElement element = driver.findElement(injuryClaims);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public  void setGoNext(){
        driver.findElement(goNext).click();
    }

    public  void  setSnapShot(){
        driver.findElement(snapShot).click();
    }
// public void setPluginDevices(){
//         driver.findElement(pluginDevices).click();
// }

    public  void  setFinalClick(){
        driver.findElement(finalClick).click();
    }
    public void setNoThanks(){
        driver.findElement(noThanks).click();
    }
    public void setFinishAndBuy(){
        driver.findElement(finishAndBuy).click();
    }


}
