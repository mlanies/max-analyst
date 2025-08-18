package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class lt2 implements sk6 {
    public static final List f = Collections.singletonList(new kt2());
    public final khe b;
    public final khe c;
    public final v00 d = new v00(13);
    public final v00 e = new v00(14);

    public lt2(khe kheVar, je7 je7Var) {
        this.b = new khe(new dr(kheVar, je7Var, this, 3));
        this.c = new khe(new dr(kheVar, je7Var, this, 4));
    }

    @Override // defpackage.sk6
    public final boolean a() {
        return false;
    }

    @Override // defpackage.sk6
    public final Comparator c() {
        return this.d;
    }

    @Override // defpackage.sk6
    public final Comparator e() {
        return this.e;
    }

    @Override // defpackage.sk6
    public final long g() {
        return ((Number) this.b.getValue()).longValue();
    }

    @Override // defpackage.sk6
    public final long h() {
        return ((Number) this.c.getValue()).longValue();
    }

    @Override // defpackage.sk6
    public final List i() {
        return f;
    }
}
