package com.weicai.springboot;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName WeicaiImportSelector
 * @Description
 * @Author weicai.yan
 * @Date 2022/11/7 21:33
 * @Version 1.0
 **/
public class WeicaiImportSelector implements DeferredImportSelector {
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		String[] name = new String[1];
		name[0] = WebServerAutoConfiguration.class.getName();
		return name;
	}
}
