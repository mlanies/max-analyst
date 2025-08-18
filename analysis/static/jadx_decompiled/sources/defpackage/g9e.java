package defpackage;

/* loaded from: classes.dex */
public enum g9e implements s77 {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    public final int a = 1 << ordinal();

    g9e() {
    }

    @Override // defpackage.s77
    public final boolean a() {
        return false;
    }

    @Override // defpackage.s77
    public final int b() {
        return this.a;
    }
}
