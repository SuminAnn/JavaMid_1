package enumeration.test.http;

import java.util.*;
public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("HTTP CODE: ");
        int httpCodeInput = sc.nextInt();

        HttpStatus httpStatus = HttpStatus.findByCode(httpCodeInput);

        if(httpStatus == null){
            System.out.println("정의되지 않은 코드");
        }else{
            System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
            System.out.println("isSuccess = " + httpStatus.isSuccess());
        }

        sc.close();
    }
}
