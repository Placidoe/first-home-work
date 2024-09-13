import com.lx.utils.HammingUtils;
import com.lx.utils.SimHashUtils;
import com.lx.utils.TxtIOUtils;
import org.junit.Test;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class MainTest {
    @Test
    public void origAndAllTest() throws IOException, NoSuchAlgorithmException {
        String[] str = new String[6];
        str[0] = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig.txt");
        str[1] = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig_0.8_add.txt");
        str[2] = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig_0.8_del.txt");
        str[3] = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig_0.8_dis_1.txt");
        str[4] = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig_0.8_dis_10.txt");
        str[5] = TxtIOUtils.readTxt("C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\orig_0.8_dis_15.txt");
        String ansFileName = "C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TxtIOUtils.writeTxt(String.valueOf(ans)+" ", ansFileName);
        }
    }
}