package com.aspect;

import com.service.Encoreable;
import com.service.impl.DefaultEncoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by XiuYin.Cui on 2017/12/14.
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.service.CompactDisc+",
              defaultImpl = DefaultEncoreable.class) //value 表示要嵌入哪些目标类的代理 。 defaultImpl：表示要嵌入的接口的默认实现方法
    public static Encoreable encoreable;
}
