package defpackage;

/* loaded from: classes.dex */
public enum zw1 {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    public final boolean a;

    zw1(boolean z) {
        this.a = z;
    }
}
