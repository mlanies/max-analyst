package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ci6 extends ztc {
    public final Handler c;
    public final boolean d = true;

    public ci6(Handler handler) {
        this.c = handler;
    }

    @Override // defpackage.ztc
    public final xtc a() {
        return new ai6(this.c, this.d);
    }

    @Override // defpackage.ztc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.c;
        bi6 bi6Var = new bi6(handler, runnable);
        Message messageObtain = Message.obtain(handler, bi6Var);
        if (this.d) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return bi6Var;
    }
}
