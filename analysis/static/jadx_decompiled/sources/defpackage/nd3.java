package defpackage;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nd3 extends hdc {
    public final od3 o;

    public nd3(hdc... hdcVarArr) {
        this(md3.c, hdcVarArr);
    }

    public final List C() {
        List listEmptyList;
        ArrayList arrayList = this.o.d;
        if (arrayList.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((cn9) it.next()).c);
            }
            listEmptyList = arrayList2;
        }
        return Collections.unmodifiableList(listEmptyList);
    }

    public final Pair D(int i) {
        od3 od3Var = this.o;
        w wVarF = od3Var.f(i);
        Pair pair = new Pair(((cn9) wVarF.c).c, Integer.valueOf(wVarF.a));
        wVarF.b = false;
        wVarF.c = null;
        wVarF.a = -1;
        od3Var.h = wVarF;
        return pair;
    }

    public final void E(hdc hdcVar) {
        od3 od3Var = this.o;
        int i = od3Var.i(hdcVar);
        if (i == -1) {
            return;
        }
        ArrayList arrayList = od3Var.d;
        cn9 cn9Var = (cn9) arrayList.get(i);
        int iD = od3Var.d(cn9Var);
        arrayList.remove(i);
        ((nd3) od3Var.e).a.f(iD, cn9Var.e);
        Iterator it = od3Var.c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                hdcVar.u(recyclerView);
            }
        }
        cn9Var.c.B(cn9Var.f);
        cn9Var.a.dispose();
        od3Var.c();
    }

    @Override // defpackage.hdc
    public final int i(hdc hdcVar, dec decVar, int i) {
        od3 od3Var = this.o;
        cn9 cn9Var = (cn9) ((IdentityHashMap) od3Var.g).get(decVar);
        if (cn9Var == null) {
            return -1;
        }
        int iD = i - od3Var.d(cn9Var);
        hdc hdcVar2 = cn9Var.c;
        int iJ = hdcVar2.j();
        if (iD >= 0 && iD < iJ) {
            return hdcVar2.i(hdcVar, decVar, iD);
        }
        StringBuilder sbJ = wg0.j("Detected inconsistent adapter updates. The local position of the view holder maps to ", iD, " which is out of bounds for the adapter with size ", iJ, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbJ.append(decVar);
        sbJ.append("adapter:");
        sbJ.append(hdcVar);
        throw new IllegalStateException(sbJ.toString());
    }

    @Override // defpackage.hdc
    public final int j() {
        Iterator it = this.o.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((cn9) it.next()).e;
        }
        return i;
    }

    @Override // defpackage.hdc
    public final long k(int i) {
        od3 od3Var = this.o;
        w wVarF = od3Var.f(i);
        cn9 cn9Var = (cn9) wVarF.c;
        long j = cn9Var.b.j(cn9Var.c.k(wVarF.a));
        wVarF.b = false;
        wVarF.c = null;
        wVarF.a = -1;
        od3Var.h = wVarF;
        return j;
    }

    @Override // defpackage.hdc
    public final int l(int i) {
        od3 od3Var = this.o;
        w wVarF = od3Var.f(i);
        cn9 cn9Var = (cn9) wVarF.c;
        int iO = cn9Var.a.o(cn9Var.c.l(wVarF.a));
        wVarF.b = false;
        wVarF.c = null;
        wVarF.a = -1;
        od3Var.h = wVarF;
        return iO;
    }

    @Override // defpackage.hdc
    public final void q(RecyclerView recyclerView) {
        od3 od3Var = this.o;
        ArrayList arrayList = od3Var.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = od3Var.d.iterator();
        while (it2.hasNext()) {
            ((cn9) it2.next()).c.q(recyclerView);
        }
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        od3 od3Var = this.o;
        w wVarF = od3Var.f(i);
        ((IdentityHashMap) od3Var.g).put(decVar, (cn9) wVarF.c);
        cn9 cn9Var = (cn9) wVarF.c;
        cn9Var.c.h(decVar, wVarF.a);
        wVarF.b = false;
        wVarF.c = null;
        wVarF.a = -1;
        od3Var.h = wVarF;
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        cn9 cn9VarA = ((ipf) this.o.f).a(i);
        return cn9VarA.c.t(viewGroup, cn9VarA.a.n(i));
    }

    @Override // defpackage.hdc
    public final void u(RecyclerView recyclerView) {
        od3 od3Var = this.o;
        ArrayList arrayList = od3Var.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = od3Var.d.iterator();
        while (it.hasNext()) {
            ((cn9) it.next()).c.u(recyclerView);
        }
    }

    @Override // defpackage.hdc
    public final boolean v(dec decVar) {
        od3 od3Var = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) od3Var.g;
        cn9 cn9Var = (cn9) identityHashMap.get(decVar);
        if (cn9Var != null) {
            boolean zV = cn9Var.c.v(decVar);
            identityHashMap.remove(decVar);
            return zV;
        }
        throw new IllegalStateException("Cannot find wrapper for " + decVar + ", seems like it is not bound by this adapter: " + od3Var);
    }

    @Override // defpackage.hdc
    public final void w(dec decVar) {
        this.o.g(decVar).c.w(decVar);
    }

    @Override // defpackage.hdc
    public final void x(dec decVar) {
        this.o.g(decVar).c.x(decVar);
    }

    @Override // defpackage.hdc
    public final void y(dec decVar) {
        od3 od3Var = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) od3Var.g;
        cn9 cn9Var = (cn9) identityHashMap.get(decVar);
        if (cn9Var != null) {
            cn9Var.c.y(decVar);
            identityHashMap.remove(decVar);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + decVar + ", seems like it is not bound by this adapter: " + od3Var);
        }
    }

    public nd3(md3 md3Var, hdc... hdcVarArr) {
        List<hdc> listAsList = Arrays.asList(hdcVarArr);
        this.o = new od3(this, md3Var);
        for (hdc hdcVar : listAsList) {
            od3 od3Var = this.o;
            od3Var.a(od3Var.d.size(), hdcVar);
        }
        A(this.o.b != 1);
    }
}
