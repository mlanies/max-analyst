package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fu extends pi0 {
    public final int b;
    public final List c;

    public fu(int i, long j, List list) {
        super(j);
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "AssetsGetByIdsEvent{type=" + au1.t(this.b) + ", ids=" + this.c + '}';
    }
}
