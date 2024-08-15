package org.BTOOP.Service;

import org.BTOOP.SinhVien;
import org.BTOOP.SinhVienTuNhien;
import org.BTOOP.SinhVienXaHoi;

import java.util.List;

public interface SinhVienService {

    public Boolean insertSvXH(SinhVienXaHoi svxh, List<SinhVienXaHoi> list );
    public Boolean insertSVTN(SinhVienTuNhien svtn , List<SinhVienTuNhien> list);

    public SinhVienXaHoi updateSvXH(SinhVienXaHoi svxh, List<SinhVienXaHoi> list );
    public SinhVienTuNhien updateSVTN(SinhVienTuNhien svtn , List<SinhVienTuNhien> list);

    public Boolean deleteSvXH(String mssv ,List<SinhVienXaHoi> list );
    public Boolean deleteSVTN(String mssv  , List<SinhVienTuNhien> list);

    public SinhVienXaHoi findByMSSVXH(String mssv, List<SinhVienXaHoi> list );
    public SinhVienTuNhien findByMSSV(String mssv  , List<SinhVienTuNhien> list);

//    public void find(Object obj);


//    public Boolean insertSV (Object obj, List<Object> list);
//    public Boolean updateSV(Object obj , List<Object> list);
//
//    public Boolean deleteSV(Integer id  , List<Object> list);
//
//    public SinhVienXaHoi findByMSSVXH(Integer id, List<SinhVienXaHoi> list );
//    public SinhVienTuNhien findByMSSV(Integer id  , List<SinhVienTuNhien> list);

}
