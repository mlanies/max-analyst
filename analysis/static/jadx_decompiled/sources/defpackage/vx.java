package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class vx implements yud {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ vx(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    @Override // defpackage.yud
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.bt0 r5, long r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            java.lang.Object r1 = r4.c
            int r4 = r4.a
            switch(r4) {
                case 0: goto L88;
                default: goto L9;
            }
        L9:
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            goto L53
        L10:
            if (r4 < 0) goto L78
            r4 = 1
            oue r1 = (defpackage.oue) r1     // Catch: java.lang.AssertionError -> L43
            r1.f()     // Catch: java.lang.AssertionError -> L43
            k2d r1 = r5.r0(r4)     // Catch: java.lang.AssertionError -> L43
            int r2 = r1.c     // Catch: java.lang.AssertionError -> L43
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.lang.AssertionError -> L43
            long r6 = java.lang.Math.min(r6, r2)     // Catch: java.lang.AssertionError -> L43
            int r6 = (int) r6     // Catch: java.lang.AssertionError -> L43
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.AssertionError -> L43
            byte[] r7 = r1.a     // Catch: java.lang.AssertionError -> L43
            int r2 = r1.c     // Catch: java.lang.AssertionError -> L43
            int r6 = r0.read(r7, r2, r6)     // Catch: java.lang.AssertionError -> L43
            r7 = -1
            if (r6 != r7) goto L48
            int r6 = r1.b     // Catch: java.lang.AssertionError -> L43
            int r7 = r1.c     // Catch: java.lang.AssertionError -> L43
            if (r6 != r7) goto L45
            k2d r6 = r1.a()     // Catch: java.lang.AssertionError -> L43
            r5.a = r6     // Catch: java.lang.AssertionError -> L43
            defpackage.b3d.a(r1)     // Catch: java.lang.AssertionError -> L43
            goto L45
        L43:
            r5 = move-exception
            goto L54
        L45:
            r2 = -1
            goto L53
        L48:
            int r7 = r1.c     // Catch: java.lang.AssertionError -> L43
            int r7 = r7 + r6
            r1.c = r7     // Catch: java.lang.AssertionError -> L43
            long r0 = r5.b     // Catch: java.lang.AssertionError -> L43
            long r2 = (long) r6     // Catch: java.lang.AssertionError -> L43
            long r0 = r0 + r2
            r5.b = r0     // Catch: java.lang.AssertionError -> L43
        L53:
            return r2
        L54:
            java.util.logging.Logger r6 = defpackage.x2a.a
            java.lang.Throwable r6 = r5.getCause()
            r7 = 0
            if (r6 == 0) goto L6e
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L6a
            java.lang.String r0 = "getsockname failed"
            boolean r6 = defpackage.w9e.p0(r6, r0, r7)
            goto L6b
        L6a:
            r6 = r7
        L6b:
            if (r6 == 0) goto L6e
            goto L6f
        L6e:
            r4 = r7
        L6f:
            if (r4 == 0) goto L77
            java.io.IOException r4 = new java.io.IOException
            r4.<init>(r5)
            throw r4
        L77:
            throw r5
        L78:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = defpackage.ey8.h(r6, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L88:
            wx r0 = (defpackage.wx) r0
            r0.i()
            yud r1 = (defpackage.yud) r1     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La2
            long r4 = r1.c(r5, r6)     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La2
            boolean r6 = r0.j()
            if (r6 != 0) goto L9a
            return r4
        L9a:
            r4 = 0
            java.io.IOException r4 = r0.k(r4)
            throw r4
        La0:
            r4 = move-exception
            goto Laf
        La2:
            r4 = move-exception
            boolean r5 = r0.j()     // Catch: java.lang.Throwable -> La0
            if (r5 != 0) goto Laa
            goto Lae
        Laa:
            java.io.IOException r4 = r0.k(r4)     // Catch: java.lang.Throwable -> La0
        Lae:
            throw r4     // Catch: java.lang.Throwable -> La0
        Laf:
            r0.j()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx.c(bt0, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                wx wxVar = (wx) this.b;
                wxVar.i();
                try {
                    ((yud) this.c).close();
                    if (wxVar.j()) {
                        throw wxVar.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!wxVar.j()) {
                        throw e;
                    }
                    throw wxVar.k(e);
                } finally {
                    wxVar.j();
                }
            default:
                ((InputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        switch (this.a) {
            case 0:
                return (wx) this.b;
            default:
                return (oue) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((yud) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }
}
