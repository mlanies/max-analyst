package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class bn0 {
    public final Context a;

    public bn0(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }
}
