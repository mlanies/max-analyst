package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u8 {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public u8(long j, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.a = j;
        this.b = i;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
