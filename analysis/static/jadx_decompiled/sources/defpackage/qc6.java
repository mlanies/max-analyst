package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class qc6 extends n3 {
    public IBinder X;
    public Scope[] Y;
    public Bundle Z;
    public final int a;
    public final int b;
    public final int c;
    public String o;
    public Account s0;
    public pe5[] t0;
    public pe5[] u0;
    public final boolean v0;
    public final int w0;
    public boolean x0;
    public final String y0;
    public static final Parcelable.Creator<qc6> CREATOR = new ufg(15);
    public static final Scope[] z0 = new Scope[0];
    public static final pe5[] A0 = new pe5[0];

    public qc6(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, pe5[] pe5VarArr, pe5[] pe5VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? z0 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        pe5[] pe5VarArr3 = A0;
        pe5[] pe5VarArr4 = pe5VarArr == null ? pe5VarArr3 : pe5VarArr;
        pe5VarArr3 = pe5VarArr2 != null ? pe5VarArr2 : pe5VarArr3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.o = "com.google.android.gms";
        } else {
            this.o = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = w4.d;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface rkgVar = iInterfaceQueryLocalInterface instanceof dr6 ? (dr6) iInterfaceQueryLocalInterface : new rkg(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (rkgVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        rkg rkgVar2 = (rkg) rkgVar;
                        Parcel parcelK = rkgVar2.k(rkgVar2.G0(), 2);
                        Account account3 = (Account) kgg.a(parcelK, Account.CREATOR);
                        parcelK.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.X = iBinder;
            account2 = account;
        }
        this.s0 = account2;
        this.Y = scopeArr2;
        this.Z = bundle2;
        this.t0 = pe5VarArr4;
        this.u0 = pe5VarArr3;
        this.v0 = z;
        this.w0 = i4;
        this.x0 = z2;
        this.y0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ufg.a(this, parcel, i);
    }
}
