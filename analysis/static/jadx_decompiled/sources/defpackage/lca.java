package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import one.me.android.deeplink.NewWidgetActivity;

/* loaded from: classes.dex */
public final class lca {
    public final Context a;
    public final je7 b;

    public lca(Context context, je7 je7Var) {
        this.a = context;
        this.b = je7Var;
    }

    public final void a(long j) {
        Uri uriH = c54.h(ey8.i(j, ":chats?id=", "&type=local"), ((fl7) ((al) this.b.getValue())).b, null);
        int i = NewWidgetActivity.V0;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NewWidgetActivity.class);
        intent.putExtra("deep_link", uriH);
        intent.putExtra("snackbar", (Parcelable) null);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
