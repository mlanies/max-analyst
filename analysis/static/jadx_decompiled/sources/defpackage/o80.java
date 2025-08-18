package defpackage;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class o80 extends AbstractAccountAuthenticator {
    public final Context a;
    public final z4 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public o80(Context context, z4 z4Var, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        super(context);
        this.a = context;
        this.b = z4Var;
        this.c = je7Var;
        this.d = je7Var2;
        this.e = je7Var3;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (((b5) this.c.getValue()).a() != null) {
            this.b.getClass();
            bundle2.putInt("errorCode", 1029);
            bundle2.putString("errorMessage", this.a.getString(f1c.account_already_exists));
        }
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) throws NetworkErrorException {
        hm9.n("o80", "getAccountRemovalAllowed");
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
        je7 je7Var = this.d;
        if (((f5a) je7Var.getValue()).d() && accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            boolean zE = ((f5a) je7Var.getValue()).e();
            int i = t8d.o;
            s8g s8gVar = (s8g) this.e.getValue();
            int i2 = ft4.o;
            t8d.c = z7.S(System.nanoTime(), kt4.NANOSECONDS);
            s8gVar.a(new t8d(zE));
        }
        return accountRemovalAllowed;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        ((b5) this.c.getValue()).getClass();
        return new Bundle();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final String getAuthTokenLabel(String str) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return null;
    }
}
