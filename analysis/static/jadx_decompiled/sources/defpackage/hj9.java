package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import androidx.media3.muxer.Muxer$MuxerException;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hj9 {
    public static final long x = oaf.S(500);
    public final String a;
    public final cj9 b;
    public final ece c;
    public final boolean d;
    public final SparseArray e;
    public final ScheduledExecutorService f;
    public final qy5 g;
    public final long h;
    public final MediaCodec.BufferInfo i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public long n;
    public ScheduledFuture o;
    public boolean p;
    public fj9 q;
    public int r;
    public boolean s;
    public boolean t;
    public long u;
    public volatile int v;
    public volatile int w;

    public hj9(String str, cj9 cj9Var, ece eceVar, int i, boolean z, qy5 qy5Var, long j) {
        this.a = str;
        this.b = cj9Var;
        this.c = eceVar;
        boolean z2 = false;
        fm9.f(i == 0 || i == 1);
        this.r = i;
        this.d = z;
        if ((i == 0 && qy5Var == null) || (i == 1 && qy5Var != null)) {
            z2 = true;
        }
        fm9.e("appendVideoFormat must be present if and only if muxerMode is MUXER_MODE_MUX_PARTIAL.", z2);
        this.g = qy5Var;
        this.h = j;
        this.e = new SparseArray();
        this.l = -2;
        this.u = -9223372036854775807L;
        this.f = Executors.newSingleThreadScheduledExecutor(new pd3(3, "Muxer:Timer"));
        this.i = new MediaCodec.BufferInfo();
    }

    public static gj9 e(SparseArray sparseArray) {
        if (sparseArray.size() == 0) {
            return null;
        }
        gj9 gj9Var = (gj9) sparseArray.valueAt(0);
        for (int i = 1; i < sparseArray.size(); i++) {
            gj9 gj9Var2 = (gj9) sparseArray.valueAt(i);
            if (gj9Var2.e < gj9Var.e) {
                gj9Var = gj9Var2;
            }
        }
        return gj9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[EDGE_INSN: B:131:0x007e->B:27:0x007e BREAK  A[LOOP:0: B:35:0x0097->B:41:0x00a3], EDGE_INSN: B:135:0x007e->B:27:0x007e BREAK  A[LOOP:1: B:43:0x00a6->B:48:0x00b2]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.qy5 r14) throws androidx.media3.transformer.MuxerWrapper$AppendTrackFormatException {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj9.a(qy5):void");
    }

    public final void b() {
        fm9.k(this.r == 1);
        this.r = 2;
    }

    public final void c(int i) throws Muxer$MuxerException {
        if (i == 0 && this.r == 1) {
            return;
        }
        this.j = false;
        this.f.shutdownNow();
        fj9 fj9Var = this.q;
        if (fj9Var != null) {
            try {
                fj9Var.close();
            } catch (Muxer$MuxerException e) {
                if (i == 1) {
                    String message = e.getMessage();
                    message.getClass();
                    if (message.equals("Failed to stop the MediaMuxer")) {
                        return;
                    }
                }
                throw e;
            }
        }
    }

    public final long d() {
        long length = new File(this.a).length();
        if (length > 0) {
            return length;
        }
        return -1L;
    }

    public final boolean f() {
        if (this.k) {
            return true;
        }
        return this.r == 1 && this.s && (this.t || this.w == 1);
    }

    public final void g() {
        fm9.l(this.q);
        long j = this.h;
        if (j == -9223372036854775807L) {
            return;
        }
        ScheduledFuture scheduledFuture = this.o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.o = this.f.schedule(new nn6(19, this), j, TimeUnit.MILLISECONDS);
    }

    public final boolean h(String str) {
        return this.b.w(ia9.g(str)).contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(int r19, java.nio.ByteBuffer r20, boolean r21, long r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj9.i(int, java.nio.ByteBuffer, boolean, long):boolean");
    }
}
