package ch12_enumAutoboxingAnnot.typeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//An annotation that can be applied to a field declaration.
@Target(ElementType.FIELD)
@interface EmptyOK {
}
