package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ku3 extends oi0 {
    public final long c;
    public final List o;

    public ku3(pke pkeVar, long j, List list) {
        super(pkeVar);
        this.c = j;
        this.o = list;
    }

    @Override // defpackage.oi0, defpackage.pi0
    public final String toString() {
        return "ControlMessageAddError{chatId=" + this.c + ", contactIds=" + this.o + '}';
    }
}
