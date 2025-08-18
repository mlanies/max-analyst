package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class fb4 implements co7 {
    public long X;
    public long Y;
    public long Z;
    public final Uri a;
    public final jo7 b = new jo7("DefaultHlsPlaylistTracker:MediaPlaylist", 0);
    public final r24 c;
    public pm6 o;
    public long s0;
    public boolean t0;
    public IOException u0;
    public final /* synthetic */ hb4 v0;

    public fb4(hb4 hb4Var, Uri uri) {
        this.v0 = hb4Var;
        this.a = uri;
        this.c = ((p24) ((gaa) hb4Var.s0).a).a();
    }

    public static boolean a(fb4 fb4Var, long j) {
        fb4Var.s0 = SystemClock.elapsedRealtime() + j;
        hb4 hb4Var = fb4Var.v0;
        if (!fb4Var.a.equals(hb4Var.X)) {
            return false;
        }
        List list = ((xm6) hb4Var.y0).e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            fb4 fb4Var2 = (fb4) hb4Var.b.get(((vm6) list.get(i)).a);
            fb4Var2.getClass();
            if (jElapsedRealtime > fb4Var2.s0) {
                Uri uri = fb4Var2.a;
                hb4Var.X = uri;
                fb4Var2.c(hb4Var.c(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        hb4 hb4Var = this.v0;
        aqa aqaVar = new aqa(this.c, uri, 4, ((dn6) hb4Var.t0).E((xm6) hb4Var.y0, this.o));
        buc bucVar = (buc) hb4Var.u0;
        int i = aqaVar.c;
        ((gk8) hb4Var.v0).k(new xn7(aqaVar.a, aqaVar.b, this.b.w(aqaVar, this, bucVar.v(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.s0 = 0L;
        if (this.t0) {
            return;
        }
        jo7 jo7Var = this.b;
        if (jo7Var.o() || jo7Var.n()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.Z;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.t0 = true;
            this.v0.o.postDelayed(new wt1(this, 21, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.pm6 r65) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb4.d(pm6):void");
    }

    @Override // defpackage.co7
    public final void o(fo7 fo7Var, long j, long j2, boolean z) {
        aqa aqaVar = (aqa) fo7Var;
        long j3 = aqaVar.a;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, aqaVar.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        hb4 hb4Var = this.v0;
        ((buc) hb4Var.u0).getClass();
        ((gk8) hb4Var.v0).d(xn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.co7
    public final void y(fo7 fo7Var, long j, long j2) {
        aqa aqaVar = (aqa) fo7Var;
        zm6 zm6Var = (zm6) aqaVar.Y;
        long j3 = aqaVar.a;
        z24 z24Var = aqaVar.b;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, z24Var, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        if (zm6Var instanceof pm6) {
            d((pm6) zm6Var);
            ((gk8) this.v0.v0).f(xn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionB = ParserException.b(null, "Loaded playlist has unexpected type.");
            this.u0 = parserExceptionB;
            ((gk8) this.v0.v0).i(xn7Var, 4, parserExceptionB, true);
        }
        ((buc) this.v0.u0).getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    @Override // defpackage.co7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b11 z(defpackage.fo7 r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r1 = r24
            r2 = r19
            aqa r2 = (defpackage.aqa) r2
            xn7 r15 = new xn7
            long r4 = r2.a
            t1e r3 = r2.o
            android.net.Uri r13 = r3.c
            java.util.Map r8 = r3.o
            long r11 = r3.b
            z24 r6 = r2.b
            r3 = r15
            r7 = r13
            r9 = r20
            r16 = r11
            r11 = r22
            r19 = r15
            r15 = r13
            r13 = r16
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            java.lang.String r3 = "_HLS_msn"
            java.lang.String r3 = r15.getQueryParameter(r3)
            r4 = 1
            r8 = 0
            if (r3 == 0) goto L32
            r3 = r4
            goto L33
        L32:
            r3 = r8
        L33:
            boolean r5 = r1 instanceof com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException
            b11 r6 = defpackage.jo7.X
            android.net.Uri r7 = r0.a
            hb4 r11 = r0.v0
            int r2 = r2.c
            if (r3 != 0) goto L41
            if (r5 == 0) goto L5b
        L41:
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            if (r3 == 0) goto L4b
            r3 = r1
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r3 = (com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException) r3
            int r3 = r3.c
            goto L4e
        L4b:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L4e:
            if (r5 != 0) goto L58
            r5 = 400(0x190, float:5.6E-43)
            if (r3 == r5) goto L58
            r5 = 503(0x1f7, float:7.05E-43)
            if (r3 != r5) goto L5b
        L58:
            r5 = r19
            goto Lb3
        L5b:
            wn7 r0 = new wn7
            r3 = r25
            r0.<init>(r3, r1)
            java.util.concurrent.CopyOnWriteArrayList r3 = r11.c
            java.util.Iterator r3 = r3.iterator()
            r5 = r8
        L69:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r3.next()
            fn6 r9 = (defpackage.fn6) r9
            boolean r9 = r9.e(r7, r0, r8)
            r9 = r9 ^ r4
            r5 = r5 | r9
            goto L69
        L7c:
            java.lang.Object r3 = r11.u0
            buc r3 = (defpackage.buc) r3
            if (r5 == 0) goto L9f
            r3.getClass()
            long r6 = defpackage.buc.w(r0)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L9c
            b11 r0 = new b11
            r9 = 4
            r10 = 0
            r5 = r0
            r5.<init>(r6, r8, r9, r10)
        L9a:
            r6 = r0
            goto L9f
        L9c:
            b11 r0 = defpackage.jo7.Y
            goto L9a
        L9f:
            boolean r0 = r6.a()
            r0 = r0 ^ r4
            java.lang.Object r4 = r11.v0
            gk8 r4 = (defpackage.gk8) r4
            r5 = r19
            r4.i(r5, r2, r1, r0)
            if (r0 == 0) goto Lc5
            r3.getClass()
            goto Lc5
        Lb3:
            long r8 = android.os.SystemClock.elapsedRealtime()
            r0.Z = r8
            r0.c(r7)
            java.lang.Object r0 = r11.v0
            gk8 r0 = (defpackage.gk8) r0
            int r3 = defpackage.maf.a
            r0.i(r5, r2, r1, r4)
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb4.z(fo7, long, long, java.io.IOException, int):b11");
    }
}
