package defpackage;

/* loaded from: classes.dex */
public final class n55 implements ol7 {
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final String a;
    public final int b;
    public final long c;
    public final int o;
    public final long s0;

    public n55(String str, int i, int i2, long j, boolean z, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.o = i2;
        this.X = i3;
        this.Y = z;
        this.Z = z2;
        this.s0 = str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n55)) {
            return false;
        }
        n55 n55Var = (n55) obj;
        return tpa.f(this.a, n55Var.a) && this.b == n55Var.b && this.c == n55Var.c && this.o == n55Var.o && this.X == n55Var.X && this.Y == n55Var.Y && this.Z == n55Var.Z;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.s0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.Z) + ms2.d(k7d.e(this.X, k7d.e(this.o, h4f.m(k7d.e(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31, this.Y);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecutorState(name=");
        sb.append(this.a);
        sb.append(", numberOfIdleThreads=");
        sb.append(this.b);
        sb.append(", completedTasksCount=");
        sb.append(this.c);
        sb.append(", activeTasksCount=");
        sb.append(this.o);
        sb.append(", tasksInQueue=");
        sb.append(this.X);
        sb.append(", shutdown=");
        sb.append(this.Y);
        sb.append(", terminated=");
        return au1.j(sb, this.Z, ")");
    }
}
