package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class uv3 implements qv3 {
    public AnimatorSet b;
    public View c;
    public View d;
    public final je7 e;
    public final je7 f;
    public m56 h;
    public m56 i;
    public ov3 j;
    public ov3 k;
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean g = true;

    public uv3() {
        final int i = 0;
        this.e = tu0.r(3, new k56(this) { // from class: rv3
            public final /* synthetic */ uv3 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        final uv3 uv3Var = this.b;
                        final int i2 = 1;
                        return new View.OnLayoutChangeListener() { // from class: sv3
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i2) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        uv3 uv3Var2 = uv3Var;
                                        ov3 ov3Var = uv3Var2.k;
                                        if (measuredHeight != ov3Var.a) {
                                            Integer numX = br7.x(view);
                                            uv3Var2.k = ov3.a(ov3Var, measuredHeight, numX != null ? numX.intValue() : 0, false, 4);
                                            Iterator it = uv3Var2.a.iterator();
                                            while (it.hasNext()) {
                                                ((pv3) it.next()).u(uv3Var2.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        uv3 uv3Var3 = uv3Var;
                                        ov3 ov3Var2 = uv3Var3.j;
                                        if (measuredHeight3 != ov3Var2.a) {
                                            Integer numE = br7.E(view);
                                            uv3Var3.j = ov3.a(ov3Var2, measuredHeight2, numE != null ? numE.intValue() : 0, false, 4);
                                            Iterator it2 = uv3Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((pv3) it2.next()).D(uv3Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        final uv3 uv3Var2 = this.b;
                        final int i3 = 0;
                        return new View.OnLayoutChangeListener() { // from class: sv3
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i3) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        uv3 uv3Var22 = uv3Var2;
                                        ov3 ov3Var = uv3Var22.k;
                                        if (measuredHeight != ov3Var.a) {
                                            Integer numX = br7.x(view);
                                            uv3Var22.k = ov3.a(ov3Var, measuredHeight, numX != null ? numX.intValue() : 0, false, 4);
                                            Iterator it = uv3Var22.a.iterator();
                                            while (it.hasNext()) {
                                                ((pv3) it.next()).u(uv3Var22.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        uv3 uv3Var3 = uv3Var2;
                                        ov3 ov3Var2 = uv3Var3.j;
                                        if (measuredHeight3 != ov3Var2.a) {
                                            Integer numE = br7.E(view);
                                            uv3Var3.j = ov3.a(ov3Var2, measuredHeight2, numE != null ? numE.intValue() : 0, false, 4);
                                            Iterator it2 = uv3Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((pv3) it2.next()).D(uv3Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
        final int i2 = 1;
        this.f = tu0.r(3, new k56(this) { // from class: rv3
            public final /* synthetic */ uv3 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        final uv3 uv3Var = this.b;
                        final int i22 = 1;
                        return new View.OnLayoutChangeListener() { // from class: sv3
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i22) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        uv3 uv3Var22 = uv3Var;
                                        ov3 ov3Var = uv3Var22.k;
                                        if (measuredHeight != ov3Var.a) {
                                            Integer numX = br7.x(view);
                                            uv3Var22.k = ov3.a(ov3Var, measuredHeight, numX != null ? numX.intValue() : 0, false, 4);
                                            Iterator it = uv3Var22.a.iterator();
                                            while (it.hasNext()) {
                                                ((pv3) it.next()).u(uv3Var22.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        uv3 uv3Var3 = uv3Var;
                                        ov3 ov3Var2 = uv3Var3.j;
                                        if (measuredHeight3 != ov3Var2.a) {
                                            Integer numE = br7.E(view);
                                            uv3Var3.j = ov3.a(ov3Var2, measuredHeight2, numE != null ? numE.intValue() : 0, false, 4);
                                            Iterator it2 = uv3Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((pv3) it2.next()).D(uv3Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        final uv3 uv3Var2 = this.b;
                        final int i3 = 0;
                        return new View.OnLayoutChangeListener() { // from class: sv3
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                                switch (i3) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        uv3 uv3Var22 = uv3Var2;
                                        ov3 ov3Var = uv3Var22.k;
                                        if (measuredHeight != ov3Var.a) {
                                            Integer numX = br7.x(view);
                                            uv3Var22.k = ov3.a(ov3Var, measuredHeight, numX != null ? numX.intValue() : 0, false, 4);
                                            Iterator it = uv3Var22.a.iterator();
                                            while (it.hasNext()) {
                                                ((pv3) it.next()).u(uv3Var22.k);
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        int measuredHeight3 = view.getMeasuredHeight();
                                        uv3 uv3Var3 = uv3Var2;
                                        ov3 ov3Var2 = uv3Var3.j;
                                        if (measuredHeight3 != ov3Var2.a) {
                                            Integer numE = br7.E(view);
                                            uv3Var3.j = ov3.a(ov3Var2, measuredHeight2, numE != null ? numE.intValue() : 0, false, 4);
                                            Iterator it2 = uv3Var3.a.iterator();
                                            while (it2.hasNext()) {
                                                ((pv3) it2.next()).D(uv3Var3.j);
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
        pz2 pz2Var = new pz2(11);
        this.h = pz2Var;
        this.i = new pz2(11);
        this.j = new ov3();
        this.k = new ov3();
        pz2Var.invoke(true);
    }

    public static final void a(uv3 uv3Var, boolean z) {
        uv3Var.b = null;
        uv3Var.h.invoke(Boolean.valueOf(z));
        Iterator it = uv3Var.a.iterator();
        while (it.hasNext()) {
            ((pv3) it.next()).L();
        }
    }

    public final void b(pv3 pv3Var) {
        this.a.add(pv3Var);
    }

    public final void c(boolean z) {
        View view;
        int i = 0;
        boolean z2 = this.g;
        if (z2 == z || this.b != null) {
            this.h.invoke(Boolean.valueOf(z2));
            return;
        }
        this.j = ov3.a(this.j, 0, 0, z, 3);
        ov3 ov3VarA = ov3.a(this.k, 0, 0, z, 3);
        this.k = ov3VarA;
        this.g = z;
        View view2 = this.c;
        if (view2 == null || (view = this.d) == null) {
            return;
        }
        boolean z3 = this.j.c;
        int i2 = z3 ? 1 : -1;
        boolean z4 = ov3VarA.c;
        int i3 = !z4 ? 1 : -1;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        int iB = this.j.b();
        float f = iB * i2;
        nv3 nv3Var = new nv3(z3, iB, i2, f, view2.getY(), this.j.b);
        int iB2 = this.k.b();
        float f2 = iB2 * i3;
        nv3 nv3Var2 = new nv3(z4, iB2, i3, f2, view.getY(), this.k.b);
        Property property = View.ALPHA;
        Float fValueOf = Float.valueOf(0.0f);
        if (!z3) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
        Float fValueOf2 = Float.valueOf(1.0f);
        if (!z3) {
            fValueOf2 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fFloatValue, fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
        Property property2 = View.Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, view2.getY(), view2.getY() + f);
        Float fValueOf3 = Float.valueOf(0.0f);
        if (!z4) {
            fValueOf3 = null;
        }
        float fFloatValue2 = fValueOf3 != null ? fValueOf3.floatValue() : 1.0f;
        Float fValueOf4 = Float.valueOf(1.0f);
        if (!z4) {
            fValueOf4 = null;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fFloatValue2, fValueOf4 != null ? fValueOf4.floatValue() : 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, view.getY(), view.getY() + f2);
        LinkedHashSet linkedHashSet = this.a;
        ArrayList arrayList = new ArrayList(z53.S(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((pv3) it.next()).H(nv3Var, nv3Var2));
        }
        ArrayList arrayListT = z53.T(arrayList);
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(objectAnimatorOfFloat);
        kl7VarL.add(objectAnimatorOfFloat2);
        kl7VarL.add(objectAnimatorOfFloat3);
        kl7VarL.add(objectAnimatorOfFloat4);
        kl7VarL.addAll(arrayListT);
        animatorSet.playTogether(j1e.d(kl7VarL));
        animatorSet.addListener(new tv3(this, this.g, i));
        animatorSet.start();
        this.b = animatorSet;
    }
}
