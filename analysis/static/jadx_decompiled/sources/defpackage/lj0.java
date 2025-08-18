package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class lj0 extends fc9 {
    @Override // defpackage.fc9, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", zr6.h(i, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).Q(Status.s0);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        au1.r(pair.first);
        try {
            throw null;
        } catch (RuntimeException e) {
            yu0 yu0Var = BasePendingResult.n;
            throw e;
        }
    }
}
