package com.google.protobuf.nano;

import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferNanoException extends IOException {
    public static InvalidProtocolBufferNanoException a() {
        return new InvalidProtocolBufferNanoException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
