package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public final class t7g extends ContextWrapper implements ke3 {
    public final /* synthetic */ v7g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7g(v7g v7gVar, Context context) {
        super(context);
        this.a = v7gVar;
    }

    @Override // defpackage.ke3
    public final me3 a() {
        return ((ke3) this.a.a.getApplicationContext()).a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final boolean isDeviceProtectedStorage() {
        return false;
    }
}
