package tests;

import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Story("Registration form")
public class RegistrationWithPageObjectTests extends TestBase {

//    @Test
//    @DisplayName("Successful Registration")
//    void successfulRegistrationTest() {
//        TestData testData = new TestData();
//        step("Open registration page", () ->
//                registrationPage.openPage());
//        step("Fill registration form", () -> {
//            registrationPage
//                    .typeFirstName(testData.firstName)
//                    .typeLastName(testData.lastName)
//                    .typeUserEmail(testData.userEmail)
//                    .setGender(testData.genter)
//                    .typeUserNumber(testData.userNumber)
//                    .setDateOfBirth(testData.day, testData.month, testData.year)
//                    .typeSubjects(testData.subject)
//                    .setHobby(testData.hobby)
//                    .uploadPicture(testData.picture)
//                    .typeAddress(testData.currentAddress)
//                    .setStateAndCity(testData.state, testData.city)
//                    .submitClick();
//        });
//        step("Check registration form results data", () -> {
//            step("Check registration form results component appears", () -> { // or move to pageobject step
//                $(".modal-dialog").should(appear);
//                $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
//            });
//            registrationPage.checkModalWindow()
//                    .checkResult("Student Name", testData.firstName + " " + testData.lastName)
//                    .checkResult("Student Email", testData.userEmail)
//                    .checkResult("Gender", testData.genter)
//                    .checkResult("Mobile", testData.userNumber)
//                    .checkResult("Subjects", testData.subject)
//                    .checkResult("Hobbies", testData.hobby)
//                    .checkResult("Picture", testData.resultsPicture)
//                    .checkResult("Address", testData.currentAddress)
//                    .checkResult("State and City", testData.state + " " + testData.city);
//
//        });
//    }
//
//    @Test
//    @DisplayName("Broken Registration")
//    void brokenRegistrationTest() {
//        step("Open registration page", () ->
//                registrationPage.openPage());
//
//        step("Fill registration form", () -> {
//            registrationPage
//                    .typeFirstName("Alex")
//                    .typeLastName("Egorov")
//                    .setGender("Other")
//                    .typeUserNumber("1234567890");
//            $("#submit").click();
//        });
//
//        step("Check registration form results data", () -> {
//            step("Check registration form results component appears", () -> { // or move to pageobject step
//                $(".modal-dialog").should(appear);
//                $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
//            });
//
//            registrationPage.checkResult("Student Name", "Alex Egorov")
//                    .checkResult("Student Email", "alex111@egorov.com");
//        });
//    }
}
