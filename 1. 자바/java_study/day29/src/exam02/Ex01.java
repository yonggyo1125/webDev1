package exam02;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        try {
            InetAddress ia = InetAddress.getByName("naver.com");
            String ipAddr = ia.getHostAddress();
            System.out.println(ipAddr);

            byte[] ipAddr2 = ia.getAddress();
            int[] ipAddr3 = new int[4];
            for (int i = 0; i < ipAddr2.length; i++) {
                int ip = ipAddr2[i];
                ip = ip < 0 ? ipAddr2[i] + 256 : ipAddr2[i];
                ipAddr3[i] = ip;
            }

            System.out.println(Arrays.toString(ipAddr3));

        } catch (UnknownHostException e) {
           e.printStackTrace();
        }
    }
}
