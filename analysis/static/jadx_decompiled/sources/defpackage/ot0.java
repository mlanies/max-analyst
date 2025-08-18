package defpackage;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;

/* loaded from: classes.dex */
public final /* synthetic */ class ot0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt0 b;

    public /* synthetic */ ot0(qt0 qt0Var, int i) {
        this.a = i;
        this.b = qt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qt0 qt0Var = this.b;
        switch (i) {
            case 0:
                qt0Var.k.set(false);
                qt0Var.g.stop();
                synchronized (qt0Var.e) {
                    qt0Var.f = null;
                    qt0Var.c.clear();
                }
                return;
            case 1:
                qt0Var.getClass();
                try {
                    qt0Var.g.start();
                    if (qt0Var.k.getAndSet(true)) {
                        return;
                    }
                    qt0Var.c();
                    return;
                } catch (AudioStream$AudioStreamException e) {
                    throw new RuntimeException(e);
                }
            case 2:
                qt0Var.c();
                return;
            default:
                qt0Var.k.set(false);
                qt0Var.g.release();
                synchronized (qt0Var.e) {
                    qt0Var.f = null;
                    qt0Var.c.clear();
                }
                return;
        }
    }
}
