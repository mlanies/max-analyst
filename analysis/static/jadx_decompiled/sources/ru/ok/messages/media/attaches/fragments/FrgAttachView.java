package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import defpackage.ai3;
import defpackage.d74;
import defpackage.e52;
import defpackage.ed3;
import defpackage.es8;
import defpackage.f6;
import defpackage.ig5;
import defpackage.iq1;
import defpackage.iz7;
import defpackage.jle;
import defpackage.jyc;
import defpackage.l20;
import defpackage.l6f;
import defpackage.n46;
import defpackage.nwe;
import defpackage.q5;
import defpackage.qw8;
import defpackage.s3a;
import defpackage.tp7;
import defpackage.u7;
import defpackage.xw8;
import defpackage.xxb;
import defpackage.y8a;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public abstract class FrgAttachView extends FrgSlideOut {
    public es8 C1;
    public l20 D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1 = false;

    public static Bundle s1(l20 l20Var, es8 es8Var, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH", l20Var != null ? qw8.toByteArray(b.d(l20Var)) : null);
        bundle.putParcelable("ru.ok.tamtam.extra.MESSAGE", new xw8(es8Var));
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", z);
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", z2);
        bundle.putBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", z3);
        return bundle;
    }

    public final void A1(SlideOutLayout slideOutLayout, View view) {
        if (this.E1 || this.F1) {
            view.setTransitionName(this.D1.r);
        }
        if (this.E1) {
            return;
        }
        Y0(true);
        ai3 ai3VarV1 = v1();
        if (ai3VarV1 != null) {
            ai3VarV1.h();
        }
        slideOutLayout.setSlideOutListener(this);
    }

    public final void B1() {
        n46 n46VarR1 = r1();
        if (n46VarR1 != null) {
            ActAttachesView actAttachesView = (ActAttachesView) n46VarR1;
            if (actAttachesView.r1 == 1) {
                actAttachesView.x1.d(2, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
                actAttachesView.setRequestedOrientation(0);
            } else {
                actAttachesView.x1.d(1, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
                actAttachesView.setRequestedOrientation(1);
            }
        }
    }

    public void C1() {
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.tsd
    public final boolean D() {
        return !this.F1;
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.tsd
    public void M(int i) {
        if (!this.F1) {
            super.M(i);
            return;
        }
        androidx.fragment.app.b bVarB0 = b0();
        bVarB0.getClass();
        u7.a(bVarB0);
    }

    @Override // androidx.fragment.app.a
    public final void O0(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        if (this.H1) {
            this.H1 = false;
            y1(this.W0);
        }
    }

    @Override // androidx.fragment.app.a
    public final void c1(boolean z) {
        super.c1(z);
        if (this.D1 != null) {
            y1(z);
        } else {
            this.H1 = true;
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return null;
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, ru.ok.messages.views.fragments.base.FrgBase
    public final void m1(q5 q5Var) {
        super.m1(q5Var);
        if (!(q5Var instanceof n46)) {
            throw new RuntimeException("FrgAttachView must be attached to activity that implements FrgAttachView.Listener");
        }
    }

    public final e52 t1() {
        return this.q1.f().C(this.C1.a.t0);
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public final n46 r1() {
        if (g1() != null) {
            return (n46) g1();
        }
        return null;
    }

    public final ai3 v1() {
        s3a s3aVarB0 = b0();
        if (s3aVarB0 instanceof nwe) {
            return ((nwe) s3aVarB0).a();
        }
        return null;
    }

    @Override // androidx.fragment.app.a
    public void w0(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemE;
        boolean z = (this.C1.a.C() || this.C1.a.c == 0 || (this.D1.f() && this.D1.b.s0 == 0)) ? false : true;
        ai3 ai3VarV1 = v1();
        if (ai3VarV1 == null || (menuItemE = ai3VarV1.e(xxb.menu_attachments__forward)) == null) {
            return;
        }
        menuItemE.setVisible(z);
    }

    public final void w1(l6f l6fVar, f6 f6Var) {
        if (this.E1) {
            return;
        }
        long j = l6fVar.c;
        ((y8a) ((ed3) this.p1.b)).getClass();
        tp7 tp7VarM = jyc.a.m();
        tp7VarM.getClass();
        tp7.b(tp7VarM, j, true, 2).i(((jle) ((y8a) ((ed3) this.p1.b)).q()).b()).m(((jle) ((y8a) ((ed3) this.p1.b)).q()).a()).k(new iq1(new d74(this, 14, f6Var), 2, new ig5(17)));
    }

    public void x1(boolean z) {
    }

    public abstract void y1(boolean z);

    public final void z1() {
        this.D1 = iz7.a(this.Z.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"));
        this.C1 = ((xw8) this.Z.getParcelable("ru.ok.tamtam.extra.MESSAGE")).a;
        this.E1 = this.Z.getBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", false);
        this.F1 = this.Z.getBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", false);
        this.G1 = this.Z.getBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", false);
    }
}
