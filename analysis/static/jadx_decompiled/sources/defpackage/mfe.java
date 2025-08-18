package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class mfe implements qj3, ifg {
    public Object a;

    public /* synthetic */ mfe(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        hm9.n(((cge) this.a).b, "Connection restored");
    }

    @Override // defpackage.ifg
    public Object r() {
        Context context = (Context) ((zig) ((ifg) this.a)).a.b;
        if (context == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        wg0.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        cgg cggVar = new cgg();
        new HashSet();
        context.getApplicationContext();
        return cggVar;
    }
}
