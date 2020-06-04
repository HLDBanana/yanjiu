package com.hanergy.out.service.impl;

import com.hanergy.out.entity.Type;
import com.hanergy.out.dao.TypeMapper;
import com.hanergy.out.service.ITypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Han LiDong
 * @since 2020-04-09
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
