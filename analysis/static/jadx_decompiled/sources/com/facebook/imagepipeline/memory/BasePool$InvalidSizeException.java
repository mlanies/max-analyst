package com.facebook.imagepipeline.memory;

/* loaded from: classes.dex */
public class BasePool$InvalidSizeException extends RuntimeException {
    public BasePool$InvalidSizeException(Integer num) {
        super("Invalid size: " + num.toString());
    }
}
