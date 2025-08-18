package ru.ok.messages.location;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import defpackage.a14;
import defpackage.ad;
import defpackage.ce;
import defpackage.ck9;
import defpackage.cn7;
import defpackage.cqc;
import defpackage.d08;
import defpackage.dpc;
import defpackage.e08;
import defpackage.e52;
import defpackage.ed3;
import defpackage.el3;
import defpackage.el9;
import defpackage.er7;
import defpackage.fk9;
import defpackage.ft;
import defpackage.gr7;
import defpackage.he0;
import defpackage.hle;
import defpackage.hm9;
import defpackage.i08;
import defpackage.ida;
import defpackage.ir7;
import defpackage.je6;
import defpackage.jj9;
import defpackage.jke;
import defpackage.jle;
import defpackage.jpc;
import defpackage.jr7;
import defpackage.jyc;
import defpackage.k8g;
import defpackage.kk9;
import defpackage.muc;
import defpackage.n16;
import defpackage.nr7;
import defpackage.ny7;
import defpackage.oy7;
import defpackage.p7b;
import defpackage.pk4;
import defpackage.qy7;
import defpackage.qy9;
import defpackage.r0a;
import defpackage.ri4;
import defpackage.rke;
import defpackage.sd7;
import defpackage.spa;
import defpackage.tg;
import defpackage.u8e;
import defpackage.uj3;
import defpackage.vy7;
import defpackage.w46;
import defpackage.wuc;
import defpackage.x46;
import defpackage.xi0;
import defpackage.xpb;
import defpackage.xxb;
import defpackage.y16;
import defpackage.y8a;
import defpackage.z7d;
import defpackage.zl4;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public class FrgLocationMap extends FrgBase implements x46, w46 {
    public y16 B1;
    public fk9 C1;
    public k8g D1;
    public rke E1;
    public cn7 F1;
    public ir7 G1;
    public long H1;
    public int I1;
    public boolean J1;

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void H0() {
        super.H0();
        fk9 fk9Var = this.C1;
        if (fk9Var != null) {
            fk9Var.Y.c(fk9Var);
            ((el9) ((kk9) fk9Var.b)).getClass();
            cqc.b(fk9Var.I0);
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        ((y8a) ((ed3) this.p1.b)).m().f(this.J1 ? wuc.CHAT_SHARE_LOCATION : wuc.CHAT_LOCATION_VIEWER, spa.f);
        fk9 fk9Var = this.C1;
        if (fk9Var != null) {
            fk9Var.Y.b(fk9Var);
            fk9Var.c2();
            ((el9) ((kk9) fk9Var.b)).getClass();
            xpb xpbVar = fk9Var.G0;
            if (xpbVar != null && fk9Var.C0.c == 1) {
                xpbVar.e(Boolean.TRUE);
            }
            cqc.b(fk9Var.I0);
            z7d z7dVar = ((p7b) fk9Var.A0).b;
            z7dVar.getClass();
            long jQ = (int) z7dVar.q(PmsKey.f59livelocationsendtimeout, 60);
            r0a r0aVarN = qy9.k(jQ, jQ, TimeUnit.SECONDS, muc.a()).n(ce.a());
            sd7 sd7Var = new sd7(new ck9(fk9Var, 6), new jj9(10), ft.d);
            r0aVarN.a(sd7Var);
            fk9Var.I0 = sd7Var;
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        fk9 fk9Var = this.C1;
        ir7 ir7Var = fk9Var.C0;
        ny7 ny7VarE = ((el9) ((kk9) fk9Var.b)).E();
        er7 er7Var = fk9Var.D0;
        boolean z = fk9Var.F0;
        bundle.putParcelable("ru.ok.tamtam.extra.VIEW_STATE", new jr7(ir7Var));
        bundle.putParcelable("ru.ok.tamtam.extra.MAP_CONFIG", new oy7(ny7VarE));
        bundle.putSerializable("ru.ok.tamtam.extra.LAST_LOCATION", er7Var);
        bundle.putBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", z);
    }

    @Override // defpackage.w46
    public final void d() {
        this.C1.c2();
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return "PICK_LOCATION";
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void l1(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.D1.A();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean n1() {
        fk9 fk9Var = this.C1;
        if (fk9Var.C0.d != 3) {
            return false;
        }
        fk9Var.Z1();
        return true;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void o1(int i, String[] strArr, int[] iArr) {
        if (i == 169 || i == 175) {
            this.D1.y(i, strArr, iArr);
        }
    }

    public final void r1(e08 e08Var) {
        Context contextD0 = d0();
        if (contextD0 == null) {
            return;
        }
        er7 er7Var = e08Var.a;
        double d = er7Var.a;
        pk4 pk4Var = (pk4) ((y8a) ((ed3) this.p1.b)).getAccessor().c(pk4.class);
        ArrayList arrayList = hm9.l;
        pk4Var.getClass();
        String str = "https://maps.google.com/maps?f=d&daddr=" + d + "," + er7Var.b;
        String str2 = e08Var.e;
        if (str2 != null && str2.length() != 0) {
            try {
                str = str + " (" + URLEncoder.encode(str2, "utf-8") + ")";
            } catch (UnsupportedEncodingException e) {
                hm9.p(je6.class.getName(), "Can't encode name ".concat(str2), e);
            }
        }
        try {
            contextD0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e2) {
            hm9.p("hm9", "openDirections: ", e2);
            int i = jpc.F1;
            Handler handler = a14.i;
            a14.N(0, contextD0, contextD0.getString(i));
        }
        this.q1.b().f("LOCATION_MAP_DIRECTION_CLICK");
    }

    @Override // defpackage.x46
    public final void t(long j) {
        if (this.G1.c == 1) {
            this.q1.b().g("LIVE_LOCATION_STOP", "VIEWER");
        } else {
            this.q1.b().g("LIVE_LOCATION_STOP", "PICKER");
        }
        this.C1.Z1();
        this.F1.getClass();
    }

    @Override // defpackage.w46
    public final void v() {
    }

    @Override // defpackage.w46
    public final void x() {
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nr7 nr7Var;
        String str;
        er7 er7Var;
        boolean z;
        long j;
        String strD;
        ny7 ny7Var;
        oy7 oy7Var;
        jr7 jr7Var;
        Context contextD0 = d0();
        c cVar = this.F0;
        e08 e08Var = null;
        if (contextD0 == null || cVar == null || this.Z == null) {
            hm9.p("ru.ok.messages.location.FrgLocationMap", "Context or fragmentManager is null", null);
            return null;
        }
        this.D1 = new k8g(this.q1.i(), this);
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        this.F1 = (cn7) ((jyc) jke.b()).getAccessor().c(cn7.class);
        ida idaVarO = this.q1.o();
        el3 el3VarG = this.q1.g();
        vy7 vy7Var = (vy7) ((y8a) ((ed3) this.p1.b)).getAccessor().c(vy7.class);
        ad adVarB = this.q1.b();
        nr7 nr7Var2 = (nr7) this.q1.getAccessor().c(nr7.class);
        this.E1 = (rke) this.q1.getAccessor().c(rke.class);
        long jT = ((p7b) this.q1.q()).a.t();
        int i = dpc.E;
        String strH0 = h0(i);
        this.H1 = this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID");
        this.I1 = this.Z.getInt("ru.ok.tamtam.extra.REQUEST_CODE");
        e52 e52VarC = this.q1.f().C(this.H1);
        if (e52VarC == null) {
            hm9.p("ru.ok.messages.location.FrgLocationMap", "Chat is null", null);
            return null;
        }
        boolean zM = e52VarC.M();
        Bundle bundle2 = this.Z;
        er7 er7Var2 = er7.Z;
        if (bundle2 == null) {
            z = zM;
            er7Var = er7Var2;
            nr7Var = nr7Var2;
            str = "ru.ok.messages.location.FrgLocationMap";
            j = 0;
        } else {
            long j2 = bundle2.getLong("ru.ok.tamtam.extra.MESSAGE_ID");
            nr7Var = nr7Var2;
            long j3 = this.Z.getLong("ru.ok.tamtam.extra.CONTACT_ID");
            er7 er7Var3 = (er7) this.Z.getSerializable("ru.ok.tamtam.extra.LOCATION");
            if (er7Var3 == null) {
                er7Var3 = er7Var2;
            }
            boolean z2 = this.Z.getBoolean("ru.ok.tamtam.extra.LIVE");
            str = "ru.ok.messages.location.FrgLocationMap";
            long j4 = this.Z.getLong("ru.ok.tamtam.extra.DATE");
            er7Var = er7Var2;
            boolean z3 = this.Z.getBoolean("ru.ok.tamtam.extra.ACTIVE");
            z = zM;
            String string = this.Z.getString("ru.ok.tamtam.extra.DEVICE_ID");
            j = 0;
            if (j2 == 0) {
                e08Var = null;
            } else {
                if (j3 == ((p7b) this.q1.q()).a.t()) {
                    strD = h0(i);
                } else {
                    uj3 uj3VarI = el3VarG.i(j3, false);
                    strD = uj3VarI != null ? uj3VarI.d() : null;
                }
                d08 d08Var = new d08(er7Var3);
                d08Var.c = j2;
                d08Var.b = j3;
                d08Var.e = strD;
                d08Var.h = z2;
                d08Var.j = j4;
                d08Var.d = i08.c;
                d08Var.k = z3;
                d08Var.l = string;
                e08Var = new e08(d08Var);
            }
        }
        this.J1 = e08Var == null;
        ir7 ir7Var = (bundle == null || (jr7Var = (jr7) bundle.getParcelable("ru.ok.tamtam.extra.VIEW_STATE")) == null) ? null : jr7Var.a;
        if (ir7Var == null) {
            boolean z4 = !e52VarC.b.J.b(32);
            if (this.Z != null) {
                z4 &= !r1.getBoolean("ru.ok.tamtam.extra.DISABLE_LIVE", false);
            }
            gr7 gr7Var = new gr7();
            gr7Var.a = z4;
            if (e08Var == null) {
                gr7Var.c = 2;
                gr7Var.d = 2;
                gr7Var.h = -1L;
            } else {
                gr7Var.c = 1;
                gr7Var.d = 1;
                gr7Var.h = e08Var.c;
            }
            gr7Var.i = z;
            gr7Var.j = ((p7b) this.q1.q()).a.g.getBoolean("app.dev.live.location.debug.view", false);
            gr7Var.k = ((p7b) this.q1.q()).a.g.getBoolean("app.dev.randomize.my.live.location", false);
            ir7Var = new ir7(gr7Var);
        }
        this.G1 = ir7Var;
        p7b p7bVarN = ((y8a) ((ed3) this.p1.b)).n();
        int i2 = p7bVarN.c.g.getInt("app.location.map.type", 1);
        ny7 ny7Var2 = (bundle == null || (oy7Var = (oy7) bundle.getParcelable("ru.ok.tamtam.extra.MAP_CONFIG")) == null) ? null : oy7Var.a;
        if (ny7Var2 == null) {
            if (e08Var == null) {
                ny7 ny7Var3 = new ny7();
                ny7Var3.a = 1.401298464324817E-45d;
                ny7Var3.b = 1.401298464324817E-45d;
                ny7Var3.c = false;
                ny7Var3.d = true;
                ny7Var3.e = true;
                ny7Var3.f = i2;
                ny7Var3.g = 14.0f;
                ny7Var3.h = 0.0f;
                ny7Var3.i = 0.0f;
                ny7Var = new ny7(ny7Var3);
            } else {
                Bundle bundle3 = this.Z;
                float f = bundle3 == null ? 14.0f : bundle3.getFloat("ru.ok.tamtam.extra.ZOOM", 14.0f);
                er7 er7Var4 = e08Var.a;
                double d = er7Var4.a;
                float f2 = f > 0.0f ? f : 14.0f;
                ny7 ny7Var4 = new ny7();
                ny7Var4.a = d;
                ny7Var4.b = er7Var4.b;
                ny7Var4.c = false;
                ny7Var4.d = true;
                ny7Var4.e = true;
                ny7Var4.f = i2;
                ny7Var4.g = f2;
                ny7Var4.h = 0.0f;
                ny7Var4.i = 0.0f;
                ny7Var = new ny7(ny7Var4);
            }
            ny7Var2 = ny7Var;
        }
        er7 er7Var5 = bundle != null ? (er7) bundle.getSerializable("ru.ok.tamtam.extra.LAST_LOCATION") : null;
        er7 er7Var6 = er7Var5 == null ? er7Var : er7Var5;
        boolean z5 = bundle != null ? bundle.getBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", true) : true;
        new WeakReference(this);
        new WeakReference(null);
        tg tgVarC = ((y8a) ((ed3) this.p1.b)).c();
        hle hleVarQ = ((y8a) ((ed3) this.p1.b)).q();
        ri4 ri4VarH = this.q1.h();
        long j5 = e08Var == null ? j : e08Var.c;
        c cVar2 = this.F0;
        hleVarQ.getClass();
        el9 el9Var = new el9(contextD0, viewGroup, idaVarO, el3VarG, vy7Var, adVarB, cVar2, j5, tgVarC, p7bVarN, ((jle) hleVarQ).a(), ri4VarH, T0().getBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", true), (u8e) ((y8a) ((ed3) this.p1.b)).getAccessor().c(u8e.class));
        String str2 = str;
        this.C1 = new fk9(this.G1, ny7Var2, er7Var6, z5, el9Var, nr7Var, this.E1, this.F1, jT, this.H1, strH0, e08Var, this, el3VarG, this.D1, ri4VarH, hleVarQ, this.q1.q());
        if (this.G1.c != 1 && bundle == null) {
            this.D1.A();
        }
        el9Var.c();
        View view = (View) el9Var.c;
        if (view != null) {
            return view;
        }
        hm9.p(str2, "Root view is null", null);
        return null;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void y0() {
        n16 n16VarS;
        a aVarD;
        super.y0();
        b bVarB0 = b0();
        if (bVarB0 == null || (bVarB0 instanceof ActLocationMap) || (aVarD = (n16VarS = bVarB0.S()).D(xxb.frg_location_map__map)) == null) {
            return;
        }
        he0 he0Var = new he0(n16VarS);
        he0Var.h(aVarD);
        he0Var.d(true);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void z0() {
        super.z0();
        fk9 fk9Var = this.C1;
        if (fk9Var != null) {
            xpb xpbVar = fk9Var.G0;
            if (xpbVar != null) {
                xpbVar.b();
            }
            fk9Var.H0.b();
            fk9Var.s0.getClass();
            cqc.b(fk9Var.K0);
            cqc.b(fk9Var.X);
            cqc.b(fk9Var.J0);
            el9 el9Var = (el9) ((kk9) fk9Var.b);
            qy7 qy7Var = el9Var.K0;
            if (qy7Var != null) {
                LinkedHashMap linkedHashMap = qy7Var.a;
                for (xi0 xi0Var : linkedHashMap.values()) {
                    xi0Var.a.F();
                    zl4 zl4Var = xi0Var.c;
                    if (zl4Var != null) {
                        zl4Var.g();
                    }
                }
                linkedHashMap.clear();
                qy7Var.b();
                qy7Var.a();
            }
            el9Var.C0.animate().cancel();
            ValueAnimator valueAnimator = el9Var.N0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            el9Var.o.g();
            this.C1 = null;
        }
    }
}
