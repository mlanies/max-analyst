package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class urf {
    public final String a;
    public final long b;
    public final long c;
    public final Thread d;
    public final List e;

    public urf(String str, long j, long j2, Thread thread, List list) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = thread;
        this.e = list;
    }

    public static urf a(urf urfVar, long j, Thread thread, int i) {
        if ((i & 4) != 0) {
            j = urfVar.c;
        }
        return new urf(urfVar.a, urfVar.b, j, thread, urfVar.e);
    }

    public final long b(long j) {
        long j2 = this.b;
        long j3 = this.c;
        if (ft4.d(j3, j2)) {
            j3 = j;
        }
        return ft4.g(j, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urf)) {
            return false;
        }
        urf urfVar = (urf) obj;
        return tpa.f(this.a, urfVar.a) && ft4.d(this.b, urfVar.b) && ft4.d(this.c, urfVar.c) && tpa.f(this.d, urfVar.d) && tpa.f(this.e, urfVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = ft4.o;
        int iM = h4f.m(h4f.m(iHashCode, 31, this.b), 31, this.c);
        Thread thread = this.d;
        return this.e.hashCode() + ((iM + (thread == null ? 0 : thread.hashCode())) * 31);
    }

    public final String toString() {
        String strJ = ft4.j(this.b);
        String strJ2 = ft4.j(this.c);
        StringBuilder sb = new StringBuilder("WatchdogTask(submitThread=");
        sb.append(this.a);
        sb.append(", submitTime=");
        sb.append(strJ);
        sb.append(", startTime=");
        sb.append(strJ2);
        sb.append(", runningThread=");
        sb.append(this.d);
        sb.append(", stacktrace=");
        return au1.i(sb, this.e, ")");
    }
}
