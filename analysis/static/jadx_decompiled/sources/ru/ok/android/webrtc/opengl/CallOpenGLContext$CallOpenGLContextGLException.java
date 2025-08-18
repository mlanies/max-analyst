package ru.ok.android.webrtc.opengl;

import defpackage.rh4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/ok/android/webrtc/opengl/CallOpenGLContext$CallOpenGLContextGLException", "Lru/ok/android/webrtc/opengl/CallOpenGLContext$CallOpenGLContextException;", "webrtc-android-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class CallOpenGLContext$CallOpenGLContextGLException extends CallOpenGLContext$CallOpenGLContextException {
    public CallOpenGLContext$CallOpenGLContextGLException(int i, String str) {
        super(rh4.j(str, ": 0x", Integer.toHexString(i)));
    }
}
