package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c84 {
    public final Handler a = new Handler(Looper.myLooper());
    public final b84 b = new b84(1, this);
    public final /* synthetic */ e84 c;

    public c84(e84 e84Var) {
        this.c = e84Var;
    }

    public void a(AudioTrack audioTrack) {
        Handler handler = this.a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new a84(handler, 0), this.b);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
