package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class sl6 extends aj0 {
    public final List X;
    public final long Y;

    public sl6(long j, List list) {
        super(0L, list.size() - 1, 1);
        this.Y = j;
        this.X = list;
    }

    @Override // defpackage.h78, defpackage.i78
    public final long e() {
        a();
        return this.Y + ((nm6) this.X.get((int) this.o)).X;
    }

    @Override // defpackage.h78, defpackage.i78
    public final long h() {
        a();
        nm6 nm6Var = (nm6) this.X.get((int) this.o);
        return this.Y + nm6Var.X + nm6Var.c;
    }
}
