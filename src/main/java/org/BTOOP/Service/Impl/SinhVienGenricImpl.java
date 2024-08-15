package org.BTOOP.Service.Impl;

import org.BTOOP.Service.SinhVienGeneric;
import org.BTOOP.SinhVienXaHoi;

import java.util.List;

public class SinhVienGenricImpl implements SinhVienGeneric<SinhVienXaHoi , List<SinhVienXaHoi>> {


    @Override
    public SinhVienXaHoi insert(SinhVienXaHoi obj, List<SinhVienXaHoi> list) {
        if(list.add(obj))
            return obj;
        return null;
    }

    @Override
    public SinhVienXaHoi update(SinhVienXaHoi obj, List<SinhVienXaHoi> list) {
        for(SinhVienXaHoi item : list)
        {
            if(item.getMssv() == obj.getMssv())
            {
                item.setTenSinhvien(obj.getTenSinhvien());
                item.setGdcd(obj.getGdcd());
                item.setDia(obj.getDia());
                item.setSu(obj.getSu());
                item.setVan(obj.getVan());
                item.setToan(obj.getToan());
                return item;
            }
        }
        return null;
    }
}
