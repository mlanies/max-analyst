package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class zh8 implements Parcelable {
    public static final Parcelable.Creator<zh8> CREATOR = new uk7(13);
    public ResultReceiver a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
