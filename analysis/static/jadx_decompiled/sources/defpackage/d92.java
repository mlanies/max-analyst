package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class d92 implements Serializable, i13 {
    public final long a;
    public final long b;

    public d92(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j == -1) {
            hm9.l0("Chunk", "", new IllegalStateException("start time is -1"));
        }
        if (j2 == -1) {
            hm9.l0("Chunk", "", new IllegalStateException("end time is -1"));
        }
    }

    @Override // defpackage.i13
    public final long a() {
        return this.a;
    }

    @Override // defpackage.i13
    public final long b() {
        return this.b;
    }

    public final l7 c() {
        l7 l7Var = new l7(3, false);
        long j = this.a;
        if (j == -1) {
            hm9.l0("Chunk.Builder", "", new IllegalStateException("start time is -1"));
        }
        l7Var.b = j;
        l7Var.b(this.b);
        return l7Var;
    }
}
