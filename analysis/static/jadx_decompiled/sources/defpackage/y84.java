package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class y84 {
    public final MediaCodec.BufferInfo a;
    public final MediaFormat b;
    public final qy5 c;
    public final MediaCodec d;
    public final Surface e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final AtomicBoolean i;
    public qy5 j;
    public ByteBuffer k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:16:0x004a, B:18:0x0059, B:20:0x005f, B:23:0x0068, B:28:0x0074, B:29:0x0078), top: B:63:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y84(android.content.Context r10, defpackage.qy5 r11, android.media.MediaFormat r12, java.lang.String r13, boolean r14, android.view.Surface r15) throws androidx.media3.transformer.ExportException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y84.<init>(android.content.Context, qy5, android.media.MediaFormat, java.lang.String, boolean, android.view.Surface):void");
    }

    public final ExportException a(RuntimeException runtimeException) {
        boolean z = this.g;
        return ExportException.c(runtimeException, z ? 3002 : 4002, new qh3(this.b.toString(), b(), this.h, z));
    }

    public final String b() {
        int i = oaf.a;
        MediaCodec mediaCodec = this.d;
        return i >= 29 ? x84.a(mediaCodec) : mediaCodec.getName();
    }

    public final ByteBuffer c() {
        if (!f(true)) {
            return null;
        }
        long j = this.a.presentationTimeUs;
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
            synchronized (d54.class) {
            }
            return this.k;
        }
        return this.k;
    }

    public final boolean d() {
        return this.o && this.m == -1;
    }

    public final boolean e(p54 p54Var) throws ExportException {
        MediaCodec mediaCodec = this.d;
        if (this.n) {
            return false;
        }
        if (this.l < 0) {
            try {
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                this.l = iDequeueInputBuffer;
                if (iDequeueInputBuffer < 0) {
                    return false;
                }
                try {
                    p54Var.X = mediaCodec.getInputBuffer(iDequeueInputBuffer);
                    p54Var.v();
                } catch (RuntimeException e) {
                    z04.s(e, "MediaCodec error");
                    throw a(e);
                }
            } catch (RuntimeException e2) {
                z04.s(e2, "MediaCodec error");
                throw a(e2);
            }
        }
        p54Var.X.getClass();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(boolean r11) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y84.f(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.p54 r10) throws android.media.MediaCodec.CryptoException, androidx.media3.transformer.ExportException {
        /*
            r9 = this;
            boolean r0 = r9.n
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "Input buffer can not be queued after the input stream has ended."
            defpackage.fm9.j(r2, r0)
            java.nio.ByteBuffer r0 = r10.X
            r2 = 0
            if (r0 == 0) goto L21
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L21
            java.nio.ByteBuffer r0 = r10.X
            int r0 = r0.position()
            java.nio.ByteBuffer r3 = r10.X
            int r3 = r3.remaining()
            goto L23
        L21:
            r0 = r2
            r3 = r0
        L23:
            long r4 = r10.Z
            r6 = 4
            boolean r7 = r10.f(r6)
            if (r7 == 0) goto L55
            r9.n = r1
            java.util.LinkedHashMap r7 = defpackage.d54.a
            java.lang.Class<d54> r7 = defpackage.d54.class
            monitor-enter(r7)
            java.lang.Class<d54> r8 = defpackage.d54.class
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r7)
            boolean r7 = r9.g
            if (r7 == 0) goto L4f
            java.nio.ByteBuffer r0 = r10.X
            if (r0 == 0) goto L48
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L47
            goto L48
        L47:
            r1 = r2
        L48:
            defpackage.fm9.k(r1)
            r4 = 0
            r3 = r2
            goto L57
        L4f:
            r2 = r0
            goto L57
        L51:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L53
            throw r9
        L53:
            r9 = move-exception
            goto L51
        L55:
            r6 = r2
            goto L4f
        L57:
            android.media.MediaCodec r0 = r9.d     // Catch: java.lang.RuntimeException -> L73
            int r1 = r9.l     // Catch: java.lang.RuntimeException -> L73
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch: java.lang.RuntimeException -> L73
            java.util.LinkedHashMap r0 = defpackage.d54.a
            java.lang.Class<d54> r0 = defpackage.d54.class
            monitor-enter(r0)
            java.lang.Class<d54> r1 = defpackage.d54.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)
            r0 = -1
            r9.l = r0
            r9 = 0
            r10.X = r9
            return
        L6f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r9
        L71:
            r9 = move-exception
            goto L6f
        L73:
            r10 = move-exception
            java.lang.String r0 = "MediaCodec error"
            defpackage.z04.s(r10, r0)
            androidx.media3.transformer.ExportException r9 = r9.a(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y84.g(p54):void");
    }

    public final void h() {
        this.k = null;
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.d.release();
    }

    public final void i() throws ExportException {
        MediaCodec.BufferInfo bufferInfo = this.a;
        fm9.l(bufferInfo);
        j(bufferInfo.presentationTimeUs, false);
    }

    public final void j(long j, boolean z) throws ExportException {
        this.k = null;
        MediaCodec mediaCodec = this.d;
        try {
            if (z) {
                mediaCodec.releaseOutputBuffer(this.m, j * 1000);
                LinkedHashMap linkedHashMap = d54.a;
                synchronized (d54.class) {
                    try {
                        synchronized (d54.class) {
                        }
                    } finally {
                    }
                }
            } else {
                mediaCodec.releaseOutputBuffer(this.m, false);
            }
            this.m = -1;
        } catch (RuntimeException e) {
            z04.s(e, "MediaCodec error");
            throw a(e);
        }
    }
}
