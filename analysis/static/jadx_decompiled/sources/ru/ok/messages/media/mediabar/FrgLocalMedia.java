package ru.ok.messages.media.mediabar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.b;
import defpackage.ai3;
import defpackage.cq7;
import defpackage.dq7;
import defpackage.ed3;
import defpackage.epc;
import defpackage.j47;
import defpackage.jp;
import defpackage.lt3;
import defpackage.ngg;
import defpackage.p4d;
import defpackage.q5;
import defpackage.qq7;
import defpackage.rp7;
import defpackage.u7;
import defpackage.up7;
import defpackage.xxb;
import defpackage.y46;
import defpackage.y8a;
import java.lang.reflect.InvocationTargetException;
import ru.ok.messages.views.fragments.FrgSlideOut;

/* loaded from: classes2.dex */
public abstract class FrgLocalMedia extends FrgSlideOut implements qq7 {
    public up7 C1;
    public boolean D1;
    public dq7 E1;
    public ProgressBar F1;
    public View G1;
    public boolean H1;

    public static Bundle s1(up7 up7Var, boolean z, rp7 rp7Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ru.ok.messages.extra.LOCAL_MEDIA", up7Var);
        bundle.putBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT", z);
        bundle.putParcelable("ru.ok.messages.extra.OPTIONS", rp7Var);
        return bundle;
    }

    @Override // defpackage.qq7
    public final void C(boolean z) {
        ProgressBar progressBar = this.F1;
        if (progressBar == null || this.G1 == null) {
            this.H1 = z;
            return;
        }
        boolean z2 = !z;
        j47.Q(progressBar, z2);
        j47.Q(this.G1, z2);
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.tsd
    public final boolean D() {
        return !this.D1;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public void H0() {
        super.H0();
        dq7 dq7Var = this.E1;
        p4d p4dVar = dq7Var.b;
        p4dVar.f.remove(dq7Var);
        p4dVar.g.remove(dq7Var);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public void K0() {
        super.K0();
        dq7 dq7Var = this.E1;
        p4d p4dVar = dq7Var.b;
        p4dVar.f.add(dq7Var);
        p4dVar.g.add(dq7Var);
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.tsd
    public final void M(int i) {
        y46 y46Var = (y46) g1();
        if (y46Var != null) {
            ActLocalMedias actLocalMedias = (ActLocalMedias) y46Var;
            if (!actLocalMedias.Y0.u0) {
                p4d p4dVar = actLocalMedias.m0().f;
                p4dVar.a.clear();
                p4dVar.n();
                p4dVar.b.clear();
                if (((jp) p4dVar.h).g.getBoolean("app.send.media.as.collage", true)) {
                    p4dVar.l = 3;
                } else {
                    p4dVar.l = 1;
                }
            }
        }
        if (!this.D1) {
            super.M(i);
            return;
        }
        b bVarB0 = b0();
        bVarB0.getClass();
        u7.a(bVarB0);
    }

    @Override // androidx.fragment.app.a
    public void O0(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        this.F1 = (ProgressBar) view.findViewById(xxb.frg_local_media__progress_bar);
        this.G1 = view.findViewById(xxb.frg_local_media__progress_background);
        ngg.H(this.F1, lt3.a(d0(), epc.f));
        j47.Q(this.F1, !this.H1);
        j47.Q(this.G1, !this.H1);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String f1() {
        return null;
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, ru.ok.messages.views.fragments.base.FrgBase
    public final void m1(q5 q5Var) {
        super.m1(q5Var);
        if (!(b0() instanceof y46)) {
            throw new IllegalStateException("Parent activity must implement FrgLocalMedia.Listener interface");
        }
    }

    public void t1() {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.v0(bundle);
        ai3 ai3VarH1 = h1();
        Y0(true);
        if (ai3VarH1 != null) {
            ai3VarH1.h();
        }
        Bundle bundle2 = this.Z;
        this.C1 = (up7) bundle2.getParcelable("ru.ok.messages.extra.LOCAL_MEDIA");
        this.D1 = bundle2.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT");
        this.E1 = ((cq7) ((y8a) ((ed3) this.p1.b)).getAccessor().c(cq7.class)).a(this, this.C1);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public void y0() {
        super.y0();
        this.E1.a();
    }
}
