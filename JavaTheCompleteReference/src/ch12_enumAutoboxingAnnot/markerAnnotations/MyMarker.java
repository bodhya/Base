package ch12_enumAutoboxingAnnot.markerAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//A marker annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}
