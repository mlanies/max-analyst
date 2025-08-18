package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class n8d extends f9d {
    public final long l;
    public final String m;
    public final List n;

    public n8d(long j, String str, List list, long j2) {
        super(j2);
        this.l = j;
        this.m = str;
        this.n = list;
    }

    @Override // defpackage.f9d
    public final g9d a() {
        return new o8d(this);
    }
}
