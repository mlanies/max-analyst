package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class p04 extends hdc implements v0e {
    public final uu3 X;
    public ArrayList Y;
    public int Z;
    public final /* synthetic */ int o;
    public final SparseArray s0;
    public int t0;
    public Cloneable u0;
    public mof v0;

    public p04(uu3 uu3Var, int i) {
        this.o = i;
        switch (i) {
            case 1:
                this.X = uu3Var;
                this.u0 = new LongSparseArray();
                this.Y = new ArrayList();
                this.Z = Integer.MAX_VALUE;
                this.s0 = new SparseArray();
                A(true);
                break;
            default:
                this.X = uu3Var;
                this.u0 = new wv7((Object) null);
                this.Y = new ArrayList();
                this.Z = Integer.MAX_VALUE;
                this.s0 = new SparseArray();
                A(true);
                break;
        }
    }

    public static ViewPager2 H(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + recyclerView.getParent()).toString());
    }

    public static ViewPager2 I(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        ViewPager2 viewPager2 = parent instanceof ViewPager2 ? (ViewPager2) parent : null;
        if (viewPager2 != null) {
            return viewPager2;
        }
        throw new IllegalStateException(("Expected ViewPager2 instance. Got: " + recyclerView.getParent()).toString());
    }

    public void C(doc docVar, int i) throws SecurityException {
        uu3 uu3Var;
        Bundle bundle;
        znc zncVar;
        long jK = k(i);
        String strValueOf = String.valueOf(jK);
        uu3 uu3Var2 = this.X;
        boolean z = false;
        znc childRouter = uu3Var2.getChildRouter(docVar.F0, strValueOf, true, false);
        childRouter.e = 1;
        if (!childRouter.equals(docVar.G0) && (zncVar = docVar.G0) != null) {
            uu3Var2.removeChildRouter(zncVar);
        }
        docVar.G0 = childRouter;
        docVar.H0 = jK;
        if (!childRouter.n() && (bundle = (Bundle) ((wv7) this.u0).c(jK)) != null) {
            childRouter.N(bundle);
            ((wv7) this.u0).g(jK);
            this.Y.remove(Long.valueOf(jK));
            z = true;
        }
        coc cocVar = (coc) x53.q0(childRouter.e());
        if (((cocVar == null || (uu3Var = cocVar.a) == null) ? null : uu3Var.getTargetController()) != null) {
            hm9.n(getClass().getName(), "Router adapter. Attach router, target exist | router restored:" + z);
        }
        childRouter.I();
        E(childRouter, i);
        if (i != this.t0) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((coc) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.s0.put(i, childRouter);
        docVar.I0 = true;
    }

    public void D(eoc eocVar, int i) throws SecurityException {
        Bundle bundle;
        znc zncVar;
        long jK = k(i);
        String strValueOf = String.valueOf(jK);
        uu3 uu3Var = this.X;
        znc childRouter = uu3Var.getChildRouter(eocVar.F0, strValueOf, true, false);
        childRouter.e = 1;
        if (!childRouter.equals(eocVar.G0) && (zncVar = eocVar.G0) != null) {
            uu3Var.removeChildRouter(zncVar);
        }
        eocVar.G0 = childRouter;
        eocVar.I0 = jK;
        if (!childRouter.n() && (bundle = (Bundle) ((LongSparseArray) this.u0).get(jK)) != null) {
            childRouter.N(bundle);
            ((LongSparseArray) this.u0).remove(jK);
            this.Y.remove(Long.valueOf(jK));
        }
        childRouter.I();
        E(childRouter, i);
        if (i != this.t0) {
            Iterator it = childRouter.e().iterator();
            while (it.hasNext()) {
                ((coc) it.next()).a.setOptionsMenuHidden(true);
            }
        }
        this.s0.put(i, childRouter);
        eocVar.J0 = true;
    }

    public abstract void E(znc zncVar, int i);

    public void F(doc docVar) {
        if (docVar.I0) {
            znc zncVar = docVar.G0;
            if (zncVar != null) {
                zncVar.F();
                L(docVar.H0, zncVar);
                SparseArray sparseArray = this.s0;
                if (tpa.f(sparseArray.get(docVar.g()), zncVar)) {
                    sparseArray.remove(docVar.g());
                }
            }
            docVar.I0 = false;
        }
    }

    public void G(eoc eocVar) {
        if (eocVar.J0) {
            znc zncVar = eocVar.G0;
            if (zncVar != null) {
                zncVar.F();
                K(eocVar.I0, zncVar);
                SparseArray sparseArray = this.s0;
                if (tpa.f(sparseArray.get(eocVar.H0), zncVar)) {
                    sparseArray.remove(eocVar.H0);
                }
            }
            eocVar.J0 = false;
        }
    }

    /* renamed from: J */
    public void y(eoc eocVar) {
        G(eocVar);
        znc zncVar = eocVar.G0;
        if (zncVar != null) {
            this.X.removeChildRouter(zncVar);
            eocVar.G0 = null;
        }
    }

    public void K(long j, znc zncVar) {
        Bundle bundle = new Bundle();
        zncVar.O(bundle);
        ((LongSparseArray) this.u0).put(j, bundle);
        this.Y.remove(Long.valueOf(j));
        this.Y.add(Long.valueOf(j));
        while (((LongSparseArray) this.u0).size() > this.Z) {
            ((LongSparseArray) this.u0).remove(((Number) this.Y.remove(0)).longValue());
        }
    }

    public void L(long j, znc zncVar) {
        Bundle bundle = new Bundle();
        zncVar.O(bundle);
        ((wv7) this.u0).f(j, bundle);
        this.Y.remove(Long.valueOf(j));
        this.Y.add(Long.valueOf(j));
        while (((wv7) this.u0).h() > this.Z) {
            ((wv7) this.u0).g(((Number) this.Y.remove(0)).longValue());
        }
    }

    @Override // defpackage.v0e
    public final Parcelable a() {
        switch (this.o) {
            case 0:
                SparseArray sparseArray = this.s0;
                j37 j37VarY = ote.Y(0, sparseArray.size());
                ArrayList arrayList = new ArrayList(z53.S(j37VarY, 10));
                Iterator it = j37VarY.iterator();
                while (((i37) it).c) {
                    arrayList.add(Integer.valueOf(sparseArray.keyAt(((i37) it).a())));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                while (!arrayList2.isEmpty()) {
                    int iIntValue = ((Number) arrayList2.remove(y53.L(arrayList2))).intValue();
                    L(k(iIntValue), (znc) sparseArray.get(iIntValue));
                    if (!arrayList2.isEmpty()) {
                        int iIntValue2 = ((Number) arrayList2.remove(0)).intValue();
                        L(k(iIntValue2), (znc) sparseArray.get(iIntValue2));
                    }
                }
                j37 j37VarY2 = ote.Y(0, ((wv7) this.u0).h());
                ArrayList arrayList3 = new ArrayList(z53.S(j37VarY2, 10));
                Iterator it2 = j37VarY2.iterator();
                while (((i37) it2).c) {
                    arrayList3.add(Long.valueOf(((wv7) this.u0).e(((i37) it2).a())));
                }
                j37 j37VarY3 = ote.Y(0, ((wv7) this.u0).h());
                ArrayList arrayList4 = new ArrayList(z53.S(j37VarY3, 10));
                Iterator it3 = j37VarY3.iterator();
                while (((i37) it3).c) {
                    arrayList4.add((Bundle) ((wv7) this.u0).i(((i37) it3).a()));
                }
                return new o04(arrayList3, arrayList4, this.Y, this.Z);
            default:
                SparseArray sparseArray2 = this.s0;
                j37 j37VarY4 = ote.Y(0, sparseArray2.size());
                ArrayList arrayList5 = new ArrayList(z53.S(j37VarY4, 10));
                Iterator it4 = j37VarY4.iterator();
                while (((i37) it4).c) {
                    arrayList5.add(Integer.valueOf(sparseArray2.keyAt(((i37) it4).a())));
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                while (!arrayList6.isEmpty()) {
                    int iIntValue3 = ((Number) arrayList6.remove(y53.L(arrayList6))).intValue();
                    K(k(iIntValue3), (znc) sparseArray2.get(iIntValue3));
                    if (!arrayList6.isEmpty()) {
                        int iIntValue4 = ((Number) arrayList6.remove(0)).intValue();
                        K(k(iIntValue4), (znc) sparseArray2.get(iIntValue4));
                    }
                }
                j37 j37VarY5 = ote.Y(0, ((LongSparseArray) this.u0).size());
                ArrayList arrayList7 = new ArrayList(z53.S(j37VarY5, 10));
                Iterator it5 = j37VarY5.iterator();
                while (((i37) it5).c) {
                    arrayList7.add(Long.valueOf(((LongSparseArray) this.u0).keyAt(((i37) it5).a())));
                }
                j37 j37VarY6 = ote.Y(0, ((LongSparseArray) this.u0).size());
                ArrayList arrayList8 = new ArrayList(z53.S(j37VarY6, 10));
                Iterator it6 = j37VarY6.iterator();
                while (((i37) it6).c) {
                    arrayList8.add((Bundle) ((LongSparseArray) this.u0).valueAt(((i37) it6).a()));
                }
                return new boc(arrayList7, arrayList8, this.Y, this.Z);
        }
    }

    @Override // defpackage.v0e
    public final void c(Parcelable parcelable) {
        switch (this.o) {
            case 0:
                if (parcelable instanceof o04) {
                    this.u0 = new wv7((Object) null);
                    o04 o04Var = (o04) parcelable;
                    List list = o04Var.a;
                    Iterator it = new j37(0, list.size() - 1, 1).iterator();
                    while (((i37) it).c) {
                        int iA = ((i37) it).a();
                        ((wv7) this.u0).f(((Number) list.get(iA)).longValue(), o04Var.b.get(iA));
                    }
                    this.Y = new ArrayList(o04Var.c);
                    this.Z = o04Var.o;
                    break;
                }
                break;
            default:
                if (parcelable instanceof boc) {
                    this.u0 = new LongSparseArray();
                    boc bocVar = (boc) parcelable;
                    List list2 = bocVar.a;
                    Iterator it2 = new j37(0, list2.size() - 1, 1).iterator();
                    while (((i37) it2).c) {
                        int iA2 = ((i37) it2).a();
                        ((LongSparseArray) this.u0).put(((Number) list2.get(iA2)).longValue(), bocVar.b.get(iA2));
                    }
                    this.Y = new ArrayList(bocVar.c);
                    this.Z = bocVar.o;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hdc
    public long k(int i) {
        return i;
    }

    @Override // defpackage.hdc
    public final void q(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 viewPager2I = I(recyclerView);
                lh0 lh0Var = new lh0(6, this);
                viewPager2I.b(lh0Var);
                this.v0 = lh0Var;
                break;
            default:
                ViewPager2 viewPager2H = H(recyclerView);
                lh0 lh0Var2 = new lh0(10, this);
                viewPager2H.b(lh0Var2);
                this.v0 = lh0Var2;
                break;
        }
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) throws SecurityException {
        switch (this.o) {
            case 0:
                C((doc) decVar, i);
                break;
            default:
                eoc eocVar = (eoc) decVar;
                eocVar.H0 = i;
                D(eocVar, i);
                break;
        }
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                int i2 = doc.J0;
                w12 w12Var = new w12(viewGroup.getContext());
                WeakHashMap weakHashMap = zmf.a;
                w12Var.setId(View.generateViewId());
                w12Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                w12Var.setSaveEnabled(false);
                return new doc(w12Var);
            default:
                int i3 = eoc.K0;
                w12 w12Var2 = new w12(viewGroup.getContext());
                WeakHashMap weakHashMap2 = zmf.a;
                w12Var2.setId(View.generateViewId());
                w12Var2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                w12Var2.setSaveEnabled(false);
                return new eoc(w12Var2);
        }
    }

    @Override // defpackage.hdc
    public final void u(RecyclerView recyclerView) {
        switch (this.o) {
            case 0:
                ViewPager2 viewPager2I = I(recyclerView);
                lh0 lh0Var = (lh0) this.v0;
                if (lh0Var != null) {
                    viewPager2I.g(lh0Var);
                }
                this.v0 = null;
                break;
            default:
                ViewPager2 viewPager2H = H(recyclerView);
                lh0 lh0Var2 = (lh0) this.v0;
                if (lh0Var2 != null) {
                    viewPager2H.g(lh0Var2);
                }
                this.v0 = null;
                break;
        }
    }

    @Override // defpackage.hdc
    public final /* bridge */ /* synthetic */ boolean v(dec decVar) {
        switch (this.o) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.hdc
    public final void w(dec decVar) throws SecurityException {
        switch (this.o) {
            case 0:
                doc docVar = (doc) decVar;
                if (!docVar.I0) {
                    C(docVar, docVar.g());
                    break;
                }
                break;
            default:
                eoc eocVar = (eoc) decVar;
                if (!eocVar.J0) {
                    D(eocVar, eocVar.H0);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hdc
    public final void x(dec decVar) {
        switch (this.o) {
            case 0:
                doc docVar = (doc) decVar;
                F(docVar);
                docVar.F0.removeAllViews();
                break;
            default:
                eoc eocVar = (eoc) decVar;
                G(eocVar);
                eocVar.F0.removeAllViews();
                break;
        }
    }

    @Override // defpackage.hdc
    public void y(dec decVar) {
        switch (this.o) {
            case 0:
                doc docVar = (doc) decVar;
                F(docVar);
                znc zncVar = docVar.G0;
                if (zncVar != null) {
                    this.X.removeChildRouter(zncVar);
                    docVar.G0 = null;
                    break;
                }
                break;
            default:
                y((eoc) decVar);
                break;
        }
    }
}
