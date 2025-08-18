package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class b5 {
    public static final /* synthetic */ int c = 0;
    public final z4 a;
    public final khe b;

    public b5(Context context, z4 z4Var) {
        this.a = z4Var;
        this.b = new khe(new a5(context, 0));
    }

    public final Account a() {
        Object njcVar;
        try {
            njcVar = (Account) ys.f0(0, ((AccountManager) this.b.getValue()).getAccountsByType(this.a.a));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        return (Account) njcVar;
    }

    public final void b() {
        hm9.n("b5", "removeAccount start");
        Account accountA = a();
        if (accountA != null) {
            try {
                ((AccountManager) this.b.getValue()).removeAccountExplicitly(accountA);
            } catch (Throwable th) {
                hm9.p("b5", "removeAccountExplicitly failed!", th);
            }
        }
        hm9.n("b5", "removeAccount finished!");
    }
}
