package defpackage;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class yx implements jde {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ yx(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.jde
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(zx.c(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(ay.q(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 2:
                return new HandlerThread(zx.c(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(ay.q(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
