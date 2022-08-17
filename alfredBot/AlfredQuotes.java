import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class AlfredQuotes {

    public String basicGreeting() {

        return "Hello, lovely to see you. How are you?";
    }

    // overload the greeting function to print the name too
    public String guestGreeting(String name) {

        return String.format("Hello, %s. Lovely to see you.", name);
    }

    // overload greeting to be customed by the time of the day too
    public String guestGreeting(String name, int timeOfDay) {
        String dayPeriod = "";
        if (timeOfDay >= 0 && timeOfDay < 12) {
            dayPeriod = "Good morning";
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            dayPeriod = "Good Afternoon";
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            dayPeriod = "Good Evening";
        } else if (timeOfDay >= 21 && timeOfDay < 24) {
            dayPeriod = "Good Night";
        }
        return String.format("%s %s ! Lovely to see you.", dayPeriod, name);
    }

    // return the day - month - day in number - time - year
    public String dateAnnouncement() {

        LocalDate currentdate = LocalDate.now();

        DayOfWeek dayOfWeek = currentdate.getDayOfWeek();

        Month currentMonth = currentdate.getMonth();

        int currentYear = currentdate.getYear();

        LocalTime timeObj = LocalTime.now();

        String currentTime = timeObj.toString();

        return "It is currently " + dayOfWeek + " " + currentMonth + " " + dayOfWeek.getValue()
                + " " + currentTime + " " + currentYear;
    }

    // return diff respond , depend on the input
    public String respondBeforeAlexis(String conversation) {
        String conv = conversation.toLowerCase();
        int isAlexis = conv.indexOf("alexis");
        int isAlfred = conv.indexOf("alfred");
        int isAngryTest1 = conv.indexOf("hate");
        int isAngryTest2 = conv.indexOf("yall");
        if (isAlexis != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (isAlfred != -1) {
            return "At your service. As you wish, naturally.";
        } else if (isAngryTest1 != -1 || isAngryTest2 != -1) {
            return "calm down , its not the end of the world ..";
        } else {
            return "Right. And with that I shall retire.";
        }

    }

}
