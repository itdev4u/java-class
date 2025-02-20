package ch08.chained;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch(InstallException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    private static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch(SpaceException se) {
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(se);
            throw ie;
        } catch(MemoryException me) {
            InstallException ie = new InstallException("설치중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    private static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }

    private static void copyFiles() {

    }

    private static void deleteTempFiles() {

    }

    private static boolean enoughMemory() {
        return true;
    }

    private static boolean enoughSpace() {
        return false;
    }
}
class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}