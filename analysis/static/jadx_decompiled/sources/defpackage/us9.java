package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class us9 extends gle {
    public final int X;
    public final List Y;
    public final long c;
    public final long o;

    public us9(long j, long j2, int i, List list) {
        this.c = j;
        this.o = j2;
        this.X = i;
        this.Y = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.us9 c(defpackage.gy8 r20) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us9.c(gy8):us9");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us9)) {
            return false;
        }
        us9 us9Var = (us9) obj;
        return this.c == us9Var.c && this.o == us9Var.o && this.X == us9Var.X && tpa.f(this.Y, us9Var.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + k7d.e(this.X, h4f.m(Long.hashCode(this.c) * 31, 31, this.o), 31);
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{chatId=" + this.c + ", messageId=" + this.o + ", totalCount=" + this.X + ", counters count=" + this.Y.size() + " }";
    }
}
