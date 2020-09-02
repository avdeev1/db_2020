package homework.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class HttpCodeService {
    private List<StatusCode> codes;

    public HttpCodeService() {
        codes = new ArrayList<>();
        codes.add(new InformationalCode());
        codes.add(new SuccessCode());
        codes.add(new RedirectionCode());
        codes.add(new ClientMistakeCode());
        codes.add(new ServerErrorCode());
    }


    public void processHttp(String text) {
        int statusCodeIndex = text.indexOf("httpcode:") + 9;

        int result = 0;
        int count = 0;
        while (count != 3) {
            char c = text.charAt(statusCodeIndex);
            try {
                int i = Integer.parseInt(String.valueOf(c));
                result = result * 10 + i;
                count++;
            } catch (Exception ignored) {}

            statusCodeIndex++;
        }

        try {
            codes.get(result / 100 - 1).doLogic(result);
        } catch (Exception e) {
            System.out.println("You caught a nonexistent error!!!");
        }
    }
}
