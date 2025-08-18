package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import javax.net.ssl.SSLEngine;

/* loaded from: classes2.dex */
public final class tve {
    public final SSLEngine a;
    public final AsynchronousByteChannel b;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public final it0 i;
    public final it0 j;
    public final it0 k;
    public sv0 l;
    public int m;
    public final String c = tve.class.getName();
    public final aj9 d = bj9.a();
    public final sv0 n = new sv0(new ByteBuffer[]{ByteBuffer.allocate(0)});

    public tve(ct0 ct0Var, SSLEngine sSLEngine, AsynchronousByteChannel asynchronousByteChannel) {
        this.a = sSLEngine;
        this.b = asynchronousByteChannel;
        this.i = new it0("inEncrypted", true, ct0Var);
        this.j = new it0("outEncrypted", false, ct0Var);
        this.k = new it0("inPlain", true, ct0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.nio.ByteBuffer r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "Read from channel; response: "
            boolean r1 = r10 instanceof defpackage.cve
            if (r1 == 0) goto L15
            r1 = r10
            cve r1 = (defpackage.cve) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.t0 = r2
            goto L1a
        L15:
            cve r1 = new cve
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.Z
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.t0
            e5f r4 = defpackage.e5f.a
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 != r5) goto L33
            tve r8 = r1.Y
            java.nio.ByteBuffer r9 = r1.X
            tve r1 = r1.o
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L31
            goto L5e
        L31:
            r8 = move-exception
            goto L8b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            defpackage.od2.a0(r10)
            java.lang.String r10 = r8.c     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = "Reading from channel"
            defpackage.hm9.i0(r10, r3)     // Catch: java.lang.Throwable -> L88
            dve r10 = new dve     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r10.<init>(r8, r9, r3)     // Catch: java.lang.Throwable -> L88
            r1.o = r8     // Catch: java.lang.Throwable -> L88
            r1.X = r9     // Catch: java.lang.Throwable -> L88
            r1.Y = r8     // Catch: java.lang.Throwable -> L88
            r1.t0 = r5     // Catch: java.lang.Throwable -> L88
            r6 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r10 = defpackage.fp3.H(r6, r10, r1)     // Catch: java.lang.Throwable -> L88
            if (r10 != r2) goto L5d
            return r2
        L5d:
            r1 = r8
        L5e:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L31
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L31
            java.lang.String r8 = r8.c     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L31
            r2.append(r10)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = ", buffer: "
            r2.append(r0)     // Catch: java.lang.Throwable -> L31
            r2.append(r9)     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Throwable -> L31
            defpackage.hm9.i0(r8, r9)     // Catch: java.lang.Throwable -> L31
            r8 = -1
            if (r10 == r8) goto L82
            r9 = r4
            goto L90
        L82:
            ave r8 = new ave     // Catch: java.lang.Throwable -> L31
            r8.<init>()     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        L88:
            r9 = move-exception
            r1 = r8
            r8 = r9
        L8b:
            njc r9 = new njc
            r9.<init>(r8)
        L90:
            java.lang.Throwable r8 = defpackage.pjc.a(r9)
            if (r8 == 0) goto L98
            r1.f = r5
        L98:
            defpackage.od2.a0(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.a(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.nio.ByteBuffer r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.eve
            if (r0 == 0) goto L13
            r0 = r11
            eve r0 = (defpackage.eve) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            eve r0 = new eve
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.nio.ByteBuffer r9 = r0.X
            tve r10 = r0.o
            defpackage.od2.a0(r11)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L39
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.od2.a0(r11)
        L39:
            boolean r11 = r10.hasRemaining()
            if (r11 == 0) goto L7a
            java.lang.String r11 = r9.c
            ir6 r2 = defpackage.hm9.m
            r4 = 0
            if (r2 != 0) goto L47
            goto L65
        L47:
            boolean r5 = r2.c()
            if (r5 == 0) goto L65
            us7 r5 = defpackage.us7.o
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "calling channel.write("
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r7 = ")"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.d(r5, r11, r6, r4)
        L65:
            fve r11 = new fve
            r11.<init>(r9, r10, r4)
            r0.o = r9
            r0.X = r10
            r0.s0 = r3
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r11 = defpackage.fp3.H(r4, r11, r0)
            if (r11 != r1) goto L39
            return r1
        L7a:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.b(java.nio.ByteBuffer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.sv0 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "engine.unwrap() result="
            boolean r1 = r10 instanceof defpackage.gve
            if (r1 == 0) goto L15
            r1 = r10
            gve r1 = (defpackage.gve) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            gve r1 = new gve
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.s0
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            sv0 r9 = r1.X
            tve r8 = r1.o
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            goto L59
        L2d:
            r9 = move-exception
            goto La7
        L30:
            r9 = move-exception
            goto La4
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            defpackage.od2.a0(r10)
            it0 r10 = r8.i
            java.nio.ByteBuffer r10 = r10.e()
            r10.flip()
            yue r10 = new yue     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r3 = 0
            r10.<init>(r8, r9, r3)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r1.o = r8     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r1.X = r9     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r1.s0 = r4     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.Object r10 = defpackage.ema.C(r10, r1)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            if (r10 != r2) goto L59
            return r2
        L59:
            javax.net.ssl.SSLEngineResult r10 = (javax.net.ssl.SSLEngineResult) r10     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r1 = r8.c     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            ir6 r2 = defpackage.hm9.m     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            if (r2 != 0) goto L62
            goto L9a
        L62:
            boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            if (r3 == 0) goto L9a
            us7 r3 = defpackage.us7.o     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            javax.net.ssl.SSLEngine r5 = r8.a     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r5.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            it0 r6 = r8.i     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r7.append(r10)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r0 = ", engineStatus="
            r7.append(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r7.append(r5)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r0 = ", inEncrypted="
            r7.append(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r7.append(r6)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r0 = ", dest="
            r7.append(r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r7.append(r9)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            java.lang.String r9 = r7.toString()     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
            r0 = 0
            r2.d(r3, r1, r9, r0)     // Catch: java.lang.Throwable -> L2d javax.net.ssl.SSLException -> L30
        L9a:
            it0 r8 = r8.i
            java.nio.ByteBuffer r8 = r8.e()
            r8.compact()
            return r10
        La4:
            r8.f = r4     // Catch: java.lang.Throwable -> L2d
            throw r9     // Catch: java.lang.Throwable -> L2d
        La7:
            it0 r8 = r8.i
            java.nio.ByteBuffer r8 = r8.e()
            r8.compact()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.c(sv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.sv0 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "engine.wrap() result: ["
            boolean r1 = r8 instanceof defpackage.hve
            if (r1 == 0) goto L15
            r1 = r8
            hve r1 = (defpackage.hve) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            hve r1 = new hve
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.s0
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            sv0 r7 = r1.X
            tve r6 = r1.o
            defpackage.od2.a0(r8)     // Catch: javax.net.ssl.SSLException -> L2d
            goto L4d
        L2d:
            r7 = move-exception
            goto L81
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.od2.a0(r8)
            yue r8 = new yue     // Catch: javax.net.ssl.SSLException -> L2d
            r3 = 1
            r8.<init>(r6, r7, r3)     // Catch: javax.net.ssl.SSLException -> L2d
            r1.o = r6     // Catch: javax.net.ssl.SSLException -> L2d
            r1.X = r7     // Catch: javax.net.ssl.SSLException -> L2d
            r1.s0 = r4     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.Object r8 = defpackage.ema.C(r8, r1)     // Catch: javax.net.ssl.SSLException -> L2d
            if (r8 != r2) goto L4d
            return r2
        L4d:
            javax.net.ssl.SSLEngineResult r8 = (javax.net.ssl.SSLEngineResult) r8     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r1 = r6.c     // Catch: javax.net.ssl.SSLException -> L2d
            javax.net.ssl.SSLEngine r2 = r6.a     // Catch: javax.net.ssl.SSLException -> L2d
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch: javax.net.ssl.SSLException -> L2d
            it0 r3 = r6.j     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: javax.net.ssl.SSLException -> L2d
            r5.<init>(r0)     // Catch: javax.net.ssl.SSLException -> L2d
            r5.append(r8)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r0 = "]; engine status: "
            r5.append(r0)     // Catch: javax.net.ssl.SSLException -> L2d
            r5.append(r2)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r0 = "; srcBuffer: "
            r5.append(r0)     // Catch: javax.net.ssl.SSLException -> L2d
            r5.append(r7)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r7 = ", outEncrypted: "
            r5.append(r7)     // Catch: javax.net.ssl.SSLException -> L2d
            r5.append(r3)     // Catch: javax.net.ssl.SSLException -> L2d
            java.lang.String r7 = r5.toString()     // Catch: javax.net.ssl.SSLException -> L2d
            defpackage.hm9.i0(r1, r7)     // Catch: javax.net.ssl.SSLException -> L2d
            return r8
        L81:
            r6.f = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.d(sv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ive
            if (r0 == 0) goto L13
            r0 = r7
            ive r0 = (defpackage.ive) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ive r0 = new ive
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            tve r6 = r0.o
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L2f
            goto L7f
        L2f:
            r7 = move-exception
            goto L9b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            tve r6 = r0.o
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L2f
            goto L74
        L3f:
            tve r6 = r0.o
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L45:
            defpackage.od2.a0(r7)
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L8b
            boolean r7 = r6.f     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L85
            r6.g = r5     // Catch: java.lang.Throwable -> L2f
            it0 r7 = r6.j     // Catch: java.lang.Throwable -> L2f
            r7.c()     // Catch: java.lang.Throwable -> L2f
            r0.o = r6     // Catch: java.lang.Throwable -> L2f
            r0.Z = r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r6.p(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L62
            return r1
        L62:
            javax.net.ssl.SSLEngine r7 = r6.a     // Catch: java.lang.Throwable -> L2f
            r7.closeOutbound()     // Catch: java.lang.Throwable -> L2f
            sv0 r7 = r6.n     // Catch: java.lang.Throwable -> L2f
            r0.o = r6     // Catch: java.lang.Throwable -> L2f
            r0.Z = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r6.m(r7, r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L74
            return r1
        L74:
            r0.o = r6     // Catch: java.lang.Throwable -> L2f
            r0.Z = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r6.p(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L7f
            return r1
        L7f:
            java.nio.channels.AsynchronousByteChannel r7 = r6.b     // Catch: java.lang.Throwable -> L2f
            r7.close()     // Catch: java.lang.Throwable -> L2f
            goto L8b
        L85:
            java.nio.channels.ClosedChannelException r7 = new java.nio.channels.ClosedChannelException     // Catch: java.lang.Throwable -> L2f
            r7.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r7     // Catch: java.lang.Throwable -> L2f
        L8b:
            it0 r7 = r6.i
            r7.a()
            it0 r7 = r6.k
            r7.a()
            it0 r6 = r6.j
            r6.a()
            goto La3
        L9b:
            java.lang.String r0 = r6.c     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = "error doing TLS shutdown on close(), continuing"
            defpackage.hm9.p(r0, r1, r7)     // Catch: java.lang.Throwable -> La6
            goto L8b
        La3:
            e5f r6 = defpackage.e5f.a
            return r6
        La6:
            r7 = move-exception
            it0 r0 = r6.i
            r0.a()
            it0 r0 = r6.k
            r0.a()
            it0 r6 = r6.j
            r6.a()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [tve] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12, types: [xi9] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [xi9] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5, types: [tve] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007a -> B:34:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ae -> B:21:0x004f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00be -> B:21:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.kve
            if (r0 == 0) goto L13
            r0 = r9
            kve r0 = (defpackage.kve) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kve r0 = new kve
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4c
            if (r2 == r7) goto L46
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            tve r8 = r0.o
            defpackage.od2.a0(r9)
            goto L7d
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            tve r8 = r0.o
            defpackage.od2.a0(r9)
            goto Lbc
        L43:
            tve r8 = r0.o
            goto L4c
        L46:
            tve r8 = r0.o
            defpackage.od2.a0(r9)
            goto La6
        L4c:
            defpackage.od2.a0(r9)
        L4f:
            javax.net.ssl.SSLEngine r9 = r8.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = r9.getHandshakeStatus()
            if (r9 != 0) goto L59
            r9 = -1
            goto L61
        L59:
            int[] r2 = defpackage.bve.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r2[r9]
        L61:
            if (r9 == r7) goto Lb1
            if (r9 == r6) goto L99
            if (r9 == r5) goto L98
            if (r9 == r4) goto L8c
            r2 = 5
            if (r9 != r2) goto L80
            zue r9 = new zue
            r2 = 0
            r9.<init>(r8, r2)
            r0.o = r8
            r0.Z = r4
            java.lang.Object r9 = defpackage.ema.C(r9, r0)
            if (r9 != r1) goto L7d
            return r1
        L7d:
            e5f r9 = (defpackage.e5f) r9
            goto L4f
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unsupported usage"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L8c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unreachable status"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L98:
            return r3
        L99:
            r0.o = r8
            r0.Z = r7
            sv0 r9 = r8.n
            java.lang.Object r9 = r8.m(r9, r0)
            if (r9 != r1) goto La6
            return r1
        La6:
            r0.o = r8
            r0.Z = r6
            java.lang.Object r9 = r8.p(r0)
            if (r9 != r1) goto L4f
            return r1
        Lb1:
            r0.o = r8
            r0.Z = r5
            java.lang.Object r9 = r8.i(r0)
            if (r9 != r1) goto Lbc
            return r1
        Lbc:
            int r9 = r8.m
            if (r9 <= 0) goto L4f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0164 A[Catch: all -> 0x0040, ave -> 0x018f, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:94:0x014e, B:106:0x017d, B:64:0x00ed, B:66:0x00f1, B:68:0x00f7, B:73:0x0101, B:75:0x0108, B:74:0x0104, B:78:0x0112, B:88:0x012f, B:91:0x0139, B:95:0x0151, B:98:0x0160, B:100:0x0164, B:103:0x016e, B:81:0x011c, B:107:0x0180, B:108:0x0185, B:113:0x018f, B:22:0x0051, B:25:0x005c), top: B:121:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180 A[Catch: all -> 0x0040, ave -> 0x018f, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:94:0x014e, B:106:0x017d, B:64:0x00ed, B:66:0x00f1, B:68:0x00f7, B:73:0x0101, B:75:0x0108, B:74:0x0104, B:78:0x0112, B:88:0x012f, B:91:0x0139, B:95:0x0151, B:98:0x0160, B:100:0x0164, B:103:0x016e, B:81:0x011c, B:107:0x0180, B:108:0x0185, B:113:0x018f, B:22:0x0051, B:25:0x005c), top: B:121:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed A[Catch: all -> 0x0040, ave -> 0x018f, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:94:0x014e, B:106:0x017d, B:64:0x00ed, B:66:0x00f1, B:68:0x00f7, B:73:0x0101, B:75:0x0108, B:74:0x0104, B:78:0x0112, B:88:0x012f, B:91:0x0139, B:95:0x0151, B:98:0x0160, B:100:0x0164, B:103:0x016e, B:81:0x011c, B:107:0x0180, B:108:0x0185, B:113:0x018f, B:22:0x0051, B:25:0x005c), top: B:121:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x017a -> B:106:0x017d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x014b -> B:94:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0162 -> B:106:0x017d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.sv0 r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.h(sv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: all -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:13:0x0028, B:23:0x0045, B:26:0x0050, B:29:0x0060, B:32:0x006c, B:34:0x0074, B:35:0x0077, B:37:0x007f, B:39:0x0083, B:42:0x0088, B:44:0x0094, B:45:0x0099, B:20:0x0039), top: B:50:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {all -> 0x002c, blocks: (B:13:0x0028, B:23:0x0045, B:26:0x0050, B:29:0x0060, B:32:0x006c, B:34:0x0074, B:35:0x0077, B:37:0x007f, B:39:0x0083, B:42:0x0088, B:44:0x0094, B:45:0x0099, B:20:0x0039), top: B:50:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00a7 -> B:23:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.mve
            if (r0 == 0) goto L13
            r0 = r9
            mve r0 = (defpackage.mve) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            mve r0 = new mve
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            tve r8 = r0.o
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L45
        L2c:
            r9 = move-exception
            goto Laa
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            tve r8 = r0.o
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L50
        L3d:
            defpackage.od2.a0(r9)
            it0 r9 = r8.i
            r9.c()
        L45:
            r0.o = r8     // Catch: java.lang.Throwable -> L2c
            r0.Z = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r8.k(r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r1) goto L50
            return r1
        L50:
            javax.net.ssl.SSLEngineResult r9 = (javax.net.ssl.SSLEngineResult) r9     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngine r2 = r8.a     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r2.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2c
            int r5 = r9.bytesProduced()     // Catch: java.lang.Throwable -> L2c
            e5f r6 = defpackage.e5f.a
            if (r5 <= 0) goto L6c
            int r9 = r9.bytesProduced()     // Catch: java.lang.Throwable -> L2c
            r8.m = r9     // Catch: java.lang.Throwable -> L2c
        L66:
            it0 r8 = r8.i
            r8.d()
            return r6
        L6c:
            javax.net.ssl.SSLEngineResult$Status r5 = r9.getStatus()     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult$Status r7 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L2c
            if (r5 != r7) goto L77
            r8.h = r4     // Catch: java.lang.Throwable -> L2c
            goto L66
        L77:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = r9.getHandshakeStatus()     // Catch: java.lang.Throwable -> L2c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> L2c
            if (r9 == r5) goto L66
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.Throwable -> L2c
            if (r2 == r9) goto L66
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> L2c
            if (r2 != r9) goto L88
            goto L66
        L88:
            it0 r9 = r8.i     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r9 = r9.e()     // Catch: java.lang.Throwable -> L2c
            boolean r9 = r9.hasRemaining()     // Catch: java.lang.Throwable -> L2c
            if (r9 != 0) goto L99
            it0 r9 = r8.i     // Catch: java.lang.Throwable -> L2c
            r9.b()     // Catch: java.lang.Throwable -> L2c
        L99:
            it0 r9 = r8.i     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r9 = r9.e()     // Catch: java.lang.Throwable -> L2c
            r0.o = r8     // Catch: java.lang.Throwable -> L2c
            r0.Z = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 != r1) goto L45
            return r1
        Laa:
            it0 r8 = r8.i
            r8.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int j(sv0 sv0Var) {
        it0 it0Var = this.k;
        it0Var.e().flip();
        ByteBuffer byteBufferE = it0Var.e();
        int i = 0;
        for (int i2 = sv0Var.b; i2 < sv0Var.d; i2++) {
            ByteBuffer byteBuffer = ((ByteBuffer[]) sv0Var.e)[i2];
            if (byteBufferE.hasRemaining()) {
                int iMin = Math.min(byteBufferE.remaining(), byteBuffer.remaining());
                if (iMin < 0) {
                    throw new IllegalArgumentException("negative length".toString());
                }
                if (byteBufferE.remaining() < iMin) {
                    throw new IllegalArgumentException(wg0.h("source buffer does not have enough remaining capacity (", byteBufferE.remaining(), " < ", iMin, ")").toString());
                }
                if (byteBuffer.remaining() < iMin) {
                    throw new IllegalArgumentException(wg0.h("destination buffer does not have enough remaining capacity (", byteBuffer.remaining(), " < ", iMin, ")").toString());
                }
                if (iMin != 0) {
                    byteBuffer.put(byteBufferE.array(), byteBufferE.position(), iMin);
                    byteBufferE.position(byteBufferE.position() + iMin);
                }
                i += iMin;
            }
        }
        it0Var.e().compact();
        if (!it0Var.d() && it0Var.f != null) {
            it0Var.f(it0Var.e().position());
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.nve
            if (r0 == 0) goto L13
            r0 = r11
            nve r0 = (defpackage.nve) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            nve r0 = new nve
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            sv0 r10 = r0.X
            tve r2 = r0.o
            defpackage.od2.a0(r11)
            r9 = r0
            r0 = r10
            r10 = r2
        L2d:
            r2 = r9
            goto L5f
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            defpackage.od2.a0(r11)
            sv0 r11 = r10.l
            if (r11 == 0) goto L3f
            goto L4e
        L3f:
            it0 r11 = r10.k
            r11.c()
            sv0 r2 = new sv0
            java.nio.ByteBuffer r11 = r11.e()
            r2.<init>(r11)
            r11 = r2
        L4e:
            r0.o = r10
            r0.X = r11
            r0.s0 = r3
            java.lang.Object r2 = r10.c(r11, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r9 = r0
            r0 = r11
            r11 = r2
            goto L2d
        L5f:
            javax.net.ssl.SSLEngineResult r11 = (javax.net.ssl.SSLEngineResult) r11
            javax.net.ssl.SSLEngine r4 = r10.a
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r4.getHandshakeStatus()
            int r5 = r11.bytesProduced()
            if (r5 <= 0) goto L6e
            return r11
        L6e:
            javax.net.ssl.SSLEngineResult$Status r5 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r5 != r6) goto L77
            return r11
        L77:
            javax.net.ssl.SSLEngineResult$Status r5 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r5 != r6) goto L80
            return r11
        L80:
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = r11.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r5 == r6) goto Lcb
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK
            if (r4 == r5) goto Lcb
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP
            if (r4 != r5) goto L91
            goto Lcb
        L91:
            javax.net.ssl.SSLEngineResult$Status r11 = r11.getStatus()
            javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW
            if (r11 != r4) goto Lc9
            sv0 r11 = r10.l
            boolean r11 = defpackage.tpa.f(r0, r11)
            it0 r4 = r10.k
            if (r11 == 0) goto Lbb
            r4.c()
            java.nio.ByteBuffer r11 = r4.e()
            int r11 = r11.capacity()
            long r5 = (long) r11
            long r7 = r0.c()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 > 0) goto Lbe
            r4.b()
            goto Lbe
        Lbb:
            r4.b()
        Lbe:
            sv0 r11 = new sv0
            java.nio.ByteBuffer r0 = r4.e()
            r11.<init>(r0)
        Lc7:
            r0 = r2
            goto L4e
        Lc9:
            r11 = r0
            goto Lc7
        Lcb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:43:0x00a9, B:45:0x00b3, B:29:0x006e, B:31:0x0078, B:37:0x008d, B:34:0x007f, B:36:0x0085, B:40:0x0098, B:20:0x0046), top: B:56:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: all -> 0x0033, TRY_ENTER, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:43:0x00a9, B:45:0x00b3, B:29:0x006e, B:31:0x0078, B:37:0x008d, B:34:0x007f, B:36:0x0085, B:40:0x0098, B:20:0x0046), top: B:56:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:43:0x00a9, B:45:0x00b3, B:29:0x006e, B:31:0x0078, B:37:0x008d, B:34:0x007f, B:36:0x0085, B:40:0x0098, B:20:0x0046), top: B:56:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #0 {all -> 0x00c2, blocks: (B:25:0x005b, B:50:0x00c6, B:51:0x00cb), top: B:54:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a6 -> B:43:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.sv0 r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.l(sv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.sv0 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.pve
            if (r0 == 0) goto L13
            r0 = r8
            pve r0 = (defpackage.pve) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            pve r0 = new pve
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            sv0 r6 = r0.X
            tve r7 = r0.o
            defpackage.od2.a0(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L46
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.od2.a0(r8)
        L39:
            r0.o = r6
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            javax.net.ssl.SSLEngineResult r8 = (javax.net.ssl.SSLEngineResult) r8
            javax.net.ssl.SSLEngineResult$Status r2 = r8.getStatus()
            if (r2 != 0) goto L50
            r2 = -1
            goto L58
        L50:
            int[] r4 = defpackage.bve.$EnumSwitchMapping$1
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L58:
            if (r2 == r3) goto L7b
            r4 = 2
            if (r2 == r4) goto L7b
            r8 = 3
            if (r2 == r8) goto L75
            r6 = 4
            if (r2 == r6) goto L69
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L69:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Undefined status"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L75:
            it0 r8 = r6.j
            r8.b()
            goto L39
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.m(sv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.sv0 r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.qve
            if (r0 == 0) goto L13
            r0 = r11
            qve r0 = (defpackage.qve) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            qve r0 = new qve
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.od2.a0(r11)
            goto L80
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            sv0 r10 = r0.X
            tve r9 = r0.o
            defpackage.od2.a0(r11)
            goto L6b
        L3b:
            defpackage.od2.a0(r11)
            java.lang.String r11 = r9.c
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L45
            goto L5e
        L45:
            boolean r6 = r2.c()
            if (r6 == 0) goto L5e
            us7 r6 = defpackage.us7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "write: "
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.d(r6, r11, r7, r3)
        L5e:
            r0.o = r9
            r0.X = r10
            r0.s0 = r5
            java.lang.Object r11 = r9.f(r0)
            if (r11 != r1) goto L6b
            return r1
        L6b:
            boolean r11 = r9.f
            if (r11 != 0) goto L81
            boolean r11 = r9.g
            if (r11 != 0) goto L81
            r0.o = r3
            r0.X = r3
            r0.s0 = r4
            java.lang.Object r11 = r9.l(r10, r0)
            if (r11 != r1) goto L80
            return r1
        L80:
            return r11
        L81:
            java.nio.channels.ClosedChannelException r9 = new java.nio.channels.ClosedChannelException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.n(sv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.rve
            if (r0 == 0) goto L13
            r0 = r6
            rve r0 = (defpackage.rve) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            rve r0 = new rve
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            tve r5 = r0.o
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L2c
            goto L5a
        L2c:
            r6 = move-exception
            goto L62
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            tve r5 = r0.o
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L2c
            goto L4f
        L3c:
            defpackage.od2.a0(r6)
            it0 r6 = r5.j
            r6.c()
            r0.o = r5     // Catch: java.lang.Throwable -> L2c
            r0.Z = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = r5.p(r0)     // Catch: java.lang.Throwable -> L2c
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0.o = r5     // Catch: java.lang.Throwable -> L2c
            r0.Z = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r6 = r5.g(r0)     // Catch: java.lang.Throwable -> L2c
            if (r6 != r1) goto L5a
            return r1
        L5a:
            it0 r5 = r5.j
            r5.d()
            e5f r5 = defpackage.e5f.a
            return r5
        L62:
            it0 r5 = r5.j
            r5.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sve
            if (r0 == 0) goto L13
            r0 = r6
            sve r0 = (defpackage.sve) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            sve r0 = new sve
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            tve r5 = r0.o
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L2b
            goto L5f
        L2b:
            r6 = move-exception
            goto L61
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.od2.a0(r6)
            it0 r6 = r5.j
            java.nio.ByteBuffer r6 = r6.e()
            int r6 = r6.position()
            if (r6 != 0) goto L45
            return r3
        L45:
            it0 r6 = r5.j
            java.nio.ByteBuffer r6 = r6.e()
            r6.flip()
            it0 r6 = r5.j     // Catch: java.lang.Throwable -> L2b
            java.nio.ByteBuffer r6 = r6.e()     // Catch: java.lang.Throwable -> L2b
            r0.o = r5     // Catch: java.lang.Throwable -> L2b
            r0.Z = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r5.b(r6, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L5f
            return r1
        L5f:
            r0 = r3
            goto L66
        L61:
            njc r0 = new njc
            r0.<init>(r6)
        L66:
            java.lang.Throwable r6 = defpackage.pjc.a(r0)
            if (r6 == 0) goto L6e
            r5.f = r4
        L6e:
            it0 r5 = r5.j
            java.nio.ByteBuffer r5 = r5.e()
            r5.compact()
            defpackage.od2.a0(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tve.p(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
