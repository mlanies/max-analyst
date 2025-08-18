package defpackage;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class n74 extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n74(Object obj, ConditionVariable conditionVariable, int i) {
        super("ExoPlayer:SimpleCacheInit");
        this.a = i;
        this.c = obj;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d84 d84Var = (d84) this.c;
                AudioTrack audioTrack = (AudioTrack) this.b;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    return;
                } finally {
                    d84Var.h.open();
                }
            case 1:
                synchronized (((rpd) this.c)) {
                    ((ConditionVariable) this.b).open();
                    rpd.a((rpd) this.c);
                    ((rpd) this.c).b.getClass();
                }
                return;
            default:
                synchronized (((spd) this.c)) {
                    ((ConditionVariable) this.b).open();
                    spd.a((spd) this.c);
                    ((spd) this.c).b.getClass();
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n74(d84 d84Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.a = 0;
        this.c = d84Var;
        this.b = audioTrack;
    }
}
