package defpackage;

import android.text.TextUtils;
import androidx.camera.core.CameraControl$OperationCanceledException;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import one.me.chats.search.ChatsListSearchScreen;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class u60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u60(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        hb0 hb0VarT;
        hb0 hb0VarG;
        int i = 3;
        int i2 = 4;
        boolean z = true;
        ScheduledFuture scheduledFuture = null;
        switch (this.a) {
            case 0:
                ph4 ph4Var = (ph4) this.c;
                ph4Var.getClass();
                int i3 = maf.a;
                t75 t75Var = ((n75) ph4Var.b).a;
                boolean z2 = t75Var.f1;
                boolean z3 = this.b;
                if (z2 == z3) {
                    return;
                }
                t75Var.f1 = z3;
                t75Var.x0.i(23, new l01(z3, i2));
                return;
            case 1:
                qz7 qz7Var = (qz7) this.c;
                qz7Var.getClass();
                int i4 = oaf.a;
                u75 u75Var = ((o75) qz7Var.c).a;
                boolean z4 = u75Var.i1;
                boolean z5 = this.b;
                if (z4 == z5) {
                    return;
                }
                u75Var.i1 = z5;
                u75Var.x0.f(23, new l01(z5, i));
                return;
            case 2:
                adc adcVar = (adc) ((l7b) this.c).c;
                boolean z6 = adcVar.X;
                boolean z7 = this.b;
                if (z6 != z7) {
                    adcVar.X = z7;
                    adcVar.H();
                    return;
                }
                return;
            case 3:
                e70 e70Var = (e70) ((ey1) this.c).b;
                e70Var.q = this.b;
                if (e70Var.g == 2) {
                    e70Var.a();
                    return;
                }
                return;
            case 4:
                CallsAudioManagerV3Impl.updateProximityTrackingState$lambda$10(this.b, (CallsAudioManagerV3Impl) this.c);
                return;
            case 5:
                ks1 ks1Var = (ks1) this.c;
                boolean z8 = this.b;
                ks1Var.e();
                if (ks1Var.s0 != 0) {
                    return;
                }
                long j = ks1Var.c.a.a;
                Iterator it = ks1Var.o.iterator();
                long j2 = Long.MAX_VALUE;
                while (it.hasNext()) {
                    long j3 = ((es8) it.next()).a.o;
                    if (j3 < j2) {
                        j2 = j3;
                    }
                }
                long j4 = j2 - 1;
                hm9.n("ks1", "loadNext: from db from: " + nu0.G(Long.valueOf(j)) + " to: " + nu0.G(Long.valueOf(j4)));
                ArrayList arrayListM = ks1Var.x0.m(j, j4);
                ks1Var.b(ks1Var.o.size(), arrayListM);
                hm9.n("ks1", "loadNext: loaded from db: " + arrayListM.size() + " messages");
                ks1Var.b = arrayListM.isEmpty();
                ks1Var.f();
                if (z8 && arrayListM.size() < 100 && ks1Var.c.o) {
                    ks1Var.d();
                    return;
                }
                return;
            case 6:
                nx0 nx0Var = (nx0) this.c;
                boolean z9 = nx0Var.b;
                boolean z10 = this.b;
                if (z9 == z10) {
                    return;
                }
                nx0Var.b = z10;
                if (z10) {
                    if (nx0Var.Y) {
                        st1 st1Var = (st1) nx0Var.c;
                        st1Var.getClass();
                        kq0.w(f8.g(new ync(22, st1Var))).d(new b(27, nx0Var), (Executor) nx0Var.o);
                        nx0Var.Y = false;
                        return;
                    }
                    return;
                }
                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                lq1 lq1Var = (lq1) nx0Var.s0;
                if (lq1Var != null) {
                    lq1Var.d(cameraControl$OperationCanceledException);
                    nx0Var.s0 = null;
                    return;
                }
                return;
            case 7:
                fu1 fu1Var = (fu1) this.c;
                boolean z11 = this.b;
                fu1Var.N0 = z11;
                if (z11 && fu1Var.S0 == 4) {
                    fu1Var.I(false);
                    return;
                }
                return;
            case 8:
                bc7[] bc7VarArr = ChatsListSearchScreen.J0;
                if (this.b) {
                    ((ChatsListSearchScreen) this.c).q0();
                    return;
                }
                return;
            case 9:
                il5 il5Var = (il5) this.c;
                boolean z12 = this.b;
                il5Var.getClass();
                Object obj = il5.m;
                synchronized (obj) {
                    try {
                        fl5 fl5Var = il5Var.a;
                        fl5Var.a();
                        qz7 qz7VarG = qz7.g(fl5Var.a);
                        try {
                            hb0VarT = il5Var.c.t();
                            if (qz7VarG != null) {
                                qz7VarG.V();
                            }
                        } catch (Throwable th) {
                            if (qz7VarG != null) {
                                qz7VarG.V();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i5 = hb0VarT.b;
                    if (i5 == 5) {
                        hb0VarG = il5Var.g(hb0VarT);
                    } else {
                        if ((i5 == 3 ? 1 : 0) != 0) {
                            hb0VarG = il5Var.g(hb0VarT);
                        } else {
                            if (!z12 && !il5Var.d.a(hb0VarT)) {
                                return;
                            }
                            hb0VarG = il5Var.b(hb0VarT);
                        }
                    }
                    synchronized (obj) {
                        try {
                            fl5 fl5Var2 = il5Var.a;
                            fl5Var2.a();
                            qz7 qz7VarG2 = qz7.g(fl5Var2.a);
                            try {
                                il5Var.c.r(hb0VarG);
                                if (qz7VarG2 != null) {
                                    qz7VarG2.V();
                                }
                            } catch (Throwable th2) {
                                if (qz7VarG2 != null) {
                                    qz7VarG2.V();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (il5Var) {
                        if (il5Var.k.size() != 0 && !TextUtils.equals(hb0VarT.a, hb0VarG.a)) {
                            Iterator it2 = il5Var.k.iterator();
                            if (it2.hasNext()) {
                                au1.r(it2.next());
                                throw null;
                            }
                        }
                    }
                    if (hb0VarG.b == 4) {
                        String str = hb0VarG.a;
                        synchronized (il5Var) {
                            il5Var.j = str;
                        }
                    }
                    int i6 = hb0VarG.b;
                    if (i6 == 5) {
                        il5Var.h(new FirebaseInstallationsException());
                        return;
                    } else if (i6 == 2 || i6 == 1) {
                        il5Var.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        il5Var.i(hb0VarG);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    il5Var.h(e);
                    return;
                }
            case 10:
                tfa tfaVar = (tfa) this.c;
                boolean z13 = this.b;
                try {
                    ScheduledFuture scheduledFuture2 = tfaVar.s0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture = scheduledFuture2;
                    }
                    if (scheduledFuture.isCancelled()) {
                        throw new InterruptedException("ScheduledFuture is cancelled");
                    }
                    tfaVar.Y = tfaVar.a.call();
                    if (z13) {
                        return;
                    }
                    tfaVar.o.set(true);
                    tfaVar.X.countDown();
                    return;
                } catch (Exception e2) {
                    tfaVar.Z.set(e2);
                    tfaVar.o.set(true);
                    tfaVar.c.set(true);
                    tfaVar.X.countDown();
                    return;
                }
            case 11:
                ((m0b) this.c).K0.setVisibility(this.b ? 0 : 8);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                koc kocVar = (koc) this.c;
                e24 e24Var = (e24) kocVar.b.get();
                if (e24Var != null) {
                    pbg pbgVar = kocVar.c;
                    if (pbgVar == null) {
                        throw new IllegalArgumentException("Illegal 'listener' value: null");
                    }
                    e24Var.c.remove(pbgVar);
                    e24Var.c(kocVar.d);
                    if (this.b) {
                        e24Var.a.close();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                qp4 qp4Var = (qp4) this.c;
                e24 e24Var2 = (e24) ((AtomicReference) qp4Var.s0).get();
                if (e24Var2 != null) {
                    e24Var2.c((vag) qp4Var.t0);
                    if (this.b) {
                        e24Var2.a.close();
                        return;
                    }
                    return;
                }
                return;
            default:
                py0 py0Var = (py0) ((u5e) this.c).a;
                try {
                    boolean zI = py0Var.i();
                    ji9 ji9Var = py0Var.y1;
                    if (zI) {
                        py0Var.L1.getClass();
                        if (ji9Var.b) {
                            ji9Var.b = false;
                            ji9Var.c = false;
                            ji9Var.a();
                        } else {
                            z = false;
                        }
                        if (z) {
                            py0Var.x();
                            py0Var.k(w51.X, null);
                        }
                        yn1 yn1Var = py0Var.t1;
                        if (yn1Var == null) {
                            return;
                        }
                        ssa ssaVar = (!ji9Var.b || py0Var.d2) ? py0Var.m2 : py0Var.l2;
                        if (ssaVar == null) {
                            return;
                        }
                        if (yn1Var.I()) {
                            yn1 yn1Var2 = py0Var.t1;
                            yn1Var2.B0 = ssaVar;
                            u38 u38Var = yn1Var2.x0;
                            if (u38Var != null) {
                                u38Var.e(ssaVar);
                                return;
                            }
                            return;
                        }
                        yn1 yn1Var3 = py0Var.t1;
                        yn1Var3.B0 = ssaVar;
                        u38 u38Var2 = yn1Var3.x0;
                        if (u38Var2 != null) {
                            u38Var2.e(ssaVar);
                            return;
                        } else {
                            yn1Var3.U(ssaVar);
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    py0Var.V0.logException("OKRTCCall", au1.j(new StringBuilder("Error apply screen capture stopped state (fast="), this.b, ")"), th3);
                    return;
                }
        }
    }

    public /* synthetic */ u60(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ u60(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
