package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kn3 extends pi0 {
    public final int b;
    public final int c;
    public final List o;

    public kn3(int i, long j, List list) {
        super(j);
        this.b = i;
        this.c = 40;
        this.o = list;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "ContactListEvent{status=" + pq3.BLOCKED + ", from=" + this.b + ", count=" + this.c + ", contactIds=" + this.o + '}';
    }
}
