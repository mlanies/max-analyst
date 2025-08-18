package defpackage;

import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z42 {
    public final z42 a;
    public final AtomicReference b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public x42[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public BitSet m;

    public z42(int i) {
        this.a = null;
        this.c = i;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference(new y42(new String[64], new x42[32]));
    }

    public final int a(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return this.j & (i3 + (i3 >>> 3));
    }

    public final int b(String str) {
        int length = str.length();
        int iCharAt = this.c;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 33) + str.charAt(i);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0085 A[EDGE_INSN: B:113:0x0085->B:48:0x0085 BREAK  A[LOOP:1: B:34:0x0062->B:46:0x0081], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081 A[LOOP:1: B:34:0x0062->B:46:0x0081, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(char[] r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z42.c(char[], int, int, int):java.lang.String");
    }

    public z42(z42 z42Var, int i, int i2, y42 y42Var) {
        this.a = z42Var;
        this.c = i2;
        this.b = null;
        this.d = i;
        this.e = zr6.a(2, i);
        String[] strArr = y42Var.c;
        this.f = strArr;
        this.g = y42Var.d;
        this.h = y42Var.a;
        this.k = y42Var.b;
        int length = strArr.length;
        this.i = length - (length >> 2);
        this.j = length - 1;
        this.l = true;
    }
}
