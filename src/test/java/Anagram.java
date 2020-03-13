import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oakinrele on Jul, 2019
 */
public class Anagram {

    @Test
    public boolean isAnagram(String x, String y)
    {

        char[] xToChar = x.toCharArray();
        char[] yToChar = y.toCharArray();

        List<Character> first = new ArrayList<>();
        List<Character> second = new ArrayList<>();

        for (char i:xToChar)
        {
            first.add(i);
        }

        for (char j:yToChar)
        {
            second.add(j);
        }

        //int length = second.size();

        for(int i = 0; i < first.size(); i++)
        {
            for (int j = 0; j < second.size(); j++)
            {
                if(second.get(j) == first.get(i))
                {
                    second.remove(second.get(j));
                }
            }
        }

        if (second.size() == 0)
            return true;
        else
            return false;

}

    public void solution()
    {
        boolean ret = isAnagram("akinrele", "akinrele");
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
