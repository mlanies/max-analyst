package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class rl6 extends aj0 {
    public final List X;
    public final long Y;

    public rl6(long j, List list) {
        super(0L, list.size() - 1, 0);
        this.Y = j;
        this.X = list;
    }

    @Override // defpackage.h78, defpackage.i78
    public final long e() {
        a();
        return this.Y + ((mm6) this.X.get((int) this.o)).X;
    }

    @Override // defpackage.h78, defpackage.i78
    public final long h() {
        a();
        mm6 mm6Var = (mm6) this.X.get((int) this.o);
        return this.Y + mm6Var.X + mm6Var.c;
    }
}
