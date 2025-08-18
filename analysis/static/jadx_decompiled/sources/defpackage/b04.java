package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class b04 {
    public final zw6 a;
    public final long b;
    public final long c;
    public final long d;

    public b04(long j, long j2, List list) {
        this.a = zw6.j(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
