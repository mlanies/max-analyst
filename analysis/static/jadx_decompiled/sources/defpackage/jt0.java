package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public abstract class jt0 {
    public static final byte[] a = "0123456789abcdef".getBytes(a52.a);

    public static final String a(bt0 bt0Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (bt0Var.S(j2) == ((byte) 13)) {
                String strO0 = bt0Var.o0(j2, a52.a);
                bt0Var.R(2L);
                return strO0;
            }
        }
        String strO02 = bt0Var.o0(j, a52.a);
        bt0Var.R(1L);
        return strO02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r19 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(defpackage.bt0 r17, defpackage.vma r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt0.b(bt0, vma, boolean):int");
    }
}
