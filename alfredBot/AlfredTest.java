import java.util.Calendar;

public class AlfredTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();

        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", timeOfDay);
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis(
                "Alexis! Play some low-fi beats.");
        String alfredTest = alfredBot.respondBeforeAlexis(
                "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
                "Maybe that's what Batman is about. Not winning. But failing..");
        // NINJA BONUS
        String angryTest = alfredBot.respondBeforeAlexis(
                "I can't find my airpods. I HATE WHEN ITS LOST !!");

        // Print the greetings to test.
        // Uncomment these one at a time as you implement each method.
         System.out.println(testGuestGreeting);
        // System.out.println(angryTest);
        // System.out.println(testDateAnnouncement);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        //System.out.println(notRelevantTest);
    }
}
