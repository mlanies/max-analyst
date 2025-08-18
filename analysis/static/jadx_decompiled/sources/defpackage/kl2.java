package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public enum kl2 implements Parcelable {
    DEFAULT,
    /* JADX INFO: Fake field, exist only in values array */
    SCHEDULED_SEND;

    public static final Parcelable.Creator<kl2> CREATOR;
    public static final lq9 b;
    public final khe a = new khe(new md1(12, this));

    static {
        xxc xxcVar = mg4.o;
        b = new lq9();
        CREATOR = new d6(25);
    }

    kl2() {
        name().substring(0, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
