package org.msgpack.core;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class MessageIntegerOverflowException extends MessageTypeException {
    public final BigInteger a;

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a.toString();
    }
}
