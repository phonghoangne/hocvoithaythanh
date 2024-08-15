package org.Exception;

import java.io.*;

public class Main {

//    https://gpcoder.com/2430-xu-ly-ngoai-le-trong-java-exception-handling/
//    https://viblo.asia/p/luong-io-trong-java-vlZL990WLQK
//    https://gpcoder.com/3484-lap-trinh-da-luong-trong-java-java-multi-threading/


//    public static void main(String[] args) throws IOException {
//
////         try - catch , try - resource - catch , try catch - finally, throw, throws
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try
//        {
//             fileReader = new FileReader("D:\\STUDYYYYY\\Menter\\Java\\hocvoithaythanh\\phong123.txt");
//             bufferedReader = new BufferedReader(fileReader);
//
//            String line;
//            while ((line = bufferedReader.readLine())!=null)
//            {
//                System.out.println(line);
//            }
//
//        }catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        finally {
//            if(bufferedReader!=null)
//                bufferedReader.close();
//        }
//
//    }

    public static void testCustomEx() throws CheckedException1 {
        if(true)
            throw new CheckedException1("erro");
    }
    public static void testUncheck()
    {
        if(true)
            throw new UnCheckedException("erro");
    }
    public static void main(String[] args) {

//        try {
//            testCustomEx();
//        } catch (CheckedException1 e)
//        {
//            System.out.println(e.getMessage());
//        }
//        testUncheck();

        try {
            FileWriter fileWriter = new FileWriter("D:\\STUDYYYYY\\Menter\\Java\\hocvoithaythanh\\phong123.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Ghi thêm dữ liệu");

            bufferedWriter.close();
        } catch (Exception e)
        {
            e.getMessage();
        }
    }
}
