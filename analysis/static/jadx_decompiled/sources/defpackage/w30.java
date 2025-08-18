package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class w30 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ x30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(x30 x30Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = x30Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        x30 x30Var = this.c;
        x30Var.d(t30.b((Context) x30Var.b, (h30) x30Var.u0, (g40) x30Var.t0));
    }
}
