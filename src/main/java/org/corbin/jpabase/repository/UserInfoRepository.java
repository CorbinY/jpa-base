package org.corbin.jpabase.repository;

import org.corbin.jpabase.base.BaseRepository;
import org.corbin.jpabase.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author yin
 * @date 2019/06/15
 */
@Repository
public interface UserInfoRepository extends BaseRepository<UserInfo,Long> {

}
