package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bd3 {
    public final Context a;
    public final int b;
    public final ArrayList c;
    public z18 d;
    public bgf e;
    public qy5 f;
    public int g;
    public long h;
    public long i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;
    public long n;
    public hlf o;
    public Executor p;
    public final /* synthetic */ cd3 q;

    public bd3(cd3 cd3Var, Context context) {
        this.q = cd3Var;
        this.a = context;
        this.b = oaf.M(context) ? 1 : 5;
        this.c = new ArrayList();
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = hlf.r0;
        this.p = cd3.A0;
    }

    public final void a(boolean z) throws InterruptedException {
        if (c()) {
            rf4 rf4Var = (rf4) this.e;
            nx0 nx0Var = rf4Var.e;
            s27 s27Var = rf4Var.d;
            if (s27Var.k != null) {
                try {
                    nx0Var.b();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    v2 v2Var = s27Var.k;
                    fm9.l(v2Var);
                    v2Var.u();
                    nf4 nf4Var = new nf4(0, countDownLatch);
                    synchronized (v2Var.b) {
                        v2Var.c = nf4Var;
                    }
                    rk5 rk5Var = rf4Var.i;
                    Objects.requireNonNull(rk5Var);
                    nx0Var.v(new nf4(1, rk5Var));
                    countDownLatch.await();
                    synchronized (v2Var.b) {
                        v2Var.c = null;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        this.m = false;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        cd3 cd3Var = this.q;
        if (cd3Var.y0 == 1) {
            cd3Var.x0++;
            cd3Var.o.a();
            bie bieVar = cd3Var.u0;
            fm9.l(bieVar);
            bieVar.d(new cu1(17, cd3Var));
        }
        if (z) {
            cgf cgfVar = cd3Var.c;
            kgf kgfVar = cgfVar.b;
            kgfVar.k = 0L;
            kgfVar.n = -1L;
            kgfVar.l = -1L;
            cgfVar.h = -9223372036854775807L;
            cgfVar.f = -9223372036854775807L;
            cgfVar.d(1);
            cgfVar.i = -9223372036854775807L;
        }
    }

    public final void b(qy5 qy5Var) throws VideoSink$VideoSinkException {
        i63 i63Var;
        fm9.k(!c());
        cd3 cd3Var = this.q;
        fm9.k(cd3Var.y0 == 0);
        i63 i63Var2 = qy5Var.A;
        if (i63Var2 == null || !i63Var2.e()) {
            i63Var2 = i63.h;
        }
        if (i63Var2.c != 7 || oaf.a >= 34) {
            i63Var = i63Var2;
        } else {
            g63 g63VarA = i63Var2.a();
            g63VarA.c = 6;
            i63Var = new i63(g63VarA.a, g63VarA.b, g63VarA.c, g63VarA.e, g63VarA.f, g63VarA.d);
        }
        Looper looperMyLooper = Looper.myLooper();
        fm9.l(looperMyLooper);
        bie bieVarA = cd3Var.Y.a(looperMyLooper, null);
        cd3Var.u0 = bieVarA;
        try {
            cd3Var.v0 = cd3Var.X.a(cd3Var.a, i63Var, cd3Var, new wc3(bieVarA, 0), ffc.X);
            Pair pair = cd3Var.w0;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                lsd lsdVar = (lsd) pair.second;
                cd3Var.a(surface, lsdVar.a, lsdVar.b);
            }
            cd3Var.v0.c(0);
            cd3Var.y0 = 1;
            this.e = cd3Var.v0.b(0);
        } catch (VideoFrameProcessingException e) {
            throw new VideoSink$VideoSinkException(e, qy5Var);
        }
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d() {
        if (this.f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        z18 z18Var = this.d;
        if (z18Var != null) {
            arrayList.add(z18Var);
        }
        arrayList.addAll(this.c);
        qy5 qy5Var = this.f;
        qy5Var.getClass();
        bgf bgfVar = this.e;
        fm9.l(bgfVar);
        int i = this.g;
        i63 i63Var = qy5Var.A;
        if (i63Var == null || !i63Var.e()) {
            i63Var = i63.h;
        }
        i63 i63Var2 = i63Var;
        rf4 rf4Var = (rf4) bgfVar;
        rf4Var.c(i, arrayList, new t26(i63Var2, qy5Var.t, qy5Var.u, qy5Var.x, 0L));
        this.k = -9223372036854775807L;
    }

    public final void e(long j, long j2) throws VideoSink$VideoSinkException {
        try {
            this.q.b(j, j2);
        } catch (ExoPlaybackException e) {
            qy5 qy5VarA = this.f;
            if (qy5VarA == null) {
                qy5VarA = new ny5().a();
            }
            throw new VideoSink$VideoSinkException(e, qy5VarA);
        }
    }

    public final void f(Surface surface, lsd lsdVar) {
        cd3 cd3Var = this.q;
        Pair pair = cd3Var.w0;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((lsd) cd3Var.w0.second).equals(lsdVar)) {
            return;
        }
        cd3Var.w0 = Pair.create(surface, lsdVar);
        cd3Var.a(surface, lsdVar.a, lsdVar.b);
    }
}
