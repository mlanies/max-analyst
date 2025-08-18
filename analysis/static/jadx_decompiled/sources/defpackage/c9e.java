package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.ArrayList;
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
public final class c9e extends l9f {
    public bad A;
    public bad B;
    public cad C;
    public final d9e p;
    public final aqf q;
    public final ge7 r;
    public final ge7 s;
    public nw4 t;
    public nw4 u;
    public o23 v;
    public iee w;
    public iee x;
    public iee y;
    public iee z;

    public c9e(ax1 ax1Var, ax1 ax1Var2, ge7 ge7Var, ge7 ge7Var2, HashSet hashSet, r9f r9fVar) {
        super(K(hashSet));
        this.p = K(hashSet);
        this.r = ge7Var;
        this.s = ge7Var2;
        this.q = new aqf(ax1Var, ax1Var2, hashSet, r9fVar, new bqc(19, this));
    }

    public static ArrayList J(l9f l9fVar) {
        ArrayList arrayList = new ArrayList();
        if (l9fVar instanceof c9e) {
            Iterator it = ((c9e) l9fVar).q.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((l9f) it.next()).f.N());
            }
        } else {
            arrayList.add(l9fVar.f.N());
        }
        return arrayList;
    }

    public static d9e K(HashSet hashSet) {
        mi9 mi9VarB = mi9.b();
        new gaa(mi9VarB);
        mi9VarB.j(tu6.z, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            l9f l9fVar = (l9f) it.next();
            if (l9fVar.f.o(o9f.o0)) {
                arrayList.add(l9fVar.f.N());
            }
        }
        mi9VarB.j(d9e.b, arrayList);
        mi9VarB.j(ev6.E, 2);
        return new d9e(wma.a(mi9VarB));
    }

    public final void F() {
        cad cadVar = this.C;
        if (cadVar != null) {
            cadVar.b();
            this.C = null;
        }
        iee ieeVar = this.w;
        if (ieeVar != null) {
            ieeVar.c();
            this.w = null;
        }
        iee ieeVar2 = this.x;
        if (ieeVar2 != null) {
            ieeVar2.c();
            this.x = null;
        }
        iee ieeVar3 = this.y;
        if (ieeVar3 != null) {
            ieeVar3.c();
            this.y = null;
        }
        iee ieeVar4 = this.z;
        if (ieeVar4 != null) {
            ieeVar4.c();
            this.z = null;
        }
        nw4 nw4Var = this.u;
        if (nw4Var != null) {
            nw4Var.n();
            this.u = null;
        }
        o23 o23Var = this.v;
        if (o23Var != null) {
            ((lee) o23Var.a).release();
            kq0.H(new dd4(9, o23Var));
            this.v = null;
        }
        nw4 nw4Var2 = this.t;
        if (nw4Var2 != null) {
            nw4Var2.n();
            this.t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    public final List G(String str, String str2, o9f o9fVar, vb0 vb0Var, vb0 vb0Var2) {
        boolean z;
        nw4 nw4Var;
        kq0.e();
        aqf aqfVar = this.q;
        if (vb0Var2 == null) {
            H(str, str2, o9fVar, vb0Var, null);
            ax1 ax1VarC = c();
            Objects.requireNonNull(ax1VarC);
            zgf zgfVar = this.m;
            if (zgfVar == null || zgfVar.b != 1) {
                nw4Var = new nw4(ax1VarC, new ce4(vb0Var.b));
            } else {
                nw4Var = new nw4(ax1VarC, new mee(zgfVar));
                this.t = nw4Var;
            }
            this.u = nw4Var;
            boolean z2 = this.i != null;
            iee ieeVar = this.y;
            int iK = k();
            aqfVar.getClass();
            HashMap map = new HashMap();
            for (l9f l9fVar : aqfVar.a) {
                map.put(l9fVar, aqfVar.q(l9fVar, aqfVar.v0, aqfVar.Y, ieeVar, iK, z2));
            }
            xs4 xs4VarR = this.u.r(new ac0(this.y, new ArrayList(map.values())));
            HashMap map2 = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                map2.put((l9f) entry.getKey(), (iee) xs4VarR.get(entry.getValue()));
            }
            aqfVar.u(map2);
            Object[] objArr = {this.A.c()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        H(str, str2, o9fVar, vb0Var, vb0Var2);
        Matrix matrix = this.j;
        ax1 ax1VarI = i();
        Objects.requireNonNull(ax1VarI);
        boolean zN = ax1VarI.n();
        Rect rect = this.i;
        if (rect != null) {
            z = false;
        } else {
            Size size = vb0Var2.a;
            z = false;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        ax1 ax1VarI2 = i();
        Objects.requireNonNull(ax1VarI2);
        int iH = h(ax1VarI2, z);
        ax1 ax1VarI3 = i();
        Objects.requireNonNull(ax1VarI3);
        iee ieeVar2 = new iee(3, 34, vb0Var2, matrix, zN, rect, iH, -1, n(ax1VarI3));
        this.x = ieeVar2;
        ax1 ax1VarI4 = i();
        Objects.requireNonNull(ax1VarI4);
        this.z = L(ieeVar2, ax1VarI4);
        bad badVarI = I(this.x, o9fVar, vb0Var2);
        this.B = badVarI;
        cad cadVar = this.C;
        if (cadVar != null) {
            cadVar.b();
        }
        boolean z3 = z;
        cad cadVar2 = new cad(new b9e(this, str, str2, o9fVar, vb0Var, vb0Var2));
        this.C = cadVar2;
        badVarI.f = cadVar2;
        this.v = new o23(c(), i(), new vs4(vb0Var.b, this.r, this.s));
        boolean z4 = this.i != null ? true : z3;
        iee ieeVar3 = this.y;
        iee ieeVar4 = this.z;
        int iK2 = k();
        aqfVar.getClass();
        HashMap map3 = new HashMap();
        for (l9f l9fVar2 : aqfVar.a) {
            cb0 cb0VarQ = aqfVar.q(l9fVar2, aqfVar.v0, aqfVar.Y, ieeVar3, iK2, z4);
            ax1 ax1Var = aqfVar.Z;
            Objects.requireNonNull(ax1Var);
            map3.put(l9fVar2, new da0(cb0VarQ, aqfVar.q(l9fVar2, aqfVar.w0, ax1Var, ieeVar4, iK2, z4)));
        }
        o23 o23Var = this.v;
        ea0 ea0Var = new ea0(this.y, this.z, new ArrayList(map3.values()));
        o23Var.getClass();
        lee leeVar = (lee) o23Var.a;
        kq0.e();
        o23Var.X = ea0Var;
        o23Var.o = new xs4();
        ea0 ea0Var2 = (ea0) o23Var.X;
        iee ieeVar5 = ea0Var2.a;
        for (da0 da0Var : ea0Var2.c) {
            xs4 xs4Var = (xs4) o23Var.o;
            cb0 cb0Var = da0Var.a;
            Rect rect2 = cb0Var.d;
            Matrix matrix2 = new Matrix();
            Size sizeE = e1f.e(rect2);
            int i = cb0Var.f;
            Size sizeG = e1f.g(sizeE, i);
            Size size2 = cb0Var.e;
            c54.k(e1f.d(sizeG, z3, size2));
            Rect rectH = e1f.h(size2);
            x3c x3cVarA = ieeVar5.g.a();
            x3cVarA.b = size2;
            xs4Var.put(da0Var, new iee(cb0Var.b, cb0Var.c, x3cVarA.c(), matrix2, false, rectH, ieeVar5.i - i, -1, ieeVar5.e != cb0Var.g ? true : z3));
        }
        try {
            leeVar.a(ieeVar5.d((ax1) o23Var.b, true));
        } catch (ProcessingException unused) {
        }
        iee ieeVar6 = ea0Var2.b;
        try {
            leeVar.a(ieeVar6.d((ax1) o23Var.c, z3));
        } catch (ProcessingException unused2) {
        }
        for (Map.Entry entry2 : ((xs4) o23Var.o).entrySet()) {
            ax1 ax1Var2 = (ax1) o23Var.b;
            ax1 ax1Var3 = (ax1) o23Var.c;
            o23Var.e(ax1Var2, ax1Var3, ieeVar5, ieeVar6, entry2);
            ((iee) entry2.getValue()).a(new ws4(o23Var, ax1Var2, ax1Var3, ieeVar5, ieeVar6, entry2, 0));
        }
        xs4 xs4Var2 = (xs4) o23Var.o;
        HashMap map4 = new HashMap();
        for (Map.Entry entry3 : map3.entrySet()) {
            map4.put((l9f) entry3.getKey(), (iee) xs4Var2.get(entry3.getValue()));
        }
        aqfVar.u(map4);
        Object[] objArr2 = {this.A.c(), this.B.c()};
        ArrayList arrayList2 = new ArrayList(2);
        for (?? r14 = z3; r14 < 2; r14++) {
            Object obj2 = objArr2[r14];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void H(String str, String str2, o9f o9fVar, vb0 vb0Var, vb0 vb0Var2) {
        Matrix matrix = this.j;
        ax1 ax1VarC = c();
        Objects.requireNonNull(ax1VarC);
        boolean zN = ax1VarC.n();
        Size size = vb0Var.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        ax1 ax1VarC2 = c();
        Objects.requireNonNull(ax1VarC2);
        int iH = h(ax1VarC2, false);
        ax1 ax1VarC3 = c();
        Objects.requireNonNull(ax1VarC3);
        iee ieeVar = new iee(3, 34, vb0Var, matrix, zN, rect2, iH, -1, n(ax1VarC3));
        this.w = ieeVar;
        ax1 ax1VarC4 = c();
        Objects.requireNonNull(ax1VarC4);
        this.y = L(ieeVar, ax1VarC4);
        bad badVarI = I(this.w, o9fVar, vb0Var);
        this.A = badVarI;
        cad cadVar = this.C;
        if (cadVar != null) {
            cadVar.b();
        }
        cad cadVar2 = new cad(new b9e(this, str, str2, o9fVar, vb0Var, vb0Var2));
        this.C = cadVar2;
        badVarI.f = cadVar2;
    }

    public final bad I(iee ieeVar, o9f o9fVar, vb0 vb0Var) {
        bad badVarD = bad.d(o9fVar, vb0Var.a);
        aqf aqfVar = this.q;
        Iterator it = aqfVar.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((fad) ((l9f) it.next()).f.h(o9f.g0)).g.c;
            Integer numValueOf = Integer.valueOf(i);
            List list = fad.j;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        u40 u40Var = badVarD.b;
        if (i != -1) {
            u40Var.c = i;
        }
        Iterator it2 = aqfVar.a.iterator();
        while (it2.hasNext()) {
            fad fadVarC = bad.d(((l9f) it2.next()).f, vb0Var.a).c();
            kz1 kz1Var = fadVarC.g;
            u40Var.a(kz1Var.e);
            for (iv1 iv1Var : fadVarC.e) {
                u40Var.b(iv1Var);
                ArrayList arrayList = badVarD.e;
                if (!arrayList.contains(iv1Var)) {
                    arrayList.add(iv1Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : fadVarC.d) {
                ArrayList arrayList2 = badVarD.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : fadVarC.c) {
                ArrayList arrayList3 = badVarD.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            badVarD.a(kz1Var.b);
        }
        ieeVar.getClass();
        kq0.e();
        ieeVar.b();
        c54.p("Consumer can only be linked once.", !ieeVar.j);
        ieeVar.j = true;
        badVarD.b(ieeVar.l, vb0Var.b, -1);
        u40Var.b(aqfVar.s0);
        ce3 ce3Var = vb0Var.d;
        if (ce3Var != null) {
            u40Var.c(ce3Var);
        }
        return badVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final iee L(iee ieeVar, ax1 ax1Var) {
        int iH;
        boolean z;
        zgf zgfVar = this.m;
        if (zgfVar == null || zgfVar.c == 2) {
            return ieeVar;
        }
        if (zgfVar.b == 1) {
            return ieeVar;
        }
        this.t = new nw4(ax1Var, new mee(zgfVar));
        zgf zgfVar2 = this.m;
        zgfVar2.getClass();
        if (zgfVar2.c == 1) {
            ax1 ax1VarC = c();
            ax1VarC.getClass();
            iH = h(ax1VarC, false);
        } else {
            iH = 0;
        }
        zgf zgfVar3 = this.m;
        zgfVar3.getClass();
        Rect rectH = zgfVar3.c == 1 ? e1f.h(ieeVar.g.a) : ieeVar.d;
        Size sizeG = e1f.g(e1f.e(rectH), iH);
        zgf zgfVar4 = this.m;
        zgfVar4.getClass();
        if (zgfVar4.c == 1) {
            ax1 ax1VarC2 = c();
            ax1VarC2.getClass();
            z = ax1VarC2.d() && ax1VarC2.n();
        } else {
            z = false;
        }
        cb0 cb0Var = new cb0(UUID.randomUUID(), ieeVar.f, ieeVar.a, rectH, sizeG, iH, z, true);
        iee ieeVar2 = (iee) this.t.r(new ac0(ieeVar, Collections.singletonList(cb0Var))).get(cb0Var);
        Objects.requireNonNull(ieeVar2);
        return ieeVar2;
    }

    @Override // defpackage.l9f
    public final o9f f(boolean z, r9f r9fVar) {
        d9e d9eVar = this.p;
        ce3 ce3VarA = r9fVar.a(d9eVar.N(), 1);
        if (z) {
            ce3VarA = ce3.K(ce3VarA, d9eVar.a);
        }
        if (ce3VarA == null) {
            return null;
        }
        return ((gaa) l(ce3VarA)).J();
    }

    @Override // defpackage.l9f
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.l9f
    public final n9f l(ce3 ce3Var) {
        return new gaa(mi9.c(ce3Var));
    }

    @Override // defpackage.l9f
    public final void s() {
        aqf aqfVar = this.q;
        for (l9f l9fVar : aqfVar.a) {
            zpf zpfVar = (zpf) aqfVar.c.get(l9fVar);
            Objects.requireNonNull(zpfVar);
            l9fVar.a(zpfVar, null, null, l9fVar.f(true, aqfVar.X));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0188  */
    @Override // defpackage.l9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o9f u(defpackage.yw1 r12, defpackage.n9f r13) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9e.u(yw1, n9f):o9f");
    }

    @Override // defpackage.l9f
    public final void v() {
        for (l9f l9fVar : this.q.a) {
            l9fVar.v();
            l9fVar.t();
        }
    }

    @Override // defpackage.l9f
    public final void w() {
        Iterator it = this.q.a.iterator();
        while (it.hasNext()) {
            ((l9f) it.next()).w();
        }
    }

    @Override // defpackage.l9f
    public final vb0 x(ce3 ce3Var) {
        this.A.a(ce3Var);
        Object[] objArr = {this.A.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        x3c x3cVarA = this.g.a();
        x3cVarA.X = ce3Var;
        return x3cVarA.c();
    }

    @Override // defpackage.l9f
    public final vb0 y(vb0 vb0Var, vb0 vb0Var2) {
        E(G(e(), i() == null ? null : i().p().d(), this.f, vb0Var, vb0Var2));
        p();
        return vb0Var;
    }

    @Override // defpackage.l9f
    public final void z() {
        F();
        aqf aqfVar = this.q;
        for (l9f l9fVar : aqfVar.a) {
            zpf zpfVar = (zpf) aqfVar.c.get(l9fVar);
            Objects.requireNonNull(zpfVar);
            l9fVar.D(zpfVar);
        }
    }
}
