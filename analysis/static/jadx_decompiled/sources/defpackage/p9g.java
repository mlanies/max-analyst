package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class p9g implements uw4 {
    public final Context a;

    public p9g(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context;
                break;
        }
    }

    @Override // defpackage.uw4
    public void a(tu0 tu0Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new pd3(0, "EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new f5(this, tu0Var, threadPoolExecutor, 27));
    }
}
