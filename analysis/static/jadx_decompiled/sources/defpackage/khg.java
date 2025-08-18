package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class khg extends n3 {
    public static final Parcelable.Creator<khg> CREATOR = new ufg(7);
    public final String X;
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent o;

    public khg(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.o = pendingIntent;
        this.X = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.O(parcel, 2, this.b);
        ay7.O(parcel, 3, this.c);
        ay7.P(parcel, 4, this.o, i);
        ay7.Q(parcel, 6, this.X);
        ay7.W(parcel, iT);
    }
}
