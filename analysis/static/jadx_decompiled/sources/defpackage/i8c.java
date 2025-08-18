package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i8c implements Closeable {
    public final /* synthetic */ int a = 1;
    public final fu0 b;
    public final long c;
    public final Object o;

    public i8c(bt0 bt0Var, rl8 rl8Var, long j) {
        this.b = bt0Var;
        this.o = rl8Var;
        this.c = j;
    }

    public final fu0 S() {
        switch (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #1 {all -> 0x0054, blocks: (B:3:0x0004, B:5:0x000b, B:10:0x002a, B:12:0x0034, B:18:0x003f, B:22:0x0048, B:21:0x0046), top: B:33:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String U() {
        /*
            r9 = this;
            fu0 r0 = r9.S()
            rl8 r9 = r9.o()     // Catch: java.lang.Throwable -> L54
            r1 = 0
            if (r9 == 0) goto L46
            java.nio.charset.Charset r2 = defpackage.a52.a     // Catch: java.lang.Throwable -> L54
            java.lang.String[] r9 = r9.c     // Catch: java.lang.Throwable -> L54
            j37 r3 = new j37     // Catch: java.lang.Throwable -> L54
            int r4 = r9.length     // Catch: java.lang.Throwable -> L54
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            r3.<init>(r6, r4, r5)     // Catch: java.lang.Throwable -> L54
            r4 = 2
            h37 r3 = defpackage.ote.X(r3, r4)     // Catch: java.lang.Throwable -> L54
            int r4 = r3.a     // Catch: java.lang.Throwable -> L54
            int r6 = r3.b     // Catch: java.lang.Throwable -> L54
            int r3 = r3.c     // Catch: java.lang.Throwable -> L54
            if (r3 < 0) goto L28
            if (r4 > r6) goto L3c
            goto L2a
        L28:
            if (r4 < r6) goto L3c
        L2a:
            r7 = r9[r4]     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "charset"
            boolean r7 = defpackage.eae.k0(r7, r8, r5)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L38
            int r4 = r4 + r5
            r9 = r9[r4]     // Catch: java.lang.Throwable -> L54
            goto L3d
        L38:
            if (r4 == r6) goto L3c
            int r4 = r4 + r3
            goto L2a
        L3c:
            r9 = r1
        L3d:
            if (r9 == 0) goto L43
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r9)     // Catch: java.lang.IllegalArgumentException -> L43 java.lang.Throwable -> L54
        L43:
            if (r2 == 0) goto L46
            goto L48
        L46:
            java.nio.charset.Charset r2 = defpackage.a52.a     // Catch: java.lang.Throwable -> L54
        L48:
            java.nio.charset.Charset r9 = defpackage.naf.r(r0, r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r9 = r0.O(r9)     // Catch: java.lang.Throwable -> L54
            defpackage.v3c.i(r0, r1)
            return r9
        L54:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L56
        L56:
            r1 = move-exception
            defpackage.v3c.i(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i8c.U():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        naf.c(S());
    }

    public final InputStream m() {
        return S().l0();
    }

    public final long n() {
        switch (this.a) {
        }
        return this.c;
    }

    public final rl8 o() {
        Object obj = this.o;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = rl8.d;
                try {
                    return fm9.A(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (rl8) obj;
        }
    }

    public i8c(String str, long j, y7c y7cVar) {
        this.o = str;
        this.c = j;
        this.b = y7cVar;
    }
}
