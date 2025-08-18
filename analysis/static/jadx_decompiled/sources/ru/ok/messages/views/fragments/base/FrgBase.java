package ru.ok.messages.views.fragments.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import defpackage.ai3;
import defpackage.ase;
import defpackage.bk4;
import defpackage.c8;
import defpackage.cy7;
import defpackage.ed3;
import defpackage.gua;
import defpackage.hc3;
import defpackage.hc7;
import defpackage.hm9;
import defpackage.jke;
import defpackage.jpc;
import defpackage.jyc;
import defpackage.nwe;
import defpackage.pi0;
import defpackage.q0e;
import defpackage.q5;
import defpackage.r0e;
import defpackage.s3a;
import defpackage.sme;
import defpackage.tu0;
import defpackage.wmd;
import defpackage.xpb;
import defpackage.y7g;
import defpackage.y8a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.views.dialogs.ProgressDialog;

/* loaded from: classes2.dex */
public abstract class FrgBase extends a implements ase, hc7 {
    public bk4 m1;
    public y7g p1;
    public jyc q1;
    public sme r1;
    public c8 t1;
    public gua u1;
    public ProgressDialog w1;
    public xpb x1;
    public hc3 y1;
    public ArrayList z1;
    public final String l1 = getClass().getSimpleName();
    public boolean n1 = true;
    public boolean o1 = false;
    public final HashSet s1 = new HashSet();
    public long v1 = 0;
    public final q0e A1 = r0e.a(null);

    @Override // androidx.fragment.app.a
    public final void A0() {
        this.S0 = true;
        hm9.k(this.l1, "lifecycle: onDetach");
    }

    @Override // defpackage.hc7
    public final boolean B0(int i, KeyEvent keyEvent) {
        Iterator it = this.z1.iterator();
        while (it.hasNext()) {
            if (((hc7) it.next()).B0(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.a
    public final void D0(boolean z) {
        hm9.m(this.l1, "onHiddenChanged %b", Boolean.valueOf(z));
        this.A1.m(null, Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.a
    public void H0() {
        this.S0 = true;
        hm9.n(this.l1, "lifecycle: onPause");
        this.o1 = false;
        if (TextUtils.isEmpty(f1())) {
            return;
        }
        ((y8a) ((ed3) this.p1.b)).b().l(SystemClock.elapsedRealtime() - this.v1, f1());
    }

    @Override // androidx.fragment.app.a
    public final void J0(int i, String[] strArr, int[] iArr) {
        wmd.z(d0(), strArr, iArr);
        if (!k1()) {
            this.u1 = new gua(i, strArr, iArr);
            return;
        }
        xpb xpbVar = this.x1;
        if (xpbVar != null) {
            xpbVar.e(new gua(i, strArr, iArr));
        }
        o1(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.a
    public void K0() {
        this.S0 = true;
        String str = this.l1;
        hm9.n(str, "lifecycle: onResume");
        StringBuilder sb = new StringBuilder("unhandled events: ");
        HashSet hashSet = this.s1;
        sb.append(hashSet.size());
        hm9.n(str, sb.toString());
        this.o1 = true;
        this.v1 = SystemClock.elapsedRealtime();
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        if (((jyc) jke.b()).d().d()) {
            cy7 cy7VarR = ((y8a) ((ed3) this.p1.b)).r();
            int i = tu0.m;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                cy7VarR.c((pi0) it.next());
            }
            hashSet.clear();
        }
        gua guaVar = this.u1;
        if (guaVar != null) {
            xpb xpbVar = this.x1;
            if (xpbVar != null) {
                xpbVar.e(guaVar);
            }
            gua guaVar2 = this.u1;
            o1(guaVar2.a, guaVar2.b, guaVar2.c);
            this.u1 = null;
        }
        c8 c8Var = this.t1;
        if (c8Var != null) {
            l1(c8Var.a, c8Var.b, c8Var.c);
            this.t1 = null;
        }
    }

    @Override // androidx.fragment.app.a
    public void L0(Bundle bundle) {
        HashSet hashSet = this.s1;
        int i = tu0.m;
        hm9.k("tu0", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    @Override // androidx.fragment.app.a
    public final void M0() {
        this.S0 = true;
        hm9.k(this.l1, "lifecycle: onStart");
    }

    @Override // androidx.fragment.app.a
    public final void N0() {
        this.S0 = true;
        hm9.k(this.l1, "lifecycle: onStop");
    }

    @Override // androidx.fragment.app.a
    public final void P0(Bundle bundle) {
        this.S0 = true;
    }

    public final void e1() {
        q5 q5VarG1 = g1();
        if (q5VarG1 != null) {
            q5VarG1.finish();
        }
    }

    public String f1() {
        return null;
    }

    public final q5 g1() {
        if (b0() == null || b0().isFinishing()) {
            return null;
        }
        return (q5) b0();
    }

    public final ai3 h1() {
        s3a s3aVarB0 = b0();
        if (!(s3aVarB0 instanceof nwe)) {
            return null;
        }
        nwe nweVar = (nwe) s3aVarB0;
        if (nweVar.a() != null) {
            return nweVar.a();
        }
        return null;
    }

    public void i1() {
    }

    public final void j1() {
        ProgressDialog progressDialog = this.w1;
        if (progressDialog != null) {
            try {
                progressDialog.f1(false, false);
            } catch (Exception e) {
                hm9.p(this.l1, "Can't hideProgressDialog", e);
            }
            this.w1 = null;
            return;
        }
        c cVar = this.F0;
        if (cVar != null) {
            a aVarE = cVar.E("ru.ok.messages.views.dialogs.ProgressDialog");
            ProgressDialog progressDialog2 = aVarE instanceof ProgressDialog ? (ProgressDialog) aVarE : null;
            if (progressDialog2 == null || !progressDialog2.D1) {
                return;
            }
            progressDialog2.f1(false, false);
        }
    }

    public boolean k1() {
        return this.o1;
    }

    public void l1(int i, int i2, Intent intent) {
    }

    public void m1(q5 q5Var) {
        this.n1 = false;
    }

    public boolean n1() {
        return false;
    }

    public void o1(int i, String[] strArr, int[] iArr) {
    }

    public final ProgressDialog p1(int i, boolean z) {
        if (!k1()) {
            return null;
        }
        j1();
        String strH0 = h0(i);
        c cVar = this.F0;
        ProgressDialog progressDialog = new ProgressDialog();
        Bundle bundle = new Bundle();
        bundle.putString("ru.ok.tamtam.extra.TITLE", strH0);
        bundle.putBoolean("ru.ok.tamtam.extra.CANCELABLE", z);
        bundle.putString("ru.ok.tamtam.extra.NEGATIVE_TEXT", null);
        bundle.putBoolean("ru.ok.tamtam.extra.INDETERMINATE", true);
        progressDialog.X0(bundle);
        progressDialog.k1(cVar, "ru.ok.messages.views.dialogs.ProgressDialog");
        this.w1 = progressDialog;
        return progressDialog;
    }

    public final ProgressDialog q1() {
        return p1(jpc.K, true);
    }

    @Override // androidx.fragment.app.a
    public final void s0(int i, int i2, Intent intent) {
        super.s0(i, i2, intent);
        if (k1()) {
            l1(i, i2, intent);
        } else {
            this.t1 = new c8(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.a
    public final void t0(Activity activity) {
        this.S0 = true;
        hm9.n(this.l1, "lifecycle: onAttach");
        if (!(activity instanceof q5)) {
            throw new IllegalStateException("Use FrgBase only in ActBase subclasses.");
        }
        this.n1 = true;
        m1((q5) activity);
    }

    @Override // defpackage.ase
    public final sme u() {
        return this.r1;
    }

    @Override // androidx.fragment.app.a
    public void v0(Bundle bundle) {
        q5 q5Var = (q5) b0();
        y7g y7gVar = q5Var.K0;
        this.p1 = y7gVar;
        ((y8a) ((ed3) y7gVar.b)).getClass();
        this.q1 = jyc.a;
        this.r1 = q5Var.u();
        this.m1 = (bk4) this.p1.c;
        super.v0(bundle);
        hm9.n(this.l1, "lifecycle: onCreate");
        if (this.n1) {
            throw new IllegalStateException("super.onAttachBase() not called");
        }
        if (bundle != null) {
            tu0.u(bundle, this.s1);
        }
        ((y8a) ((ed3) this.p1.b)).r().d(this);
        this.z1 = new ArrayList();
    }

    @Override // androidx.fragment.app.a
    public void y0() {
        hm9.n(this.l1, "lifecycle: onDestroy");
        ((y8a) ((ed3) this.p1.b)).r().f(this);
        this.S0 = true;
        this.z1.clear();
    }

    @Override // androidx.fragment.app.a
    public void z0() {
        hm9.k(this.l1, "lifecycle: onDestroyView");
        hc3 hc3Var = this.y1;
        if (hc3Var != null) {
            hc3Var.d();
        }
        this.S0 = true;
    }
}
