package pattern.dayoungle.adapter;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pattern.Application;
import org.junit.Test;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class PrintBannerTest {
    @Test
    public void testInherit(){
        InterfacePrint p = new PrintBannerInherit("apfhd");
        p.printStrong();
        p.printWeak();
    }

    @Test
    public void testDelegate(){
        AbstractPrint p = new PrintBannerDelegation("dnffkdnffk");
        p.printWeak();
        p.printStrong();
    }
}
