package ru.ok.messages.settings.locations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ad;
import defpackage.ai3;
import defpackage.ce;
import defpackage.cn7;
import defpackage.cqc;
import defpackage.cy7;
import defpackage.ed3;
import defpackage.ft;
import defpackage.hle;
import defpackage.hm9;
import defpackage.ida;
import defpackage.jj9;
import defpackage.jke;
import defpackage.jle;
import defpackage.jpc;
import defpackage.jyc;
import defpackage.k8g;
import defpackage.kk9;
import defpackage.muc;
import defpackage.p7b;
import defpackage.p82;
import defpackage.qy9;
import defpackage.r0a;
import defpackage.rj9;
import defpackage.sd7;
import defpackage.sj9;
import defpackage.x46;
import defpackage.xk9;
import defpackage.y8a;
import defpackage.z7d;
import defpackage.ztc;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public class FrgLiveLocationSettings extends FrgBase implements x46 {
    public sj9 B1;
    public k8g C1;

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void H0() {
        super.H0();
        sj9 sj9Var = this.B1;
        ((Set) ((xk9) ((kk9) sj9Var.b)).a).remove(sj9Var);
        sj9Var.o.getClass();
        cqc.b(sj9Var.u0);
        cqc.b(sj9Var.v0);
        sj9Var.X.f(sj9Var);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        sj9 sj9Var = this.B1;
        xk9 xk9Var = (xk9) ((kk9) sj9Var.b);
        xk9Var.r(sj9Var);
        xk9Var.A(true);
        sj9Var.o.getClass();
        sj9Var.Z1();
        cqc.b(sj9Var.v0);
        z7d z7dVar = ((p7b) sj9Var.c).b;
        z7dVar.getClass();
        long jQ = (int) z7dVar.q(PmsKey.f59livelocationsendtimeout, 60);
        r0a r0aVarN = qy9.k(jQ, jQ, TimeUnit.SECONDS, muc.a()).n(ce.a());
        sd7 sd7Var = new sd7(new rj9(sj9Var, 0), new jj9(1), ft.d);
        r0aVarN.a(sd7Var);
        sj9Var.v0 = sd7Var;
        sj9Var.X.d(sj9Var);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked", this.B1.w0);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return "SETTINGS_LIVE_LOCATIONS";
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void l1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.C1.A();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void o1(int i, String[] strArr, int[] iArr) {
        if (i == 169 || i == 175) {
            this.C1.y(i, strArr, iArr);
        }
    }

    @Override // defpackage.x46
    public final void t(long j) {
        hm9.m("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "On stop now location click %d", Long.valueOf(j));
        sj9 sj9Var = this.B1;
        sj9Var.o.getClass();
        sj9Var.Y.g("LIVE_LOCATION_STOP", "SETTINGS");
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextD0 = d0();
        if (contextD0 == null) {
            hm9.p("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Context is null", null);
            return null;
        }
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        cn7 cn7Var = (cn7) ((jyc) jke.b()).getAccessor().c(cn7.class);
        p7b p7bVarN = ((y8a) ((ed3) this.p1.b)).n();
        p82 p82VarE = ((y8a) ((ed3) this.p1.b)).e();
        ida idaVar = (ida) ((y8a) ((ed3) this.p1.b)).getAccessor().c(ida.class);
        cy7 cy7VarR = ((y8a) ((ed3) this.p1.b)).r();
        hle hleVarQ = ((y8a) ((ed3) this.p1.b)).q();
        hleVarQ.getClass();
        ztc ztcVarA = ((jle) hleVarQ).a();
        xk9 xk9Var = new xk9(contextD0, viewGroup, idaVar);
        ad adVarB = ((y8a) ((ed3) this.p1.b)).b();
        this.C1 = new k8g(this.q1.i(), this);
        sj9 sj9Var = new sj9(xk9Var, p7bVarN, p82VarE, cn7Var, cy7VarR, adVarB, this.C1, ztcVarA, this.q1.h(), this);
        this.B1 = sj9Var;
        if (bundle != null) {
            sj9Var.w0 = bundle.getBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked");
        }
        ai3 ai3VarH1 = h1();
        if (ai3VarH1 != null) {
            ai3VarH1.g(h0(jpc.p0));
        }
        xk9Var.c();
        View view = (View) xk9Var.c;
        if (view != null) {
            return view;
        }
        hm9.p("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Root view is null", null);
        return null;
    }
}
