package com.google.android.exoplayer2.audio;

import defpackage.oy5;
import defpackage.zr6;

/* loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final boolean a;
    public final oy5 b;

    public AudioSink$InitializationException(int i, int i2, int i3, int i4, oy5 oy5Var, boolean z, RuntimeException runtimeException) {
        String str = z ? " (recoverable)" : "";
        StringBuilder sb = new StringBuilder(str.length() + 80);
        sb.append("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        super(zr6.l(sb, ")", str), runtimeException);
        this.a = z;
        this.b = oy5Var;
    }
}
