public class Textmassage {
    public String message1;
    public String message2;
    public String message3;


    public Textmassage(String message) {
        message1 = message.replaceAll("fuck", "f***k ").replaceAll("bullshit", "b****t ");
        message2 = message.replaceAll("fuck", "f***k ").replaceAll("bullshit", "b****t ");
        message3 = message.replaceAll("fuck", "f***k ").replaceAll("bullshit", "b****t ");
        System.out.println(message1);

    }



}