import com.lx.utils.SimHashUtils;
import com.lx.utils.TxtIOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class SimHashUtilsTest {
    @Test
    public void getHashTest() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String[] strings = {"余华", "是", "一位", "真正", "的", "作家"};
        for (String string : strings) {
            String stringHash = SimHashUtils.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }
    @Test
    public void getSimHashTest() throws IOException, NoSuchAlgorithmException {
        String str0 = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig.txt");
        String str1 = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig_0.8_add.txt");
        System.out.println(SimHashUtils.getSimHash(str0));
        System.out.println(SimHashUtils.getSimHash(str1));
    }
}