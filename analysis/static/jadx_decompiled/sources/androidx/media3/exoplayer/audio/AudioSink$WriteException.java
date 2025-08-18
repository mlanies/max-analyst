package androidx.media3.exoplayer.audio;

import defpackage.qy5;
import defpackage.zr6;

/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final int a;
    public final boolean b;
    public final qy5 c;

    public AudioSink$WriteException(int i, qy5 qy5Var, boolean z) {
        super(zr6.h(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = qy5Var;
    }
}
