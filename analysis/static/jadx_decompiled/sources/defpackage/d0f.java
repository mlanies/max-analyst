package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d0f implements su0 {
    public static final hme c = new hme(18);
    public final qze a;
    public final zw6 b;

    public d0f(qze qzeVar) {
        this.a = qzeVar;
        wmd.i(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < qzeVar.a) {
            Integer numValueOf = Integer.valueOf(i);
            int i3 = i2 + 1;
            if (objArrCopyOf.length < i3) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, pw6.h(objArrCopyOf.length, i3));
            }
            objArrCopyOf[i2] = numValueOf;
            i++;
            i2 = i3;
        }
        this.b = zw6.h(i2, objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0f.class != obj.getClass()) {
            return false;
        }
        d0f d0fVar = (d0f) obj;
        return this.a.equals(d0fVar.a) && this.b.equals(d0fVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public d0f(qze qzeVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= qzeVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = qzeVar;
        this.b = zw6.j(list);
    }
}
