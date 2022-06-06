package TestNG;

import org.testng.annotations.DataProvider;

public class DataForNames {

    @DataProvider(name = "FullNameTest")
    public Object[][] getData() {
        return new Object[][]{
                {"Miko", "Lomachenko", "Miko Lomachenko"},
                {"Igor", "Car", "Igor Car"},
                {"Mike", "Lopes", "Mike Lopes"},
                {"Ram", "Corb", "Ram Corb"},
                {"Alex", "Mirron", "Alex Mirron"},
                {"Ivan", "Ivanov", "Ivan Ivanov"},
                {"B", "Bold", "B Bold"}
        };
    }
}
