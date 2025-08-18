package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ru extends gle {
    public Map X;
    public Map Y;
    public List Z;
    public long c;
    public List o;
    public Map s0;
    public Map t0;

    public ru(gy8 gy8Var) {
        super(gy8Var);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.X == null) {
            this.X = Collections.emptyMap();
        }
        if (this.Y == null) {
            this.Y = Collections.emptyMap();
        }
        if (this.Z == null) {
            this.Z = Collections.emptyList();
        }
        if (this.s0 == null) {
            this.s0 = Collections.emptyMap();
        }
        if (this.t0 == null) {
            this.t0 = Collections.emptyMap();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.util.ArrayList] */
    @Override // defpackage.gle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.gy8 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru.b(gy8, java.lang.String):void");
    }

    @Override // defpackage.zje
    public final String toString() {
        return "{sync=" + this.c + ", sections=" + s5c.o(this.o) + ", stickersUpdates=" + s5c.S(this.X) + ", stickersSetsUpdates=" + s5c.S(this.Y) + ", stickersOrder=" + s5c.o(this.Z) + ", animojiUpdates=" + s5c.S(this.s0) + ", animojiSetsUpdates=" + s5c.S(this.t0) + "}";
    }
}
