package javabasics.inheritance.polymorphism.dynamicpolymorphism.drivers;

public class ChromeDriver extends RahulDriver {

    @Override
    public String get(String url) {
        return "This is my URL in chrome browser " + url;
    }

    @Override
    public String findElement(String s) {
        return "this is xpath " + s;
    }

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        System.out.println(driver.get("www.google.com"));

        System.out.println(driver.findElement("//a[text()='hello']"));
    }
}
