package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import pages.ContactListContactPage;
import pages.ContactListHomePage;
import utilities.Driver;


public class AddContactStepDefs {
    ContactListContactPage contactListContactPage = new ContactListContactPage();
    ContactListHomePage contactListHomePage = new ContactListHomePage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {

        Driver.getDriver().get(url);

    }
    @When("user enters email as {string}")
    public void user_enters_email_as(String email) {

        contactListHomePage.email.sendKeys(email);

    }
    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {

        contactListHomePage.password.sendKeys(password);

    }
    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {

        contactListHomePage.submit.click();

    }
    @When("user clicks on Add a New Contact button")
    public void user_clicks_on_add_a_new_contact_button() {

        contactListContactPage.addContact.click();

    }
    @When("user enters First Name as {string}")
    public void user_enters_first_name_as(String firstname) {

        contactListContactPage.firstName.sendKeys(firstname);

    }
    @When("user enters Last Name as {string}")
    public void user_enters_last_name_as(String lastname) {

        contactListContactPage.lastName.sendKeys(lastname);

    }
    @When("user enters Date of Birth as {string}")
    public void user_enters_date_of_birth_as(String dob) {

        contactListContactPage.birthdate.sendKeys(dob);

    }

    @When("user enters contact Email as {string}")
    public void user_enters_contact_email_as(String email) {

        contactListContactPage.email.sendKeys(email);

    }

    @When("user enters Phone as {string}")
    public void user_enters_phone_as(String phone) {

        contactListContactPage.phone.sendKeys(phone);

    }
    @When("user enters Street Address1 as {string}")
    public void user_enters_street_address1_as(String street1) {
        contactListContactPage.street1.sendKeys(street1);
    }

    @When("user enters Street Address2 as {string}")
    public void user_enters_street_address2_as(String street2) {
        contactListContactPage.street2.sendKeys(street2);
    }

    @When("user enters City as {string}")
    public void user_enters_city_as(String city) {
        contactListContactPage.city.sendKeys(city);
    }

    @When("user enters State or Province as {string}")
    public void user_enters_state_or_province_as(String state) {
        contactListContactPage.stateProvince.sendKeys(state);
    }

    @When("user enters Postal Code as {string}")
    public void user_enters_postal_code_as(String postalCode) {
        contactListContactPage.postalCode.sendKeys(postalCode);
    }

    @When("user enters Country {string}")
    public void user_enters_country(String country) {
        contactListContactPage.country.sendKeys(country);
    }

    @When("user clicks on contact Submit button")
    public void user_clicks_on_contact_submit_button() {
        contactListContactPage.submit.click();
    }



}
