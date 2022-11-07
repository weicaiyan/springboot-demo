package com.weicai.springboot;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @ClassName WeicaiImportSelector
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/7 21:33
 * @Version 1.0
 **/
public class WeicaiImportSelector implements DeferredImportSelector {
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// 自动配置
		ServiceLoader<AutoConfiguration> loader = ServiceLoader.load(AutoConfiguration.class);
		List<String> list = new ArrayList<String>();
		for (AutoConfiguration configuration : loader) {
			list.add(configuration.getClass().getName());
		}
		return list.toArray(new String[0]);
	}
}
