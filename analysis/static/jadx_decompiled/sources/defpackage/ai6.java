package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ai6 extends xtc {
    public final Handler a;
    public final boolean b;
    public volatile boolean c;

    public ai6(Handler handler, boolean z) {
        this.a = handler;
        this.b = z;
    }

    @Override // defpackage.xtc
    public final zl4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        boolean z = this.c;
        iz4 iz4Var = iz4.a;
        if (z) {
            return iz4Var;
        }
        Handler handler = this.a;
        bi6 bi6Var = new bi6(handler, runnable);
        Message messageObtain = Message.obtain(handler, bi6Var);
        messageObtain.obj = this;
        if (this.b) {
            messageObtain.setAsynchronous(true);
        }
        this.a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        if (!this.c) {
            return bi6Var;
        }
        this.a.removeCallbacks(bi6Var);
        return iz4Var;
    }

    @Override // defpackage.zl4
    public final void g() {
        this.c = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.c;
    }
}
