package com.customAnnotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface FrameworkAnnotation {
	
	public  String[] author();
	//public  String[] testCategory();
	public String[] category();

}
