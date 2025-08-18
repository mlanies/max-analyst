package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes2.dex */
public final class u7g extends ContextWrapper implements ke3 {
    public final t7g a;
    public final /* synthetic */ v7g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7g(v7g v7gVar, Context context) {
        super(context);
        this.b = v7gVar;
        this.a = new t7g(v7gVar, v7gVar.a.getApplicationContext());
    }

    @Override // defpackage.ke3
    public final me3 a() {
        return ((ke3) this.b.a.getApplicationContext()).a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this.a;
    }
}
