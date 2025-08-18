package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class vs6 implements c99 {
    public static final Parcelable.Creator<vs6> CREATOR = new dj6(7);
    public final byte[] a;
    public final String b;
    public final String c;

    public vs6(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vs6.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((vs6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.c99
    public final void p(dd8 dd8Var) {
        String str = this.b;
        if (str != null) {
            dd8Var.a = str;
        }
    }

    public final String toString() {
        return "ICY: title=\"" + this.b + "\", url=\"" + this.c + "\", rawMetadata.length=\"" + this.a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public vs6(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.a = bArrCreateByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
