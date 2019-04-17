package challenges;

/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 *
 * The method should return a new string representing the input time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 *
 * Example:
 * s: 07:05:45AM
 * return: 07:05:45
 *
 * Example:
 * s: 07:05:45PM
 * return: 19:05:45
 *
 //@param a string representing time in 12 hour format
 * @return the string s in 24 hour format
 */

public class NumberThree {


    public String timeConversion(String s) {

        String newString = " ";

        if(s.indexOf('a') != -1) {
           newString = s.substring(0, 8);


        }

        if(s.indexOf('p')  != -1){
            newString = "";
            String newnewString = s.substring(2, 8);
            int num = Integer.parseInt(s);
            num= num+12;
            newString+= num + newnewString;



        }
    return newString;
    }

}
