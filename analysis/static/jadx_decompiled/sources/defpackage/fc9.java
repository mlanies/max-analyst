package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class fc9 extends Handler {
    public final /* synthetic */ int a;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        switch (this.a) {
            case 0:
                ec9 ec9Var = (ec9) message.obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    ec9Var.a.getClass();
                    return;
                }
                sx sxVar = ec9Var.a;
                Object obj = ec9Var.b[0];
                if (sxVar.o.get()) {
                    countDownLatch = sxVar.Y;
                    try {
                        rgg rggVar = sxVar.Z;
                        if (rggVar.i == sxVar) {
                            SystemClock.uptimeMillis();
                            rggVar.i = null;
                            rggVar.b();
                        }
                        countDownLatch.countDown();
                    } finally {
                        countDownLatch.countDown();
                    }
                } else {
                    try {
                        rgg rggVar2 = sxVar.Z;
                        if (rggVar2.h != sxVar) {
                            if (rggVar2.i == sxVar) {
                                SystemClock.uptimeMillis();
                                rggVar2.i = null;
                                rggVar2.b();
                            }
                        } else if (!rggVar2.d) {
                            SystemClock.uptimeMillis();
                            rggVar2.h = null;
                            mo7 mo7Var = rggVar2.b;
                            if (mo7Var != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    mo7Var.k(obj);
                                } else {
                                    mo7Var.i(obj);
                                }
                            }
                        }
                    } finally {
                        countDownLatch = sxVar.Y;
                    }
                }
                sxVar.c = 3;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc9(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc9(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc9(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
