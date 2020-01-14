package pages;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonPage {
    public String getDateTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }
}
