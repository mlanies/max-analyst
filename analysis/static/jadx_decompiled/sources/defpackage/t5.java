package defpackage;

import java.io.Serializable;
import ru.ok.messages.contacts.profile.ActContactAvatars;

/* loaded from: classes2.dex */
public final /* synthetic */ class t5 implements f6 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ t5(dq0 dq0Var, long j, eq0 eq0Var) {
        this.c = dq0Var;
        this.b = j;
        this.d = eq0Var;
    }

    @Override // defpackage.f6
    public final void run() {
        long j = this.b;
        Serializable serializable = this.d;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                int i = ActContactAvatars.h1;
                String str = (String) serializable;
                ((el3) ((y8a) ((ed3) ((ActContactAvatars) obj).K0.b)).getAccessor().c(el3.class)).d(j, str, str);
                break;
            default:
                dq0 dq0Var = (dq0) obj;
                dq0Var.getClass();
                eq0 eq0Var = (eq0) serializable;
                boolean zD = nd7.D(eq0Var.a);
                zi5 zi5Var = dq0Var.a;
                if (!zD) {
                    if (!pag.K(((kk5) zi5Var).e(j), eq0Var)) {
                        hm9.m("dq0", "Failed to store botCommands, chatId = %d", Long.valueOf(j));
                        break;
                    }
                } else {
                    try {
                        ((kk5) zi5Var).e(j).delete();
                        break;
                    } catch (Exception unused) {
                        hm9.m("dq0", "deleteBotCommandsForChat: exception when delete botCommands for, chatId = %d", Long.valueOf(j));
                        return;
                    }
                }
                break;
        }
    }

    public /* synthetic */ t5(ActContactAvatars actContactAvatars, String str, long j) {
        this.c = actContactAvatars;
        this.d = str;
        this.b = j;
    }
}
