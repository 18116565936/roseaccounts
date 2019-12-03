package com.caacetc.zhoutianlu.roseaccounts.entities;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface AccountRecordMapper {
    List<AccountRecord> queryAllRecords();

    void addRecord(AccountRecord record);

    void deleteRecord(AccountRecord record);
}
