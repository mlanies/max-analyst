package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;
import defpackage.ab7;

/* loaded from: classes.dex */
public abstract class StreamReadException extends JsonProcessingException {
    public StreamReadException(ab7 ab7Var, String str) {
        super(str, ab7Var == null ? null : ab7Var.o(), null);
    }
}
