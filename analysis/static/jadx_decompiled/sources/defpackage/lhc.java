package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lhc {
    public final r4c X;
    public final qy5 a;
    public final zw6 b;
    public final long c;
    public final List o;

    public lhc(qy5 qy5Var, List list, v2d v2dVar, ArrayList arrayList) {
        fm9.f(!list.isEmpty());
        this.a = qy5Var;
        this.b = zw6.j(list);
        this.o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.X = v2dVar.b(this);
        int i = oaf.a;
        this.c = oaf.a0(v2dVar.b, 1000000L, v2dVar.a, RoundingMode.FLOOR);
    }

    public abstract String a();

    public abstract a24 c();

    public abstract r4c d();

    public final r4c e() {
        return this.X;
    }
}
