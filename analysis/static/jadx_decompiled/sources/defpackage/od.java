package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes2.dex */
public final class od implements gq1, ri0 {
    public Object X;
    public Object Y;
    public boolean a;
    public Object b;
    public Object c;
    public Object o;

    public static cag b(xv1 xv1Var) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) xv1Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                range = null;
            }
            if (range != null) {
                return new zd(xv1Var);
            }
        }
        c8d c8dVar = new c8d();
        c8dVar.b = null;
        c8dVar.o = null;
        c8dVar.a = xv1Var;
        return c8dVar;
    }

    public IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            g(iOException);
        }
        dp3 dp3Var = (dp3) this.o;
        if (z2) {
            if (iOException != null) {
                dp3Var.getClass();
            } else {
                dp3Var.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                dp3Var.getClass();
            } else {
                dp3Var.getClass();
            }
        }
        return ((b8c) this.c).i(this, z2, z, iOException);
    }

    public wj8 c(int i) {
        HashMap map = (HashMap) this.o;
        wj8 wj8Var = (wj8) map.get(Integer.valueOf(i));
        if (wj8Var != null) {
            return wj8Var;
        }
        wj8 wj8Var2 = (wj8) d(i).get();
        wj8Var2.d((b46) ((mbe) this.Y));
        wj8Var2.b(this.a);
        map.put(Integer.valueOf(i), wj8Var2);
        return wj8Var2;
    }

    public jde d(int i) {
        jde lc4Var;
        jde jdeVar;
        final int i2 = 0;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        HashMap map = (HashMap) this.c;
        jde jdeVar2 = (jde) map.get(Integer.valueOf(i));
        if (jdeVar2 != null) {
            return jdeVar2;
        }
        final q24 q24Var = (q24) this.X;
        q24Var.getClass();
        if (i != 0) {
            if (i == 1) {
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(wj8.class);
                jdeVar = new jde() { // from class: kc4
                    @Override // defpackage.jde
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return oc4.f((Class) genericDeclarationAsSubclass, q24Var);
                            case 1:
                                return oc4.f((Class) genericDeclarationAsSubclass, q24Var);
                            case 2:
                                return oc4.f((Class) genericDeclarationAsSubclass, q24Var);
                            default:
                                return new ynb(q24Var, (va4) ((ra5) ((od) genericDeclarationAsSubclass).b));
                        }
                    }
                };
            } else if (i == 2) {
                final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(wj8.class);
                jdeVar = new jde() { // from class: kc4
                    @Override // defpackage.jde
                    public final Object get() {
                        switch (i4) {
                            case 0:
                                return oc4.f((Class) clsAsSubclass, q24Var);
                            case 1:
                                return oc4.f((Class) clsAsSubclass, q24Var);
                            case 2:
                                return oc4.f((Class) clsAsSubclass, q24Var);
                            default:
                                return new ynb(q24Var, (va4) ((ra5) ((od) clsAsSubclass).b));
                        }
                    }
                };
            } else if (i == 3) {
                lc4Var = new lc4(i2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(wj8.class));
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(zr6.h(i, "Unrecognized contentType: "));
                }
                jdeVar = new jde() { // from class: kc4
                    @Override // defpackage.jde
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return oc4.f((Class) this, q24Var);
                            case 1:
                                return oc4.f((Class) this, q24Var);
                            case 2:
                                return oc4.f((Class) this, q24Var);
                            default:
                                return new ynb(q24Var, (va4) ((ra5) ((od) this).b));
                        }
                    }
                };
            }
            map.put(Integer.valueOf(i), jdeVar);
            return jdeVar;
        }
        final Class clsAsSubclass2 = DashMediaSource$Factory.class.asSubclass(wj8.class);
        lc4Var = new jde() { // from class: kc4
            @Override // defpackage.jde
            public final Object get() {
                switch (i2) {
                    case 0:
                        return oc4.f((Class) clsAsSubclass2, q24Var);
                    case 1:
                        return oc4.f((Class) clsAsSubclass2, q24Var);
                    case 2:
                        return oc4.f((Class) clsAsSubclass2, q24Var);
                    default:
                        return new ynb(q24Var, (va4) ((ra5) ((od) clsAsSubclass2).b));
                }
            }
        };
        jdeVar = lc4Var;
        map.put(Integer.valueOf(i), jdeVar);
        return jdeVar;
    }

    public xic e(boolean z) throws IOException {
        try {
            xic xicVarE = ((u45) this.Y).e(z);
            if (xicVarE != null) {
                xicVarE.m = this;
            }
            return xicVarE;
        } catch (IOException e) {
            ((dp3) this.o).getClass();
            g(e);
            throw e;
        }
    }

    public void f(lq1 lq1Var, gag gagVar) {
        sa0 sa0VarE;
        if (this.a) {
            ((cag) this.Y).f(gagVar.c(), lq1Var);
            ((st1) this.b).A();
            return;
        }
        synchronized (((hag) this.o)) {
            ((hag) this.o).f(1.0f);
            sa0VarE = sa0.e((hag) this.o);
        }
        h(sa0VarE);
        lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
    }

    public void g(IOException iOException) {
        ((v45) this.X).b(iOException);
        f8c f8cVarF = ((u45) this.Y).f();
        b8c b8cVar = (b8c) this.c;
        synchronized (f8cVarF) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(f8cVarF.f != null) || (iOException instanceof ConnectionShutdownException)) {
                        f8cVarF.i = true;
                        if (f8cVarF.l == 0) {
                            f8c.d(b8cVar.A0, f8cVarF.q, iOException);
                            f8cVarF.k++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == 8) {
                    int i = f8cVarF.m + 1;
                    f8cVarF.m = i;
                    if (i > 1) {
                        f8cVarF.i = true;
                        f8cVarF.k++;
                    }
                } else if (((StreamResetException) iOException).a != 9 || !b8cVar.x0) {
                    f8cVarF.i = true;
                    f8cVarF.k++;
                }
            } finally {
            }
        }
    }

    public void h(sa0 sa0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        ci9 ci9Var = (ci9) this.X;
        if (looperMyLooper == mainLooper) {
            ci9Var.k(sa0Var);
        } else {
            ci9Var.i(sa0Var);
        }
    }

    public void i(ph3 ph3Var) {
        kdg kdgVar = (kdg) ((ie6) this.Y).u0.get((zk) this.c);
        if (kdgVar != null) {
            kdgVar.n(ph3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.gq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.b8c r14, defpackage.yic r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od.m(b8c, yic):void");
    }

    @Override // defpackage.gq1
    public void q(b8c b8cVar, IOException iOException) {
        Iterator it;
        try {
            Pattern pattern = qd.d;
            hm9.r("qd", iOException, "exception while download request: %s", (mhc) this.b);
            ad adVar = (ad) ((qd) this.Y).c.a.getValue();
            if (!adVar.a().c()) {
                adVar.g("HTTP_ERROR", iOException.getClass().getSimpleName());
            }
            synchronized (((pd) this.c).a) {
                try {
                    it = ((pd) this.c).a.iterator();
                } catch (Throwable th) {
                    Pattern pattern2 = qd.d;
                    hm9.p("qd", "onFailure: failed to notify listener on exception", th);
                } finally {
                }
                while (it.hasNext()) {
                    ((fq6) it.next()).f();
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.ri0
    public void s(ph3 ph3Var) {
        ((ie6) this.Y).x0.post(new i76((Object) this, (Object) ph3Var, false, 28));
    }
}
