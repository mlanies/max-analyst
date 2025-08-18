package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class jgf implements Choreographer.FrameCallback, Handler.Callback {
    public static final jgf X = new jgf();
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int o;

    public jgf() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = oaf.a;
        Handler handler = new Handler(looper, this);
        this.b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a = j;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.c = Choreographer.getInstance();
            } catch (RuntimeException e) {
                z04.d0("Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.c;
            if (choreographer != null) {
                int i2 = this.o + 1;
                this.o = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.c;
        if (choreographer2 != null) {
            int i3 = this.o - 1;
            this.o = i3;
            if (i3 == 0) {
                choreographer2.removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
        }
        return true;
    }
}
