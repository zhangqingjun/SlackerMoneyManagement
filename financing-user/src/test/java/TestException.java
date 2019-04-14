import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class TestException {
    private static Logger logger = Logger.getLogger("TestException");
    static void logException(Exception e){
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        //1.all
        //2.finest
        logger.finest(stringWriter.toString());
        logger.finer(stringWriter.toString());
        logger.fine(stringWriter.toString());
        logger.config(stringWriter.toString());
        logger.info(stringWriter.toString());
        logger.warning(stringWriter.toString());
        logger.severe(stringWriter.toString());
        logger.getLevel();
    }
    public static void main(String[] args){
        try{
            throw new Exception("my");
        }/*catch (NullPointerException e){
            logException(e);
        }*/
        catch (Exception e){
            System.out.println("Caught Exception");
            System.out.println("getMessage():"+e.getMessage());
            System.out.println("getLocalizedMessage():"+e.getLocalizedMessage());
            System.out.println("toString():"+e);
            System.out.println("printStackTrace()");
            e.printStackTrace(System.out);

        }
    }

}
