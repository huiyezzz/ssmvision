package cm.hm.mapper;

import cm.hm.dao.Singer;

public interface SingerMapper {
     Singer selectByName(String name);
}