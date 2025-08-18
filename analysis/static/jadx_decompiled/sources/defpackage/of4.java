package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class of4 implements mq1, wu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ of4(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public void a() {
        rf4 rf4Var = (rf4) this.a;
        Executor executor = (Executor) this.b;
        agf agfVar = (agf) this.c;
        nx0 nx0Var = (nx0) this.o;
        if (rf4Var.r) {
            Objects.requireNonNull(agfVar);
            executor.execute(new dd4(3, agfVar));
            d54.a();
            return;
        }
        synchronized (rf4Var.o) {
            try {
                jn jnVar = rf4Var.l;
                if (jnVar != null) {
                    nx0Var.v(new mf4(rf4Var, jnVar, 1));
                    rf4Var.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        bm7 bm7VarW;
        jhe jheVar = (jhe) this.a;
        CameraDevice cameraDevice = (CameraDevice) this.b;
        had hadVar = (had) this.c;
        List list = (List) this.o;
        if (jheVar.u.b) {
            Iterator it = jheVar.b.e().iterator();
            while (it.hasNext()) {
                ((ihe) it.next()).j();
            }
        }
        synchronized (jheVar.a) {
            try {
                if (jheVar.l) {
                    bm7VarW = new dw6(1, new CancellationException("Opener is disabled"));
                } else {
                    q40 q40Var = jheVar.b;
                    synchronized (q40Var.b) {
                        ((LinkedHashSet) q40Var.X).add(jheVar);
                    }
                    oq1 oq1VarG = f8.g(new of4(jheVar, list, new rxd(cameraDevice), hadVar));
                    jheVar.g = oq1VarG;
                    kq0.a(oq1VarG, new u5e(jheVar), ju0.k());
                    bm7VarW = kq0.w(jheVar.g);
                }
            } finally {
            }
        }
        return bm7VarW;
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        String str;
        ihe iheVar = (ihe) this.a;
        List list = (List) this.b;
        rxd rxdVar = (rxd) this.c;
        had hadVar = (had) this.o;
        synchronized (iheVar.a) {
            try {
                synchronized (iheVar.a) {
                    synchronized (iheVar.a) {
                        try {
                            List list2 = iheVar.j;
                            if (list2 != null) {
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    ((xf4) it.next()).b();
                                }
                                iheVar.j = null;
                            }
                        } finally {
                        }
                    }
                    if (!list.isEmpty()) {
                        int i = 0;
                        do {
                            try {
                                ((xf4) list.get(i)).d();
                                i++;
                            } catch (DeferrableSurface$SurfaceClosedException e) {
                                for (int i2 = i - 1; i2 >= 0; i2--) {
                                    ((xf4) list.get(i2)).b();
                                }
                                throw e;
                            }
                        } while (i < list.size());
                    }
                    iheVar.j = list;
                }
                c54.p("The openCaptureSessionCompleter can only set once!", iheVar.h == null);
                iheVar.h = lq1Var;
                mw1 mw1Var = (mw1) rxdVar.b;
                mw1Var.getClass();
                SessionConfiguration sessionConfiguration = hadVar.a.a;
                sessionConfiguration.getClass();
                try {
                    ((CameraDevice) mw1Var.b).createCaptureSession(sessionConfiguration);
                    str = "openCaptureSession[session=" + iheVar + "]";
                } catch (CameraAccessException e2) {
                    throw new CameraAccessExceptionCompat(e2);
                }
            } finally {
            }
        }
        return str;
    }
}
