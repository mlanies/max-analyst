package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l7 {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public /* synthetic */ l7(int i, boolean z) {
        this.a = i;
    }

    public d92 a() {
        return new d92(this.b, this.c);
    }

    public void b(long j) {
        if (j == -1) {
            hm9.l0("Chunk.Builder", "", new IllegalStateException("end time is -1"));
        }
        this.c = j;
    }

    public double c(long j, long j2) {
        double millis;
        long jC = ote.c(j - this.b, 0L);
        if (this.c == 0) {
            millis = Double.NaN;
        } else {
            millis = (TimeUnit.SECONDS.toMillis(1L) * jC) / ote.c(j2 - r4, 1L);
        }
        this.b = j;
        this.c = j2;
        return millis * 8;
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l7(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public l7(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = 300L;
                break;
        }
    }

    public l7(long j, long j2, long j3) {
        this.a = 4;
        this.b = j2;
        this.c = j3;
    }
}
