package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xx1 implements fv1 {
    public c9e A0;
    public final ejc B0;
    public final fjc C0;
    public final fjc D0;
    public final ge7 E0;
    public final ge7 F0;
    public final x90 X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ax1 a;
    public final ax1 b;
    public final y7g c;
    public final r9f o;
    public final l0f s0;
    public uof t0;
    public List u0;
    public final yv1 v0;
    public final Object w0;
    public boolean x0;
    public ce3 y0;
    public l9f z0;

    public xx1(ax1 ax1Var, ax1 ax1Var2, fjc fjcVar, fjc fjcVar2, l0f l0fVar, y7g y7gVar, ev1 ev1Var) {
        ge7 ge7Var = ge7.f;
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.u0 = Collections.emptyList();
        this.w0 = new Object();
        this.x0 = true;
        this.y0 = null;
        this.a = ax1Var;
        this.b = ax1Var2;
        this.E0 = ge7Var;
        this.F0 = ge7Var;
        this.s0 = l0fVar;
        this.c = y7gVar;
        this.o = ev1Var;
        yv1 yv1Var = fjcVar.c;
        this.v0 = yv1Var;
        yv1Var.P();
        this.B0 = new ejc(ax1Var.g());
        this.C0 = fjcVar;
        this.D0 = fjcVar2;
        this.X = t(fjcVar, fjcVar2);
    }

    public static ArrayList A(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            l9fVar.getClass();
            l9fVar.m = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                zgf zgfVar = (zgf) it2.next();
                if (l9fVar.m(zgfVar.a)) {
                    c54.p(l9fVar + " already has effect" + l9fVar.m, l9fVar.m == null);
                    c54.k(l9fVar.m(zgfVar.a));
                    l9fVar.m = zgfVar;
                    arrayList2.remove(zgfVar);
                }
            }
        }
        return arrayList2;
    }

    public static Matrix m(Rect rect, Size size) {
        c54.j("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static x90 t(fjc fjcVar, fjc fjcVar2) {
        StringBuilder sb = new StringBuilder();
        sb.append(fjcVar.a.d());
        sb.append(fjcVar2 == null ? "" : fjcVar2.a.d());
        return new x90(sb.toString(), ((aw1) fjcVar.c).a);
    }

    public static HashMap u(ArrayList arrayList, r9f r9fVar, r9f r9fVar2) {
        o9f o9fVarF;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            if (l9fVar instanceof c9e) {
                c9e c9eVar = (c9e) l9fVar;
                o9f o9fVarF2 = new mt6(2).b().f(false, r9fVar);
                if (o9fVarF2 == null) {
                    o9fVarF = null;
                } else {
                    mi9 mi9VarC = mi9.c(o9fVarF2);
                    mi9VarC.a.remove(cne.e0);
                    o9fVarF = ((gaa) c9eVar.l(mi9VarC)).J();
                }
            } else {
                o9fVarF = l9fVar.f(false, r9fVar);
            }
            o9f o9fVarF3 = l9fVar.f(true, r9fVar2);
            wx1 wx1Var = new wx1();
            wx1Var.a = o9fVarF;
            wx1Var.b = o9fVarF3;
            map.put(l9fVar, wx1Var);
        }
        return map;
    }

    public static boolean y(vb0 vb0Var, fad fadVar) {
        ce3 ce3Var = fadVar.g.b;
        ce3 ce3Var2 = vb0Var.d;
        if (ce3Var2.g().size() != fadVar.g.b.g().size()) {
            return true;
        }
        for (aa0 aa0Var : ce3Var2.g()) {
            if (!ce3Var.o(aa0Var) || !Objects.equals(ce3Var.h(aa0Var), ce3Var2.h(aa0Var))) {
                return true;
            }
        }
        return false;
    }

    public final void B(LinkedHashSet linkedHashSet, boolean z, boolean z2) {
        int i;
        HashMap map;
        vb0 vb0Var;
        ce3 ce3Var;
        int i2;
        boolean z3;
        synchronized (this.w0) {
            x();
            synchronized (this.w0) {
                try {
                    if (!this.u0.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z3 = false;
                                break;
                            }
                            l9f l9fVar = (l9f) it.next();
                            if (l9fVar instanceof fu6) {
                                o9f o9fVar = l9fVar.f;
                                aa0 aa0Var = gu6.Y;
                                if (o9fVar.o(aa0Var)) {
                                    Integer num = (Integer) o9fVar.h(aa0Var);
                                    num.getClass();
                                    if (num.intValue() == 1) {
                                        z3 = true;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (z3) {
                            throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                        }
                    }
                } finally {
                }
            }
            if (!z) {
                x();
            }
            c9e c9eVarR = r(linkedHashSet, z);
            l9f l9fVarI = i(linkedHashSet, c9eVarR);
            ArrayList arrayList = new ArrayList(linkedHashSet);
            if (l9fVarI != null) {
                arrayList.add(l9fVarI);
            }
            if (c9eVarR != null) {
                arrayList.add(c9eVarR);
                arrayList.removeAll(c9eVarR.q.a);
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.removeAll(this.Z);
            ArrayList arrayList3 = new ArrayList(arrayList);
            arrayList3.retainAll(this.Z);
            ArrayList arrayList4 = new ArrayList(this.Z);
            arrayList4.removeAll(arrayList);
            HashMap mapU = u(arrayList2, (r9f) this.v0.f(yv1.g, r9f.a), this.o);
            Map mapEmptyMap = Collections.emptyMap();
            try {
                try {
                    synchronized (this.w0) {
                        try {
                            i = this.s0.b == 2 ? 1 : 0;
                        } finally {
                            th = th;
                            while (true) {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        }
                    }
                    HashMap map2 = mapU;
                    HashMap mapQ = q(i, this.a.p(), arrayList2, arrayList3, map2);
                    if (this.b != null) {
                        synchronized (this.w0) {
                            try {
                                i2 = this.s0.b == 2 ? 1 : 0;
                            } finally {
                            }
                        }
                        ax1 ax1Var = this.b;
                        Objects.requireNonNull(ax1Var);
                        map = mapQ;
                        mapEmptyMap = q(i2, ax1Var.p(), arrayList2, arrayList3, map2);
                    } else {
                        map = mapQ;
                    }
                    Map map3 = mapEmptyMap;
                    C(map, arrayList);
                    ArrayList arrayListA = A(arrayList, this.u0);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList arrayListA2 = A(arrayList5, arrayListA);
                    if (arrayListA2.size() > 0) {
                        arrayListA2.toString();
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        ((l9f) it2.next()).D(this.a);
                    }
                    this.a.l(arrayList4);
                    if (this.b != null) {
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            l9f l9fVar2 = (l9f) it3.next();
                            ax1 ax1Var2 = this.b;
                            Objects.requireNonNull(ax1Var2);
                            l9fVar2.D(ax1Var2);
                        }
                        ax1 ax1Var3 = this.b;
                        Objects.requireNonNull(ax1Var3);
                        ax1Var3.l(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            l9f l9fVar3 = (l9f) it4.next();
                            if (map.containsKey(l9fVar3) && (ce3Var = (vb0Var = (vb0) map.get(l9fVar3)).d) != null && y(vb0Var, l9fVar3.n)) {
                                l9fVar3.g = l9fVar3.x(ce3Var);
                                if (this.x0) {
                                    this.a.i(l9fVar3);
                                    ax1 ax1Var4 = this.b;
                                    if (ax1Var4 != null) {
                                        ax1Var4.i(l9fVar3);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        l9f l9fVar4 = (l9f) it5.next();
                        HashMap map4 = map2;
                        wx1 wx1Var = (wx1) map4.get(l9fVar4);
                        Objects.requireNonNull(wx1Var);
                        ax1 ax1Var5 = this.b;
                        if (ax1Var5 != null) {
                            l9fVar4.a(this.a, ax1Var5, wx1Var.a, wx1Var.b);
                            vb0 vb0Var2 = (vb0) map.get(l9fVar4);
                            vb0Var2.getClass();
                            l9fVar4.g = l9fVar4.y(vb0Var2, (vb0) map3.get(l9fVar4));
                        } else {
                            l9fVar4.a(this.a, null, wx1Var.a, wx1Var.b);
                            vb0 vb0Var3 = (vb0) map.get(l9fVar4);
                            vb0Var3.getClass();
                            l9fVar4.g = l9fVar4.y(vb0Var3, null);
                        }
                        map2 = map4;
                    }
                    if (this.x0) {
                        this.a.k(arrayList2);
                        ax1 ax1Var6 = this.b;
                        if (ax1Var6 != null) {
                            ax1Var6.k(arrayList2);
                        }
                    }
                    Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        ((l9f) it6.next()).r();
                    }
                    this.Y.clear();
                    this.Y.addAll(linkedHashSet);
                    this.Z.clear();
                    this.Z.addAll(arrayList);
                    this.z0 = l9fVarI;
                    this.A0 = c9eVarR;
                } catch (IllegalArgumentException e) {
                    e = e;
                    if (!z) {
                        x();
                        if (this.s0.b != 2) {
                            B(linkedHashSet, true, z2);
                            return;
                        }
                    }
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
            }
        }
    }

    public final void C(HashMap map, ArrayList arrayList) {
        synchronized (this.w0) {
            try {
                if (this.t0 != null && !arrayList.isEmpty()) {
                    boolean z = this.a.p().g() == 0;
                    Rect rectE = this.a.g().e();
                    Rational rational = this.t0.b;
                    int iL = this.a.p().l(this.t0.c);
                    uof uofVar = this.t0;
                    HashMap mapH = ema.h(rectE, z, rational, iL, uofVar.a, uofVar.d, map);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        l9f l9fVar = (l9f) it.next();
                        Rect rect = (Rect) mapH.get(l9fVar);
                        rect.getClass();
                        l9fVar.C(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    l9f l9fVar2 = (l9f) it2.next();
                    Rect rectE2 = this.a.g().e();
                    vb0 vb0Var = (vb0) map.get(l9fVar2);
                    vb0Var.getClass();
                    l9fVar2.A(m(rectE2, vb0Var.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fv1
    public final yw1 a() {
        return this.C0;
    }

    public final void c(List list) {
        synchronized (this.w0) {
            try {
                this.a.b(this.v0);
                ax1 ax1Var = this.b;
                if (ax1Var != null) {
                    ax1Var.b(this.v0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.Y);
                linkedHashSet.addAll(list);
                try {
                    ax1 ax1Var2 = this.b;
                    B(linkedHashSet, ax1Var2 != null, ax1Var2 != null);
                } catch (IllegalArgumentException e) {
                    throw new CameraUseCaseAdapter$CameraException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.w0) {
            try {
                if (!this.x0) {
                    if (!this.Z.isEmpty()) {
                        this.a.b(this.v0);
                        ax1 ax1Var = this.b;
                        if (ax1Var != null) {
                            ax1Var.b(this.v0);
                        }
                    }
                    this.a.k(this.Z);
                    ax1 ax1Var2 = this.b;
                    if (ax1Var2 != null) {
                        ax1Var2.k(this.Z);
                    }
                    synchronized (this.w0) {
                        try {
                            if (this.y0 != null) {
                                this.a.g().c(this.y0);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.Z.iterator();
                    while (it.hasNext()) {
                        ((l9f) it.next()).r();
                    }
                    this.x0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l9f i(java.util.LinkedHashSet r8, defpackage.c9e r9) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx1.i(java.util.LinkedHashSet, c9e):l9f");
    }

    public final HashMap q(int i, yw1 yw1Var, ArrayList arrayList, ArrayList arrayList2, HashMap map) {
        y7g y7gVar;
        Rect rectE;
        boolean z;
        boolean z2;
        ArrayList arrayList3 = new ArrayList();
        String strD = yw1Var.d();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            y7gVar = this.c;
            if (!zHasNext) {
                break;
            }
            l9f l9fVar = (l9f) it.next();
            int inputFormat = l9fVar.f.getInputFormat();
            vb0 vb0Var = l9fVar.g;
            Size size = vb0Var != null ? vb0Var.a : null;
            bee beeVar = (bee) ((HashMap) y7gVar.b).get(strD);
            xb0 xb0VarB = beeVar != null ? xb0.b(i, inputFormat, size, beeVar.i(inputFormat)) : null;
            int inputFormat2 = l9fVar.f.getInputFormat();
            vb0 vb0Var2 = l9fVar.g;
            Size size2 = vb0Var2 != null ? vb0Var2.a : null;
            vb0Var2.getClass();
            l90 l90Var = new l90(xb0VarB, inputFormat2, size2, vb0Var2.b, c9e.J(l9fVar), l9fVar.g.d, (Range) l9fVar.f.f(o9f.l0, null));
            arrayList3.add(l90Var);
            map3.put(l90Var, l9fVar);
            map2.put(l9fVar, l9fVar.g);
        }
        if (!arrayList.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectE = this.a.g().e();
            } catch (NullPointerException unused) {
                rectE = null;
            }
            jo7 jo7Var = new jo7(yw1Var, rectE != null ? e1f.e(rectE) : null);
            Iterator it2 = arrayList.iterator();
            loop1: while (true) {
                z = false;
                while (it2.hasNext()) {
                    l9f l9fVar2 = (l9f) it2.next();
                    wx1 wx1Var = (wx1) map.get(l9fVar2);
                    o9f o9fVarO = l9fVar2.o(yw1Var, wx1Var.a, wx1Var.b);
                    map4.put(o9fVarO, l9fVar2);
                    map5.put(o9fVarO, jo7Var.k(o9fVarO));
                    o9f o9fVar = l9fVar2.f;
                    if (o9fVar instanceof i8b) {
                        if (((i8b) o9fVar).X() == 2) {
                            z = true;
                        }
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = false;
                    break;
                }
                l9f l9fVar3 = (l9f) it3.next();
                if (l9fVar3 != null) {
                    if (l9fVar3.f.o(o9f.o0)) {
                        if (l9fVar3.f.N() == q9f.o) {
                            z2 = true;
                            break;
                        }
                    } else {
                        l9fVar3.toString();
                    }
                }
            }
            y7gVar.getClass();
            c54.j("No new use cases to be bound.", !map5.isEmpty());
            bee beeVar2 = (bee) ((HashMap) y7gVar.b).get(strD);
            if (beeVar2 == null) {
                throw new IllegalArgumentException(wg0.i("No such camera id in supported combination list: ", strD));
            }
            Pair pairG = beeVar2.g(i, arrayList3, map5, z, z2);
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((l9f) entry.getValue(), (vb0) ((Map) pairG.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairG.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((l9f) map3.get(entry2.getKey()), (vb0) entry2.getValue());
                }
            }
        }
        return map2;
    }

    public final c9e r(LinkedHashSet linkedHashSet, boolean z) {
        synchronized (this.w0) {
            try {
                HashSet hashSetV = v(linkedHashSet, z);
                if (hashSetV.size() < 2) {
                    x();
                    return null;
                }
                c9e c9eVar = this.A0;
                if (c9eVar != null && c9eVar.q.a.equals(hashSetV)) {
                    c9e c9eVar2 = this.A0;
                    Objects.requireNonNull(c9eVar2);
                    return c9eVar2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = hashSetV.iterator();
                while (it.hasNext()) {
                    l9f l9fVar = (l9f) it.next();
                    for (int i = 0; i < 3; i++) {
                        int i2 = iArr[i];
                        if (l9fVar.m(i2)) {
                            if (hashSet.contains(Integer.valueOf(i2))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i2));
                        }
                    }
                }
                return new c9e(this.a, this.b, this.E0, this.F0, hashSetV, this.o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.w0) {
            try {
                if (this.x0) {
                    this.a.l(new ArrayList(this.Z));
                    ax1 ax1Var = this.b;
                    if (ax1Var != null) {
                        ax1Var.l(new ArrayList(this.Z));
                    }
                    synchronized (this.w0) {
                        hw1 hw1VarG = this.a.g();
                        this.y0 = hw1VarG.m();
                        hw1VarG.n();
                    }
                    this.x0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet v(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.w0) {
            try {
                Iterator it = this.u0.iterator();
                zgf zgfVar = null;
                while (true) {
                    boolean z2 = true;
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    zgf zgfVar2 = (zgf) it.next();
                    int i2 = 0;
                    for (int i3 = zgfVar2.a; i3 != 0; i3 >>= 1) {
                        i2 += i3 & 1;
                    }
                    if (i2 > 1) {
                        if (zgfVar != null) {
                            z2 = false;
                        }
                        c54.p("Can only have one sharing effect.", z2);
                        zgfVar = zgfVar2;
                    }
                }
                if (zgfVar != null) {
                    i = zgfVar.a;
                }
                if (z) {
                    i |= 3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            l9f l9fVar = (l9f) it2.next();
            c54.j("Only support one level of sharing for now.", !(l9fVar instanceof c9e));
            if (l9fVar.m(i)) {
                hashSet.add(l9fVar);
            }
        }
        return hashSet;
    }

    public final List w() {
        ArrayList arrayList;
        synchronized (this.w0) {
            arrayList = new ArrayList(this.Y);
        }
        return arrayList;
    }

    public final void x() {
        synchronized (this.w0) {
            this.v0.P();
        }
    }

    public final void z(ArrayList arrayList) {
        synchronized (this.w0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.Y);
            linkedHashSet.removeAll(arrayList);
            ax1 ax1Var = this.b;
            B(linkedHashSet, ax1Var != null, ax1Var != null);
        }
    }
}
