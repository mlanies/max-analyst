package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import androidx.media3.common.PlaybackException;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class f9 implements hje, qj3, pof, b66, t31, hnc, wu, mq1, cc3, wsd, km7, mm7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f9(wja wjaVar, hh2 hh2Var) {
        this.a = 20;
        this.c = wjaVar;
        this.b = hh2Var;
    }

    @Override // defpackage.wsd
    public void a(int i) {
        DateTimePicker dateTimePicker = (DateTimePicker) this.b;
        if (dateTimePicker.N0) {
            return;
        }
        x34 x34Var = (x34) ((b44) this.c).C(i);
        u34 u34Var = dateTimePicker.M0;
        if (u34Var != null) {
            ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) u34Var;
            hm9.n("ScheduledSendPickerViewModel", "day = " + x34Var);
            q0e q0eVar = scheduledSendPickerViewModel.e;
            m34 m34Var = (m34) q0eVar.getValue();
            if (m34Var == null || tpa.f(m34Var.a, x34Var)) {
                return;
            }
            q0eVar.m(null, m34.a(m34Var, x34Var, null, null, 6));
            scheduledSendPickerViewModel.f();
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 1:
                hm9.n("l00", "Attach downloaded");
                l00 l00Var = (l00) obj3;
                l00Var.b.o((j00) obj2, (File) obj);
                l00Var.a.C(false);
                break;
            case 18:
                u82 u82Var = (u82) obj;
                ((p82) obj3).getClass();
                u82Var.c = (i92) obj2;
                p82.q(u82Var);
                u82Var.x = 0L;
                u82Var.m = 0;
                break;
            case 19:
                u82 u82Var2 = (u82) obj;
                p82 p82Var = (p82) obj3;
                p82Var.getClass();
                Map mapD = u82Var2.d();
                p7b p7bVar = (p7b) p82Var.n;
                mapD.remove(Long.valueOf(p7bVar.a.t()));
                if (((e52) obj2).b0()) {
                    Iterator it = Collections.singletonList(Long.valueOf(p7bVar.a.t())).iterator();
                    while (it.hasNext()) {
                        u82Var2.R.remove((Long) it.next());
                    }
                }
                p82.q(u82Var2);
                u82Var2.x = 0L;
                break;
            default:
                hl3 hl3Var = (hl3) obj;
                hl3Var.k = (ol3) obj3;
                hl3Var.i = (nl3) obj2;
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        bq0 bq0Var = (bq0) obj;
        y8 y8Var = (y8) this.b;
        y8Var.getClass();
        wm3 wm3Var = (wm3) ((Map) this.c).get(Long.valueOf(bq0Var.a));
        if (wm3Var == null) {
            hm9.m("y8", "prepareBotCommandItems, contactInfo is null, botId: %d", Long.valueOf(bq0Var.a));
            return new iq0(null, bq0Var.a, y8Var.w(bq0Var, null), bq0Var.c);
        }
        return new iq0(bre.c(wm3Var.w0), bq0Var.a, y8Var.w(bq0Var, wm3Var), bq0Var.c);
    }

    @Override // defpackage.hnc
    public void b() {
        o11 o11Var;
        ln1 ln1Var;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 6:
                j11 j11Var = (j11) obj2;
                if (j11Var.P0 != null && (o11Var = j11Var.M0) != null) {
                    ((sy4) o11Var).G((knc) obj);
                    break;
                }
                break;
            default:
                mn1 mn1Var = (mn1) obj2;
                if (tpa.f(mn1Var.H0, Boolean.TRUE) && (ln1Var = mn1Var.G0) != null) {
                    bc7[] bc7VarArr = CallTopPanelWidget.o;
                    CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) ((o9g) ln1Var).b;
                    if (!((el1) callTopPanelWidget.a.getValue()).u()) {
                        qt3 qt3VarS = dy7.c(1).y().Y((knc) obj).s();
                        la1 la1Var = (la1) callTopPanelWidget.n0().b.C0.a.getValue();
                        tt3 tt3Var = ppa.a;
                        boolean z = !la1Var.g;
                        m31 m31Var = la1Var.f;
                        boolean z2 = (m31Var != null ? m31Var.a : null) != null;
                        kl7 kl7VarL = j1e.l();
                        if (z) {
                            kl7VarL.add(ppa.a);
                        }
                        if (z2) {
                            kl7VarL.add(ppa.b);
                        }
                        qt3VarS.I(j1e.d(kl7VarL)).build().q(callTopPanelWidget);
                        break;
                    } else {
                        pnf.o(callTopPanelWidget.n0().b.M0, jj1.D);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.mm7
    public void d(Object obj, tm5 tm5Var) {
        ((gd) obj).N((q3b) this.c, new imc(tm5Var, ((i74) this.b).X));
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        String str = (String) this.b;
        nb3 nb3Var = (nb3) this.c;
        try {
            Trace.beginSection(str);
            return nb3Var.f.f(bg4Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.hje
    public void h(eje ejeVar, int i) {
        String strB;
        switch (this.a) {
            case 0:
                List list = (List) ((bkg) this.b).b;
                if (list.isEmpty()) {
                    return;
                }
                View view = ejeVar.e;
                vja vjaVar = view instanceof vja ? (vja) view : null;
                g9 g9Var = (g9) list.get(i);
                wja wjaVar = (wja) this.c;
                y5a y5aVar = new y5a(String.valueOf(g9Var.a), i == wjaVar.getSelectedTabPosition() ? 1 : 2, 56, wjaVar.getContext().getString(g9Var.b));
                if (vjaVar != null) {
                    vjaVar.setTabItem(y5aVar);
                    return;
                }
                vja vjaVar2 = new vja(wjaVar.getContext());
                vjaVar2.setTabItem(y5aVar);
                ejeVar.e = vjaVar2;
                gje gjeVar = ejeVar.g;
                if (gjeVar != null) {
                    gjeVar.e();
                    return;
                }
                return;
            case 7:
                y8 y8Var = (y8) this.b;
                if (((List) y8Var.a).isEmpty()) {
                    return;
                }
                View view2 = ejeVar.e;
                vja vjaVar3 = view2 instanceof vja ? (vja) view2 : null;
                w81 w81Var = (w81) ((List) y8Var.a).get(i);
                wja wjaVar2 = (wja) this.c;
                y5a y5aVar2 = new y5a(String.valueOf(w81Var.a), wjaVar2.getContext().getString(w81Var.b), i == wjaVar2.getSelectedTabPosition() ? 1 : 2, new v5a(0), null, null);
                if (vjaVar3 != null) {
                    vjaVar3.setTabItem(y5aVar2);
                    return;
                }
                vja vjaVar4 = new vja(wjaVar2.getContext());
                vjaVar4.setTabItem(y5aVar2);
                ejeVar.e = vjaVar4;
                gje gjeVar2 = ejeVar.g;
                if (gjeVar2 != null) {
                    gjeVar2.e();
                    return;
                }
                return;
            default:
                wja wjaVar3 = (wja) this.c;
                int selectedTabPosition = wjaVar3.getSelectedTabPosition();
                View view3 = ejeVar.e;
                vja vjaVar5 = view3 instanceof vja ? (vja) view3 : null;
                ih2 ih2Var = (ih2) ((hh2) this.b).a.get(i);
                boolean z = i == selectedTabPosition;
                Context context = wjaVar3.getContext();
                int iOrdinal = ih2Var.ordinal();
                if (iOrdinal == 0) {
                    strB = z7.B(context, yea.v0);
                } else if (iOrdinal == 1) {
                    strB = z7.B(context, yea.t0);
                } else if (iOrdinal == 2) {
                    strB = z7.B(context, yea.u0);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strB = z7.B(context, yea.s0);
                }
                y5a y5aVar3 = new y5a(String.valueOf(ih2Var.ordinal()), z ? 1 : 2, 8, strB);
                if (vjaVar5 != null) {
                    vjaVar5.setTabItem(y5aVar3);
                    return;
                }
                vja vjaVar6 = new vja(wjaVar3.getContext());
                vjaVar6.setTabItem(y5aVar3);
                ejeVar.e = vjaVar6;
                gje gjeVar3 = ejeVar.g;
                if (gjeVar3 != null) {
                    gjeVar3.e();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.t31
    public void i(m7 m7Var) {
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 5:
                s6 s6Var = (s6) m7Var;
                u31 u31Var = (u31) obj2;
                j11 j11Var = (j11) obj;
                if (s6Var instanceof p6) {
                    u31Var.getClass();
                    o11 o11Var = j11Var.M0;
                    if (o11Var != null) {
                        ((sy4) o11Var).I(true);
                    }
                    cu3 cu3Var = u31Var.a;
                    if (cu3Var != null) {
                        cu3Var.dismiss();
                    }
                    u31Var.a = null;
                    return;
                }
                if (s6Var instanceof q6) {
                    u31Var.getClass();
                    o11 o11Var2 = j11Var.M0;
                    if (o11Var2 != null) {
                        ((sy4) o11Var2).I(false);
                    }
                    cu3 cu3Var2 = u31Var.a;
                    if (cu3Var2 != null) {
                        cu3Var2.dismiss();
                    }
                    u31Var.a = null;
                    return;
                }
                if (s6Var instanceof r6) {
                    u31Var.getClass();
                    o11 o11Var3 = j11Var.M0;
                    if (o11Var3 != null) {
                        ((sy4) o11Var3).H();
                    }
                    cu3 cu3Var3 = u31Var.a;
                    if (cu3Var3 != null) {
                        cu3Var3.dismiss();
                    }
                    u31Var.a = null;
                    return;
                }
                if (!(s6Var instanceof o6)) {
                    throw new NoWhenBranchMatchedException();
                }
                u31Var.getClass();
                o11 o11Var4 = j11Var.M0;
                if (o11Var4 != null) {
                    bc7[] bc7VarArr = CallBottomPanelWidget.s0;
                    pnf.o(((CallBottomPanelWidget) ((sy4) o11Var4).b).n0().c.M0, ij1.D);
                }
                cu3 cu3Var4 = u31Var.a;
                if (cu3Var4 != null) {
                    cu3Var4.dismiss();
                }
                u31Var.a = null;
                return;
            default:
                v6 v6Var = (v6) m7Var;
                u31 u31Var2 = (u31) obj2;
                in1 in1Var = (in1) obj;
                if (v6Var instanceof u6) {
                    u31Var2.getClass();
                    ln1 ln1Var = in1Var.L0;
                    if (ln1Var != null) {
                        ((o9g) ln1Var).A(nnf.a);
                    }
                    cu3 cu3Var5 = u31Var2.a;
                    if (cu3Var5 != null) {
                        cu3Var5.dismiss();
                    }
                    u31Var2.a = null;
                    return;
                }
                if (!(v6Var instanceof t6)) {
                    throw new NoWhenBranchMatchedException();
                }
                u31Var2.getClass();
                ln1 ln1Var2 = in1Var.L0;
                if (ln1Var2 != null) {
                    ((o9g) ln1Var2).A(nnf.c);
                }
                cu3 cu3Var6 = u31Var2.a;
                if (cu3Var6 != null) {
                    cu3Var6.dismiss();
                }
                u31Var2.a = null;
                return;
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                gdVar.B((fd) this.b, (c3b) this.c);
                break;
            case 25:
            default:
                gdVar.J((fd) this.b, (n54) this.c);
                break;
            case 26:
                gdVar.D((fd) this.b, (f99) this.c);
                break;
            case 27:
                gdVar.A0((fd) this.b, (p0f) this.c);
                break;
            case 28:
                gdVar.m0((fd) this.b, (PlaybackException) this.c);
                break;
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 13:
                ((su1) this.b).getClass();
                ((u40) this.c).b(new ru1(lq1Var, 0));
                return "submitStillCapture";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                xu1 xu1Var = (xu1) this.b;
                xu1Var.getClass();
                ju0.D().execute(new f5(xu1Var, (AtomicReference) this.c, lq1Var, 13));
                return "OnScreenFlashStart";
            default:
                ay1 ay1Var = (ay1) this.b;
                ay1Var.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Context context = (Context) this.c;
                Executor executor = ay1Var.d;
                executor.execute(new zx1(ay1Var, context, executor, 1, lq1Var, jElapsedRealtime));
                return "CameraX initInternal";
        }
    }

    public /* synthetic */ f9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public bm7 mo131apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                sz1 sz1Var = (sz1) this.b;
                sz1Var.a();
                ((xf4) this.c).a();
                return sz1Var.m();
            default:
                xu1 xu1Var = (xu1) this.b;
                xu1Var.getClass();
                return f8.g(new vg4((oq1) ((bm7) this.c), xu1Var.c, TimeUnit.SECONDS.toMillis(3L)));
        }
    }
}
