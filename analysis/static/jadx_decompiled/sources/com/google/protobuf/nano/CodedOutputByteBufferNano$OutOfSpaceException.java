package com.google.protobuf.nano;

import defpackage.wg0;
import java.io.IOException;

/* loaded from: classes.dex */
public class CodedOutputByteBufferNano$OutOfSpaceException extends IOException {
    public CodedOutputByteBufferNano$OutOfSpaceException(int i, int i2) {
        super(wg0.h("CodedOutputStream was writing to a flat byte array and ran out of space (pos ", i, " limit ", i2, ")."));
    }
}
