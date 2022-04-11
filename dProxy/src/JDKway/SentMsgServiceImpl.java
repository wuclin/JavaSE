package JDKway;

public class SentMsgServiceImpl implements SentMsgService {
    @Override
    public String sentMsg(String msg) {
        System.out.println(msg);
        return msg;
    }
}
