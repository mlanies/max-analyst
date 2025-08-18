package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class h92 {
    public final String a;
    public final String b;
    public final List c;
    public final long d;
    public final boolean e;

    public h92(s7 s7Var) {
        this.a = (String) s7Var.c;
        this.b = (String) s7Var.d;
        List list = (List) s7Var.e;
        this.c = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.d = s7Var.a;
        this.e = s7Var.b;
    }
}
