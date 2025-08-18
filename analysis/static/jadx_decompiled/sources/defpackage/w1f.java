package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class w1f implements Cloneable {
    public static final Animator[] N0 = new Animator[0];
    public static final int[] O0 = {2, 1, 3, 4};
    public static final vu4 P0 = new vu4();
    public static final ThreadLocal Q0 = new ThreadLocal();
    public eod I0;
    public fm9 J0;
    public long L0;
    public long M0;
    public ArrayList x0;
    public ArrayList y0;
    public v1f[] z0;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator o = null;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public ArrayList Z = null;
    public ArrayList s0 = null;
    public a8g t0 = new a8g(15);
    public a8g u0 = new a8g(15);
    public e2f v0 = null;
    public final int[] w0 = O0;
    public final ArrayList A0 = new ArrayList();
    public Animator[] B0 = N0;
    public int C0 = 0;
    public boolean D0 = false;
    public boolean E0 = false;
    public w1f F0 = null;
    public ArrayList G0 = null;
    public ArrayList H0 = new ArrayList();
    public vu4 K0 = P0;

    public static void c(a8g a8gVar, View view, g2f g2fVar) {
        ((us) a8gVar.a).put(view, g2fVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) a8gVar.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = zmf.a;
        String strK = omf.k(view);
        if (strK != null) {
            us usVar = (us) a8gVar.o;
            if (usVar.containsKey(strK)) {
                usVar.put(strK, null);
            } else {
                usVar.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                wv7 wv7Var = (wv7) a8gVar.c;
                if (wv7Var.d(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    wv7Var.f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) wv7Var.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    wv7Var.f(itemIdAtPosition, null);
                }
            }
        }
    }

    public static ArrayList o(ArrayList arrayList, int i) {
        if (i > 0) {
            Integer numValueOf = Integer.valueOf(i);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(numValueOf)) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }

    public static us t() {
        ThreadLocal threadLocal = Q0;
        us usVar = (us) threadLocal.get();
        if (usVar != null) {
            return usVar;
        }
        us usVar2 = new us();
        threadLocal.set(usVar2);
        return usVar2;
    }

    public static boolean z(g2f g2fVar, g2f g2fVar2, String str) {
        Object obj = g2fVar.a.get(str);
        Object obj2 = g2fVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public final void A(w1f w1fVar, hme hmeVar, boolean z) {
        w1f w1fVar2 = this.F0;
        if (w1fVar2 != null) {
            w1fVar2.A(w1fVar, hmeVar, z);
        }
        ArrayList arrayList = this.G0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.G0.size();
        v1f[] v1fVarArr = this.z0;
        if (v1fVarArr == null) {
            v1fVarArr = new v1f[size];
        }
        this.z0 = null;
        v1f[] v1fVarArr2 = (v1f[]) this.G0.toArray(v1fVarArr);
        for (int i = 0; i < size; i++) {
            hmeVar.a(v1fVarArr2[i], w1fVar, z);
            v1fVarArr2[i] = null;
        }
        this.z0 = v1fVarArr2;
    }

    public void B(View view) {
        if (this.E0) {
            return;
        }
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
        this.B0 = N0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.B0 = animatorArr;
        A(this, hme.X, false);
        this.D0 = true;
    }

    public void C() {
        us usVarT = t();
        this.L0 = 0L;
        for (int i = 0; i < this.H0.size(); i++) {
            Animator animator = (Animator) this.H0.get(i);
            s1f s1fVar = (s1f) usVarT.get(animator);
            if (animator != null && s1fVar != null) {
                long j = this.c;
                Animator animator2 = s1fVar.f;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.o;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.A0.add(animator);
                this.L0 = Math.max(this.L0, t1f.a(animator));
            }
        }
        this.H0.clear();
    }

    public w1f D(v1f v1fVar) {
        w1f w1fVar;
        ArrayList arrayList = this.G0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(v1fVar) && (w1fVar = this.F0) != null) {
            w1fVar.D(v1fVar);
        }
        if (this.G0.size() == 0) {
            this.G0 = null;
        }
        return this;
    }

    public void E(View view) {
        this.Y.remove(view);
    }

    public void F(View view) {
        if (this.D0) {
            if (!this.E0) {
                ArrayList arrayList = this.A0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
                this.B0 = N0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.B0 = animatorArr;
                A(this, hme.Y, false);
            }
            this.D0 = false;
        }
    }

    public void G() {
        O();
        us usVarT = t();
        Iterator it = this.H0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (usVarT.containsKey(animator)) {
                O();
                if (animator != null) {
                    animator.addListener(new eh(this, usVarT, false, 5));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.o;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new h6(10, this));
                    animator.start();
                }
            }
        }
        this.H0.clear();
        n();
    }

    public void H(long j, long j2) {
        long j3 = this.L0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.E0 = false;
            A(this, hme.b, z);
        }
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
        this.B0 = N0;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            t1f.b(animator, Math.min(Math.max(0L, j), t1f.a(animator)));
        }
        this.B0 = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.E0 = true;
        }
        A(this, hme.c, z);
    }

    public void I(long j) {
        this.c = j;
    }

    public void J(fm9 fm9Var) {
        this.J0 = fm9Var;
    }

    public void K(TimeInterpolator timeInterpolator) {
        this.o = timeInterpolator;
    }

    public void L(vu4 vu4Var) {
        if (vu4Var == null) {
            this.K0 = P0;
        } else {
            this.K0 = vu4Var;
        }
    }

    public void M(eod eodVar) {
        this.I0 = eodVar;
    }

    public void N(long j) {
        this.b = j;
    }

    public final void O() {
        if (this.C0 == 0) {
            A(this, hme.b, false);
            this.E0 = false;
        }
        this.C0++;
    }

    public String P(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.o != null) {
            sb.append("interp(");
            sb.append(this.o);
            sb.append(") ");
        }
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(v1f v1fVar) {
        if (this.G0 == null) {
            this.G0 = new ArrayList();
        }
        this.G0.add(v1fVar);
    }

    public void b(View view) {
        this.Y.add(view);
    }

    public void d() {
        ArrayList arrayList = this.A0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.B0);
        this.B0 = N0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.B0 = animatorArr;
        A(this, hme.o, false);
    }

    public abstract void e(g2f g2fVar);

    public final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.Z;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            if (view.getParent() instanceof ViewGroup) {
                g2f g2fVar = new g2f(view);
                if (z) {
                    h(g2fVar);
                } else {
                    e(g2fVar);
                }
                g2fVar.c.add(this);
                g(g2fVar);
                if (z) {
                    c(this.t0, view, g2fVar);
                } else {
                    c(this.u0, view, g2fVar);
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList arrayList2 = this.s0;
                if (arrayList2 == null || !arrayList2.contains(Integer.valueOf(id))) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        f(viewGroup.getChildAt(i), z);
                    }
                }
            }
        }
    }

    public void g(g2f g2fVar) {
        if (this.I0 != null) {
            HashMap map = g2fVar.a;
            if (map.isEmpty()) {
                return;
            }
            this.I0.getClass();
            String[] strArr = eod.c;
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArr[i])) {
                    this.I0.getClass();
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    View view = g2fVar.b;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void h(g2f g2fVar);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        ArrayList arrayList2 = this.Y;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                g2f g2fVar = new g2f(viewFindViewById);
                if (z) {
                    h(g2fVar);
                } else {
                    e(g2fVar);
                }
                g2fVar.c.add(this);
                g(g2fVar);
                if (z) {
                    c(this.t0, viewFindViewById, g2fVar);
                } else {
                    c(this.u0, viewFindViewById, g2fVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            g2f g2fVar2 = new g2f(view);
            if (z) {
                h(g2fVar2);
            } else {
                e(g2fVar2);
            }
            g2fVar2.c.add(this);
            g(g2fVar2);
            if (z) {
                c(this.t0, view, g2fVar2);
            } else {
                c(this.u0, view, g2fVar2);
            }
        }
    }

    public final void j(boolean z) {
        if (z) {
            ((us) this.t0.a).clear();
            ((SparseArray) this.t0.b).clear();
            ((wv7) this.t0.c).a();
        } else {
            ((us) this.u0.a).clear();
            ((SparseArray) this.u0.b).clear();
            ((wv7) this.u0.c).a();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public w1f clone() {
        try {
            w1f w1fVar = (w1f) super.clone();
            w1fVar.H0 = new ArrayList();
            w1fVar.t0 = new a8g(15);
            w1fVar.u0 = new a8g(15);
            w1fVar.x0 = null;
            w1fVar.y0 = null;
            w1fVar.getClass();
            w1fVar.F0 = this;
            w1fVar.G0 = null;
            return w1fVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator l(ViewGroup viewGroup, g2f g2fVar, g2f g2fVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.view.ViewGroup r27, defpackage.a8g r28, defpackage.a8g r29, java.util.ArrayList r30, java.util.ArrayList r31) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1f.m(android.view.ViewGroup, a8g, a8g, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n() {
        int i = this.C0 - 1;
        this.C0 = i;
        if (i == 0) {
            A(this, hme.c, false);
            for (int i2 = 0; i2 < ((wv7) this.t0.c).h(); i2++) {
                View view = (View) ((wv7) this.t0.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((wv7) this.u0.c).h(); i3++) {
                View view2 = (View) ((wv7) this.u0.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.E0 = true;
        }
    }

    public void p(int i) {
        this.Z = o(this.Z, i);
    }

    public void q(ViewGroup viewGroup) {
        us usVarT = t();
        int i = usVarT.c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        us usVar = new us(usVarT);
        usVarT.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            s1f s1fVar = (s1f) usVar.i(i2);
            if (s1fVar.a != null && windowId.equals(s1fVar.d)) {
                ((Animator) usVar.f(i2)).end();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.x0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (defpackage.g2f) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g2f r(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            e2f r0 = r5.v0
            if (r0 == 0) goto L9
            g2f r5 = r0.r(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.x0
            goto L10
        Le:
            java.util.ArrayList r0 = r5.y0
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            g2f r4 = (defpackage.g2f) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.y0
            goto L36
        L34:
            java.util.ArrayList r5 = r5.x0
        L36:
            java.lang.Object r5 = r5.get(r3)
            r1 = r5
            g2f r1 = (defpackage.g2f) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1f.r(android.view.View, boolean):g2f");
    }

    public final w1f s() {
        e2f e2fVar = this.v0;
        return e2fVar != null ? e2fVar.s() : this;
    }

    public final String toString() {
        return P("");
    }

    public String[] u() {
        return null;
    }

    public final g2f v(View view, boolean z) {
        e2f e2fVar = this.v0;
        if (e2fVar != null) {
            return e2fVar.v(view, z);
        }
        return (g2f) ((us) (z ? this.t0 : this.u0).a).get(view);
    }

    public boolean w() {
        return !this.A0.isEmpty();
    }

    public boolean x(g2f g2fVar, g2f g2fVar2) {
        if (g2fVar == null || g2fVar2 == null) {
            return false;
        }
        String[] strArrU = u();
        if (strArrU == null) {
            Iterator it = g2fVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (z(g2fVar, g2fVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrU) {
            if (!z(g2fVar, g2fVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean y(View view) {
        int id = view.getId();
        ArrayList arrayList = this.Z;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList2 = this.X;
        int size = arrayList2.size();
        ArrayList arrayList3 = this.Y;
        return (size == 0 && arrayList3.size() == 0) || arrayList2.contains(Integer.valueOf(id)) || arrayList3.contains(view);
    }
}
