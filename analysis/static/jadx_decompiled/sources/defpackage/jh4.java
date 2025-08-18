package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class jh4 implements Iterator, qb7 {
    public int X;
    public final /* synthetic */ kh4 Y;
    public int a = -1;
    public int b;
    public int c;
    public j37 o;

    public jh4(kh4 kh4Var) {
        this.Y = kh4Var;
        int iE = ote.e(kh4Var.b, 0, kh4Var.a.length());
        this.b = iE;
        this.c = iE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.a = r1
            r0 = 0
            r7.o = r0
            goto L7b
        Lb:
            kh4 r2 = r7.Y
            int r3 = r2.c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.X
            int r6 = r6 + r5
            r7.X = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            j37 r0 = new j37
            int r1 = r7.b
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.w9e.v0(r2)
            r0.<init>(r1, r2, r5)
            r7.o = r0
            r7.c = r4
            goto L79
        L34:
            a66 r0 = r2.d
            java.lang.CharSequence r3 = r2.a
            int r6 = r7.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            kpa r0 = (defpackage.kpa) r0
            if (r0 != 0) goto L58
            j37 r0 = new j37
            int r1 = r7.b
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.w9e.v0(r2)
            r0.<init>(r1, r2, r5)
            r7.o = r0
            r7.c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.b
            j37 r3 = defpackage.ote.Y(r3, r2)
            r7.o = r3
            int r2 = r2 + r0
            r7.b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.c = r2
        L79:
            r7.a = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh4.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            throw new NoSuchElementException();
        }
        j37 j37Var = this.o;
        this.o = null;
        this.a = -1;
        return j37Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
