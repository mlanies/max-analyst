package defpackage;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class rdf extends l9f {
    public static final pdf D = new pdf();
    public qdf A;
    public cad B;
    public final xrb C;
    public xf4 p;
    public iee q;
    public ub0 r;
    public bad s;
    public oq1 t;
    public see u;
    public int v;
    public nw4 w;
    public Rect x;
    public int y;
    public boolean z;

    public rdf(sdf sdfVar) {
        super(sdfVar);
        this.r = ub0.d;
        this.s = new bad();
        this.t = null;
        this.v = 3;
        this.z = false;
        this.C = new xrb(2, this);
    }

    public static void F(HashSet hashSet, int i, int i2, Size size, dff dffVar) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) dffVar.v1(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException unused) {
        }
        try {
            hashSet.add(new Size(((Integer) dffVar.r1(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException unused2) {
        }
    }

    public static int G(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static dff O(l66 l66Var, nc0 nc0Var, ab0 ab0Var, Size size, eu4 eu4Var, Range range) {
        kc0 kc0VarB = eef.b(ab0Var, eu4Var, nc0Var);
        bue bueVar = bue.a;
        mc0 mc0Var = ab0Var.a;
        ha0 ha0Var = kc0VarB.c;
        dff dffVar = (dff) l66Var.apply((ic0) (ha0Var != null ? new fc3(kc0VarB.a, bueVar, mc0Var, size, ha0Var, eu4Var, range) : new cff(kc0VarB.a, bueVar, mc0Var, size, eu4Var, range)).get());
        Size size2 = null;
        if (dffVar == null) {
            return null;
        }
        if (nc0Var != null) {
            ha0 ha0Var2 = nc0Var.f;
            size2 = new Size(ha0Var2.e, ha0Var2.f);
        }
        return fff.a(dffVar, size2);
    }

    @Override // defpackage.l9f
    public final void C(Rect rect) {
        this.i = rect;
        P();
    }

    public final void H(bad badVar, ub0 ub0Var, vb0 vb0Var) {
        xf4 xf4Var;
        boolean z = ub0Var.a == -1;
        boolean z2 = ub0Var.b == 1;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        badVar.a.clear();
        ((HashSet) badVar.b.e).clear();
        eu4 eu4Var = vb0Var.b;
        if (!z && (xf4Var = this.p) != null) {
            if (z2) {
                badVar.b(xf4Var, eu4Var, -1);
            } else {
                xe5 xe5VarA = rb0.a(xf4Var);
                if (eu4Var == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                xe5VarA.Y = eu4Var;
                badVar.a.add(xe5VarA.a());
            }
        }
        oq1 oq1Var = this.t;
        if (oq1Var != null) {
            oq1Var.cancel(false);
        }
        oq1 oq1VarG = f8.g(new ypc(this, 23, badVar));
        this.t = oq1VarG;
        kq0.a(oq1VarG, new td(this, oq1VarG, z2, 16), ju0.D());
    }

    public final void I() {
        kq0.e();
        cad cadVar = this.B;
        if (cadVar != null) {
            cadVar.b();
            this.B = null;
        }
        xf4 xf4Var = this.p;
        if (xf4Var != null) {
            xf4Var.a();
            this.p = null;
        }
        nw4 nw4Var = this.w;
        if (nw4Var != null) {
            nw4Var.n();
            this.w = null;
        }
        iee ieeVar = this.q;
        if (ieeVar != null) {
            ieeVar.c();
            this.q = null;
        }
        this.x = null;
        this.u = null;
        this.r = ub0.d;
        this.y = 0;
        this.z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bad J(defpackage.sdf r28, defpackage.vb0 r29) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.J(sdf, vb0):bad");
    }

    public final int K(ax1 ax1Var) {
        boolean zN = n(ax1Var);
        int iH = h(ax1Var, zN);
        cc0 cc0Var = this.r.c;
        if (cc0Var == null) {
            return iH;
        }
        Objects.requireNonNull(cc0Var);
        boolean z = cc0Var.f;
        int i = cc0Var.b;
        if (zN != z) {
            i = -i;
        }
        return e1f.i(iH - i);
    }

    public final wjf L() {
        wjf wjfVar = (wjf) ((sdf) this.f).h(sdf.b);
        Objects.requireNonNull(wjfVar);
        return wjfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M(defpackage.ax1 r3, defpackage.sdf r4, android.graphics.Rect r5, android.util.Size r6) {
        /*
            r2 = this;
            zgf r0 = r2.m
            if (r0 != 0) goto L66
            boolean r0 = r3.n()
            if (r0 == 0) goto L1e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            aa0 r1 = defpackage.sdf.o
            java.lang.Object r4 = r4.f(r1, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1e
            goto L66
        L1e:
            boolean r4 = r3.n()
            if (r4 == 0) goto L3b
            bj6 r4 = defpackage.xi4.a
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 != 0) goto L66
            yw1 r4 = r3.p()
            bj6 r4 = r4.p()
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 == 0) goto L3b
            goto L66
        L3b:
            int r4 = r6.getWidth()
            int r0 = r5.width()
            if (r4 != r0) goto L66
            int r4 = r6.getHeight()
            int r5 = r5.height()
            if (r4 == r5) goto L50
            goto L66
        L50:
            boolean r4 = r3.n()
            if (r4 == 0) goto L5d
            boolean r3 = r2.n(r3)
            if (r3 == 0) goto L5d
            goto L66
        L5d:
            ub0 r2 = r2.r
            cc0 r2 = r2.c
            if (r2 == 0) goto L64
            goto L66
        L64:
            r2 = 0
            goto L67
        L66:
            r2 = 1
        L67:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.M(ax1, sdf, android.graphics.Rect, android.util.Size):boolean");
    }

    public final void N() {
        if (c() == null) {
            return;
        }
        I();
        sdf sdfVar = (sdf) this.f;
        vb0 vb0Var = this.g;
        vb0Var.getClass();
        bad badVarJ = J(sdfVar, vb0Var);
        this.s = badVarJ;
        H(badVarJ, this.r, this.g);
        Object[] objArr = {this.s.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        q();
    }

    public final void P() {
        ax1 ax1VarC = c();
        iee ieeVar = this.q;
        if (ax1VarC == null || ieeVar == null) {
            return;
        }
        int iK = K(ax1VarC);
        this.y = iK;
        kq0.H(new ft0(ieeVar, iK, b(), 5));
    }

    @Override // defpackage.l9f
    public final o9f f(boolean z, r9f r9fVar) {
        D.getClass();
        sdf sdfVar = pdf.a;
        ce3 ce3VarA = r9fVar.a(sdfVar.N(), 1);
        if (z) {
            ce3VarA = ce3.K(ce3VarA, sdfVar);
        }
        if (ce3VarA == null) {
            return null;
        }
        return new sdf(wma.a(((mt6) l(ce3VarA)).b));
    }

    @Override // defpackage.l9f
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // defpackage.l9f
    public final n9f l(ce3 ce3Var) {
        return new mt6(mi9.c(ce3Var), 3);
    }

    public final String toString() {
        return "VideoCapture:".concat(g());
    }

    @Override // defpackage.l9f
    public final o9f u(yw1 yw1Var, n9f n9fVar) throws ExecutionException, InterruptedException {
        Object obj;
        ArrayList arrayList;
        nc0 nc0VarA;
        sdf sdfVar;
        dff dffVarO;
        sdf sdfVar2;
        int i;
        bm7 bm7VarJ = L().b().j();
        if (bm7VarJ.isDone()) {
            try {
                obj = bm7VarJ.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } else {
            obj = null;
        }
        ab0 ab0Var = (ab0) obj;
        c54.j("Unable to update target resolution by null MediaSpec.", ab0Var != null);
        eu4 eu4VarU = this.f.o(tu6.A) ? this.f.u() : pdf.c;
        kdf kdfVarG = L().g(yw1Var);
        ArrayList arrayListC = kdfVarG.c(eu4VarU);
        if (!arrayListC.isEmpty()) {
            mc0 mc0Var = ab0Var.a;
            b9b b9bVar = mc0Var.a;
            b9bVar.getClass();
            if (arrayListC.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                arrayListC.toString();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = ((List) b9bVar.b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    mb0 mb0Var = (mb0) it.next();
                    if (mb0Var == mb0.i) {
                        linkedHashSet.addAll(arrayListC);
                        break;
                    }
                    if (mb0Var == mb0.h) {
                        ArrayList arrayList2 = new ArrayList(arrayListC);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                        break;
                    }
                    if (arrayListC.contains(mb0Var)) {
                        linkedHashSet.add(mb0Var);
                    } else {
                        Objects.toString(mb0Var);
                    }
                }
                if (!arrayListC.isEmpty() && !linkedHashSet.containsAll(arrayListC)) {
                    la0 la0Var = (la0) b9bVar.c;
                    Objects.toString(la0Var);
                    if (la0Var != la0.c) {
                        c54.p("Currently only support type RuleStrategy", la0Var instanceof la0);
                        ArrayList arrayList3 = new ArrayList(mb0.l);
                        mb0 mb0Var2 = la0Var.a;
                        if (mb0Var2 == mb0.i) {
                            mb0Var2 = (mb0) arrayList3.get(0);
                        } else if (mb0Var2 == mb0.h) {
                            mb0Var2 = (mb0) wg0.f(arrayList3, 1);
                        }
                        int iIndexOf = arrayList3.indexOf(mb0Var2);
                        c54.p(null, iIndexOf != -1);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                            mb0 mb0Var3 = (mb0) arrayList3.get(i2);
                            if (arrayListC.contains(mb0Var3)) {
                                arrayList4.add(mb0Var3);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        while (true) {
                            iIndexOf++;
                            if (iIndexOf >= arrayList3.size()) {
                                break;
                            }
                            mb0 mb0Var4 = (mb0) arrayList3.get(iIndexOf);
                            if (arrayListC.contains(mb0Var4)) {
                                arrayList5.add(mb0Var4);
                            }
                        }
                        arrayList3.toString();
                        Objects.toString(mb0Var2);
                        arrayList4.toString();
                        arrayList5.toString();
                        int i3 = la0Var.b;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                throw new AssertionError("Unhandled fallback strategy: " + la0Var);
                            }
                            linkedHashSet.addAll(arrayList4);
                            linkedHashSet.addAll(arrayList5);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            arrayList.toString();
            b9bVar.toString();
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
            }
            HashMap map = new HashMap();
            for (mb0 mb0Var5 : kdfVarG.c(eu4VarU)) {
                nc0 nc0VarB = kdfVarG.b(mb0Var5, eu4VarU);
                Objects.requireNonNull(nc0VarB);
                ha0 ha0Var = nc0VarB.f;
                map.put(mb0Var5, new Size(ha0Var.e, ha0Var.f));
            }
            rqb rqbVar = new rqb(yw1Var.q(this.f.getInputFormat()), map);
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List list = (List) rqbVar.a.get(new lb0((mb0) it2.next(), mc0Var.d));
                arrayList6.addAll(list != null ? new ArrayList(list) : new ArrayList(0));
            }
            sdf sdfVar3 = (sdf) n9fVar.J();
            if (!arrayList6.isEmpty()) {
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    Size size = (Size) it3.next();
                    if (!map.containsValue(size) && (nc0VarA = kdfVarG.a(size, eu4VarU)) != null) {
                        l66 l66Var = (l66) sdfVar3.h(sdf.c);
                        Objects.requireNonNull(l66Var);
                        Range range = (Range) sdfVar3.f(o9f.l0, pdf.b);
                        Objects.requireNonNull(range);
                        if (eu4VarU.b()) {
                            dffVarO = O(l66Var, nc0VarA, ab0Var, size, eu4VarU, range);
                            sdfVar = sdfVar3;
                        } else {
                            int i4 = Integer.MIN_VALUE;
                            dff dffVar = null;
                            for (ha0 ha0Var2 : nc0VarA.d) {
                                if (hu4.a(ha0Var2, eu4VarU)) {
                                    HashMap map2 = hu4.d;
                                    int i5 = ha0Var2.j;
                                    c54.k(map2.containsKey(Integer.valueOf(i5)));
                                    Integer num = (Integer) map2.get(Integer.valueOf(i5));
                                    Objects.requireNonNull(num);
                                    int iIntValue = num.intValue();
                                    HashMap map3 = hu4.c;
                                    int i6 = ha0Var2.h;
                                    c54.k(map3.containsKey(Integer.valueOf(i6)));
                                    Integer num2 = (Integer) map3.get(Integer.valueOf(i6));
                                    Objects.requireNonNull(num2);
                                    sdfVar2 = sdfVar3;
                                    i = i4;
                                    dff dffVarO2 = O(l66Var, nc0VarA, ab0Var, size, new eu4(iIntValue, num2.intValue()), range);
                                    if (dffVarO2 != null) {
                                        int iIntValue2 = ((Integer) dffVarO2.x1().getUpper()).intValue();
                                        int iIntValue3 = ((Integer) dffVarO2.E1().getUpper()).intValue();
                                        Size size2 = msd.a;
                                        int i7 = iIntValue2 * iIntValue3;
                                        if (i7 > i) {
                                            dffVar = dffVarO2;
                                            i4 = i7;
                                        }
                                    }
                                    sdfVar3 = sdfVar2;
                                } else {
                                    sdfVar2 = sdfVar3;
                                    i = i4;
                                }
                                i4 = i;
                                sdfVar3 = sdfVar2;
                            }
                            sdfVar = sdfVar3;
                            dffVarO = dffVar;
                        }
                        if (dffVarO != null && !dffVarO.Q0(size.getWidth(), size.getHeight())) {
                            it3.remove();
                        }
                        sdfVar3 = sdfVar;
                    }
                }
            }
            arrayList6.toString();
            ((mi9) n9fVar.F()).j(ev6.K, arrayList6);
        }
        return n9fVar.J();
    }

    @Override // defpackage.l9f
    public final void v() throws ExecutionException, InterruptedException {
        e();
        vb0 vb0Var = this.g;
        if (vb0Var == null || this.u != null) {
            return;
        }
        ry9 ry9VarD = L().d();
        Object obj = ub0.d;
        bm7 bm7VarJ = ry9VarD.j();
        if (bm7VarJ.isDone()) {
            try {
                obj = bm7VarJ.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        this.r = (ub0) obj;
        bad badVarJ = J((sdf) this.f, vb0Var);
        this.s = badVarJ;
        H(badVarJ, this.r, vb0Var);
        Object[] objArr = {this.s.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        E(Collections.unmodifiableList(arrayList));
        p();
        L().d().f(ju0.D(), this.C);
        qdf qdfVar = this.A;
        if (qdfVar != null) {
            c54.p("SourceStreamRequirementObserver can be closed from main thread only", kq0.t());
            hw1 hw1Var = qdfVar.a;
            if (hw1Var != null) {
                if (qdfVar.b) {
                    qdfVar.b = false;
                    hw1Var.a();
                }
                qdfVar.a = null;
            }
        }
        hw1 hw1VarD = d();
        qdf qdfVar2 = new qdf();
        qdfVar2.b = false;
        qdfVar2.a = hw1VarD;
        this.A = qdfVar2;
        L().e().f(ju0.D(), this.A);
        if (2 != this.v) {
            this.v = 2;
            L().c(2);
        }
    }

    @Override // defpackage.l9f
    public final void w() {
        c54.p("VideoCapture can only be detached on the main thread.", kq0.t());
        if (this.A != null) {
            L().e().l(this.A);
            qdf qdfVar = this.A;
            qdfVar.getClass();
            c54.p("SourceStreamRequirementObserver can be closed from main thread only", kq0.t());
            hw1 hw1Var = qdfVar.a;
            if (hw1Var != null) {
                if (qdfVar.b) {
                    qdfVar.b = false;
                    hw1Var.a();
                }
                qdfVar.a = null;
            }
            this.A = null;
        }
        if (3 != this.v) {
            this.v = 3;
            L().c(3);
        }
        L().d().l(this.C);
        oq1 oq1Var = this.t;
        if (oq1Var != null) {
            oq1Var.cancel(false);
        }
        I();
    }

    @Override // defpackage.l9f
    public final vb0 x(ce3 ce3Var) {
        this.s.a(ce3Var);
        Object[] objArr = {this.s.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        vb0 vb0Var = this.g;
        Objects.requireNonNull(vb0Var);
        x3c x3cVarA = vb0Var.a();
        x3cVarA.X = ce3Var;
        return x3cVarA.c();
    }

    @Override // defpackage.l9f
    public final vb0 y(vb0 vb0Var, vb0 vb0Var2) {
        Objects.toString(vb0Var);
        List list = (List) ((sdf) this.f).f(ev6.K, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(vb0Var.a)) {
            Objects.toString(vb0Var.a);
            arrayList.toString();
        }
        return vb0Var;
    }
}
