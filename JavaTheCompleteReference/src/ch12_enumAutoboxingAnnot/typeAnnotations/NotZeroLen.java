package ch12_enumAutoboxingAnnot.typeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}
