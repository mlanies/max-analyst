package androidx.media3.exoplayer.audio;

import defpackage.ms2;
import defpackage.qy5;
import defpackage.wg0;

/* loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final int a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, qy5 qy5Var, boolean z, RuntimeException runtimeException) {
        StringBuilder sbJ = wg0.j("AudioTrack init failed ", i, " Config(", i2, ", ");
        ms2.k(sbJ, i3, ", ", i4, ") ");
        sbJ.append(qy5Var);
        sbJ.append(z ? " (recoverable)" : "");
        super(sbJ.toString(), runtimeException);
        this.a = i;
        this.b = z;
    }
}
