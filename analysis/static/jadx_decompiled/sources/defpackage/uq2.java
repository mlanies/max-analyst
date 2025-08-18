package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class uq2 extends gle {
    public final Long X;
    public final List c;
    public final boolean o;

    public uq2(Long l, List list, boolean z) {
        this.c = list;
        this.o = z;
        this.X = l;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.uq2 c(defpackage.gy8 r14) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq2.c(gy8):uq2");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq2)) {
            return false;
        }
        uq2 uq2Var = (uq2) obj;
        return tpa.f(this.c, uq2Var.c) && this.o == uq2Var.o && tpa.f(this.X, uq2Var.X);
    }

    public final int hashCode() {
        int iD = ms2.d(this.c.hashCode() * 31, 31, this.o);
        Long l = this.X;
        return iD + (l == null ? 0 : l.hashCode());
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(commonChats=" + this.c + ", hasMore=" + this.o + ", marker=" + this.X + ")";
    }
}
