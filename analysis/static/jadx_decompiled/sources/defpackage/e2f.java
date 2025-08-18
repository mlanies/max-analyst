package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e2f extends w1f {
    public int T0;
    public ArrayList R0 = new ArrayList();
    public boolean S0 = true;
    public boolean U0 = false;
    public int V0 = 0;

    @Override // defpackage.w1f
    public final void B(View view) {
        super.B(view);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).B(view);
        }
    }

    @Override // defpackage.w1f
    public final void C() {
        this.L0 = 0L;
        d2f d2fVar = new d2f(this);
        for (int i = 0; i < this.R0.size(); i++) {
            w1f w1fVar = (w1f) this.R0.get(i);
            w1fVar.a(d2fVar);
            w1fVar.C();
            long j = w1fVar.L0;
            if (this.S0) {
                this.L0 = Math.max(this.L0, j);
            } else {
                long j2 = this.L0;
                w1fVar.M0 = j2;
                this.L0 = j2 + j;
            }
        }
    }

    @Override // defpackage.w1f
    public final w1f D(v1f v1fVar) {
        super.D(v1fVar);
        return this;
    }

    @Override // defpackage.w1f
    public final void E(View view) {
        for (int i = 0; i < this.R0.size(); i++) {
            ((w1f) this.R0.get(i)).E(view);
        }
        this.Y.remove(view);
    }

    @Override // defpackage.w1f
    public final void F(View view) {
        super.F(view);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).F(view);
        }
    }

    @Override // defpackage.w1f
    public final void G() {
        if (this.R0.isEmpty()) {
            O();
            n();
            return;
        }
        d2f d2fVar = new d2f();
        d2fVar.b = this;
        Iterator it = this.R0.iterator();
        while (it.hasNext()) {
            ((w1f) it.next()).a(d2fVar);
        }
        this.T0 = this.R0.size();
        if (this.S0) {
            Iterator it2 = this.R0.iterator();
            while (it2.hasNext()) {
                ((w1f) it2.next()).G();
            }
            return;
        }
        for (int i = 1; i < this.R0.size(); i++) {
            ((w1f) this.R0.get(i - 1)).a(new jj0(1, (w1f) this.R0.get(i)));
        }
        w1f w1fVar = (w1f) this.R0.get(0);
        if (w1fVar != null) {
            w1fVar.G();
        }
    }

    @Override // defpackage.w1f
    public final void H(long j, long j2) {
        long j3 = this.L0;
        if (this.v0 != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j3 && j2 > j3) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j3 && j2 > j3)) {
            this.E0 = false;
            A(this, hme.b, z);
        }
        if (this.S0) {
            for (int i = 0; i < this.R0.size(); i++) {
                ((w1f) this.R0.get(i)).H(j, j2);
            }
        } else {
            int size = 1;
            while (true) {
                if (size >= this.R0.size()) {
                    size = this.R0.size();
                    break;
                } else if (((w1f) this.R0.get(size)).M0 > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i2 = size - 1;
            if (j >= j2) {
                while (i2 < this.R0.size()) {
                    w1f w1fVar = (w1f) this.R0.get(i2);
                    long j4 = w1fVar.M0;
                    int i3 = i2;
                    long j5 = j - j4;
                    if (j5 < 0) {
                        break;
                    }
                    w1fVar.H(j5, j2 - j4);
                    i2 = i3 + 1;
                }
            } else {
                while (i2 >= 0) {
                    w1f w1fVar2 = (w1f) this.R0.get(i2);
                    long j6 = w1fVar2.M0;
                    long j7 = j - j6;
                    w1fVar2.H(j7, j2 - j6);
                    if (j7 >= 0) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
        }
        if (this.v0 != null) {
            if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
                return;
            }
            if (j > j3) {
                this.E0 = true;
            }
            A(this, hme.c, z);
        }
    }

    @Override // defpackage.w1f
    public final void J(fm9 fm9Var) {
        this.J0 = fm9Var;
        this.V0 |= 8;
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).J(fm9Var);
        }
    }

    @Override // defpackage.w1f
    public final void K(TimeInterpolator timeInterpolator) {
        this.V0 |= 1;
        ArrayList arrayList = this.R0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((w1f) this.R0.get(i)).K(timeInterpolator);
            }
        }
        this.o = timeInterpolator;
    }

    @Override // defpackage.w1f
    public final void L(vu4 vu4Var) {
        super.L(vu4Var);
        this.V0 |= 4;
        if (this.R0 != null) {
            for (int i = 0; i < this.R0.size(); i++) {
                ((w1f) this.R0.get(i)).L(vu4Var);
            }
        }
    }

    @Override // defpackage.w1f
    public final void M(eod eodVar) {
        this.I0 = eodVar;
        this.V0 |= 2;
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).M(eodVar);
        }
    }

    @Override // defpackage.w1f
    public final void N(long j) {
        this.b = j;
    }

    @Override // defpackage.w1f
    public final String P(String str) {
        String strP = super.P(str);
        for (int i = 0; i < this.R0.size(); i++) {
            StringBuilder sbO = rh4.o(strP, "\n");
            sbO.append(((w1f) this.R0.get(i)).P(str + "  "));
            strP = sbO.toString();
        }
        return strP;
    }

    public final void Q(v1f v1fVar) {
        super.a(v1fVar);
    }

    public final void R(w1f w1fVar) {
        this.R0.add(w1fVar);
        w1fVar.v0 = this;
        long j = this.c;
        if (j >= 0) {
            w1fVar.I(j);
        }
        if ((this.V0 & 1) != 0) {
            w1fVar.K(this.o);
        }
        if ((this.V0 & 2) != 0) {
            w1fVar.M(this.I0);
        }
        if ((this.V0 & 4) != 0) {
            w1fVar.L(this.K0);
        }
        if ((this.V0 & 8) != 0) {
            w1fVar.J(this.J0);
        }
    }

    public final w1f S(int i) {
        if (i < 0 || i >= this.R0.size()) {
            return null;
        }
        return (w1f) this.R0.get(i);
    }

    @Override // defpackage.w1f
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void I(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.R0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).I(j);
        }
    }

    public final void U(int i) {
        if (i == 0) {
            this.S0 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(zr6.h(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.S0 = false;
        }
    }

    @Override // defpackage.w1f
    public final void b(View view) {
        for (int i = 0; i < this.R0.size(); i++) {
            ((w1f) this.R0.get(i)).b(view);
        }
        this.Y.add(view);
    }

    @Override // defpackage.w1f
    public final void d() {
        super.d();
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).d();
        }
    }

    @Override // defpackage.w1f
    public final void e(g2f g2fVar) {
        if (y(g2fVar.b)) {
            Iterator it = this.R0.iterator();
            while (it.hasNext()) {
                w1f w1fVar = (w1f) it.next();
                if (w1fVar.y(g2fVar.b)) {
                    w1fVar.e(g2fVar);
                    g2fVar.c.add(w1fVar);
                }
            }
        }
    }

    @Override // defpackage.w1f
    public final void g(g2f g2fVar) {
        super.g(g2fVar);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).g(g2fVar);
        }
    }

    @Override // defpackage.w1f
    public final void h(g2f g2fVar) {
        if (y(g2fVar.b)) {
            Iterator it = this.R0.iterator();
            while (it.hasNext()) {
                w1f w1fVar = (w1f) it.next();
                if (w1fVar.y(g2fVar.b)) {
                    w1fVar.h(g2fVar);
                    g2fVar.c.add(w1fVar);
                }
            }
        }
    }

    @Override // defpackage.w1f
    /* renamed from: k */
    public final w1f clone() {
        e2f e2fVar = (e2f) super.clone();
        e2fVar.R0 = new ArrayList();
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            w1f w1fVarClone = ((w1f) this.R0.get(i)).clone();
            e2fVar.R0.add(w1fVarClone);
            w1fVarClone.v0 = e2fVar;
        }
        return e2fVar;
    }

    @Override // defpackage.w1f
    public final void m(ViewGroup viewGroup, a8g a8gVar, a8g a8gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            w1f w1fVar = (w1f) this.R0.get(i);
            if (j > 0 && (this.S0 || i == 0)) {
                long j2 = w1fVar.b;
                if (j2 > 0) {
                    w1fVar.N(j2 + j);
                } else {
                    w1fVar.N(j);
                }
            }
            w1fVar.m(viewGroup, a8gVar, a8gVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.w1f
    public final void p(int i) {
        for (int i2 = 0; i2 < this.R0.size(); i2++) {
            ((w1f) this.R0.get(i2)).p(i);
        }
        super.p(i);
    }

    @Override // defpackage.w1f
    public final void q(ViewGroup viewGroup) {
        super.q(viewGroup);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).q(viewGroup);
        }
    }

    @Override // defpackage.w1f
    public final boolean w() {
        for (int i = 0; i < this.R0.size(); i++) {
            if (((w1f) this.R0.get(i)).w()) {
                return true;
            }
        }
        return false;
    }
}
