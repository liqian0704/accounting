import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by yp-tc-2646 on 17/11/29.
 */
public class TestLogger {


        public static void main(String[] args) {
            Logger log = Logger.getLogger("lavasoft");
            log.setLevel(Level.INFO);
            Logger log1 = Logger.getLogger("lavasoft");
            System.out.println(log==log1);     //true
            Logger log2 = Logger.getLogger("lavasoft.blog");
            log2.setLevel(Level.WARNING);

            log.info("aaa");
            log2.info("bbb");
            log2.fine("fine");
        }
    }

