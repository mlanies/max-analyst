package defpackage;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ra7 extends ewe {
    public static final int s0;
    public static final int t0;
    public static final int u0;
    public static final a7d v0;
    public final int X;
    public final a7d Y;
    public final char Z;
    public final transient z42 a;
    public final transient wv0 b;
    public final int c;
    public final int o;

    static {
        int iB = 0;
        for (int i : au1.v(4)) {
            if (i == 0) {
                throw null;
            }
            iB |= zr6.b(i);
        }
        s0 = iB;
        int i2 = 0;
        for (ya7 ya7Var : ya7.values()) {
            if (ya7Var.a) {
                i2 |= ya7Var.b;
            }
        }
        t0 = i2;
        int i3 = 0;
        for (sa7 sa7Var : sa7.values()) {
            if (sa7Var.a) {
                i3 |= sa7Var.b;
            }
        }
        u0 = i3;
        v0 = ad4.a;
    }

    public ra7() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = new z42((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        this.b = new wv0((((int) jCurrentTimeMillis2) + ((int) (jCurrentTimeMillis2 >>> 32))) | 1);
        this.c = s0;
        this.o = t0;
        this.X = u0;
        this.Y = v0;
        this.Z = '\"';
    }

    public wr6 a(Object obj, boolean z) {
        return new wr6(i(), obj, z);
    }

    public ta7 b(Writer writer, wr6 wr6Var) {
        m9g m9gVar = new m9g(wr6Var, this.X, writer, this.Z);
        a7d a7dVar = this.Y;
        if (a7dVar != v0) {
            m9gVar.Z = a7dVar;
        }
        return m9gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ab7 c(java.io.InputStream r26, defpackage.wr6 r27) throws java.io.CharConversionException {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra7.c(java.io.InputStream, wr6):ab7");
    }

    public ab7 d(Reader reader, wr6 wr6Var) {
        int i = this.c;
        z42 z42Var = this.a;
        return new u7c(wr6Var, this.o, reader, new z42(z42Var, i, z42Var.c, (y42) z42Var.b.get()));
    }

    public ab7 e(char[] cArr, int i, int i2, wr6 wr6Var, boolean z) {
        int i3 = this.c;
        z42 z42Var = this.a;
        y42 y42Var = (y42) z42Var.b.get();
        return new u7c(wr6Var, this.o, new z42(z42Var, i3, z42Var.c, y42Var), cArr, i, i + i2, z);
    }

    public final InputStream f(InputStream inputStream, wr6 wr6Var) {
        return inputStream;
    }

    public final Reader g(Reader reader, wr6 wr6Var) {
        return reader;
    }

    public final Writer h(Writer writer, wr6 wr6Var) {
        return writer;
    }

    public mt0 i() {
        SoftReference softReference;
        if (!zr6.a(4, this.c)) {
            return new mt0();
        }
        ThreadLocal threadLocal = nt0.b;
        SoftReference softReference2 = (SoftReference) threadLocal.get();
        mt0 mt0Var = softReference2 == null ? null : (mt0) softReference2.get();
        if (mt0Var == null) {
            mt0Var = new mt0();
            bdb bdbVar = nt0.a;
            if (bdbVar != null) {
                ReferenceQueue referenceQueue = (ReferenceQueue) bdbVar.c;
                softReference = new SoftReference(mt0Var, referenceQueue);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bdbVar.b;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(mt0Var);
            }
            threadLocal.set(softReference);
        }
        return mt0Var;
    }

    public boolean j() {
        return true;
    }

    public ta7 k(Writer writer) {
        wr6 wr6VarA = a(writer, false);
        return b(h(writer, wr6VarA), wr6VarA);
    }

    public ab7 l(InputStream inputStream) {
        wr6 wr6VarA = a(inputStream, false);
        return c(f(inputStream, wr6VarA), wr6VarA);
    }

    public ab7 m(Reader reader) {
        wr6 wr6VarA = a(reader, false);
        return d(g(reader, wr6VarA), wr6VarA);
    }

    public ab7 n(String str) {
        int length = str.length();
        if (length > 32768 || !j()) {
            return m(new StringReader(str));
        }
        wr6 wr6VarA = a(str, true);
        if (wr6VarA.f != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        char[] cArrA = wr6VarA.d.a(0, length);
        wr6VarA.f = cArrA;
        str.getChars(0, length, cArrA, 0);
        return e(cArrA, 0, length, wr6VarA, true);
    }
}
