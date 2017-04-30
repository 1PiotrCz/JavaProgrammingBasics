package com.company;

/**
 * Created by Piotr on 2017-04-30.
 */
public class TextOperation {
    public static void main(String[] args) {

        String info = "";

        info += "My name is Piotr.";
        info += " ";
        info += "I am a engineer.";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Anna.");
        sb.append(" ");
        sb.append("I am a hairdresser.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Ewa.")
                .append(" ")
                .append("I am a skydiver.");

        System.out.println(s.toString());

        System.out.print("Here is some text.tThat was a tab.nThat was a newline.");
        System.out.println(" More text.");

        // Formatting integers
        // %-10d means: output an integer in a space ten characters wide,
        // padding with space and left-aligning (%10d would right-align)
        System.out.printf("Total cost %-10d; quantity is %dn", 5, 120);

        // Demo-ing integer and string formatting control sequences
        for(int i=0; i<20; i++) {
            System.out.printf("%-2d: %sn", i, "here is some text");
        }

        // Formatting floating point value

        // Two decimal place:
        System.out.printf("Total value: %.2fn", 5.6874);

        // One decimal place, left-aligned in 6-character field:
        System.out.printf("Total value: %-6.1fn", 343.23423);

        // You can also use the String.format() method if you want to retrieve
        // a formatted string.
        String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
        System.out.println(formatted);

        // Use double %% for outputting a % sign.
        System.out.printf("Giving it %d%% is physically impossible.", 100);
    }

}
