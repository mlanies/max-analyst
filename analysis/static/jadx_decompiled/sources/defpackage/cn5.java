package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cn5 implements Parcelable {
    public static final Parcelable.Creator<cn5> CREATOR = new f73(21);
    public int a;
    public int b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState{mAnchorPosition=");
        sb.append(this.a);
        sb.append(", mAnchorOffset=");
        return au1.h(sb, this.b, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
