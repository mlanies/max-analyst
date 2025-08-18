package defpackage;

import android.os.SystemClock;
import org.webrtc.Size;

/* loaded from: classes2.dex */
public final class qx1 implements rx1 {
    public final a4c a;
    public final cue b = new cue();
    public volatile Size c = new Size(0, 0);
    public long d = SystemClock.elapsedRealtime();

    public qx1(a4c a4cVar) {
        this.a = a4cVar;
    }

    public final String toString() {
        return "fps estimation: " + this.b.b() + ", frame size: " + this.c;
    }
}
