package org.zerock.mapper;

import org.apache.ibatis.annotations.Insert;

public class Sample2Mapper {

    @Insert("insert into tbl_sample2 (col2) values (#{data})")
    public int insertCol2(String data);
}
