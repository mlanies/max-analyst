package defpackage;

/* loaded from: classes.dex */
public enum av3 {
    PUSH_ENTER(true, true),
    PUSH_EXIT(true, false),
    POP_ENTER(false, true),
    POP_EXIT(false, false);

    public final boolean a;
    public final boolean b;

    av3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
