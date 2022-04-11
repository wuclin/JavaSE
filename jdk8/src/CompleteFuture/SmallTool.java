package CompleteFuture;

import java.util.StringJoiner;

public class SmallTool {

    public static void SleepMillis(long millis){
        try{
            Thread.sleep(millis);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printTimeAndThread(String tag){
        String result = new StringJoiner("\t/\t")
                    .add(String.valueOf(System.currentTimeMillis()))
                    .add(String.valueOf(Thread.currentThread().getId()))
                    .add(Thread.currentThread().getName())
                    .add(tag)
                    .toString();
        System.out.println(result);
    }
}
