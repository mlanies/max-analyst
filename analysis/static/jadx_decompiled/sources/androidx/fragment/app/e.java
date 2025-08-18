package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import defpackage.au1;
import defpackage.ef;
import defpackage.eg7;
import defpackage.f16;
import defpackage.fdc;
import defpackage.fg7;
import defpackage.gh7;
import defpackage.mmf;
import defpackage.n16;
import defpackage.ovd;
import defpackage.p16;
import defpackage.pq1;
import defpackage.pvd;
import defpackage.pxb;
import defpackage.qz7;
import defpackage.r16;
import defpackage.rh4;
import defpackage.t16;
import defpackage.u06;
import defpackage.u16;
import defpackage.x16;
import defpackage.yd4;
import defpackage.ynf;
import defpackage.z06;
import defpackage.z7;
import defpackage.zmf;
import defpackage.zr6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {
    public final qz7 a;
    public final f b;
    public final a c;
    public boolean d = false;
    public int e = -1;

    public e(qz7 qz7Var, f fVar, a aVar) {
        this.a = qz7Var;
        this.b = fVar;
        this.c = aVar;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        aVar.H0.S();
        aVar.a = 3;
        aVar.S0 = false;
        aVar.r0(bundle2);
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            aVar.toString();
        }
        if (aVar.U0 != null) {
            Bundle bundle3 = aVar.b;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = aVar.c;
            if (sparseArray != null) {
                aVar.U0.restoreHierarchyState(sparseArray);
                aVar.c = null;
            }
            aVar.S0 = false;
            aVar.P0(bundle4);
            if (!aVar.S0) {
                throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onViewStateRestored()"));
            }
            if (aVar.U0 != null) {
                aVar.e1.a(eg7.ON_CREATE);
            }
        }
        aVar.b = null;
        n16 n16Var = aVar.H0;
        n16Var.H = false;
        n16Var.I = false;
        n16Var.O.g = false;
        n16Var.u(4);
        this.a.t(aVar, false);
    }

    public final void b() {
        a aVar;
        View view;
        View view2;
        int iIndexOfChild = -1;
        a aVar2 = this.c;
        View view3 = aVar2.T0;
        while (true) {
            aVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(pxb.fragment_container_view_tag);
            a aVar3 = tag instanceof a ? (a) tag : null;
            if (aVar3 != null) {
                aVar = aVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        a aVar4 = aVar2.I0;
        if (aVar != null && !aVar.equals(aVar4)) {
            int i = aVar2.K0;
            t16 t16Var = u16.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(aVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(aVar);
            sb.append(" via container with ID ");
            u16.b(new WrongNestedHierarchyViolation(aVar2, zr6.j(sb, i, " without using parent's childFragmentManager")));
            u16.a(aVar2).getClass();
        }
        f fVar = this.b;
        fVar.getClass();
        ViewGroup viewGroup = aVar2.T0;
        if (viewGroup != null) {
            ArrayList arrayList = fVar.a;
            int iIndexOf = arrayList.indexOf(aVar2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        a aVar5 = (a) arrayList.get(iIndexOf);
                        if (aVar5.T0 == viewGroup && (view = aVar5.U0) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    a aVar6 = (a) arrayList.get(i2);
                    if (aVar6.T0 == viewGroup && (view2 = aVar6.U0) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        aVar2.T0.addView(aVar2.U0, iIndexOfChild);
    }

    public final void c() {
        e eVar;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        a aVar2 = aVar.s0;
        f fVar = this.b;
        if (aVar2 != null) {
            eVar = (e) fVar.b.get(aVar2.Y);
            if (eVar == null) {
                throw new IllegalStateException("Fragment " + aVar + " declared target fragment " + aVar.s0 + " that does not belong to this FragmentManager!");
            }
            aVar.t0 = aVar.s0.Y;
            aVar.s0 = null;
        } else {
            String str = aVar.t0;
            if (str != null) {
                eVar = (e) fVar.b.get(str);
                if (eVar == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(aVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(zr6.l(sb, aVar.t0, " that does not belong to this FragmentManager!"));
                }
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            eVar.k();
        }
        c cVar = aVar.F0;
        aVar.G0 = cVar.w;
        aVar.I0 = cVar.y;
        qz7 qz7Var = this.a;
        qz7Var.E(aVar, false);
        ArrayList arrayList = aVar.i1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar3 = ((u06) it.next()).a;
            aVar3.h1.s();
            z7.k(aVar3);
            Bundle bundle = aVar3.b;
            aVar3.h1.t(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        aVar.H0.b(aVar.G0, aVar.V(), aVar);
        aVar.a = 0;
        aVar.S0 = false;
        aVar.u0(aVar.G0.u0);
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onAttach()"));
        }
        Iterator it2 = aVar.F0.p.iterator();
        while (it2.hasNext()) {
            ((p16) it2.next()).a(aVar);
        }
        n16 n16Var = aVar.H0;
        n16Var.H = false;
        n16Var.I = false;
        n16Var.O.g = false;
        n16Var.u(0);
        qz7Var.u(aVar, false);
    }

    public final int d() {
        yd4 yd4Var;
        a aVar = this.c;
        if (aVar.F0 == null) {
            return aVar.a;
        }
        int iMin = this.e;
        int iOrdinal = aVar.c1.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (aVar.z0) {
            if (aVar.A0) {
                iMin = Math.max(this.e, 2);
                View view = aVar.U0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, aVar.a) : Math.min(iMin, 1);
            }
        }
        if (aVar.B0 && aVar.T0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!aVar.w0) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = aVar.T0;
        if (viewGroup != null) {
            aVar.f0().K();
            Object tag = viewGroup.getTag(pxb.special_effects_controller_view_tag);
            if (tag instanceof yd4) {
                yd4Var = (yd4) tag;
            } else {
                yd4Var = new yd4(viewGroup);
                viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4Var);
            }
            yd4Var.getClass();
            ovd ovdVarF = yd4Var.f(aVar);
            int i = ovdVarF != null ? ovdVarF.b : 0;
            ovd ovdVarG = yd4Var.g(aVar);
            i = ovdVarG != null ? ovdVarG.b : 0;
            int i2 = i == 0 ? -1 : pvd.$EnumSwitchMapping$0[au1.s(i)];
            if (i2 != -1 && i2 != 1) {
                i = i;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (aVar.x0) {
            iMin = aVar.q0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (aVar.V0 && aVar.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (aVar.y0) {
            iMin = Math.max(iMin, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle2 = aVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (aVar.a1) {
            aVar.a = 1;
            Bundle bundle4 = aVar.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            aVar.H0.Z(bundle);
            n16 n16Var = aVar.H0;
            n16Var.H = false;
            n16Var.I = false;
            n16Var.O.g = false;
            n16Var.u(1);
            return;
        }
        qz7 qz7Var = this.a;
        qz7Var.F(aVar, false);
        aVar.H0.S();
        aVar.a = 1;
        aVar.S0 = false;
        aVar.d1.a(new fdc(4, aVar));
        aVar.v0(bundle3);
        aVar.a1 = true;
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onCreate()"));
        }
        aVar.d1.d(eg7.ON_CREATE);
        qz7Var.w(aVar, false);
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        a aVar = this.c;
        if (aVar.z0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterC0 = aVar.C0(bundle2);
        aVar.Z0 = layoutInflaterC0;
        ViewGroup viewGroup = aVar.T0;
        if (viewGroup == null) {
            int i = aVar.K0;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException(rh4.i("Cannot create fragment ", aVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) aVar.F0.x.J(i);
                if (viewGroup == null) {
                    if (!aVar.C0 && !aVar.B0) {
                        try {
                            resourceName = aVar.g0().getResourceName(aVar.K0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.K0) + " (" + resourceName + ") for fragment " + aVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    t16 t16Var = u16.a;
                    u16.b(new WrongFragmentContainerViolation(aVar, "Attempting to add fragment " + aVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    u16.a(aVar).getClass();
                }
            }
        }
        aVar.T0 = viewGroup;
        aVar.Q0(layoutInflaterC0, viewGroup, bundle2);
        if (aVar.U0 != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            aVar.U0.setSaveFromParentEnabled(false);
            aVar.U0.setTag(pxb.fragment_container_view_tag, aVar);
            if (viewGroup != null) {
                b();
            }
            if (aVar.M0) {
                aVar.U0.setVisibility(8);
            }
            if (aVar.U0.isAttachedToWindow()) {
                View view = aVar.U0;
                WeakHashMap weakHashMap = zmf.a;
                mmf.c(view);
            } else {
                View view2 = aVar.U0;
                view2.addOnAttachStateChangeListener(new ef(view2, 1));
            }
            Bundle bundle3 = aVar.b;
            aVar.O0(aVar.U0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            aVar.H0.u(2);
            this.a.K(aVar, aVar.U0, false);
            int visibility = aVar.U0.getVisibility();
            aVar.a0().j = aVar.U0.getAlpha();
            if (aVar.T0 != null && visibility == 0) {
                View viewFindFocus = aVar.U0.findFocus();
                if (viewFindFocus != null) {
                    aVar.a0().k = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        viewFindFocus.toString();
                        Objects.toString(aVar);
                    }
                }
                aVar.U0.setAlpha(0.0f);
            }
        }
        aVar.a = 2;
    }

    public final void g() {
        a aVarB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = aVar.x0 && !aVar.q0();
        f fVar = this.b;
        if (z) {
            fVar.i(aVar.Y, null);
        }
        if (!z) {
            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
            if (!((fragmentManagerViewModel.b.containsKey(aVar.Y) && fragmentManagerViewModel.e) ? fragmentManagerViewModel.f : true)) {
                String str = aVar.t0;
                if (str != null && (aVarB = fVar.b(str)) != null && aVarB.O0) {
                    aVar.s0 = aVarB;
                }
                aVar.a = 0;
                return;
            }
        }
        z06 z06Var = aVar.G0;
        if (z06Var instanceof ynf) {
            zIsChangingConfigurations = fVar.d.f;
        } else {
            Context context = z06Var.u0;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || zIsChangingConfigurations) {
            FragmentManagerViewModel fragmentManagerViewModel2 = fVar.d;
            fragmentManagerViewModel2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            fragmentManagerViewModel2.f(aVar.Y, false);
        }
        aVar.H0.l();
        aVar.d1.d(eg7.ON_DESTROY);
        aVar.a = 0;
        aVar.S0 = false;
        aVar.a1 = false;
        aVar.y0();
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onDestroy()"));
        }
        this.a.x(aVar, false);
        Iterator it = fVar.d().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                String str2 = aVar.Y;
                a aVar2 = eVar.c;
                if (str2.equals(aVar2.t0)) {
                    aVar2.s0 = aVar;
                    aVar2.t0 = null;
                }
            }
        }
        String str3 = aVar.t0;
        if (str3 != null) {
            aVar.s0 = fVar.b(str3);
        }
        fVar.h(this);
    }

    public final void h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        ViewGroup viewGroup = aVar.T0;
        if (viewGroup != null && (view = aVar.U0) != null) {
            viewGroup.removeView(view);
        }
        aVar.H0.u(1);
        if (aVar.U0 != null) {
            x16 x16Var = aVar.e1;
            x16Var.b();
            if (x16Var.X.d.a(fg7.c)) {
                aVar.e1.a(eg7.ON_DESTROY);
            }
        }
        aVar.a = 1;
        aVar.S0 = false;
        aVar.z0();
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onDestroyView()"));
        }
        new androidx.loader.app.b(aVar, aVar.w()).c();
        aVar.D0 = false;
        this.a.L(aVar, false);
        aVar.T0 = null;
        aVar.U0 = null;
        aVar.e1 = null;
        aVar.f1.k(null);
        aVar.A0 = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        aVar.a = -1;
        aVar.S0 = false;
        aVar.A0();
        aVar.Z0 = null;
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onDetach()"));
        }
        n16 n16Var = aVar.H0;
        if (!n16Var.J) {
            n16Var.l();
            aVar.H0 = new n16();
        }
        this.a.C(aVar, false);
        aVar.a = -1;
        aVar.G0 = null;
        aVar.I0 = null;
        aVar.F0 = null;
        if (!aVar.x0 || aVar.q0()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.b.d;
            boolean z = true;
            if (fragmentManagerViewModel.b.containsKey(aVar.Y) && fragmentManagerViewModel.e) {
                z = fragmentManagerViewModel.f;
            }
            if (!z) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(aVar);
        }
        aVar.n0();
    }

    public final void j() {
        a aVar = this.c;
        if (aVar.z0 && aVar.A0 && !aVar.D0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterC0 = aVar.C0(bundle2);
            aVar.Z0 = layoutInflaterC0;
            aVar.Q0(layoutInflaterC0, null, bundle2);
            View view = aVar.U0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                aVar.U0.setTag(pxb.fragment_container_view_tag, aVar);
                if (aVar.M0) {
                    aVar.U0.setVisibility(8);
                }
                Bundle bundle3 = aVar.b;
                aVar.O0(aVar.U0, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                aVar.H0.u(2);
                this.a.K(aVar, aVar.U0, false);
                aVar.a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        yd4 yd4Var;
        ViewGroup viewGroup2;
        yd4 yd4Var2;
        ViewGroup viewGroup3;
        yd4 yd4Var3;
        f fVar = this.b;
        boolean z = this.d;
        a aVar = this.c;
        if (z) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = aVar.a;
                int i2 = 3;
                if (iD == i) {
                    if (!z2 && i == -1 && aVar.x0 && !aVar.q0()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(aVar);
                        }
                        FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
                        fragmentManagerViewModel.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(aVar);
                        }
                        fragmentManagerViewModel.f(aVar.Y, true);
                        fVar.h(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(aVar);
                        }
                        aVar.n0();
                    }
                    if (aVar.Y0) {
                        if (aVar.U0 != null && (viewGroup = aVar.T0) != null) {
                            aVar.f0().K();
                            Object tag = viewGroup.getTag(pxb.special_effects_controller_view_tag);
                            if (tag instanceof yd4) {
                                yd4Var = (yd4) tag;
                            } else {
                                yd4Var = new yd4(viewGroup);
                                viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4Var);
                            }
                            if (aVar.M0) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    yd4Var.getClass();
                                    Objects.toString(aVar);
                                }
                                yd4Var.d(3, 1, this);
                            } else {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    yd4Var.getClass();
                                    Objects.toString(aVar);
                                }
                                yd4Var.d(2, 1, this);
                            }
                        }
                        c cVar = aVar.F0;
                        if (cVar != null && aVar.w0 && c.M(aVar)) {
                            cVar.G = true;
                        }
                        aVar.Y0 = false;
                        aVar.D0(aVar.M0);
                        aVar.H0.o();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            aVar.a = 1;
                            break;
                        case 2:
                            aVar.A0 = false;
                            aVar.a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            if (aVar.U0 != null && aVar.c == null) {
                                p();
                            }
                            if (aVar.U0 != null && (viewGroup2 = aVar.T0) != null) {
                                aVar.f0().K();
                                Object tag2 = viewGroup2.getTag(pxb.special_effects_controller_view_tag);
                                if (tag2 instanceof yd4) {
                                    yd4Var2 = (yd4) tag2;
                                } else {
                                    yd4Var2 = new yd4(viewGroup2);
                                    viewGroup2.setTag(pxb.special_effects_controller_view_tag, yd4Var2);
                                }
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    yd4Var2.getClass();
                                    Objects.toString(aVar);
                                }
                                yd4Var2.d(1, 3, this);
                            }
                            aVar.a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            aVar.a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (aVar.U0 != null && (viewGroup3 = aVar.T0) != null) {
                                aVar.f0().K();
                                Object tag3 = viewGroup3.getTag(pxb.special_effects_controller_view_tag);
                                if (tag3 instanceof yd4) {
                                    yd4Var3 = (yd4) tag3;
                                } else {
                                    yd4Var3 = new yd4(viewGroup3);
                                    viewGroup3.setTag(pxb.special_effects_controller_view_tag, yd4Var3);
                                }
                                int visibility = aVar.U0.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    yd4Var3.getClass();
                                    Objects.toString(aVar);
                                }
                                yd4Var3.d(i2, 2, this);
                            }
                            aVar.a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            aVar.a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        aVar.H0.u(5);
        if (aVar.U0 != null) {
            aVar.e1.a(eg7.ON_PAUSE);
        }
        aVar.d1.d(eg7.ON_PAUSE);
        aVar.a = 6;
        aVar.S0 = false;
        aVar.H0();
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onPause()"));
        }
        this.a.D(aVar, false);
    }

    public final void m(ClassLoader classLoader) {
        a aVar = this.c;
        Bundle bundle = aVar.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (aVar.b.getBundle("savedInstanceState") == null) {
            aVar.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            aVar.c = aVar.b.getSparseParcelableArray("viewState");
            aVar.o = aVar.b.getBundle("viewRegistryState");
            r16 r16Var = (r16) aVar.b.getParcelable("state");
            if (r16Var != null) {
                aVar.t0 = r16Var.x0;
                aVar.u0 = r16Var.y0;
                Boolean bool = aVar.X;
                if (bool != null) {
                    aVar.W0 = bool.booleanValue();
                    aVar.X = null;
                } else {
                    aVar.W0 = r16Var.z0;
                }
            }
            if (aVar.W0) {
                return;
            }
            aVar.V0 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aVar, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r6 = this;
            r0 = 3
            java.lang.String r1 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            androidx.fragment.app.a r2 = r6.c
            if (r0 == 0) goto Le
            java.util.Objects.toString(r2)
        Le:
            w06 r0 = r2.X0
            r3 = 0
            if (r0 != 0) goto L15
            r0 = r3
            goto L17
        L15:
            android.view.View r0 = r0.k
        L17:
            if (r0 == 0) goto L47
            android.view.View r4 = r2.U0
            if (r0 != r4) goto L1e
            goto L28
        L1e:
            android.view.ViewParent r4 = r0.getParent()
        L22:
            if (r4 == 0) goto L47
            android.view.View r5 = r2.U0
            if (r4 != r5) goto L42
        L28:
            r0.requestFocus()
            r4 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r4)
            if (r1 == 0) goto L47
            r0.toString()
            java.util.Objects.toString(r2)
            android.view.View r0 = r2.U0
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L47
        L42:
            android.view.ViewParent r4 = r4.getParent()
            goto L22
        L47:
            w06 r0 = r2.a0()
            r0.k = r3
            n16 r0 = r2.H0
            r0.S()
            n16 r0 = r2.H0
            r1 = 1
            r0.A(r1)
            r0 = 7
            r2.a = r0
            r1 = 0
            r2.S0 = r1
            r2.K0()
            boolean r4 = r2.S0
            if (r4 == 0) goto L95
            gh7 r4 = r2.d1
            eg7 r5 = defpackage.eg7.ON_RESUME
            r4.d(r5)
            android.view.View r4 = r2.U0
            if (r4 == 0) goto L75
            x16 r4 = r2.e1
            r4.a(r5)
        L75:
            n16 r4 = r2.H0
            r4.H = r1
            r4.I = r1
            androidx.fragment.app.FragmentManagerViewModel r5 = r4.O
            r5.g = r1
            r4.u(r0)
            qz7 r0 = r6.a
            r0.G(r2, r1)
            androidx.fragment.app.f r6 = r6.b
            java.lang.String r0 = r2.Y
            r6.i(r0, r3)
            r2.b = r3
            r2.c = r3
            r2.o = r3
            return
        L95:
            pq1 r6 = new pq1
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " did not call through to super.onResume()"
            java.lang.String r0 = defpackage.rh4.i(r0, r2, r1)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.n():void");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        a aVar = this.c;
        if (aVar.a == -1 && (bundle = aVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new r16(aVar));
        if (aVar.a > -1) {
            Bundle bundle3 = new Bundle();
            aVar.L0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.H(aVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            aVar.h1.u(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleA0 = aVar.H0.a0();
            if (!bundleA0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleA0);
            }
            if (aVar.U0 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = aVar.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = aVar.o;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = aVar.Z;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        a aVar = this.c;
        if (aVar.U0 == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
            Objects.toString(aVar.U0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        aVar.U0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            aVar.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        aVar.e1.Y.u(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        aVar.o = bundle;
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        aVar.H0.S();
        aVar.H0.A(true);
        aVar.a = 5;
        aVar.S0 = false;
        aVar.M0();
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onStart()"));
        }
        gh7 gh7Var = aVar.d1;
        eg7 eg7Var = eg7.ON_START;
        gh7Var.d(eg7Var);
        if (aVar.U0 != null) {
            aVar.e1.a(eg7Var);
        }
        n16 n16Var = aVar.H0;
        n16Var.H = false;
        n16Var.I = false;
        n16Var.O.g = false;
        n16Var.u(5);
        this.a.I(aVar, false);
    }

    public final void r() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (zIsLoggable) {
            Objects.toString(aVar);
        }
        n16 n16Var = aVar.H0;
        n16Var.I = true;
        n16Var.O.g = true;
        n16Var.u(4);
        if (aVar.U0 != null) {
            aVar.e1.a(eg7.ON_STOP);
        }
        aVar.d1.d(eg7.ON_STOP);
        aVar.a = 4;
        aVar.S0 = false;
        aVar.N0();
        if (!aVar.S0) {
            throw new pq1(rh4.i("Fragment ", aVar, " did not call through to super.onStop()"));
        }
        this.a.J(aVar, false);
    }

    public e(qz7 qz7Var, f fVar, ClassLoader classLoader, f16 f16Var, Bundle bundle) {
        this.a = qz7Var;
        this.b = fVar;
        r16 r16Var = (r16) bundle.getParcelable("state");
        a aVarA = f16Var.a(r16Var.a);
        aVarA.Y = r16Var.b;
        aVarA.z0 = r16Var.c;
        aVarA.B0 = r16Var.o;
        aVarA.C0 = true;
        aVarA.J0 = r16Var.X;
        aVarA.K0 = r16Var.Y;
        aVarA.L0 = r16Var.Z;
        aVarA.O0 = r16Var.s0;
        aVarA.x0 = r16Var.t0;
        aVarA.N0 = r16Var.u0;
        aVarA.M0 = r16Var.v0;
        aVarA.c1 = fg7.values()[r16Var.w0];
        aVarA.t0 = r16Var.x0;
        aVarA.u0 = r16Var.y0;
        aVarA.W0 = r16Var.z0;
        this.c = aVarA;
        aVarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        aVarA.X0(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVarA);
        }
    }

    public e(qz7 qz7Var, f fVar, a aVar, Bundle bundle) {
        this.a = qz7Var;
        this.b = fVar;
        this.c = aVar;
        aVar.c = null;
        aVar.o = null;
        aVar.E0 = 0;
        aVar.A0 = false;
        aVar.w0 = false;
        a aVar2 = aVar.s0;
        aVar.t0 = aVar2 != null ? aVar2.Y : null;
        aVar.s0 = null;
        aVar.b = bundle;
        aVar.Z = bundle.getBundle("arguments");
    }
}
