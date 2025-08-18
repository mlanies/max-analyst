package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class cn3 {
    public final je7 a;

    public cn3(je7 je7Var) {
        this.a = je7Var;
    }

    public final void a(Context context, Uri uri) {
        qyc qycVar = (qyc) ((y7d) this.a.getValue());
        String string = qycVar.g.getString("invite-long", null);
        if (string == null) {
            string = String.format(context.getString(dpc.C), Arrays.copyOf(new Object[]{qycVar.p()}, 1));
        }
        tpa.o(context, string.toString());
        String str = o37.a;
        o37.d(context, string, uri);
    }
}
