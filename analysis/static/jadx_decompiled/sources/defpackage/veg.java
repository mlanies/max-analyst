package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class veg extends n3 {
    public static final Parcelable.Creator<veg> CREATOR = new vqf(11);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount o;

    public veg(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.o = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.P(parcel, 2, this.b, i);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(this.c);
        ay7.P(parcel, 4, this.o, i);
        ay7.W(parcel, iT);
    }
}
