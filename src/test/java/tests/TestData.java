package tests;

import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.RandomUtils.*;

public class TestData {
    public Faker faker = new Faker();
    public Faker fakerRu = new Faker(new Locale("ru"));

    public String firstName = fakerRu.name().firstName();
    public String lastName = fakerRu.name().lastName();
    public String userEmail = faker.internet().emailAddress();
    public String userNumber = getRandomPhone();
    public String genter = getRandomGender();
    public String hobby = getRandomHobby();
    public String currentAddress = fakerRu.address().fullAddress();
    public String day = String.valueOf(getRandomInt(1, 28));
    public String month = getRandomMonth();
    public String year = String.valueOf(getRandomInt(1900, 2026));
    public String data = String.format("%s %s,%s", day, month, year);
    public String subject = getRandomSubject();
    public String state = getRandomState();
    public String city = generateCity(state);
    public String picture = "img/picture.png";
    public String resultsPicture = "picture.png";


}
