package com.weicai.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @ClassName WebCondition
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/6 21:57
 * @Version 1.0
 **/
public class WebCondition implements Condition {
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());
		String className = (String) annotationAttributes.get("value");
		try {
			context.getClassLoader().loadClass(className);
			return true;
		} catch (ClassNotFoundException e) {
			return false;
		}
	}
}
