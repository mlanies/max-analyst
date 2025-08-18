package defpackage;

import android.os.SystemClock;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class bw4 implements qq6, n99 {
    public static final long[] X = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Object o;

    public bw4(ik5 ik5Var) {
        this.o = ik5Var;
        this.b = new kw4(0.3d, 0.0d, 6);
        this.c = new l7(1, false);
    }

    public void a(long j) {
        if (this.a != j) {
            this.a = j;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ik5 ik5Var = (ik5) this.o;
            ik5Var.a = jElapsedRealtime;
            ((kw4) this.b).a(((l7) this.c).c(j, ik5Var.a));
        }
    }

    public void b(u99 u99Var, int i) {
        c54.j("Invalid metering mode " + i, i >= 1 && i <= 7);
        if ((i & 1) != 0) {
            ((ArrayList) this.b).add(u99Var);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.c).add(u99Var);
        }
    }

    public void c(int i) throws IOException {
        if (((InputStream) this.o).read((byte[]) this.b, 0, i) != i) {
            throw new IOException("read failed");
        }
        this.a += i;
    }

    @Override // defpackage.n99
    public long e() {
        return this.a;
    }

    @Override // defpackage.qq6
    public long getContentLength() {
        return this.a;
    }

    @Override // defpackage.qq6
    public String getContentType() {
        return (String) this.o;
    }

    @Override // defpackage.n99
    public int j() throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(4);
        return byteBuffer.getInt();
    }

    @Override // defpackage.n99
    public void k(int i) {
        while (i > 0) {
            int iSkip = (int) ((InputStream) this.o).skip(i);
            if (iSkip < 1) {
                throw new IOException("Skip didn't move at least 1 byte forward");
            }
            i -= iSkip;
            this.a += iSkip;
        }
    }

    @Override // defpackage.n99
    public long o() throws IOException {
        ((ByteBuffer) this.c).position(0);
        c(4);
        return r1.getInt() & 4294967295L;
    }

    @Override // defpackage.n99
    public int readUnsignedShort() throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(2);
        return byteBuffer.getShort() & 65535;
    }

    @Override // defpackage.qq6
    public void writeTo(OutputStream outputStream) throws IOException {
        Iterator it = ((List) this.c).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = (String) this.b;
            if (!zHasNext) {
                byte[] bArr = nq6.b;
                outputStream.write(bArr);
                nq6.c(outputStream, str);
                outputStream.write(bArr);
                return;
            }
            pq6 pq6Var = (pq6) it.next();
            outputStream.write(nq6.b);
            nq6.c(outputStream, str);
            byte[] bArr2 = nq6.a;
            outputStream.write(bArr2);
            nq6.c(outputStream, pq6Var.b);
            outputStream.write(bArr2);
            pq6Var.a.writeTo(outputStream);
            outputStream.write(bArr2);
        }
    }

    public bw4(r6d r6dVar, vw vwVar) {
        this.b = r6dVar;
        this.c = vwVar;
        int iF = r6dVar.f();
        if (iF <= 64) {
            this.a = iF != 64 ? (-1) << iF : 0L;
            this.o = X;
            return;
        }
        this.a = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.o = jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bw4(java.lang.String r13, java.util.List r14) {
        /*
            r12 = this;
            r12.<init>()
            r12.b = r13
            r12.c = r14
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r13 = r0.concat(r13)
            r12.o = r13
            boolean r13 = r14.isEmpty()
            r0 = -1
            r2 = 0
            if (r13 == 0) goto L1a
            goto L35
        L1a:
            java.util.Iterator r13 = r14.iterator()
        L1e:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L35
            java.lang.Object r14 = r13.next()
            pq6 r14 = (defpackage.pq6) r14
            qq6 r14 = r14.a
            long r4 = r14.getContentLength()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 >= 0) goto L1e
            goto L90
        L35:
            java.lang.Object r13 = r12.c
            java.util.List r13 = (java.util.List) r13
            byte[] r14 = defpackage.nq6.b
            int r14 = r14.length
            long r4 = (long) r14
            java.lang.Object r14 = r12.b
            java.lang.String r14 = (java.lang.String) r14
            int r14 = defpackage.nq6.b(r14)
            long r6 = (long) r14
            long r4 = r4 + r6
            byte[] r14 = defpackage.nq6.a
            int r14 = r14.length
            long r6 = (long) r14
            long r4 = r4 + r6
            java.util.Iterator r13 = r13.iterator()
        L50:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L8f
            java.lang.Object r14 = r13.next()
            pq6 r14 = (defpackage.pq6) r14
            byte[] r6 = defpackage.nq6.b
            int r6 = r6.length
            long r6 = (long) r6
            long r4 = r4 + r6
            java.lang.Object r6 = r12.b
            java.lang.String r6 = (java.lang.String) r6
            int r6 = defpackage.nq6.b(r6)
            long r6 = (long) r6
            long r4 = r4 + r6
            byte[] r6 = defpackage.nq6.a
            int r7 = r6.length
            long r7 = (long) r7
            long r4 = r4 + r7
            qq6 r7 = r14.a
            long r8 = r7.getContentLength()
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L7c
            r10 = r0
            goto L8d
        L7c:
            java.lang.String r14 = r14.b
            int r14 = defpackage.nq6.b(r14)
            int r8 = r6.length
            int r14 = r14 + r8
            long r8 = (long) r14
            long r10 = r7.getContentLength()
            long r10 = r10 + r8
            int r14 = r6.length
            long r6 = (long) r14
            long r10 = r10 + r6
        L8d:
            long r4 = r4 + r10
            goto L50
        L8f:
            r0 = r4
        L90:
            r12.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw4.<init>(java.lang.String, java.util.List):void");
    }

    public bw4(bw4 bw4Var) {
        this.b = Collections.unmodifiableList((ArrayList) bw4Var.b);
        this.c = Collections.unmodifiableList((ArrayList) bw4Var.c);
        this.o = Collections.unmodifiableList((ArrayList) bw4Var.o);
        this.a = bw4Var.a;
    }

    public bw4(u99 u99Var) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.a = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        b(u99Var, 1);
    }

    public bw4(FileInputStream fileInputStream) {
        this.a = 0L;
        this.o = fileInputStream;
        byte[] bArr = new byte[4];
        this.b = bArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.c = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
    }
}
