import com.lx.utils.HammingUtils;
import com.lx.utils.SimHashUtils;
import com.lx.utils.TxtIOUtils;
import org.junit.Test;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class HammingUtilsTest {
    @Test
    public void getHammingDistanceTest() throws IOException, NoSuchAlgorithmException {
        String str0 = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig.txt");
        String str1 = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig_0.8_add.txt");
        int distance = HammingUtils.getHammingDistance(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }
}