package ru.ok.messages.contacts.profile;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import defpackage.a14;
import defpackage.ai3;
import defpackage.an3;
import defpackage.b;
import defpackage.b56;
import defpackage.c5;
import defpackage.dgc;
import defpackage.dpc;
import defpackage.dx3;
import defpackage.ed3;
import defpackage.ee4;
import defpackage.epc;
import defpackage.f46;
import defpackage.gof;
import defpackage.gpc;
import defpackage.he0;
import defpackage.hh3;
import defpackage.hm9;
import defpackage.i5;
import defpackage.iq1;
import defpackage.jpc;
import defpackage.n16;
import defpackage.ngg;
import defpackage.nwe;
import defpackage.oi0;
import defpackage.pke;
import defpackage.r5;
import defpackage.s46;
import defpackage.sme;
import defpackage.spa;
import defpackage.tg;
import defpackage.tu0;
import defpackage.u46;
import defpackage.uae;
import defpackage.vl;
import defpackage.vq3;
import defpackage.wm3;
import defpackage.wuc;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.yyb;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ActContactAvatars extends r5 implements gof, u46, b56, s46, nwe {
    public static final /* synthetic */ int h1 = 0;
    public ViewPager V0;
    public vq3 W0;
    public FrgContactAvatarsLoader X0;
    public dx3 Y0;
    public ArrayList Z0;
    public final ArrayList a1 = new ArrayList();
    public int b1;
    public int c1;
    public int d1;
    public ai3 e1;
    public tg f1;
    public iq1 g1;

    @Override // defpackage.q5
    public final String Z() {
        return "AVATAR_PHOTO";
    }

    @Override // defpackage.nwe
    public final ai3 a() {
        return this.e1;
    }

    @Override // defpackage.b56
    public final void c(boolean z, boolean z2, boolean z3) {
        if (z) {
            g0(null);
        } else {
            b0(null);
        }
        if (z) {
            this.f1.e((Toolbar) this.e1.b);
        } else {
            this.f1.o((Toolbar) this.e1.b);
        }
    }

    @Override // defpackage.b56
    public final void e() {
        c(((Toolbar) this.e1.b).getVisibility() != 0, true, false);
    }

    @Override // defpackage.b56
    public final boolean f() {
        return ((Toolbar) this.e1.b).getVisibility() == 0;
    }

    @Override // defpackage.gof
    public final void k(int i) {
    }

    public final void k0(int i, List list) {
        hm9.n("ru.ok.messages.contacts.profile.ActContactAvatars", "urls = " + list.size() + ", total = " + i);
        this.b1 = i;
        ArrayList arrayList = this.a1;
        arrayList.clear();
        arrayList.addAll(list);
        this.W0.d();
        this.V0.post(new b(3, this));
    }

    public final void l0(int i) {
        if (this.b1 != 0) {
            if (i == -1) {
                i = 0;
            }
            this.e1.g((i + 1) + " " + getString(dpc.B) + " " + this.b1);
        }
    }

    @Override // defpackage.gof
    public final void m(int i) {
        hm9.n("ru.ok.messages.contacts.profile.ActContactAvatars", "onPageSelected: " + i);
        this.d1 = i;
        l0(i);
        if (this.a1.size() - i < 3) {
            this.X0.r1();
        }
        ((y8a) vl.b()).b().f("AVATAR_PHOTO");
    }

    @Override // defpackage.gof
    public final void n(int i, float f) {
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        FrgContactAvatarsLoader frgContactAvatarsLoader;
        super.onCreate(bundle);
        this.f1 = ((y8a) ((ed3) this.K0.b)).c();
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        ai3 ai3VarJ0 = j0(yyb.act_contact_avatars);
        this.e1 = ai3VarJ0;
        Drawable drawableU = ngg.u(gpc.R, -1, this);
        Toolbar toolbar = (Toolbar) ai3VarJ0.b;
        if (toolbar != null) {
            toolbar.setOverflowIcon(drawableU);
        }
        g0(null);
        int i = epc.b;
        f0(getResources().getColor(i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        Toolbar toolbar2 = (Toolbar) this.e1.b;
        if (toolbar2 != null) {
            toolbar2.setBackgroundResource(i);
        }
        ai3 ai3Var = this.e1;
        Drawable drawableU2 = ngg.u(gpc.k, -1, this);
        Toolbar toolbar3 = (Toolbar) ai3Var.b;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(drawableU2);
        }
        Drawable navigationIcon = ((Toolbar) this.e1.b).getNavigationIcon();
        if (navigationIcon != null) {
            ngg.G(navigationIcon, -1);
        }
        ai3 ai3Var2 = this.e1;
        c5 c5Var = new c5(1, this);
        Toolbar toolbar4 = (Toolbar) ai3Var2.b;
        if (toolbar4 != null) {
            toolbar4.setNavigationOnClickListener(c5Var);
        }
        TextView textView = (TextView) this.e1.o;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        ViewPager viewPager = (ViewPager) findViewById(xxb.act_contact_profile__vp_pager);
        this.V0 = viewPager;
        viewPager.b(new i5(this, 1));
        vq3 vq3Var = new vq3(S(), this.a1, ((y8a) ((ed3) this.K0.b)).n().a.t() == getIntent().getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0L), this.c1);
        this.W0 = vq3Var;
        this.V0.setAdapter(vq3Var);
        if (bundle != null) {
            this.Y0 = (dx3) bundle.getSerializable("ru.ok.tamtam.extra.REMOVE_REQUESTS");
            this.Z0 = (ArrayList) bundle.getSerializable("ru.ok.tamtam.extra.MAKE_MAIN_REQUESTS");
            int i2 = bundle.getInt("ru.ok.tamtam.extra.MAIN_PHOTO_INDEX");
            this.c1 = i2;
            this.W0.k = i2;
            this.d1 = bundle.getInt("ru.ok.tamtam.extra.CURRENT_PAGE");
        }
        FrgContactAvatarsLoader frgContactAvatarsLoader2 = (FrgContactAvatarsLoader) S().E("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader");
        this.X0 = frgContactAvatarsLoader2;
        if (frgContactAvatarsLoader2 == null) {
            this.d1 = 0;
            long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0L);
            if (longExtra == 0) {
                wm3 wm3Var = ((an3) getIntent().getParcelableExtra("ru.ok.tamtam.extra.CONTACT_INFO")).a;
                frgContactAvatarsLoader = new FrgContactAvatarsLoader();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ru.ok.tamtam.extra.CONTACT_INFO", new an3(wm3Var));
                frgContactAvatarsLoader.X0(bundle2);
            } else {
                FrgContactAvatarsLoader frgContactAvatarsLoader3 = new FrgContactAvatarsLoader();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("ru.ok.tamtam.extra.CONTACT_ID", longExtra);
                frgContactAvatarsLoader3.X0(bundle3);
                frgContactAvatarsLoader = frgContactAvatarsLoader3;
            }
            this.X0 = frgContactAvatarsLoader;
            n16 n16VarS = S();
            FrgContactAvatarsLoader frgContactAvatarsLoader4 = this.X0;
            n16VarS.getClass();
            he0 he0Var = new he0(n16VarS);
            he0Var.f(0, frgContactAvatarsLoader4, "ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", 1);
            he0Var.d(false);
        }
        ((y8a) vl.b()).b().f("AVATAR_PHOTO");
    }

    @uae
    public void onEvent(dgc dgcVar) {
        dx3 dx3Var = this.Y0;
        if (dx3Var == null || !dx3Var.contains(Long.valueOf(dgcVar.a))) {
            return;
        }
        FrgContactAvatarsLoader frgContactAvatarsLoader = this.X0;
        if (frgContactAvatarsLoader != null) {
            int i = frgContactAvatarsLoader.E1 - 1;
            frgContactAvatarsLoader.E1 = i;
            if (i <= 0) {
                i = 0;
            }
            frgContactAvatarsLoader.E1 = i;
        }
        this.Y0.remove(Long.valueOf(dgcVar.a));
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.X0.J1 = null;
    }

    @Override // defpackage.q5, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        super.onResume();
        FrgContactAvatarsLoader frgContactAvatarsLoader = this.X0;
        frgContactAvatarsLoader.J1 = this;
        if (frgContactAvatarsLoader.I1) {
            k0(frgContactAvatarsLoader.G1, frgContactAvatarsLoader.D1);
        }
        FrgContactAvatarsLoader frgContactAvatarsLoader2 = this.X0;
        k0(frgContactAvatarsLoader2.F1 + frgContactAvatarsLoader2.G1, frgContactAvatarsLoader2.D1);
        ((y8a) ((ed3) this.K0.b)).m().f(wuc.AVATAR_VIEWER, spa.f);
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("ru.ok.tamtam.extra.REMOVE_REQUESTS", this.Y0);
        bundle.putSerializable("ru.ok.tamtam.extra.MAKE_MAIN_REQUESTS", this.Z0);
        bundle.putInt("ru.ok.tamtam.extra.MAIN_PHOTO_INDEX", this.c1);
        bundle.putInt("ru.ok.tamtam.extra.CURRENT_PAGE", this.d1);
    }

    @Override // defpackage.q5, defpackage.ase
    public final sme u() {
        return ee4.e0;
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        ArrayList arrayList;
        long j = oi0Var.a;
        dx3 dx3Var = this.Y0;
        if ((dx3Var == null || !dx3Var.contains(Long.valueOf(j))) && ((arrayList = this.Z0) == null || !arrayList.contains(Long.valueOf(j)))) {
            return;
        }
        if (this.P0) {
            dx3 dx3Var2 = this.Y0;
            pke pkeVar = oi0Var.b;
            long j2 = oi0Var.a;
            if (dx3Var2 != null && dx3Var2.contains(Long.valueOf(j2))) {
                this.Y0.remove(Long.valueOf(j2));
                if (f46.U(pkeVar.b)) {
                    return;
                }
                a14.N(1, this, getString(jpc.i));
                return;
            }
            ArrayList arrayList2 = this.Z0;
            if (arrayList2 == null || !arrayList2.contains(Long.valueOf(j2))) {
                return;
            }
            this.Z0.remove(Long.valueOf(j2));
            if (f46.U(pkeVar.b)) {
                return;
            }
            a14.N(1, this, getString(jpc.i));
            return;
        }
        tu0.A(this.Q0, oi0Var, false);
    }

    @uae
    public void onEvent(hh3 hh3Var) {
        if (this.P0) {
            throw null;
        }
    }
}
