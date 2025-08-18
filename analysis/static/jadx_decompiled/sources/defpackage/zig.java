package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class zig implements ifg {
    public final y7f a;

    public zig(y7f y7fVar) {
        this.a = y7fVar;
    }

    @Override // defpackage.ifg
    public final Object r() {
        Context context = (Context) this.a.b;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
