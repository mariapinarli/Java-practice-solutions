package day08_switch;
/*
3.  write a program that can display the selected browser
    3.1  declare a String variable called browserName
    3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
    3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser
    Do Not use if statement or ternary
 */

public class Browser {
    public static void main(String[] args) {

        String browserName = "chrome";
        String result;

        switch (browserName){
            case "CHROME":
            case "chrome":
                result = "Chrome is opening";
                break;
            case "FIREFOX":
            case "firefox":
                result = "Firefox is opening";
                break;
            case "opera":
            case "OPERA":
                result = "Opera is opening";
                break;
            case "safari":
                result = "safari is opening";
                break;
            default:
                result = browserName + " is not valid";
        }

        System.out.println(result);


    }
}
