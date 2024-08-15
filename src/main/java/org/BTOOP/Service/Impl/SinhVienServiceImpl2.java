package org.BTOOP.Service.Impl;

import org.BTOOP.Service.SinhVienService;
import org.BTOOP.SinhVienTuNhien;
import org.BTOOP.SinhVienXaHoi;

import java.util.List;

public class SinhVienServiceImpl2 implements SinhVienService {
    @Override
    public Boolean insertSvXH(SinhVienXaHoi svxh, List<SinhVienXaHoi> list) {
        return null;
    }

    @Override
    public Boolean insertSVTN(SinhVienTuNhien svtn, List<SinhVienTuNhien> list) {
        return null;
    }

    @Override
    public SinhVienXaHoi updateSvXH(SinhVienXaHoi svxh, List<SinhVienXaHoi> list) {
        return null;
    }

    @Override
    public SinhVienTuNhien updateSVTN(SinhVienTuNhien svtn, List<SinhVienTuNhien> list) {
        return null;
    }

    @Override
    public Boolean deleteSvXH(String mssv, List<SinhVienXaHoi> list) {
        return null;
    }

    @Override
    public Boolean deleteSVTN(String mssv, List<SinhVienTuNhien> list) {
        for(SinhVienTuNhien item : list)
        {
            if(item.getMssv() == mssv)
            {
                list.remove(item);
                return false;
            }
        }
        return true;
    }

    @Override
    public SinhVienXaHoi findByMSSVXH(String mssv, List<SinhVienXaHoi> list) {
        return null;
    }

    @Override
    public SinhVienTuNhien findByMSSV(String mssv, List<SinhVienTuNhien> list) {
        return null;
    }
}
