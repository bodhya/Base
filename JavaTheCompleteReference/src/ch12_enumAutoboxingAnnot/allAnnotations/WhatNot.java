package ch12_enumAutoboxingAnnot.allAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface WhatNot {
	String description();
}
