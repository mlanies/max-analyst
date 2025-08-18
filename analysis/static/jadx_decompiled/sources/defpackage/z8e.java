package defpackage;

/* loaded from: classes.dex */
public enum z8e implements s77 {
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE_PROPERTIES,
    /* JADX INFO: Fake field, exist only in values array */
    SCALARS_AS_OBJECTS,
    /* JADX INFO: Fake field, exist only in values array */
    UNTYPED_SCALARS;

    public final int a = 1 << ordinal();

    z8e() {
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
