import JDKway.JDKProxyFactory;
import JDKway.SentMsgService;
import JDKway.SentMsgServiceImpl;

public class main {
    public static void main(String[] args){
        SentMsgService sentMsgService = (SentMsgService) JDKProxyFactory.getProxy(new SentMsgServiceImpl());
        sentMsgService.sentMsg("jdk proxy");
    }
}
