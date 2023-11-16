package ksmart.ks48team02.admin.service.category;

import ksmart.ks48team02.admin.dto.Category;
import ksmart.ks48team02.admin.mapper.category.CategoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    private static final Logger log = LoggerFactory.getLogger(CategoryService.class);

    private static CategoryMapper categoryMapper = null;

    public CategoryService(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    // ajax 카테고리 분류
    public List<Category> getCategoryList(String cateSelect){

        return categoryMapper.getCategoryList(cateSelect);
    }


    // ajax 카테고리 대분류 진열
    public List<Category> getCategoryAdd(){

        return categoryMapper.getCategoryAdd();
    }

    // ajax 중분류 진열
    public List<Category> getCategoryDepth2(String projectPatition){
        return categoryMapper.getCategoryDepth2(projectPatition);
    }
}
