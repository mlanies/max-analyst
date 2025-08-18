package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class l9f {
    public o9f d;
    public o9f e;
    public o9f f;
    public vb0 g;
    public o9f h;
    public Rect i;
    public ax1 k;
    public ax1 l;
    public zgf m;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public int c = 2;
    public Matrix j = new Matrix();
    public fad n = fad.a();
    public fad o = fad.a();

    public l9f(o9f o9fVar) {
        this.e = o9fVar;
        this.f = o9fVar;
    }

    public void A(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public final boolean B(int i) {
        Size size;
        int iF0 = ((ev6) this.f).f0(-1);
        if (iF0 != -1 && iF0 == i) {
            return false;
        }
        n9f n9fVarL = l(this.e);
        ev6 ev6Var = (ev6) n9fVarL.J();
        int iF02 = ev6Var.f0(-1);
        if (iF02 == -1 || iF02 != i) {
            ((mt6) n9fVarL).e(i);
        }
        if (iF02 != -1 && i != -1 && iF02 != i) {
            if (Math.abs(kp.C(i) - kp.C(iF02)) % 180 == 90 && (size = (Size) ev6Var.f(ev6.F, null)) != null) {
                ((mt6) n9fVarL).d(new Size(size.getHeight(), size.getWidth()));
            }
        }
        this.e = n9fVarL.J();
        ax1 ax1VarC = c();
        if (ax1VarC == null) {
            this.f = this.e;
            return true;
        }
        this.f = o(ax1VarC.p(), this.d, this.h);
        return true;
    }

    public void C(Rect rect) {
        this.i = rect;
    }

    public final void D(ax1 ax1Var) {
        z();
        synchronized (this.b) {
            try {
                ax1 ax1Var2 = this.k;
                if (ax1Var == ax1Var2) {
                    this.a.remove(ax1Var2);
                    this.k = null;
                }
                ax1 ax1Var3 = this.l;
                if (ax1Var == ax1Var3) {
                    this.a.remove(ax1Var3);
                    this.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public final void E(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.n = (fad) list.get(0);
        if (list.size() > 1) {
            this.o = (fad) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (xf4 xf4Var : ((fad) it.next()).b()) {
                if (xf4Var.j == null) {
                    xf4Var.j = getClass();
                }
            }
        }
    }

    public final void a(ax1 ax1Var, ax1 ax1Var2, o9f o9fVar, o9f o9fVar2) {
        synchronized (this.b) {
            this.k = ax1Var;
            this.l = ax1Var2;
            this.a.add(ax1Var);
            if (ax1Var2 != null) {
                this.a.add(ax1Var2);
            }
        }
        this.d = o9fVar;
        this.h = o9fVar2;
        this.f = o(ax1Var.p(), this.d, this.h);
        s();
    }

    public final int b() {
        return ((Integer) ((ev6) this.f).f(ev6.D, -1)).intValue();
    }

    public final ax1 c() {
        ax1 ax1Var;
        synchronized (this.b) {
            ax1Var = this.k;
        }
        return ax1Var;
    }

    public final hw1 d() {
        synchronized (this.b) {
            try {
                ax1 ax1Var = this.k;
                if (ax1Var == null) {
                    return hw1.a;
                }
                return ax1Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        ax1 ax1VarC = c();
        c54.o(ax1VarC, "No camera attached to use case: " + this);
        return ax1VarC.p().d();
    }

    public abstract o9f f(boolean z, r9f r9fVar);

    public final String g() {
        String str = (String) this.f.f(cne.d0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int h(ax1 ax1Var, boolean z) {
        int iL = ax1Var.p().l(k());
        return (ax1Var.n() || !z) ? iL : e1f.i(-iL);
    }

    public final ax1 i() {
        ax1 ax1Var;
        synchronized (this.b) {
            ax1Var = this.l;
        }
        return ax1Var;
    }

    public Set j() {
        return Collections.emptySet();
    }

    public final int k() {
        return ((ev6) this.f).f0(0);
    }

    public abstract n9f l(ce3 ce3Var);

    public final boolean m(int i) {
        Iterator it = j().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(ax1 ax1Var) {
        int iIntValue = ((Integer) ((ev6) this.f).f(ev6.E, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return ax1Var.d();
        }
        throw new AssertionError(zr6.h(iIntValue, "Unknown mirrorMode: "));
    }

    public final o9f o(yw1 yw1Var, o9f o9fVar, o9f o9fVar2) {
        mi9 mi9VarB;
        if (o9fVar2 != null) {
            mi9VarB = mi9.c(o9fVar2);
            mi9VarB.a.remove(cne.d0);
        } else {
            mi9VarB = mi9.b();
        }
        boolean zO = this.e.o(ev6.B);
        TreeMap treeMap = mi9VarB.a;
        if (zO || this.e.o(ev6.F)) {
            aa0 aa0Var = ev6.J;
            if (treeMap.containsKey(aa0Var)) {
                treeMap.remove(aa0Var);
            }
        }
        o9f o9fVar3 = this.e;
        aa0 aa0Var2 = ev6.J;
        if (o9fVar3.o(aa0Var2)) {
            aa0 aa0Var3 = ev6.H;
            if (treeMap.containsKey(aa0Var3) && ((kic) this.e.h(aa0Var2)).b != null) {
                treeMap.remove(aa0Var3);
            }
        }
        Iterator it = this.e.g().iterator();
        while (it.hasNext()) {
            ce3.H(mi9VarB, mi9VarB, this.e, (aa0) it.next());
        }
        if (o9fVar != null) {
            for (aa0 aa0Var4 : o9fVar.g()) {
                if (!aa0Var4.a.equals(cne.d0.a)) {
                    ce3.H(mi9VarB, mi9VarB, o9fVar, aa0Var4);
                }
            }
        }
        if (treeMap.containsKey(ev6.F)) {
            aa0 aa0Var5 = ev6.B;
            if (treeMap.containsKey(aa0Var5)) {
                treeMap.remove(aa0Var5);
            }
        }
        aa0 aa0Var6 = ev6.J;
        if (treeMap.containsKey(aa0Var6) && ((kic) mi9VarB.h(aa0Var6)).c != 0) {
            mi9VarB.j(o9f.m0, Boolean.TRUE);
        }
        return u(yw1Var, l(mi9VarB));
    }

    public final void p() {
        this.c = 1;
        r();
    }

    public final void q() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k9f) it.next()).c(this);
        }
    }

    public final void r() {
        int iS = au1.s(this.c);
        HashSet hashSet = this.a;
        if (iS == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((k9f) it.next()).e(this);
            }
        } else {
            if (iS != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((k9f) it2.next()).m(this);
            }
        }
    }

    public void s() {
    }

    public void t() {
    }

    public abstract o9f u(yw1 yw1Var, n9f n9fVar);

    public void v() {
    }

    public void w() {
    }

    public abstract vb0 x(ce3 ce3Var);

    public abstract vb0 y(vb0 vb0Var, vb0 vb0Var2);

    public void z() {
    }
}
