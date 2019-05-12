import java.util.regex.Matcher;
import java.util.regex.Pattern;
//поиск драгоценных камней
public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println(new JewelsAndStones().numJewelsInStones("aFrfadA", "aAAbbklhfklmlmklf"));
    }

    public int numJewelsInStones(String J, String S) {
        String[] regxJ = J.split("");
        StringBuilder strB = new StringBuilder();
        int result = 0;
        for (String s : regxJ) {
            strB.append(s);
        }

        Pattern p = Pattern.compile("[" + strB.toString() + "]");
        Matcher m = p.matcher(S);
        //цикл на количество вхождений
        while (m.find()) {
            result++;
        }
        return result;
    }
}
