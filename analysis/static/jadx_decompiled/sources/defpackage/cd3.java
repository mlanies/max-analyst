package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class cd3 implements pgf {
    public static final cs A0 = new cs(1);
    public final t8b X;
    public final she Y;
    public final CopyOnWriteArraySet Z;
    public final Context a;
    public final bd3 b;
    public final cgf c;
    public final lgf o;
    public qy5 s0;
    public q75 t0;
    public bie u0;
    public s8b v0;
    public Pair w0;
    public int x0;
    public int y0;
    public long z0;

    public cd3(od odVar) {
        Context context = (Context) odVar.b;
        this.a = context;
        bd3 bd3Var = new bd3(this, context);
        this.b = bd3Var;
        she sheVar = (she) odVar.Y;
        this.Y = sheVar;
        cgf cgfVar = (cgf) odVar.c;
        this.c = cgfVar;
        cgfVar.l = sheVar;
        this.o = new lgf(new o9g(10, this), cgfVar);
        zc3 zc3Var = (zc3) odVar.X;
        fm9.l(zc3Var);
        this.X = zc3Var;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.Z = copyOnWriteArraySet;
        this.y0 = 0;
        copyOnWriteArraySet.add(bd3Var);
    }

    @Override // defpackage.pgf
    public final void F(long j) {
        if (this.x0 > 0) {
            return;
        }
        long j2 = j - this.z0;
        lgf lgfVar = this.o;
        jlf jlfVar = lgfVar.g;
        if (jlfVar != null) {
            lgfVar.d.a(j2, jlfVar);
            lgfVar.g = null;
        }
        lgfVar.f.e(j2);
    }

    public final void a(Surface surface, int i, int i2) {
        if (this.v0 != null) {
            this.v0.m(surface != null ? new jee(surface, i, i2, 0) : null);
            this.c.h(surface);
        }
    }

    public final void b(long j, long j2) {
        cd3 cd3Var = this;
        if (cd3Var.x0 != 0) {
            return;
        }
        while (true) {
            lgf lgfVar = cd3Var.o;
            uy uyVar = lgfVar.f;
            if (uyVar.o == 0) {
                return;
            }
            long jF = uyVar.f();
            Long l = (Long) lgfVar.e.f(jF);
            cgf cgfVar = lgfVar.b;
            if (l != null && l.longValue() != lgfVar.i) {
                lgfVar.i = l.longValue();
                cgfVar.d(2);
            }
            int iA = lgfVar.b.a(jF, j, j2, lgfVar.i, false, lgfVar.c);
            o9g o9gVar = lgfVar.a;
            if (iA == 0 || iA == 1) {
                lgfVar.j = jF;
                boolean z = iA == 0;
                long jH = uyVar.h();
                jlf jlfVar = (jlf) lgfVar.d.f(jH);
                if (jlfVar != null && !jlfVar.equals(jlf.e) && !jlfVar.equals(lgfVar.h)) {
                    lgfVar.h = jlfVar;
                    o9gVar.getClass();
                    ny5 ny5Var = new ny5();
                    ny5Var.s = jlfVar.a;
                    ny5Var.t = jlfVar.b;
                    ny5Var.m = ia9.l("video/raw");
                    qy5 qy5Var = new qy5(ny5Var);
                    cd3 cd3Var2 = (cd3) o9gVar.b;
                    cd3Var2.s0 = qy5Var;
                    Iterator it = cd3Var2.Z.iterator();
                    while (it.hasNext()) {
                        bd3 bd3Var = (bd3) it.next();
                        bd3Var.p.execute(new ad3(bd3Var, bd3Var.o, jlfVar));
                    }
                }
                long j3 = z ? -1L : lgfVar.c.c;
                boolean z2 = cgfVar.e != 3;
                cgfVar.e = 3;
                cgfVar.l.getClass();
                cgfVar.g = oaf.S(SystemClock.elapsedRealtime());
                cd3 cd3Var3 = (cd3) o9gVar.b;
                if (z2 && cd3Var3.w0 != null) {
                    Iterator it2 = cd3Var3.Z.iterator();
                    while (it2.hasNext()) {
                        bd3 bd3Var2 = (bd3) it2.next();
                        bd3Var2.p.execute(new ad3(bd3Var2, bd3Var2.o, 2));
                    }
                }
                if (cd3Var3.t0 != null) {
                    if (cd3Var3.s0 == null) {
                        new ny5().a();
                    }
                    q75 q75Var = cd3Var3.t0;
                    cd3Var3.Y.getClass();
                    q75Var.d(jH, System.nanoTime());
                }
                s8b s8bVar = cd3Var3.v0;
                fm9.l(s8bVar);
                rf4 rf4Var = (rf4) s8bVar.b(s8bVar.z0);
                fm9.j("Calling this method is not allowed when renderFramesAutomatically is enabled", !rf4Var.h);
                rf4Var.e.w(new gf4(rf4Var, j3, 1));
            } else {
                if (iA != 2 && iA != 3 && iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                lgfVar.j = jF;
                uyVar.h();
                cd3 cd3Var4 = (cd3) o9gVar.b;
                Iterator it3 = cd3Var4.Z.iterator();
                while (it3.hasNext()) {
                    bd3 bd3Var3 = (bd3) it3.next();
                    bd3Var3.p.execute(new ad3(bd3Var3, bd3Var3.o, 1));
                }
                s8b s8bVar2 = cd3Var4.v0;
                fm9.l(s8bVar2);
                rf4 rf4Var2 = (rf4) s8bVar2.b(s8bVar2.z0);
                fm9.j("Calling this method is not allowed when renderFramesAutomatically is enabled", !rf4Var2.h);
                rf4Var2.e.w(new gf4(rf4Var2, -2L, 1));
            }
            cd3Var = this;
        }
    }

    @Override // defpackage.pgf
    public final void c(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            bd3 bd3Var = (bd3) it.next();
            bd3Var.p.execute(new f5(bd3Var, bd3Var.o, videoFrameProcessingException, 16));
        }
    }

    @Override // defpackage.pgf
    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.pgf
    public final void o(int i, int i2) {
        lgf lgfVar = this.o;
        lgfVar.getClass();
        jlf jlfVar = new jlf(i, i2);
        if (oaf.a(lgfVar.g, jlfVar)) {
            return;
        }
        lgfVar.g = jlfVar;
    }
}
