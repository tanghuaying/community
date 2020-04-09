package life.majiang.community.mapper;

import life.majiang.community.modle.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into mj_user(name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},to_date(#{gmtCreate},'YYYY-MM-DD HH24:mi:ss'),to_date(#{gmtModified},'YYYY-MM-DD HH24:mi:ss'))")
    void insert(User user);
}
