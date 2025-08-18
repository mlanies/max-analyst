package defpackage;

/* loaded from: classes2.dex */
public final class c80 extends dle {
    /* JADX WARN: Illegal instructions before constructor call */
    public c80(int i) {
        short s = 1;
        if (i != 1) {
            s = 2;
            if (i != 2) {
                throw null;
            }
        }
        super("registration_failed", 3, usc.b(new kpa("reason", Short.valueOf(s))));
    }
}
