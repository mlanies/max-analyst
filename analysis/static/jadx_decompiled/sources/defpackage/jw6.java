package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class jw6 extends cx6 {
    @Override // defpackage.cx6
    public final qw6 e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.cx6
    /* renamed from: i */
    public final qw6 values() {
        return ((efc) this).t0.keySet();
    }

    @Override // defpackage.cx6, java.util.Map
    public final Collection values() {
        return ((efc) this).t0.keySet();
    }
}
