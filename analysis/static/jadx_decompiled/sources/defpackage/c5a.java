package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class c5a extends ContextWrapper {
    public final /* synthetic */ OneMeApplication a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5a(Context context, OneMeApplication oneMeApplication) {
        super(context);
        this.a = oneMeApplication;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this.a;
    }
}
