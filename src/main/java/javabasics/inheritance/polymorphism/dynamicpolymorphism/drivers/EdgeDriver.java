package javabasics.inheritance.polymorphism.dynamicpolymorphism.drivers;

public class EdgeDriver extends RahulDriver {
    @Override
    public String get(String url) {
        return "This is my URL in edge browser " + url;
    }

    @Override
    public String findElement(String s) {
        return "this is xpath in edge browser" + s;
    }

    public static void main(String[] args) {
        RahulDriver driver = new ChromeDriver();
        System.out.println(driver.get("www.google.com"));

        System.out.println(driver.findElement("//a[text()='hello']"));
    }
}
