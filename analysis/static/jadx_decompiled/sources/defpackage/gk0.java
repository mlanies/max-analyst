package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class gk0 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            au1.r(message.obj);
            throw null;
        }
        if (i != 1) {
            return false;
        }
        au1.r(message.obj);
        throw null;
    }
}
