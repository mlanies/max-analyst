package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.a14;
import defpackage.ak9;
import defpackage.b56;
import defpackage.bk9;
import defpackage.bq7;
import defpackage.cqc;
import defpackage.drd;
import defpackage.e5;
import defpackage.ed3;
import defpackage.hkf;
import defpackage.hle;
import defpackage.hm9;
import defpackage.ik9;
import defpackage.iq1;
import defpackage.j00;
import defpackage.jle;
import defpackage.kk9;
import defpackage.mmf;
import defpackage.nd7;
import defpackage.nse;
import defpackage.oag;
import defpackage.omf;
import defpackage.pl9;
import defpackage.q1a;
import defpackage.up7;
import defpackage.we8;
import defpackage.wk9;
import defpackage.xe8;
import defpackage.xxb;
import defpackage.y38;
import defpackage.y8a;
import defpackage.y98;
import defpackage.yyb;
import defpackage.z16;
import defpackage.zmf;
import defpackage.zqe;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgLocalVideo extends FrgLocalMedia implements ik9 {
    public we8 I1;
    public wk9 J1;
    public bk9 K1;
    public SimpleDraweeView L1;
    public y38 M1;

    @Override // androidx.fragment.app.a
    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.o1) {
            return true;
        }
        e1();
        return true;
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void H0() {
        super.H0();
        w1();
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void K0() {
        super.K0();
        this.E1.c();
    }

    @Override // defpackage.qq7
    public final void N(up7 up7Var, Uri uri, int i, Uri uri2) {
        if (uri != null) {
            this.L1.setImageURI(uri);
        }
    }

    @Override // defpackage.ik9
    public final void T() {
        b56 b56VarR1 = r1();
        if (b56VarR1 != null) {
            b56VarR1.e();
        }
    }

    @Override // defpackage.ik9
    public final void X() {
        b56 b56VarR1 = r1();
        if (b56VarR1 == null) {
            return;
        }
        b56VarR1.c(true, true, false);
    }

    @Override // defpackage.ik9
    public final void Y(Throwable th) {
        a14.N(0, d0(), zqe.b(d0(), th));
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void i1() {
        bk9 bk9Var = this.K1;
        if (bk9Var == null) {
            return;
        }
        kk9 kk9Var = (kk9) bk9Var.b;
        if (kk9Var instanceof nse) {
            ((nse) kk9Var).c();
        }
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia
    public final void t1() {
        if (this.K1 == null) {
            return;
        }
        b56 b56VarR1 = r1();
        if (b56VarR1 == null || !b56VarR1.f()) {
            this.K1.k1(false);
        } else {
            this.K1.k1(true);
        }
    }

    public final void u1() {
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        if (this.K1 == null) {
            return;
        }
        up7 up7Var = this.C1;
        if (up7Var == null || ((up7Var instanceof j00) && oag.t(((j00) up7Var).u0.s))) {
            hm9.n("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Can't bind local media. Skip");
            ((View) this.J1.c).setVisibility(8);
            return;
        }
        hm9.n("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Bind local media success");
        ((View) this.J1.c).setVisibility(0);
        bk9 bk9Var = this.K1;
        up7 up7Var2 = this.C1;
        bk9Var.getClass();
        hm9.m("bk9", "Bind local media %s", Long.valueOf(up7Var2.b));
        ((bq7) bk9Var.c).j = false;
        cqc.b(bk9Var.u0);
        bk9Var.c2();
        bk9Var.b2();
        hkf hkfVarA = bk9Var.t0.a();
        hkfVarA.c = true;
        hkfVarA.e = true;
        hkfVarA.f = false;
        hkfVarA.g = false;
        hkfVarA.n = null;
        hkfVarA.s = true;
        hkf hkfVar = new hkf(hkfVarA);
        bk9Var.t0 = hkfVar;
        ((pl9) ((kk9) bk9Var.b)).d(hkfVar);
        boolean z = up7Var2 instanceof j00;
        hle hleVar = bk9Var.Y;
        if (z) {
            j00 j00Var = (j00) up7Var2;
            if (oag.t(j00Var.u0.s)) {
                jle jleVar = (jle) hleVar;
                drd drdVarI = bk9Var.s0.c(j00Var.u0, j00Var.v0, j00Var.w0).m(jleVar.a()).i(jleVar.b());
                iq1 iq1Var = new iq1(new ak9(bk9Var, i2), i, new ak9(bk9Var, i3));
                drdVarI.k(iq1Var);
                bk9Var.u0 = iq1Var;
                return;
            }
        }
        q1a q1aVar = new q1a(1, new y98(bk9Var, 15, up7Var2));
        hleVar.getClass();
        jle jleVar2 = (jle) hleVar;
        drd drdVarI2 = q1aVar.m(jleVar2.a()).i(jleVar2.b());
        iq1 iq1Var2 = new iq1(new ak9(bk9Var, i2), i, new ak9(bk9Var, i3));
        drdVarI2.k(iq1Var2);
        bk9Var.u0 = iq1Var2;
    }

    public final void v1() {
        w1();
        View view = (View) this.J1.c;
        if (view != null) {
            view.setVisibility(0);
        }
        this.K1 = new bk9(this.J1, this.I1, d0(), ((y8a) ((ed3) this.p1.b)).j().f, ((y8a) ((ed3) this.p1.b)).q(), this, ((y8a) ((ed3) this.p1.b)).s(), this.M1);
        u1();
    }

    public final void w1() {
        if (this.K1 == null) {
            return;
        }
        hm9.n("ru.ok.messages.media.mediabar.FrgLocalMedia", "Release");
        ((bq7) this.K1.c).n();
        this.K1.l1(false);
        this.K1 = null;
    }

    @Override // androidx.fragment.app.a
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_local_video, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.r1.m);
        this.I1 = ((xe8) b0()).b();
        this.M1 = b0() instanceof y38 ? (y38) b0() : null;
        this.J1 = new wk9(d0(), slideOutLayout.findViewById(xxb.frg_local_video__player), ((y8a) ((ed3) this.p1.b)).c(), ((y8a) ((ed3) this.p1.b)).b());
        if (bundle == null && this.Z.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT")) {
            this.K1 = new bk9(this.J1, this.I1, d0(), ((y8a) ((ed3) this.p1.b)).j().f, ((y8a) ((ed3) this.p1.b)).q(), this, ((y8a) ((ed3) this.p1.b)).s(), this.M1);
            u1();
        } else {
            ((View) this.J1.c).setVisibility(8);
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(xxb.frg_local_video__iv_video);
        this.L1 = simpleDraweeView;
        nd7.h(simpleDraweeView, new e5(9, this));
        SimpleDraweeView simpleDraweeView2 = this.L1;
        if (this.D1) {
            simpleDraweeView2.setTransitionName(this.C1.a());
        }
        z16 z16Var = new z16(3, this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(slideOutLayout, z16Var);
        mmf.c(slideOutLayout);
        return slideOutLayout;
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void y0() {
        super.y0();
        w1();
    }
}
