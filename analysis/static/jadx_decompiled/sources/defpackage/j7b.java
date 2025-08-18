package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j7b extends tdc {
    public static final /* synthetic */ bc7[] m;
    public static final String n;
    public final k56 a;
    public final int b;
    public final boolean c;
    public final sj3 d;
    public boolean g;
    public int j;
    public final HashSet k;
    public final gi9 e = new gi9(10);
    public final gi9 f = new gi9(10);
    public int h = -1;
    public int i = -1;
    public final yj l = new yj(21, this);

    static {
        oi9 oi9Var = new oi9(j7b.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;");
        nec.a.getClass();
        m = new bc7[]{oi9Var};
        n = j7b.class.getName();
    }

    public j7b(p59 p59Var, int i, boolean z, sj3 sj3Var) {
        this.a = p59Var;
        this.b = i;
        this.c = z;
        this.d = sj3Var;
        this.k = new HashSet(i);
    }

    @Override // defpackage.tdc
    public final void a(RecyclerView recyclerView, int i) {
        this.l.o1(this, m[0], recyclerView);
    }

    @Override // defpackage.tdc
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.l.o1(this, m[0], recyclerView);
        if (this.c && this.g && this.d != null) {
            HashSet hashSet = this.k;
            try {
                hashSet.clear();
                c();
                hashSet.clear();
            } catch (Throwable th) {
                hm9.p(n, "tryToPrefetch failure!", th);
            }
        }
    }

    public final void c() {
        hdc adapter;
        sj3 sj3Var;
        int iH;
        boolean z = false;
        bc7 bc7Var = m[0];
        RecyclerView recyclerView = (RecyclerView) this.l.b;
        if (recyclerView == null) {
            return;
        }
        boolean z2 = false;
        int i = 0;
        int iMin = -1;
        int iMax = -1;
        while (true) {
            boolean z3 = i < recyclerView.getChildCount();
            HashSet hashSet = this.k;
            gi9 gi9Var = this.f;
            if (!z3) {
                gi9 gi9Var2 = this.e;
                if (gi9Var2.j() && !tpa.f(gi9Var, gi9Var2)) {
                    z = true;
                }
                this.g = z;
                if (z2 && (adapter = recyclerView.getAdapter()) != null) {
                    int size = hashSet.size();
                    if (size > 0) {
                        float f = size;
                        int i2 = this.b;
                        if (f < i2 * 0.8f) {
                            if (this.j != adapter.j()) {
                                this.j = adapter.j();
                                this.h = -1;
                                this.i = -1;
                            }
                            int i3 = (i2 - size) / 2;
                            if (i3 != 0) {
                                List list = (List) this.a.invoke();
                                if (this.h != iMin) {
                                    this.h = iMin;
                                    Iterator it = mqd.F(list, iMin, -i3).iterator();
                                    while (it.hasNext()) {
                                        long jLongValue = ((Number) it.next()).longValue();
                                        if (gi9Var.a(jLongValue)) {
                                            hashSet.add(Long.valueOf(jLongValue));
                                        }
                                    }
                                }
                                if (this.i != iMax) {
                                    this.i = iMax;
                                    Iterator it2 = mqd.F(list, iMax, i3).iterator();
                                    while (it2.hasNext()) {
                                        long jLongValue2 = ((Number) it2.next()).longValue();
                                        if (gi9Var.a(jLongValue2)) {
                                            hashSet.add(Long.valueOf(jLongValue2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if ((!hashSet.isEmpty()) && (sj3Var = this.d) != null) {
                        sj3Var.accept(x53.D0(hashSet));
                    }
                    if (this.g) {
                        return;
                    }
                    hm9.n(n, "clear");
                    hashSet.clear();
                    gi9Var.c();
                    gi9Var2.c();
                    return;
                }
                return;
            }
            int i4 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            try {
                Object objT = recyclerView.T(childAt);
                Object obj = objT instanceof bv8 ? (bv8) objT : null;
                if (obj != null) {
                    ht8 ht8Var = (ht8) obj;
                    if (ht8Var.O0) {
                        long j = ht8Var.P0;
                        boolean zA = gi9Var.a(j);
                        if (zA) {
                            hashSet.add(Long.valueOf(j));
                        }
                        z2 = z2 || zA;
                        if (z2 && (iH = ((dec) obj).h()) != -1) {
                            iMin = Math.min(iMin, iH);
                            iMax = Math.max(iMax, iH);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            i = i4;
        }
    }
}
