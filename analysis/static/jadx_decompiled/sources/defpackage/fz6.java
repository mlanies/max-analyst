package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class fz6 implements hq7, sx3 {
    public static final String E0 = hq7.class.getSimpleName();
    public final ConcurrentHashMap A0;
    public final ConcurrentHashMap B0;
    public vxd C0;
    public final Object D0;
    public final je7 X;
    public final q0e Y;
    public final t03 Z;
    public final /* synthetic */ ContextScope a;
    public final ox3 b;
    public final kke c;
    public final ContentResolver o;
    public final q0e s0;
    public final q0e t0;
    public final t03 u0;
    public final q0e v0;
    public final ac w0;
    public final AtomicInteger x0;
    public x77 y0;
    public final AtomicInteger z0;

    public fz6(Context context, ox3 ox3Var, kke kkeVar, je7 je7Var) {
        this.a = j1e.a(f46.a().plus(((w9a) kkeVar).b()));
        this.b = ox3Var;
        this.c = kkeVar;
        this.o = context.getContentResolver();
        this.X = je7Var;
        q0e q0eVarA = r0e.a(new b86(x76.a, 0, false, true));
        this.Y = q0eVarA;
        this.Z = new t03(new w7c(q0eVarA), 15);
        this.s0 = r0e.a(new b86(y76.a, 0, false, false));
        q0e q0eVarA2 = r0e.a(new b86(w76.a, 0, false, true));
        this.t0 = q0eVarA2;
        this.u0 = new t03(new w7c(q0eVarA2), 16);
        q0e q0eVarA3 = r0e.a(null);
        this.v0 = q0eVarA3;
        this.w0 = new ac(new t03(q0eVarA3, 11), 25, this);
        this.x0 = new AtomicInteger(0);
        this.z0 = new AtomicInteger(-1);
        this.A0 = new ConcurrentHashMap();
        this.B0 = new ConcurrentHashMap();
        f04 f04Var = new f04(this);
        Iterator it = y53.M(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.INTERNAL_CONTENT_URI, MediaStore.Video.Media.INTERNAL_CONTENT_URI).iterator();
        while (it.hasNext()) {
            try {
                this.o.registerContentObserver((Uri) it.next(), true, f04Var);
            } catch (Throwable th) {
                this.b.g(hz4.a, th);
            }
        }
        bkg bkgVar = new bkg(14, this);
        es3 es3Var = new es3(26, this);
        ox3 ox3Var2 = this.b;
        kke kkeVar2 = this.c;
        l84 l84Var = new l84();
        l84Var.a = this;
        l84Var.b = ox3Var2;
        l84Var.c = bkgVar;
        l84Var.d = es3Var;
        hm9.n("l84", "init");
        j47.T(this, ((w9a) kkeVar2).c().plus(ox3Var2), null, new fy7(l84Var, null), 2);
        this.D0 = new Object();
    }

    public static final Object a(a86 a86Var, fz6 fz6Var, Continuation continuation) {
        return j47.t0(((w9a) fz6Var.c).b(), new dz6(a86Var, fz6Var, null), continuation);
    }

    public final boolean b(b86 b86Var) {
        List list;
        return (b86Var.b == 0 || (list = (List) this.A0.get(b86Var.a)) == null || list.size() >= b86Var.b) ? false : true;
    }

    public final List c(a86 a86Var) {
        List list = (List) this.A0.get(a86Var);
        return list == null ? nz4.a : list;
    }

    public final Object d(b86 b86Var, int i, Continuation continuation) {
        return j47.t0(((w9a) this.c).b(), new uy6(b86Var, i, this, null), continuation);
    }

    public final void e() {
        vxd vxdVar;
        synchronized (this.D0) {
            try {
                hm9.n(E0, "onContentChanged()");
                vxd vxdVar2 = this.C0;
                if (vxdVar2 != null && vxdVar2.isActive() && (vxdVar = this.C0) != null) {
                    vxdVar.cancel((CancellationException) null);
                }
                this.C0 = j47.T(this, this.b, null, new vy6(this, null), 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        x77 x77Var = this.y0;
        AtomicInteger atomicInteger = this.x0;
        String str = E0;
        if (x77Var != null) {
            int i = atomicInteger.get();
            x77 x77Var2 = this.y0;
            Boolean boolValueOf = x77Var2 != null ? Boolean.valueOf(x77Var2.isActive()) : null;
            x77 x77Var3 = this.y0;
            hm9.n(str, "prefetch " + i + " is not null, prefetchJob.isActive = " + boolValueOf + ", prefetchJob.isCompleted = " + (x77Var3 != null ? Boolean.valueOf(x77Var3.isCompleted()) : null));
            return;
        }
        if (!((eua) this.X.getValue()).c()) {
            hm9.n(str, "permission is not granted");
            return;
        }
        final int iIncrementAndGet = atomicInteger.incrementAndGet();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        hm9.n(str, "prefetch " + iIncrementAndGet + " start");
        vxd vxdVarT = j47.T(this, this.b, null, new zy6(this, iIncrementAndGet, null), 2);
        vxdVarT.invokeOnCompletion(new m56() { // from class: fy6
            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                String str2 = fz6.E0;
                int i2 = iIncrementAndGet;
                if (th == null) {
                    hm9.n(str2, "prefetch " + i2 + " completed, all time = " + jElapsedRealtime2 + "ms");
                } else {
                    hm9.p(str2, "prefetch " + i2 + " completion error, all time = " + jElapsedRealtime2 + "ms", th);
                }
                return e5f.a;
            }
        });
        this.y0 = vxdVarT;
    }

    @Override // defpackage.sx3
    public final lx3 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
