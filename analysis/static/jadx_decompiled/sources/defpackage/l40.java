package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import one.me.calls.impl.service.CallServiceImpl;
import org.webrtc.HardwareVideoEncoder;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class l40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l40(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ScheduledFuture scheduledFuture;
        n05 n05Var;
        ax1 ax1VarC;
        switch (this.a) {
            case 0:
                n40 n40Var = (n40) ((m40) this.c).c;
                n40Var.getClass();
                int i = this.b;
                if (i == -3 || i == -2) {
                    if (i != -2) {
                        g30 g30Var = (g30) n40Var.i;
                        if (!(g30Var != null && g30Var.a == 1)) {
                            n40Var.c(3);
                            return;
                        }
                    }
                    n75 n75Var = (n75) n40Var.h;
                    if (n75Var != null) {
                        t75 t75Var = n75Var.a;
                        boolean zU = t75Var.u();
                        t75Var.p2(0, zU ? 2 : 1, zU);
                    }
                    n40Var.c(2);
                    return;
                }
                if (i == -1) {
                    n75 n75Var2 = (n75) n40Var.h;
                    if (n75Var2 != null) {
                        t75 t75Var2 = n75Var2.a;
                        boolean zU2 = t75Var2.u();
                        t75Var2.p2(-1, zU2 ? 2 : 1, zU2);
                    }
                    n40Var.a();
                    return;
                }
                if (i != 1) {
                    return;
                }
                n40Var.c(1);
                n75 n75Var3 = (n75) n40Var.h;
                if (n75Var3 != null) {
                    t75 t75Var3 = n75Var3.a;
                    t75Var3.p2(1, 1, t75Var3.u());
                    return;
                }
                return;
            case 1:
                n40 n40Var2 = (n40) ((m40) this.c).c;
                n40Var2.getClass();
                int i2 = this.b;
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        h30 h30Var = (h30) n40Var2.i;
                        if (!(h30Var != null && h30Var.a == 1)) {
                            n40Var2.c(4);
                            return;
                        }
                    }
                    o75 o75Var = (o75) n40Var2.h;
                    if (o75Var != null) {
                        u75 u75Var = o75Var.a;
                        u75Var.s2(0, 1, u75Var.u());
                    }
                    n40Var2.c(3);
                    return;
                }
                if (i2 == -1) {
                    o75 o75Var2 = (o75) n40Var2.h;
                    if (o75Var2 != null) {
                        u75 u75Var2 = o75Var2.a;
                        u75Var2.s2(-1, 2, u75Var2.u());
                    }
                    n40Var2.a();
                    n40Var2.c(1);
                    return;
                }
                if (i2 != 1) {
                    ey8.k(i2, "Unknown focus change type: ");
                    return;
                }
                n40Var2.c(2);
                o75 o75Var3 = (o75) n40Var2.h;
                if (o75Var3 != null) {
                    u75 u75Var3 = o75Var3.a;
                    u75Var3.s2(1, 1, u75Var3.u());
                    return;
                }
                return;
            case 2:
                qt0 qt0Var = (qt0) this.c;
                int i3 = qt0Var.l;
                int i4 = this.b;
                if (i3 == i4) {
                    return;
                }
                int i5 = qt0Var.h;
                qt0Var.l = (i4 / i5) * i5;
                return;
            case 3:
                hl1 hl1Var = CallServiceImpl.s0;
                CallServiceImpl callServiceImpl = (CallServiceImpl) this.c;
                if (((wr1) ((kr1) callServiceImpl.b.getValue())).p()) {
                    return;
                }
                b8d.a(callServiceImpl, 1);
                callServiceImpl.stopSelfResult(this.b);
                return;
            case 4:
                ((iv1) this.c).a(this.b);
                return;
            case 5:
                ((lw1) this.c).b = this.b;
                return;
            case 6:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                int i6 = this.b;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    jhe jheVar = (jhe) ((ihe) it.next());
                    if (i6 == 5) {
                        synchronized (jheVar.o) {
                            try {
                                if (jheVar.l() && (list = jheVar.p) != null) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        ((xf4) it2.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        jheVar.getClass();
                    }
                }
                return;
            case 7:
                t54 t54Var = (t54) this.c;
                t54Var.getClass();
                VpxDecoderWrapper.DecoderKind decoderKind = VpxDecoderWrapper.DecoderKind.values()[au1.s(this.b)];
                VpxDecoderWrapper vpxDecoderWrapper = t54Var.a;
                vpxDecoderWrapper.init(decoderKind);
                vpxDecoderWrapper.setFrameHandler(t54Var);
                vpxDecoderWrapper.setErrorCallback(t54Var);
                vpxDecoderWrapper.setDesiredFps(10);
                return;
            case 8:
                b15 b15Var = (b15) this.c;
                boolean z = b15Var.j;
                d15 d15Var = b15Var.k;
                if (z) {
                    String str = d15Var.a;
                    return;
                }
                switch (au1.s(d15Var.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        d15Var.k.offer(Integer.valueOf(this.b));
                        d15Var.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15Var.D)));
                }
            case 9:
                ((z15) this.c).P0(this.b + 1);
                return;
            case 10:
                ((HardwareVideoEncoder) this.c).lambda$deliverEncodedImage$0(this.b);
                return;
            case 11:
                ((w98) this.c).j.remove(Integer.valueOf(this.b));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((sv8) this.c).h(this.b);
                return;
            case 13:
                adc adcVar = (adc) this.c;
                int i7 = adcVar.g0;
                int i8 = this.b;
                adcVar.g0 = i8;
                if (i7 != i8) {
                    if (i8 != 3) {
                        if (i8 != 2 || (scheduledFuture = adcVar.Y) == null || !scheduledFuture.cancel(false) || (n05Var = adcVar.F) == null) {
                            return;
                        }
                        adc.r(n05Var);
                        return;
                    }
                    if (adcVar.B != null) {
                        adcVar.Z = true;
                        nb0 nb0Var = adcVar.q;
                        if (nb0Var == null || nb0Var.w0) {
                            return;
                        }
                        adcVar.s(nb0Var, 4, null);
                        return;
                    }
                    wj4 wj4Var = adcVar.e0;
                    if (wj4Var != null) {
                        if (!wj4Var.b) {
                            wj4Var.b = true;
                            ScheduledFuture scheduledFuture2 = (ScheduledFuture) wj4Var.f;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(false);
                                wj4Var.f = null;
                            }
                        }
                        adcVar.e0 = null;
                    }
                    adcVar.v(false);
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((tu0) this.c).w(this.b);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                cnc cncVar = (cnc) this.c;
                if (cncVar.c.get()) {
                    lw1 lw1Var = (lw1) cncVar.a.b;
                    pt6 pt6Var = lw1Var.e;
                    int i9 = this.b;
                    if (pt6Var.B(i9) && (ax1VarC = pt6Var.c()) != null) {
                        pt6Var.p.a = pt6Var.h(ax1VarC, false);
                    }
                    fu6 fu6Var = lw1Var.d;
                    int iK = fu6Var.k();
                    if (fu6Var.B(i9) && fu6Var.t != null) {
                        fu6Var.t = f46.O(Math.abs(kp.C(i9) - kp.C(iK)), fu6Var.t);
                    }
                    rdf rdfVar = lw1Var.f;
                    if (rdfVar.B(i9)) {
                        rdfVar.P();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.A(this.b, view, false);
                    return;
                }
                return;
            default:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                return;
        }
    }
}
