package org.BTOOP.Service;

import org.BTOOP.SinhVienXaHoi;

import java.util.HashMap;

public interface SinhVienGeneric<T,S> {

    T insert(T obj , S list);

    T update(T obj, S list);

}
