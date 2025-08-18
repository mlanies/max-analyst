package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class l10 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    static {
        k10 k10Var = new k10();
        if (k10Var.e == null) {
            k10Var.e = Collections.emptyList();
        }
        new l10(k10Var);
    }

    public l10(k10 k10Var) {
        this.a = k10Var.a;
        this.b = k10Var.c;
        this.c = k10Var.d;
        this.d = k10Var.f;
        this.e = k10Var.b;
        this.f = k10Var.e;
    }

    public final boolean a() {
        return this.d == 3;
    }

    public final boolean b() {
        return c() || a() || this.d == 4;
    }

    public final boolean c() {
        return this.d == 5;
    }

    public final boolean d() {
        return this.c == 2;
    }
}
