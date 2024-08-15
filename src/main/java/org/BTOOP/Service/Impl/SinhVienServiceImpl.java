package org.BTOOP.Service.Impl;

import org.BTOOP.Service.SinhVienService;
import org.BTOOP.SinhVien;
import org.BTOOP.SinhVienTuNhien;
import org.BTOOP.SinhVienXaHoi;

import java.rmi.NotBoundException;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    @Override
    public Boolean insertSvXH(SinhVienXaHoi svxh, List<SinhVienXaHoi> list) {
        if(list.add(svxh))
            return true;
        return false;
    }

    @Override
    public Boolean insertSVTN(SinhVienTuNhien svtn, List<SinhVienTuNhien> list) {
       if(list.add(svtn))
       {
           return true;
       }
       else{
           throw new IndexOutOfBoundsException("Ko insert thanh cong");
       }
    }

    @Override
    public SinhVienXaHoi updateSvXH(SinhVienXaHoi svxh, List<SinhVienXaHoi> list) {

      for(SinhVienXaHoi item : list)
      {
          if(item.getMssv() == svxh.getMssv())
          {
              item.setTenSinhvien(svxh.getTenSinhvien());
              item.setGdcd(svxh.getGdcd());
              item.setDia(svxh.getDia());
              item.setSu(svxh.getSu());
              item.setVan(svxh.getVan());
              item.setToan(svxh.getToan());
            return item;
          }
      }
      return null;
    }

    @Override
    public SinhVienTuNhien updateSVTN(SinhVienTuNhien svtn, List<SinhVienTuNhien> list)
    {
        for(SinhVienTuNhien item : list)
        {
            if(item.getMssv() == svtn.getMssv())
            {
                item.setTenSinhvien(svtn.getTenSinhvien());
                item.setSinh(svtn.getSinh());
                item.setLy(svtn.getLy());
                item.setHoa(svtn.getHoa());
                item.setVan(svtn.getVan());
                item.setToan(svtn.getToan());
                return item;
            }
        }
        return null;
    }

    @Override
    public Boolean deleteSvXH(String id, List<SinhVienXaHoi> list)
    {
        for(SinhVienXaHoi item : list)
        {
            if(item.getMssv() == id)
            {
                list.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean deleteSVTN(String id, List<SinhVienTuNhien> list) {
        for(SinhVienTuNhien item : list)
        {
            if(item.getMssv() == id)
            {
                list.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public SinhVienXaHoi findByMSSVXH(String id, List<SinhVienXaHoi> list) {
        for(SinhVienXaHoi item : list)
        {
            if(item.getMssv() == id)
                return item;
        }
        return null;
    }

    @Override
    public SinhVienTuNhien findByMSSV(String id, List<SinhVienTuNhien> list) {
        for(SinhVienTuNhien item : list)
        {
            if(item.getMssv() == id)
                return item;
        }
        return null;
    }
}
