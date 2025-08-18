package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

/* loaded from: classes2.dex */
public class MessageStringCodingException extends MessagePackException {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (CharacterCodingException) super.getCause();
    }
}
