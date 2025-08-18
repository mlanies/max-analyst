package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class khc {
    public final q4c X;
    public final oy5 a;
    public final zw6 b;
    public final long c;
    public final List o;

    public khc(oy5 oy5Var, List list, v2d v2dVar, ArrayList arrayList) {
        np8.d(!list.isEmpty());
        this.a = oy5Var;
        this.b = zw6.j(list);
        this.o = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.X = v2dVar.a(this);
        this.c = maf.J(v2dVar.b, 1000000L, v2dVar.a);
    }

    public abstract String a();

    public abstract z14 c();

    public abstract q4c d();
}
