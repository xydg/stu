package file;

import java.io.File;
import java.io.IOException;

/**
 * @author yuanshuchang
 * @since 2020/4/8
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File fileEmptyString = new File("");
        File fileOneDot = new File(".");
        File fileDotSlash = new File("./");
        File fileTwoDot = new File("..");
        File fileTwoDotSlash = new File("../");
        String currentWorkspace = System.getProperty("user.dir");
        System.out.println("fileEmptyString = " + fileEmptyString.getCanonicalPath());
        System.out.println("fileOneDot = " + fileOneDot.getCanonicalPath());
        System.out.println("fileDotSlash = " + fileDotSlash.getCanonicalPath());
        System.out.println("fileTwoDot = " + fileTwoDot.getCanonicalPath());
        System.out.println("fileTwoDotSlash = " + fileTwoDotSlash.getCanonicalPath());
        System.out.println("currentWorkspace = " + currentWorkspace);
    }
}
