package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class x30 implements xl7 {
    public final Object X;
    public Object Y;
    public Object Z;
    public boolean a;
    public final Object b;
    public Object c;
    public Object o;
    public Object s0;
    public Object t0;
    public Object u0;

    public x30(yad yadVar, rpa rpaVar, rpa rpaVar2, rpa rpaVar3, rpa rpaVar4, rpa rpaVar5, rpa rpaVar6, rpa rpaVar7, rpa rpaVar8, boolean z) {
        this.b = yadVar;
        this.c = rpaVar;
        this.o = rpaVar2;
        this.X = rpaVar3;
        this.Y = rpaVar4;
        this.Z = rpaVar5;
        this.s0 = rpaVar6;
        this.t0 = rpaVar7;
        this.u0 = rpaVar8;
        this.a = z;
    }

    @Override // defpackage.xl7
    public void a(int i, int i2) {
        wja wjaVar = (wja) this.o;
        if (wjaVar == null) {
            return;
        }
        wjaVar.m(i);
        eje ejeVarI = wjaVar.i();
        if (c(ejeVarI, i2)) {
            wjaVar.b(ejeVarI, i2, wjaVar.b.isEmpty());
        }
        h();
    }

    public s04 b(final wja wjaVar, ViewPager2 viewPager2, m56 m56Var, a66 a66Var) {
        this.o = wjaVar;
        this.Y = m56Var;
        this.Z = a66Var;
        cx5 cx5Var = new cx5(0, this);
        wjaVar.a(cx5Var);
        this.c = cx5Var;
        final int i = 0;
        k56 k56Var = new k56(this) { // from class: bx5
            public final /* synthetic */ x30 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        x30 x30Var = this.b;
                        List list = (List) x30Var.s0;
                        if (list != null) {
                            wjaVar.k();
                            ((iv) x30Var.t0).b(list, null);
                        }
                        x30Var.s0 = null;
                        break;
                    default:
                        x30 x30Var2 = this.b;
                        cx5 cx5Var2 = (cx5) x30Var2.c;
                        if (cx5Var2 != null) {
                            wjaVar.l(cx5Var2);
                        }
                        x30Var2.c = null;
                        x30Var2.o = null;
                        iv ivVar = (iv) x30Var2.t0;
                        x30Var2.s0 = ivVar.f;
                        ivVar.b(null, null);
                        break;
                }
                return e5f.a;
            }
        };
        final int i2 = 1;
        k56 k56Var2 = new k56(this) { // from class: bx5
            public final /* synthetic */ x30 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        x30 x30Var = this.b;
                        List list = (List) x30Var.s0;
                        if (list != null) {
                            wjaVar.k();
                            ((iv) x30Var.t0).b(list, null);
                        }
                        x30Var.s0 = null;
                        break;
                    default:
                        x30 x30Var2 = this.b;
                        cx5 cx5Var2 = (cx5) x30Var2.c;
                        if (cx5Var2 != null) {
                            wjaVar.l(cx5Var2);
                        }
                        x30Var2.c = null;
                        x30Var2.o = null;
                        iv ivVar = (iv) x30Var2.t0;
                        x30Var2.s0 = ivVar.f;
                        ivVar.b(null, null);
                        break;
                }
                return e5f.a;
            }
        };
        s04 s04Var = new s04();
        s04Var.d = wjaVar;
        s04Var.e = viewPager2;
        s04Var.a = true;
        s04Var.b = false;
        s04Var.f = k56Var;
        s04Var.g = k56Var2;
        return s04Var;
    }

    public boolean c(eje ejeVar, int i) {
        View view = ejeVar.e;
        vja vjaVar = view instanceof vja ? (vja) view : null;
        y5a y5aVar = (y5a) x53.j0(i, ((iv) this.t0).f);
        if (y5aVar == null) {
            return false;
        }
        if (vjaVar != null) {
            vjaVar.setTabItem(y5aVar);
            return true;
        }
        wja wjaVar = (wja) this.o;
        if (wjaVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        vja vjaVar2 = new vja(wjaVar.getContext());
        vjaVar2.setIndicatorVisible(this.a);
        vjaVar2.setTabItem(y5aVar);
        ejeVar.e = vjaVar2;
        gje gjeVar = ejeVar.g;
        if (gjeVar != null) {
            gjeVar.e();
        }
        ejeVar.g.setOnLongClickListener(new z52(this, vjaVar2, y5aVar, 8));
        int iG = tu0.G(13 * fk4.d().getDisplayMetrics().density);
        gje gjeVar2 = ejeVar.g;
        gjeVar2.setPadding(iG, gjeVar2.getPaddingTop(), iG, gjeVar2.getPaddingBottom());
        gje gjeVar3 = ejeVar.g;
        pla.a(gjeVar3, new re(22, gjeVar3, this));
        return true;
    }

    public void d(t30 t30Var) {
        jgc jgcVar;
        boolean z;
        k0f k0fVar;
        if (!this.a || t30Var.equals((t30) this.s0)) {
            return;
        }
        this.s0 = t30Var;
        e84 e84Var = (e84) ((q64) this.c).b;
        e84Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = e84Var.i0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(k7d.j("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (t30Var.equals(e84Var.x)) {
            return;
        }
        e84Var.x = t30Var;
        qqd qqdVar = e84Var.s;
        if (qqdVar != null) {
            v78 v78Var = (v78) qqdVar.b;
            synchronized (v78Var.a) {
                jgcVar = v78Var.B0;
            }
            if (jgcVar != null) {
                cf4 cf4Var = (cf4) jgcVar;
                synchronized (cf4Var.c) {
                    z = cf4Var.g.w0;
                }
                if (!z || (k0fVar = cf4Var.a) == null) {
                    return;
                }
                ((g85) k0fVar).s0.f(26);
            }
        }
    }

    @Override // defpackage.xl7
    public void e(int i, int i2) {
        wja wjaVar = (wja) this.o;
        if (wjaVar == null) {
            return;
        }
        int i3 = i2 + i;
        while (i < i3) {
            eje ejeVarI = wjaVar.i();
            if (c(ejeVarI, i)) {
                wjaVar.b(ejeVarI, i, wjaVar.b.isEmpty());
            }
            i++;
        }
        h();
    }

    public void f(AudioDeviceInfo audioDeviceInfo) {
        g40 g40Var = (g40) this.t0;
        if (oaf.a(audioDeviceInfo, g40Var == null ? null : g40Var.a)) {
            return;
        }
        g40 g40Var2 = audioDeviceInfo != null ? new g40(audioDeviceInfo) : null;
        this.t0 = g40Var2;
        d(t30.b((Context) this.b, (h30) this.u0, g40Var2));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence, v5a] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.util.List r24) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.g(java.util.List):void");
    }

    public void h() {
        wja wjaVar = (wja) this.o;
        if (wjaVar == null) {
            return;
        }
        int tabCount = wjaVar.getTabCount();
        iv ivVar = (iv) this.t0;
        if (ivVar.f.isEmpty() || tabCount == 0) {
            return;
        }
        int i = tabCount - 1;
        Iterator it = ivVar.f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((y5a) it.next()).c == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 <= i) {
            i = i2;
        }
        if (i < 0 || i == wjaVar.getSelectedTabPosition()) {
            return;
        }
        wjaVar.o(wjaVar.h(i), true);
    }

    @Override // defpackage.xl7
    public void m(int i, int i2) {
        wja wjaVar = (wja) this.o;
        if (wjaVar == null) {
            return;
        }
        int i3 = i2 + i;
        while (i < i3) {
            if (wjaVar.o.getChildAt(i) != null) {
                wjaVar.m(i);
            }
            i++;
        }
        h();
    }

    @Override // defpackage.xl7
    public void o(int i, int i2, Object obj) {
        wja wjaVar = (wja) this.o;
        if (wjaVar == null) {
            return;
        }
        int i3 = i2 + i;
        while (i < i3) {
            eje ejeVarH = wjaVar.h(i);
            if (ejeVarH != null) {
                y5a y5aVar = (y5a) ((iv) this.t0).f.get(i);
                View view = ejeVarH.e;
                vja vjaVar = view instanceof vja ? (vja) view : null;
                if (vjaVar != null) {
                    vjaVar.setTabItem(y5aVar);
                }
            }
            i++;
        }
        h();
    }

    public x30(ExecutorService executorService, int i) {
        boolean z = (i & 1) != 0;
        executorService = (i & 2) != 0 ? ys2.a.c().a() : executorService;
        ax7 ax7VarB = ys2.a.b();
        this.a = z;
        this.b = ax7VarB;
        this.X = new qi9();
        this.t0 = new iv(this, new qz7(executorService, 4, new y34(6)));
    }

    public x30(Context context, q64 q64Var, h30 h30Var, g40 g40Var) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = q64Var;
        this.u0 = h30Var;
        this.t0 = g40Var;
        Handler handlerP = oaf.p(null);
        this.o = handlerP;
        int i = oaf.a;
        this.X = i >= 23 ? new v30(this) : null;
        this.Y = i >= 21 ? new an(1, this) : null;
        t30 t30Var = t30.c;
        String str = oaf.c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.Z = uriFor != null ? new w30(this, handlerP, applicationContext.getContentResolver(), uriFor) : null;
    }
}
