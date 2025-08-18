package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* loaded from: classes2.dex */
public final class i50 implements tj8 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object o;
    public Object s0;

    public /* synthetic */ i50(y1f y1fVar, ViewGroup viewGroup, Object obj, View view, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.s0 = y1fVar;
        this.c = viewGroup;
        this.o = obj;
        this.X = view;
        this.Y = obj2;
        this.b = z;
        this.Z = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.tv1 a(defpackage.jx1 r19) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i50.a(jx1):tv1");
    }

    public void b(yha yhaVar) {
        tge callback;
        int iOrdinal = yhaVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            uge ugeVar = (uge) this.X;
            if (ugeVar != null && (callback = ugeVar.getCallback()) != null) {
                callback.onDismiss();
            }
            xha xhaVar = (xha) this.Y;
            if (xhaVar != null) {
                xhaVar.I(yhaVar);
                return;
            }
            return;
        }
        uge ugeVar2 = (uge) this.X;
        if (ugeVar2 != null) {
            yf3 yf3Var = new yf3(this, 28, yhaVar);
            tge tgeVar = ugeVar2.o;
            if (tgeVar == null) {
                return;
            }
            if (tgeVar.q().getHeight() > 0) {
                ugeVar2.c(tgeVar.h(), tgeVar.y(), new zja(yf3Var, 26, tgeVar), new xid(21), new sge(ugeVar2, 1));
            }
            ugeVar2.invalidate();
        }
    }

    @Override // defpackage.tj8
    public void c(dpd dpdVar) {
        rod rodVar;
        dpd dpdVar2 = (dpd) this.s0;
        if (dpdVar2 == null) {
            return;
        }
        if (!dpdVar2.equals(dpdVar) || this.b) {
            if (((py0) ((mfe) this.o).a).K1) {
                this.b = true;
                return;
            }
            py0 py0Var = (py0) ((mfe) this.o).a;
            if (py0Var.N0) {
                if ((py0Var.B0 || py0Var.s()) && (rodVar = ((py0) ((wmc) this.c).a).Z) != null) {
                    ag1 ag1Var = (ag1) this.Y;
                    rodVar.d(new wod(dpdVar, ag1Var != null && ag1Var.u, ag1Var != null && ag1Var.v), false, null, (jy0) this.Z);
                    this.s0 = dpdVar;
                    this.b = false;
                }
            }
        }
    }

    public void d() {
        if (this.b) {
            return;
        }
        if (((Long) this.Z) != null) {
            ((a4c) this.X).log((String) this.Y, "Duplicate accept event");
        }
        ((wte) ((vte) this.c)).getClass();
        this.Z = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.tj8
    public void e(dpd dpdVar) {
        this.s0 = dpdVar;
    }

    public void f() {
        if (this.b) {
            return;
        }
        Long l = (Long) this.Z;
        if (l == null) {
            ((a4c) this.X).log((String) this.Y, "Data is received but accept event wasn't triggered");
            return;
        }
        ((wte) ((vte) this.c)).getClass();
        ((n61) ((m61) this.o)).c("first_media_received", EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - l.longValue()), new EventItemsMap(Collections.singletonMap("call_type", EventItemValueKt.toEventItemValue((String) this.s0))));
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i50.g():void");
    }

    public void h() {
        if (((Long) this.Z) == null || this.b) {
            return;
        }
        this.b = true;
        ((t33) ((q33) ((je7) this.Y).getValue())).j("app.audio_onboarding_ended", true);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return jb9.c(this);
            default:
                return super.toString();
        }
    }

    public i50(od odVar) {
        this.a = 5;
        this.X = (aq7) odVar.X;
        a4c a4cVar = (a4c) odVar.c;
        this.o = a4cVar;
        this.c = (gy9) odVar.b;
        a4cVar.log("OKRTCSvcFactory", "Is VIDEO HW acceleration enabled ? ".concat(jb9.a ^ true ? "yes" : "no"));
        a4cVar.log("OKRTCSvcFactory", "Is Camera2 API enabled ? " + odVar.a);
        this.b = odVar.a;
        this.s0 = (Context) odVar.Y;
        this.Y = new wd6(27, a4cVar);
        this.Z = new lz1(a4cVar);
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.clear();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.addAll((List) odVar.o);
    }

    public i50(wmc wmcVar, mfe mfeVar, a4c a4cVar, ag1 ag1Var) {
        this.a = 1;
        this.s0 = null;
        this.b = false;
        this.c = wmcVar;
        this.o = mfeVar;
        this.X = a4cVar;
        this.Z = new jy0(1, this);
        this.Y = ag1Var;
    }

    public i50(wte wteVar, m61 m61Var, a4c a4cVar, String str, String str2) {
        this.a = 3;
        this.c = wteVar;
        this.o = m61Var;
        this.X = a4cVar;
        this.Y = str;
        this.s0 = str2;
    }

    public i50(ch9 ch9Var, sx3 sx3Var, je7 je7Var) {
        this.a = 0;
        this.c = ch9Var;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.o = kldVarB;
        this.X = new v7c(kldVarB);
        this.Y = je7Var;
        boolean z = ((t33) ((q33) je7Var.getValue())).g.getBoolean("app.audio_onboarding_ended", false);
        this.b = z;
        qqd qqdVar = new qqd(3, this);
        this.s0 = qqdVar;
        if (z) {
            return;
        }
        ((uh9) ch9Var).e(qqdVar);
        pag.n(sx3Var.getCoroutineContext()).invokeOnCompletion(new l(12, this));
    }

    public i50(WeakReference weakReference) {
        this.a = 2;
        this.c = weakReference;
        this.o = uia.Z;
        this.Z = new ck(6, this);
        this.s0 = new zha(this);
    }
}
