package org.BTOOP;

import org.BTOOP.Service.Impl.SinhVienServiceImpl;
import org.BTOOP.Service.Impl.SinhVienServiceImpl2;
import org.BTOOP.Service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<SinhVienTuNhien> svtn = new ArrayList<>();

        List<SinhVienXaHoi> svxh =  new ArrayList<>();

        SinhVienService service = new SinhVienServiceImpl();

        SinhVienService service1 = new SinhVienServiceImpl2();

        SinhVienTuNhien sv1 = new SinhVienTuNhien("SV1", "nguyen chi thanh", 20, 8.0, 7.5, 9.0, 8.5, 8.0);
        SinhVienTuNhien sv2 = new SinhVienTuNhien("SV3", "hoang van cam", 22, 4.5, 6.0, 5.0, 4.0, 1);
        SinhVienXaHoi sv3 = new SinhVienXaHoi("SV2", "nguyen duc loc", 21, 9.0, 7.0, 8.5, 9.0, 8.0);
        SinhVienXaHoi sv4 = new SinhVienXaHoi("SV", "le my duyen", 20, 6.0, 5.0, 4.5, 1, 2);

        try {
            service.insertSVTN(sv1,svtn);
            service.insertSVTN(sv2,svtn);
        }catch (Exception e )
        {

        }

        service.insertSvXH(sv3,svxh);
        service.insertSvXH(sv4,svxh);


        System.out.println("svtn : ");
        for (SinhVienTuNhien item : svtn)
        {
            System.out.println(item.toString());
        }
        System.out.println("svxh : -------------");
        for (SinhVienXaHoi item: svxh)
        {
            System.out.println(item.toString());
        }

        System.out.println("---- update");
        sv2.setTenSinhvien("Hoang Van Cam update");
        sv2.setHoa(6);
        sv2.setToan(9);
        service.updateSVTN(sv2,svtn);
        for (SinhVienTuNhien item : svtn)
        {
            System.out.println(item.toString());
        }

        System.out.println("find sv");

        System.out.println(service.findByMSSV("SV3",svtn).toString());;

    }
}