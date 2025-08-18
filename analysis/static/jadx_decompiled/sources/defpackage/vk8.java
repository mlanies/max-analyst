package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vk8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;

    public vk8(a4c a4cVar, aab aabVar, gy0 gy0Var, gy0 gy0Var2, xx0 xx0Var, wte wteVar) {
        this.a = 3;
        this.h = a4cVar;
        this.b = aabVar;
        this.c = gy0Var;
        this.e = gy0Var2;
        this.i = xx0Var;
        this.j = wteVar;
        this.k = new Handler(Looper.getMainLooper());
        this.f = new LinkedHashSet();
        this.d = new HashMap();
        this.m = new i0e(this);
    }

    public lue a(int i, List list, cod codVar) {
        if (!list.isEmpty()) {
            this.l = codVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                sk8 sk8Var = (sk8) list.get(i2 - i);
                ArrayList arrayList = (ArrayList) this.b;
                if (i2 > 0) {
                    sk8 sk8Var2 = (sk8) arrayList.get(i2 - 1);
                    sk8Var.d = sk8Var2.a.o.b.p() + sk8Var2.d;
                    sk8Var.e = false;
                    sk8Var.c.clear();
                } else {
                    sk8Var.d = 0;
                    sk8Var.e = false;
                    sk8Var.c.clear();
                }
                int iP = sk8Var.a.o.b.p();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((sk8) arrayList.get(i3)).d += iP;
                }
                arrayList.add(i2, sk8Var);
                ((HashMap) this.d).put(sk8Var.b, sk8Var);
                if (this.g) {
                    k(sk8Var);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(sk8Var);
                    } else {
                        qk8 qk8Var = (qk8) ((HashMap) this.e).get(sk8Var);
                        if (qk8Var != null) {
                            qk8Var.a.b(qk8Var.b);
                        }
                    }
                }
            }
        }
        return e();
    }

    public mue b(int i, List list, dod dodVar) {
        if (!list.isEmpty()) {
            this.l = dodVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                tk8 tk8Var = (tk8) list.get(i2 - i);
                ArrayList arrayList = (ArrayList) this.b;
                if (i2 > 0) {
                    tk8 tk8Var2 = (tk8) arrayList.get(i2 - 1);
                    tk8Var.d = tk8Var2.a.o.e.p() + tk8Var2.d;
                    tk8Var.e = false;
                    tk8Var.c.clear();
                } else {
                    tk8Var.d = 0;
                    tk8Var.e = false;
                    tk8Var.c.clear();
                }
                int iP = tk8Var.a.o.e.p();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((tk8) arrayList.get(i3)).d += iP;
                }
                arrayList.add(i2, tk8Var);
                ((HashMap) this.d).put(tk8Var.b, tk8Var);
                if (this.g) {
                    l(tk8Var);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(tk8Var);
                    } else {
                        rk8 rk8Var = (rk8) ((HashMap) this.e).get(tk8Var);
                        if (rk8Var != null) {
                            rk8Var.a.d(rk8Var.b);
                        }
                    }
                }
            }
        }
        return f();
    }

    public void c(m1e m1eVar, long j, TimeUnit timeUnit) {
        ((HashMap) this.d).put(m1eVar, new bbg(j, timeUnit));
    }

    public void d(gjd gjdVar, float f, RectF rectF, ey1 ey1Var, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        pjd[] pjdVarArr;
        Path path2;
        Path path3;
        vk8 vk8Var = this;
        gjd gjdVar2 = gjdVar;
        ey1 ey1Var2 = ey1Var;
        path.rewind();
        Path path4 = (Path) vk8Var.e;
        path4.rewind();
        Path path5 = (Path) vk8Var.i;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            matrixArr = (Matrix[]) vk8Var.c;
            fArr = (float[]) vk8Var.k;
            matrixArr2 = (Matrix[]) vk8Var.b;
            pjdVarArr = (pjd[]) vk8Var.h;
            if (i2 >= 4) {
                break;
            }
            hx3 hx3Var = i2 != 1 ? i2 != 2 ? i2 != 3 ? gjdVar2.f : gjdVar2.e : gjdVar2.h : gjdVar2.g;
            hm9 hm9Var = i2 != 1 ? i2 != 2 ? i2 != 3 ? gjdVar2.b : gjdVar2.a : gjdVar2.d : gjdVar2.c;
            pjd pjdVar = pjdVarArr[i2];
            hm9Var.getClass();
            hm9Var.B(pjdVar, f, hx3Var.a(rectF));
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = (PointF) vk8Var.d;
            if (i2 == 1) {
                path3 = path4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                path3 = path4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                path3 = path4;
                pointF.set(rectF.right, rectF.top);
            } else {
                path3 = path4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            pjd pjdVar2 = pjdVarArr[i2];
            fArr[0] = pjdVar2.c;
            fArr[1] = pjdVar2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
            path4 = path3;
        }
        Path path6 = path4;
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            pjd pjdVar3 = pjdVarArr[i4];
            fArr[0] = pjdVar3.a;
            fArr[1] = pjdVar3.b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            pjdVarArr[i4].b(matrixArr2[i4], path);
            if (ey1Var2 != null) {
                pjd pjdVar4 = pjdVarArr[i4];
                Matrix matrix = matrixArr2[i4];
                q18 q18Var = (q18) ey1Var2.b;
                BitSet bitSet = q18Var.o;
                pjdVar4.getClass();
                bitSet.set(i4, false);
                pjdVar4.a(pjdVar4.f);
                q18Var.b[i4] = new ijd(new ArrayList(pjdVar4.h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            pjd pjdVar5 = pjdVarArr[i4];
            fArr[0] = pjdVar5.c;
            fArr[1] = pjdVar5.d;
            matrixArr2[i4].mapPoints(fArr);
            pjd pjdVar6 = pjdVarArr[i6];
            float f3 = pjdVar6.a;
            float[] fArr2 = (float[]) vk8Var.f;
            fArr2[0] = f3;
            fArr2[1] = pjdVar6.b;
            matrixArr2[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            pjd pjdVar7 = pjdVarArr[i4];
            fArr[0] = pjdVar7.c;
            fArr[1] = pjdVar7.d;
            matrixArr2[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            pjd pjdVar8 = (pjd) vk8Var.j;
            pjdVar8.d(0.0f, 0.0f, 270.0f, 0.0f);
            vu4 vu4Var = i4 != 1 ? i4 != 2 ? i4 != 3 ? gjdVar2.j : gjdVar2.i : gjdVar2.l : gjdVar2.k;
            vu4Var.p(fMax, fAbs, f, pjdVar8);
            Path path7 = (Path) vk8Var.l;
            path7.reset();
            pjdVar8.b(matrixArr[i4], path7);
            if (vk8Var.g && (vu4Var.n() || vk8Var.j(path7, i4) || vk8Var.j(path7, i6))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = pjdVar8.a;
                fArr[1] = pjdVar8.b;
                matrixArr[i4].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                pjdVar8.b(matrixArr[i4], path2);
            } else {
                path2 = path6;
                pjdVar8.b(matrixArr[i4], path);
            }
            if (ey1Var != null) {
                Matrix matrix2 = matrixArr[i4];
                q18 q18Var2 = (q18) ey1Var.b;
                q18Var2.o.set(i4 + 4, false);
                pjdVar8.a(pjdVar8.f);
                q18Var2.c[i4] = new ijd(new ArrayList(pjdVar8.h), new Matrix(matrix2));
            }
            vk8Var = this;
            gjdVar2 = gjdVar;
            ey1Var2 = ey1Var;
            path6 = path2;
            i4 = i5;
        }
        Path path8 = path6;
        path.close();
        path8.close();
        if (path8.isEmpty()) {
            return;
        }
        path.op(path8, Path.Op.UNION);
    }

    public lue e() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return lue.a;
        }
        int iP = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sk8 sk8Var = (sk8) arrayList.get(i);
            sk8Var.d = iP;
            iP += sk8Var.a.o.b.p();
        }
        return new a5b(arrayList, (cod) this.l);
    }

    public mue f() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return mue.a;
        }
        int iP = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            tk8 tk8Var = (tk8) arrayList.get(i);
            tk8Var.d = iP;
            iP += tk8Var.a.o.e.p();
        }
        return new b5b(arrayList, (dod) this.l);
    }

    public void g() {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.f).iterator();
                while (it.hasNext()) {
                    sk8 sk8Var = (sk8) it.next();
                    if (sk8Var.c.isEmpty()) {
                        qk8 qk8Var = (qk8) ((HashMap) this.e).get(sk8Var);
                        if (qk8Var != null) {
                            qk8Var.a.b(qk8Var.b);
                        }
                        it.remove();
                    }
                }
                break;
            default:
                Iterator it2 = ((HashSet) this.f).iterator();
                while (it2.hasNext()) {
                    tk8 tk8Var = (tk8) it2.next();
                    if (tk8Var.c.isEmpty()) {
                        rk8 rk8Var = (rk8) ((HashMap) this.e).get(tk8Var);
                        if (rk8Var != null) {
                            rk8Var.a.d(rk8Var.b);
                        }
                        it2.remove();
                    }
                }
                break;
        }
    }

    public void h(sk8 sk8Var) {
        if (sk8Var.e && sk8Var.c.isEmpty()) {
            qk8 qk8Var = (qk8) ((HashMap) this.e).remove(sk8Var);
            qk8Var.getClass();
            dj0 dj0Var = qk8Var.a;
            dj0Var.l(qk8Var.b);
            a8g a8gVar = qk8Var.c;
            dj0Var.o(a8gVar);
            dj0Var.n(a8gVar);
            ((HashSet) this.f).remove(sk8Var);
        }
    }

    public void i(tk8 tk8Var) {
        if (tk8Var.e && tk8Var.c.isEmpty()) {
            rk8 rk8Var = (rk8) ((HashMap) this.e).remove(tk8Var);
            rk8Var.getClass();
            ej0 ej0Var = rk8Var.a;
            ej0Var.p(rk8Var.b);
            imc imcVar = rk8Var.c;
            ej0Var.s(imcVar);
            ej0Var.r(imcVar);
            ((HashSet) this.f).remove(tk8Var);
        }
    }

    public boolean j(Path path, int i) {
        Path path2 = (Path) this.m;
        path2.reset();
        ((pjd[]) this.h)[i].b(((Matrix[]) this.b)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lk8, zj8] */
    public void k(sk8 sk8Var) {
        p08 p08Var = sk8Var.a;
        ?? r1 = new zj8() { // from class: lk8
            @Override // defpackage.zj8
            public final void a(dj0 dj0Var, lue lueVar) {
                ((f85) this.a.i).s0.c(22);
            }
        };
        a8g a8gVar = new a8g();
        a8gVar.o = this;
        a8gVar.b = (gk8) this.j;
        a8gVar.c = (kr4) this.k;
        a8gVar.a = sk8Var;
        ((HashMap) this.e).put(sk8Var, new qk8(p08Var, r1, a8gVar));
        int i = maf.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        p08Var.getClass();
        gk8 gk8Var = p08Var.c;
        gk8Var.getClass();
        ek8 ek8Var = new ek8();
        ek8Var.a = handler;
        ek8Var.b = a8gVar;
        ((CopyOnWriteArrayList) gk8Var.d).add(ek8Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        kr4 kr4Var = p08Var.d;
        kr4Var.getClass();
        ir4 ir4Var = new ir4();
        ir4Var.a = handler2;
        ir4Var.b = a8gVar;
        kr4Var.c.add(ir4Var);
        p08Var.h(r1, (y0f) this.m, (i4b) this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ak8, mk8] */
    public void l(tk8 tk8Var) {
        q08 q08Var = tk8Var.a;
        ?? r1 = new ak8() { // from class: mk8
            @Override // defpackage.ak8
            public final void a(ej0 ej0Var, mue mueVar) {
                bie bieVar = ((g85) ((uk8) this.a.i)).s0;
                bieVar.e(2);
                bieVar.f(22);
            }
        };
        imc imcVar = new imc(this, 25, tk8Var);
        ((HashMap) this.e).put(tk8Var, new rk8(q08Var, r1, imcVar));
        Handler handlerP = oaf.p(null);
        q08Var.getClass();
        jn jnVar = q08Var.c;
        jnVar.getClass();
        fk8 fk8Var = new fk8();
        fk8Var.a = handlerP;
        fk8Var.b = imcVar;
        ((CopyOnWriteArrayList) jnVar.o).add(fk8Var);
        Handler handlerP2 = oaf.p(null);
        lr4 lr4Var = q08Var.d;
        lr4Var.getClass();
        jr4 jr4Var = new jr4();
        jr4Var.a = handlerP2;
        jr4Var.b = imcVar;
        lr4Var.c.add(jr4Var);
        q08Var.l(r1, (z0f) this.m, (j4b) this.h);
    }

    public void m(zbg zbgVar) {
        Handler handler = (Handler) this.k;
        if (!tpa.f(handler.getLooper().getThread(), Thread.currentThread())) {
            handler.post(new f0e(this, zbgVar, 0));
        } else {
            if (this.g) {
                return;
            }
            ((LinkedHashSet) this.f).add(zbgVar);
        }
    }

    public void n(yd8 yd8Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        sk8 sk8Var = (sk8) identityHashMap.remove(yd8Var);
        sk8Var.getClass();
        sk8Var.a.k(yd8Var);
        sk8Var.c.remove(((j08) yd8Var).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        h(sk8Var);
    }

    public void o(zd8 zd8Var) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        tk8 tk8Var = (tk8) identityHashMap.remove(zd8Var);
        tk8Var.getClass();
        tk8Var.a.o(zd8Var);
        tk8Var.c.remove(((k08) zd8Var).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        i(tk8Var);
    }

    public void p(int i, int i2) {
        switch (this.a) {
            case 0:
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    ArrayList arrayList = (ArrayList) this.b;
                    sk8 sk8Var = (sk8) arrayList.remove(i3);
                    ((HashMap) this.d).remove(sk8Var.b);
                    int i4 = -sk8Var.a.o.b.p();
                    for (int i5 = i3; i5 < arrayList.size(); i5++) {
                        ((sk8) arrayList.get(i5)).d += i4;
                    }
                    sk8Var.e = true;
                    if (this.g) {
                        h(sk8Var);
                    }
                }
                break;
            default:
                for (int i6 = i2 - 1; i6 >= i; i6--) {
                    ArrayList arrayList2 = (ArrayList) this.b;
                    tk8 tk8Var = (tk8) arrayList2.remove(i6);
                    ((HashMap) this.d).remove(tk8Var.b);
                    int i7 = -tk8Var.a.o.e.p();
                    for (int i8 = i6; i8 < arrayList2.size(); i8++) {
                        ((tk8) arrayList2.get(i8)).d += i7;
                    }
                    tk8Var.e = true;
                    if (this.g) {
                        i(tk8Var);
                    }
                }
                break;
        }
    }

    public vk8() {
        this.a = 2;
        this.h = new pjd[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.i = new Path();
        this.j = new pjd();
        this.k = new float[2];
        this.f = new float[2];
        this.l = new Path();
        this.m = new Path();
        this.g = true;
        for (int i = 0; i < 4; i++) {
            ((pjd[]) this.h)[i] = new pjd();
            ((Matrix[]) this.b)[i] = new Matrix();
            ((Matrix[]) this.c)[i] = new Matrix();
        }
    }

    public vk8(f85 f85Var, h74 h74Var, Handler handler, i4b i4bVar) {
        this.a = 0;
        this.h = i4bVar;
        this.i = f85Var;
        this.l = new cod();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        gk8 gk8Var = new gk8();
        this.j = gk8Var;
        kr4 kr4Var = new kr4();
        this.k = kr4Var;
        this.e = new HashMap();
        this.f = new HashSet();
        h74Var.getClass();
        ek8 ek8Var = new ek8();
        ek8Var.a = handler;
        ek8Var.b = h74Var;
        ((CopyOnWriteArrayList) gk8Var.d).add(ek8Var);
        ir4 ir4Var = new ir4();
        ir4Var.a = handler;
        ir4Var.b = h74Var;
        kr4Var.c.add(ir4Var);
    }

    public vk8(uk8 uk8Var, i74 i74Var, bie bieVar, j4b j4bVar) {
        this.a = 1;
        this.h = j4bVar;
        this.i = uk8Var;
        this.l = new dod();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.j = i74Var;
        this.k = bieVar;
        this.e = new HashMap();
        this.f = new HashSet();
    }
}
