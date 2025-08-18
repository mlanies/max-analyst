package ru.ok.messages.settings.caching;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a14;
import defpackage.are;
import defpackage.bk4;
import defpackage.bx0;
import defpackage.ce;
import defpackage.cx0;
import defpackage.ed3;
import defpackage.f40;
import defpackage.ft;
import defpackage.gcd;
import defpackage.hod;
import defpackage.j47;
import defpackage.jke;
import defpackage.jp;
import defpackage.jpc;
import defpackage.jyc;
import defpackage.muc;
import defpackage.ng5;
import defpackage.o46;
import defpackage.oc;
import defpackage.ood;
import defpackage.p46;
import defpackage.r0a;
import defpackage.r23;
import defpackage.s08;
import defpackage.s23;
import defpackage.sd7;
import defpackage.spa;
import defpackage.vl;
import defpackage.wuc;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yw0;
import java.util.ArrayList;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.views.dialogs.ProgressDialog;

/* loaded from: classes2.dex */
public class FrgCachingSettings extends FrgBaseSettings implements bx0 {
    public final jp E1 = vl.o.a().c;
    public String F1 = "";
    public String[] G1;
    public cx0 H1;

    @Override // defpackage.bx0
    public final void F() {
        a aVarE = this.F0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((aVarE instanceof ProgressDialog ? (ProgressDialog) aVarE : null) != null) {
            return;
        }
        p1(jpc.e1, false);
    }

    @Override // defpackage.bx0
    public final void I() {
        a14.N(0, U0(), h0(jpc.d1));
    }

    @Override // defpackage.bx0
    public final void J() {
        a14.N(0, U0(), h0(jpc.E));
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        this.H1.b();
        ((y8a) ((ed3) this.p1.b)).m().f(wuc.SETTINGS_CACHE, spa.f);
    }

    @Override // defpackage.bx0
    public final void S() {
        a aVarE = this.F0.E("ru.ok.messages.views.dialogs.ProgressDialog");
        if ((aVarE instanceof ProgressDialog ? (ProgressDialog) aVarE : null) != null) {
            return;
        }
        q1();
    }

    @Override // defpackage.bx0
    public final void f(ArrayList arrayList) {
        RecyclerView recyclerView = new RecyclerView(U0(), null);
        d0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(new r23(d0(), arrayList));
        s08 s08Var = new s08(U0());
        int i = jpc.h1;
        oc ocVar = s08Var.a;
        ocVar.d = ocVar.a.getText(i);
        s08Var.f(recyclerView).d(jpc.g1, new p46(this, arrayList, 2)).a();
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return "SETTINGS_MEDIA_CACHING";
    }

    @Override // defpackage.bx0
    public final void m(String str) {
        this.F1 = str;
        if (this.o1) {
            v1();
        }
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final ArrayList r1() {
        ArrayList arrayList = new ArrayList();
        int i = xxb.setting_caching_time;
        String strH0 = h0(jpc.R0);
        jp jpVar = this.E1;
        int i2 = jpVar.g.getInt("app.media.caching.time", 0);
        arrayList.add(gcd.a(i, strH0, i2 != 1 ? i2 != 2 ? i2 != 3 ? h0(jpc.S0) : h0(jpc.V0) : h0(jpc.T0) : h0(jpc.U0)));
        int i3 = xxb.setting_caching_limit;
        String strH02 = h0(jpc.P0);
        long j = jpVar.g.getLong("app.media.caching.limit", -1L);
        gcd gcdVarA = gcd.a(i3, strH02, j <= 0 ? h0(jpc.Q0) : are.w(j, false, null));
        gcdVarA.Z = true;
        arrayList.add(gcdVarA);
        arrayList.add(new gcd(xxb.setting_caching_clear_cache, h0(jpc.h1), h0(jpc.i1), this.F1, null, 1));
        return arrayList;
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final String s1() {
        return h0(jpc.f1);
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final void t1(int i) {
        if (i == xxb.setting_caching_time) {
            String[] strArr = {h0(jpc.S0), h0(jpc.U0), h0(jpc.T0), h0(jpc.V0)};
            s08 s08Var = new s08(U0());
            int i2 = jpc.R0;
            oc ocVar = s08Var.a;
            ocVar.d = ocVar.a.getText(i2);
            p46 p46Var = new p46(this, strArr, 1);
            oc ocVar2 = s08Var.a;
            ocVar2.p = strArr;
            ocVar2.r = p46Var;
            s08Var.a();
            return;
        }
        if (i != xxb.setting_caching_limit) {
            if (i == xxb.setting_caching_clear_cache) {
                cx0 cx0Var = this.H1;
                synchronized (cx0Var) {
                    try {
                        if (cx0Var.k == null) {
                            cx0Var.h.S();
                            r0a r0aVarN = cx0Var.c().r(cx0Var.f).n(cx0Var.g);
                            sd7 sd7Var = new sd7(new yw0(cx0Var, 4), new yw0(cx0Var, 5), ft.d);
                            r0aVarN.a(sd7Var);
                            cx0Var.a(sd7Var);
                        } else {
                            cx0Var.h.f((ArrayList) cx0Var.k.c);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        ood oodVar = new ood(d0());
        int i3 = this.r1.k;
        hod configBuilder = oodVar.getConfigBuilder();
        configBuilder.b = 0.0f;
        configBuilder.d = 0.0f;
        configBuilder.c = this.G1.length - 1;
        long j = this.E1.g.getLong("app.media.caching.limit", -1L);
        configBuilder.d = j == 536870912 ? 0 : j == 1073741824 ? 1 : j == 2147483648L ? 2 : j == 4294967296L ? 3 : 4;
        int i4 = this.r1.M;
        configBuilder.j = i4;
        configBuilder.r = i4;
        bk4 bk4Var = this.m1;
        int i5 = bk4Var.b;
        configBuilder.f = i5;
        configBuilder.k = i3;
        configBuilder.w = i3;
        configBuilder.g = i5;
        configBuilder.l = i3;
        configBuilder.G = 1.0f;
        int i6 = bk4Var.f;
        configBuilder.h = i6;
        configBuilder.i = bk4Var.h;
        configBuilder.E = true;
        configBuilder.D = -1;
        configBuilder.C = bk4Var.l;
        configBuilder.B = i3;
        configBuilder.W = true;
        configBuilder.A = true;
        configBuilder.m = this.G1.length - 1;
        configBuilder.K = bk4Var.e;
        configBuilder.L = i6;
        ood oodVar2 = configBuilder.a;
        oodVar2.getClass();
        oodVar2.b = configBuilder.b;
        oodVar2.c = configBuilder.c;
        oodVar2.o = configBuilder.d;
        oodVar2.s0 = configBuilder.e;
        oodVar2.t0 = configBuilder.f;
        oodVar2.u0 = configBuilder.g;
        oodVar2.v0 = configBuilder.h;
        oodVar2.w0 = configBuilder.i;
        oodVar2.x0 = configBuilder.j;
        oodVar2.y0 = configBuilder.k;
        oodVar2.z0 = configBuilder.l;
        oodVar2.A0 = configBuilder.m;
        oodVar2.B0 = configBuilder.n;
        oodVar2.C0 = configBuilder.o;
        oodVar2.D0 = configBuilder.p;
        oodVar2.E0 = configBuilder.q;
        oodVar2.F0 = configBuilder.r;
        oodVar2.G0 = configBuilder.s;
        oodVar2.H0 = configBuilder.t;
        oodVar2.I0 = configBuilder.u;
        oodVar2.J0 = configBuilder.v;
        oodVar2.K0 = configBuilder.w;
        oodVar2.L0 = configBuilder.x;
        oodVar2.O0 = configBuilder.y;
        oodVar2.M0 = configBuilder.z;
        oodVar2.N0 = configBuilder.A;
        hod hodVar = oodVar2.r1;
        String[] strArr2 = hodVar.F;
        oodVar2.s1 = strArr2;
        oodVar2.t1 = strArr2 != null && strArr2.length > 0;
        oodVar2.u1 = hodVar.G;
        oodVar2.v1 = hodVar.H;
        oodVar2.w1 = hodVar.I;
        oodVar2.M1 = hodVar.J;
        oodVar2.N1 = hodVar.U;
        oodVar2.P1 = hodVar.T;
        oodVar2.W0 = configBuilder.B;
        oodVar2.X0 = configBuilder.C;
        oodVar2.Y0 = configBuilder.D;
        oodVar2.x1 = configBuilder.E;
        oodVar2.C1 = configBuilder.L;
        oodVar2.B1 = configBuilder.K;
        oodVar2.D1 = configBuilder.M;
        int i7 = configBuilder.N;
        oodVar2.a1 = i7;
        oodVar2.Z0 = i7;
        int i8 = configBuilder.O;
        oodVar2.c1 = i8;
        oodVar2.b1 = i8;
        oodVar2.T0 = configBuilder.Q;
        oodVar2.S0 = configBuilder.P;
        oodVar2.U0 = configBuilder.S;
        oodVar2.y1 = configBuilder.R;
        oodVar2.P0 = configBuilder.V;
        oodVar2.Q0 = configBuilder.W;
        oodVar2.d();
        oodVar2.e();
        oodVar2.c();
        oodVar2.r1 = null;
        oodVar2.requestLayout();
        oodVar.setValueFormatListener(new o46(this));
        j47.q(oodVar, this.m1.r);
        j47.p(oodVar, this.m1.r);
        s08 s08Var2 = new s08(U0());
        int i9 = jpc.P0;
        oc ocVar3 = s08Var2.a;
        ocVar3.d = ocVar3.a.getText(i9);
        s08Var2.f(oodVar).d(jpc.I, new p46(this, oodVar, 0)).a();
    }

    @Override // androidx.fragment.app.a
    public final void u0(Context context) {
        super.u0(context);
        this.G1 = new String[]{"512MB", "1GB", "2GB", "4GB", h0(jpc.Q0)};
    }

    @Override // ru.ok.messages.settings.FrgBaseSettings
    public final void u1(int i, Object obj) {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        jyc jycVar = (jyc) jke.b();
        this.H1 = new cx0((ng5) jycVar.getAccessor().c(ng5.class), (f40) ((y8a) ((ed3) this.p1.b)).getAccessor().c(f40.class), new s23(d0()), jycVar.u(), muc.a(), ce.a(), new o46(this), this);
    }
}
