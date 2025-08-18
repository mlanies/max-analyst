package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class b15 extends MediaCodec.Callback {
    public final qi8 a;
    public final boolean b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public final /* synthetic */ d15 k;

    public b15(d15 d15Var) {
        this.k = d15Var;
        this.b = true;
        if (d15Var.c) {
            pq9 pq9Var = d15Var.q;
            bue bueVar = d15Var.p;
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) xi4.a.e(CameraUseInconsistentTimebaseQuirk.class);
            qi8 qi8Var = new qi8();
            qi8Var.o = -1L;
            qi8Var.a = pq9Var;
            qi8Var.b = bueVar;
            qi8Var.c = cameraUseInconsistentTimebaseQuirk;
            this.a = qi8Var;
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) xi4.a.e(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(d15Var.d.getString("mime"))) {
            return;
        }
        this.b = false;
    }

    public final void a() {
        d15 d15Var;
        o05 o05Var;
        Executor executor;
        if (this.e) {
            return;
        }
        this.e = true;
        Future future = this.k.C;
        if (future != null) {
            future.cancel(false);
            this.k.C = null;
        }
        synchronized (this.k.b) {
            d15Var = this.k;
            o05Var = d15Var.r;
            executor = d15Var.s;
        }
        d15Var.l(new v05((Object) this, executor, (Object) o05Var, 1));
    }

    public final void b(e05 e05Var, o05 o05Var, Executor executor) {
        d15 d15Var = this.k;
        d15Var.n.add(e05Var);
        kq0.a(kq0.w(e05Var.X), new imc(this, 17, e05Var), d15Var.h);
        try {
            executor.execute(new kl4(o05Var, 16, e05Var));
        } catch (RejectedExecutionException unused) {
            e05Var.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.k.h.execute(new kl4(this, 13, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.k.h.execute(new l40(i, 8, this));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.k.h.execute(new t05(this, bufferInfo, mediaCodec, i, 1));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.k.h.execute(new kl4(this, 14, mediaFormat));
    }
}
