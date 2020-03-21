package com.edu.mju.ugomall.mapper;

import com.edu.mju.ugomall.entity.Category;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 类目表(Category)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-29 21:09:31
 */
public interface CategoryMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Category queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Category> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param category 实例对象
     * @return 对象列表
     */
    List<Category> queryAll(Category category);

    /**
     * 新增数据
     *
     * @param category 实例对象
     * @return 影响行数
     */
    int insert(Category category);

    /**
     * 修改数据
     *
     * @param category 实例对象
     * @return 影响行数
     */
    int update(Category category);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);




    /**
     * 带分页的查询方法
     * @return
     */
    List<Category> getList();

    /**
     * 批量删除+单个删除
     *
     * @param ids
     * @return
     */
    int deleteByBatch(@Param("ids") String[] ids);

}