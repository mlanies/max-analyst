package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class sma implements ol7 {
    public static final sma o = new sma(nz4.a, 0, 1);
    public final int a;
    public final int b;
    public final List c;

    public sma(List list, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        sma smaVar = (sma) obj;
        if (this.a != smaVar.a || this.b != smaVar.b) {
            return false;
        }
        List list = this.c;
        int size = list.size();
        List list2 = smaVar.c;
        if (size != list2.size()) {
            return false;
        }
        ArrayList arrayListJ0 = x53.J0(list, list2);
        if (!arrayListJ0.isEmpty()) {
            Iterator it = arrayListJ0.iterator();
            while (it.hasNext()) {
                kpa kpaVar = (kpa) it.next();
                if (!tpa.f((kb1) kpaVar.a, (kb1) kpaVar.b)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        sma smaVar = (sma) ol7Var;
        return smaVar.b == this.b && smaVar.a == this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ey8.g(this.b, this.a * 31, 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 1;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        sma smaVar = (sma) ((ol7) obj);
        return equals(smaVar) ? nz4.a : Collections.singletonList(new rma(smaVar));
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        ol7 ol7Var = (ol7) obj;
        return ol7Var.equals(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentsPageState(pagePosition=");
        sb.append(this.a);
        sb.append(", pageType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "SCREEN_SHARING" : "DEFAULT");
        sb.append(", opponents=");
        return au1.i(sb, this.c, ")");
    }
}
