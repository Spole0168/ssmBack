/** 
 * 
 * @author geloin 
 * @date 2012-5-5 上午10:26:34 
 */  
package com.geloin.spring.mapper;  
  
import java.util.List;  
  
import org.apache.ibatis.annotations.Param;  
import org.apache.ibatis.annotations.Result;  
import org.apache.ibatis.annotations.Results;  
import org.apache.ibatis.annotations.Select;  
import org.springframework.stereotype.Repository;  
  
import com.geloin.spring.entity.Menu;  
  
/** 
 *  
 * @author geloin 
 * @date 2012-5-5 上午10:26:34 
 */  
@Repository(value = "menuMapper")  
public interface MenuMapper {  
  
    @Select(value = "${sql}")  
    @Results(value = { @Result(id = true, property = "id", column = "id"),  
            @Result(property = "parentId", column = "c_parent_id"),  
            @Result(property = "url", column = "c_url"),  
            @Result(property = "isShowLeft", column = "c_is_show_left"),  
            @Result(property = "name", column = "c_name") })  
    List<Menu> operateReturnBeans(@Param(value = "sql") String sql);  
}  