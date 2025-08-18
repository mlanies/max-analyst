package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class iod extends a implements ok {
    public static final /* synthetic */ int O0 = 0;
    public final boolean K0;
    public final kad L0;
    public final Bundle M0;
    public final Integer N0;

    public iod(Context context, Looper looper, kad kadVar, Bundle bundle, ge6 ge6Var, he6 he6Var) {
        super(context, looper, 44, kadVar, ge6Var, he6Var);
        this.K0 = true;
        this.L0 = kadVar;
        this.M0 = bundle;
        this.N0 = (Integer) kadVar.Z;
    }

    @Override // defpackage.ok
    public final int g() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.ok
    public final boolean j() {
        return this.K0;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof heg ? (heg) iInterfaceQueryLocalInterface : new heg(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle n() {
        kad kadVar = this.L0;
        boolean zEquals = this.c.getPackageName().equals((String) kadVar.o);
        Bundle bundle = this.M0;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) kadVar.o);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String p() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String q() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void w() {
        e(new fd7(this));
    }

    public final void x(eeg eegVar) {
        boolean z = false;
        fp3.o(eegVar, "Expecting a valid ISignInCallbacks");
        try {
            Account account = (Account) this.L0.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? l8e.a(this.c).b() : null;
            Integer num = this.N0;
            fp3.n(num);
            veg vegVar = new veg(2, account, num.intValue(), googleSignInAccountB);
            heg hegVar = (heg) o();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(hegVar.e);
            int i = rdg.a;
            parcelObtain.writeInt(1);
            int iT = ay7.T(parcelObtain, 20293);
            ay7.X(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            ay7.P(parcelObtain, 2, vegVar, 0);
            ay7.W(parcelObtain, iT);
            parcelObtain.writeStrongBinder(eegVar.asBinder());
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                hegVar.d.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            try {
                xdg xdgVar = (xdg) eegVar;
                xdgVar.e.post(new i76(xdgVar, new qeg(1, new ph3(8, null), null), z, 29));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
