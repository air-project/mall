package com.icoding.mapper;

import com.icoding.my.mapper.MyMapper;
import com.icoding.pojo.Category;
import com.icoding.vo.SecondLevelCategoryVO;

import java.util.List;

public interface CategoryMapper extends MyMapper<Category> {
  List<Category> queryCategoryByType(Integer type);
  List<SecondLevelCategoryVO> queryCategoryByFatherId(Integer fatherId);
}
