package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class aqf implements k9f {
    public final r9f X;
    public final ax1 Y;
    public final ax1 Z;
    public final Set a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();
    public final oz1 s0 = new oz1(2, this);
    public final HashSet t0;
    public final HashMap u0;
    public final mic v0;
    public final mic w0;

    public aqf(ax1 ax1Var, ax1 ax1Var2, HashSet hashSet, r9f r9fVar, bqc bqcVar) {
        this.Y = ax1Var;
        this.Z = ax1Var2;
        this.X = r9fVar;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            map.put(l9fVar, l9fVar.o(ax1Var.p(), null, l9fVar.f(true, r9fVar)));
        }
        this.u0 = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.t0 = hashSet2;
        this.v0 = new mic(ax1Var, hashSet2);
        if (this.Z != null) {
            this.w0 = new mic(this.Z, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            l9f l9fVar2 = (l9f) it2.next();
            this.o.put(l9fVar2, Boolean.FALSE);
            this.c.put(l9fVar2, new zpf(ax1Var, this, bqcVar));
        }
    }

    public static void r(iee ieeVar, xf4 xf4Var, fad fadVar) {
        ieeVar.e();
        try {
            kq0.e();
            ieeVar.b();
            hee heeVar = ieeVar.l;
            Objects.requireNonNull(heeVar);
            heeVar.f(xf4Var, new fee(heeVar, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            dad dadVar = fadVar.f;
            if (dadVar != null) {
                dadVar.a(fadVar);
            }
        }
    }

    public static xf4 s(l9f l9fVar) {
        List listB = l9fVar instanceof fu6 ? l9fVar.n.b() : Collections.unmodifiableList(l9fVar.n.g.a);
        c54.p(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (xf4) listB.get(0);
        }
        return null;
    }

    @Override // defpackage.k9f
    public final void c(l9f l9fVar) {
        xf4 xf4VarS;
        kq0.e();
        iee ieeVar = (iee) this.b.get(l9fVar);
        Objects.requireNonNull(ieeVar);
        if (t(l9fVar) && (xf4VarS = s(l9fVar)) != null) {
            r(ieeVar, xf4VarS, l9fVar.n);
        }
    }

    @Override // defpackage.k9f
    public final void e(l9f l9fVar) {
        kq0.e();
        if (t(l9fVar)) {
            return;
        }
        this.o.put(l9fVar, Boolean.TRUE);
        xf4 xf4VarS = s(l9fVar);
        if (xf4VarS != null) {
            iee ieeVar = (iee) this.b.get(l9fVar);
            Objects.requireNonNull(ieeVar);
            r(ieeVar, xf4VarS, l9fVar.n);
        }
    }

    @Override // defpackage.k9f
    public final void i(l9f l9fVar) {
        kq0.e();
        if (t(l9fVar)) {
            iee ieeVar = (iee) this.b.get(l9fVar);
            Objects.requireNonNull(ieeVar);
            xf4 xf4VarS = s(l9fVar);
            if (xf4VarS != null) {
                r(ieeVar, xf4VarS, l9fVar.n);
                return;
            }
            kq0.e();
            ieeVar.b();
            ieeVar.l.a();
        }
    }

    @Override // defpackage.k9f
    public final void m(l9f l9fVar) {
        kq0.e();
        if (t(l9fVar)) {
            this.o.put(l9fVar, Boolean.FALSE);
            iee ieeVar = (iee) this.b.get(l9fVar);
            Objects.requireNonNull(ieeVar);
            kq0.e();
            ieeVar.b();
            ieeVar.l.a();
        }
    }

    public final cb0 q(l9f l9fVar, mic micVar, ax1 ax1Var, iee ieeVar, int i, boolean z) {
        boolean z2;
        Size sizeE;
        int iL = ax1Var.p().l(i);
        Matrix matrix = ieeVar.b;
        RectF rectF = e1f.a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > 0.0f;
        o9f o9fVar = (o9f) this.u0.get(l9fVar);
        Objects.requireNonNull(o9fVar);
        ieeVar.b.getValues(new float[9]);
        int i2 = e1f.i((int) Math.round(Math.atan2(r9[3], r9[0]) * 57.29577951308232d));
        micVar.getClass();
        boolean zC = e1f.c(i2);
        Rect rectA = ieeVar.d;
        if (zC) {
            rectA = new Rect(rectA.top, rectA.left, rectA.bottom, rectA.right);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            sizeE = e1f.e(rectA);
            Iterator it = micVar.b(o9fVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size sizeE2 = e1f.e(mic.a((Size) it.next(), sizeE));
                if (!mic.c(sizeE2, sizeE)) {
                    sizeE = sizeE2;
                    break;
                }
            }
        } else {
            Size sizeE3 = e1f.e(rectA);
            List listB = micVar.b(o9fVar);
            Iterator it2 = listB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeE = sizeE3;
                            break;
                        }
                        Size size = (Size) it3.next();
                        if (!mic.c(size, sizeE3)) {
                            sizeE = size;
                            break;
                        }
                    }
                } else {
                    Size size2 = (Size) it2.next();
                    Rational rationalG = lt.a;
                    Size size3 = msd.c;
                    if (!lt.a(sizeE3, rationalG, size3)) {
                        rationalG = lt.c;
                        if (!lt.a(sizeE3, rationalG, size3)) {
                            rationalG = mic.g(sizeE3);
                        }
                    }
                    if (!micVar.d(rationalG, size2) && !mic.c(size2, sizeE3)) {
                        sizeE = size2;
                        break;
                    }
                }
            }
            rectA = mic.a(sizeE3, sizeE);
        }
        Pair pair = new Pair(rectA, sizeE);
        Rect rect = (Rect) pair.first;
        Size size4 = (Size) pair.second;
        if (z2) {
            Size size5 = new Size(size4.getHeight(), size4.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size4 = size5;
        }
        Pair pair2 = new Pair(rect, size4);
        Rect rect2 = (Rect) pair2.first;
        Size size6 = (Size) pair2.second;
        int iL2 = this.Y.p().l(((ev6) l9fVar.f).f0(0));
        zpf zpfVar = (zpf) this.c.get(l9fVar);
        Objects.requireNonNull(zpfVar);
        zpfVar.c.c = iL2;
        int i3 = e1f.i((ieeVar.i + iL2) - iL);
        return new cb0(UUID.randomUUID(), l9fVar instanceof h8b ? 1 : l9fVar instanceof fu6 ? 4 : 2, l9fVar instanceof fu6 ? 256 : 34, rect2, e1f.g(size6, i3), i3, l9fVar.n(ax1Var) ^ z3, false);
    }

    public final boolean t(l9f l9fVar) {
        Boolean bool = (Boolean) this.o.get(l9fVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void u(HashMap map) {
        HashMap map2 = this.b;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            l9f l9fVar = (l9f) entry.getKey();
            iee ieeVar = (iee) entry.getValue();
            l9fVar.C(ieeVar.d);
            l9fVar.A(ieeVar.b);
            l9fVar.g = l9fVar.y(ieeVar.g, null);
            l9fVar.r();
        }
    }
}
