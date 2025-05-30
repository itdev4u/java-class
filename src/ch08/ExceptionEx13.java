package ch08;

import java.io.File;

public class ExceptionEx13 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + "파일이 생성되었습니다.");
        } catch(Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다.");
            try {
                createFile("제목없음2.txt");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    private static File createFile(String fileName) throws Exception {
        if(fileName==null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);
        f.createNewFile();

        return f;
    }
}
