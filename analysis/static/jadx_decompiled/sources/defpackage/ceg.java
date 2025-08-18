package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class ceg extends fc9 {
    public final Context b;
    public final /* synthetic */ ee6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceg(ee6 ee6Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.c = ee6Var;
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.fc9, android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int i = fe6.a;
        ee6 ee6Var = this.c;
        Context context = this.b;
        int iB = ee6Var.b(context, i);
        int i2 = pe6.e;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = ee6Var.a(iB, context, "n");
            ee6Var.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
