import com.lx.utils.TxtIOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TxtIOUtilsTest.class)
public class TxtIOUtilsTest {
    @Test
    public void readTxtTest() throws IOException {
        // 路径存在，正常读取
        String str = TxtIOUtils.readTxt("D:/test/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
    @Test
    public void writeTxtTest() throws IOException {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtIOUtils.writeTxt(String.valueOf(elem[i])+" ", "C:\\Users\\1\\Desktop\\java论文查重的测试txt文件\\ans.txt");
        }
    }
    @Test
    public void readTxtFailTest() throws IOException {
        // 路径不存在，读取失败
        String str = TxtIOUtils.readTxt("D:/test/none.txt");
    }
    @Test
    public void writeTxtFailTest() throws IOException {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            TxtIOUtils.writeTxt(String.valueOf(elem[i]), "User:/test/ans.txt");
        }
    }
}