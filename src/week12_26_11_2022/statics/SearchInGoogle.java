package week12_26_11_2022.statics;
import static week12_26_11_2022.statics.BrowserUtils.*;
// or
//import static week12_26_11_2022.statics.BrowserUtils.navigateUrl;

public class SearchInGoogle {
    public static void main(String[] args) {

       navigateUrl("Google");

       search("Adam");
        System.out.println(staticVariable); // we can import all static members

    }
}
