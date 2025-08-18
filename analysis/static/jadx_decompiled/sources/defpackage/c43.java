package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c43 extends s06 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public c43(mue mueVar, long j, long j2) throws IOException {
        super(mueVar);
        boolean z = false;
        z = false;
        z = false;
        final int i = 1;
        if (mueVar.i() != 1) {
            final int i2 = z ? 1 : 0;
            throw new IOException(i2) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                {
                    super("Illegal clipping: ".concat(i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
                }
            };
        }
        kue kueVarN = mueVar.n(0, new kue(), 0L);
        long jMax = Math.max(0L, j);
        if (!kueVarN.k && jMax != 0 && !kueVarN.h) {
            throw new IOException(i) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                {
                    super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
                }
            };
        }
        long jMax2 = j2 == Long.MIN_VALUE ? kueVarN.m : Math.max(0L, j2);
        long j3 = kueVarN.m;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                final int i3 = 2;
                throw new IOException(i3) { // from class: androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException
                    {
                        super("Illegal clipping: ".concat(i3 != 0 ? i3 != 1 ? i3 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
                    }
                };
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (kueVarN.i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.i = z;
    }

    @Override // defpackage.s06, defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        this.e.g(0, hueVar, z);
        long j = hueVar.e - this.f;
        long j2 = this.h;
        hueVar.j(hueVar.a, hueVar.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, s8.g, false);
        return hueVar;
    }

    @Override // defpackage.s06, defpackage.mue
    public final kue n(int i, kue kueVar, long j) {
        this.e.n(0, kueVar, 0L);
        long j2 = kueVar.p;
        long j3 = this.f;
        kueVar.p = j2 + j3;
        kueVar.m = this.h;
        kueVar.i = this.i;
        long j4 = kueVar.l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            kueVar.l = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            kueVar.l = jMax - j3;
        }
        long jH0 = oaf.h0(j3);
        long j6 = kueVar.e;
        if (j6 != -9223372036854775807L) {
            kueVar.e = j6 + jH0;
        }
        long j7 = kueVar.f;
        if (j7 != -9223372036854775807L) {
            kueVar.f = j7 + jH0;
        }
        return kueVar;
    }
}
