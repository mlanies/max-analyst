package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class h9b extends oi0 {
    public static final pke X = new pke("privacy.restricted", null, null);
    public final long c;
    public final List o;

    public h9b(long j, List list) {
        super(X);
        this.c = j;
        this.o = list;
    }

    @Override // defpackage.oi0, defpackage.pi0
    public final String toString() {
        return "PrivacyRestrictedError{chatId=" + this.c + ", contactIds=" + this.o + '}';
    }
}
