package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class aq7 {
    public final Context a;
    public final a4c b;
    public volatile boolean c;
    public volatile boolean d;

    public aq7(Context context, a4c a4cVar) {
        this.a = context;
        this.b = a4cVar;
        this.c = z7.c(context, "android.permission.RECORD_AUDIO") == 0;
        this.d = z7.c(context, "android.permission.CAMERA") == 0;
    }

    public final boolean a() {
        boolean z = false;
        boolean z2 = z7.c(this.a, "android.permission.RECORD_AUDIO") == 0;
        boolean z3 = z7.c(this.a, "android.permission.CAMERA") == 0;
        this.b.log("LocalMediaPermissionProvider", "call permissions state updated, audio: " + this.c + "->" + z2 + ", video: " + this.d + "->" + z3);
        if (this.c != z2) {
            this.c = z2;
            z = true;
        }
        if (this.d == z3) {
            return z;
        }
        this.d = z3;
        return true;
    }
}
