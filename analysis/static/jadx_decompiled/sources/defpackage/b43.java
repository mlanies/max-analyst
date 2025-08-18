package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class b43 extends r06 {
    public final long X;
    public final boolean Y;
    public final long c;
    public final long o;

    public b43(lue lueVar, long j, long j2) throws IOException {
        super(lueVar);
        boolean z = false;
        z = false;
        z = false;
        final int i = 1;
        if (lueVar.i() != 1) {
            final int i2 = z ? 1 : 0;
            throw new IOException(i2) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String str = i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                    super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                }
            };
        }
        jue jueVarN = lueVar.n(0, new jue(), 0L);
        long jMax = Math.max(0L, j);
        if (!jueVarN.w0 && jMax != 0 && !jueVarN.s0) {
            throw new IOException(i) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    String str = i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                    super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                }
            };
        }
        long jMax2 = j2 == Long.MIN_VALUE ? jueVarN.y0 : Math.max(0L, j2);
        long j3 = jueVarN.y0;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                final int i3 = 2;
                throw new IOException(i3) { // from class: com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        String str = i3 != 0 ? i3 != 1 ? i3 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
                        super(str.length() != 0 ? "Illegal clipping: ".concat(str) : new String("Illegal clipping: "));
                    }
                };
            }
        }
        this.c = jMax;
        this.o = jMax2;
        this.X = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (jueVarN.t0 && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.Y = z;
    }

    @Override // defpackage.r06, defpackage.lue
    public final gue g(int i, gue gueVar, boolean z) {
        this.b.g(0, gueVar, z);
        long j = gueVar.X - this.c;
        long j2 = this.X;
        gueVar.h(gueVar.a, gueVar.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, r8.Y, false);
        return gueVar;
    }

    @Override // defpackage.r06, defpackage.lue
    public final jue n(int i, jue jueVar, long j) {
        this.b.n(0, jueVar, 0L);
        long j2 = jueVar.B0;
        long j3 = this.c;
        jueVar.B0 = j2 + j3;
        jueVar.y0 = this.X;
        jueVar.t0 = this.Y;
        long j4 = jueVar.x0;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            jueVar.x0 = jMax;
            long j5 = this.o;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            jueVar.x0 = jMax - j3;
        }
        long jM = maf.M(j3);
        long j6 = jueVar.X;
        if (j6 != -9223372036854775807L) {
            jueVar.X = j6 + jM;
        }
        long j7 = jueVar.Y;
        if (j7 != -9223372036854775807L) {
            jueVar.Y = j7 + jM;
        }
        return jueVar;
    }
}
