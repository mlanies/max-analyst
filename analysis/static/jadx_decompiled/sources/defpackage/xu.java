package defpackage;

import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final /* synthetic */ class xu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;
    public final /* synthetic */ vk6 c;

    public /* synthetic */ xu(tf2 tf2Var, es8 es8Var, int i) {
        this.a = i;
        this.b = tf2Var;
        this.c = es8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vk6 vk6Var = this.c;
                tf2 tf2Var = this.b;
                tf2Var.getClass();
                try {
                    tf2Var.b.b(vk6Var);
                    break;
                } catch (Throwable th) {
                    hm9.p(tf2Var.a, "addHistoryItem: exception", th);
                    tf2Var.Y.a(new HandledException(th));
                    return;
                }
            default:
                vk6 vk6Var2 = this.c;
                tf2 tf2Var2 = this.b;
                tf2Var2.getClass();
                try {
                    tf2Var2.b.r(vk6Var2);
                    break;
                } catch (Throwable th2) {
                    hm9.p(tf2Var2.a, "updateHistoryItemSync: exception", th2);
                    tf2Var2.Y.a(new HandledException(th2));
                }
        }
    }
}
