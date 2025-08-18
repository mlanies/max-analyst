package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class aia implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        Handler handler = cia.a;
        bia biaVar = (bia) message.obj;
        AtomicBoolean atomicBoolean = cia.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (tpa.f(cia.b, biaVar) || tpa.f(cia.c, biaVar)) {
                cia.a(biaVar, yha.a);
            }
            atomicBoolean.set(false);
        }
        return true;
    }
}
