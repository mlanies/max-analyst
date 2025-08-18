package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ws6 implements d99 {
    public static final Parcelable.Creator<ws6> CREATOR = new dj6(8);
    public final byte[] a;
    public final String b;
    public final String c;

    public ws6(String str, String str2, byte[] bArr) {
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
        if (obj == null || ws6.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((ws6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.b + "\", url=\"" + this.c + "\", rawMetadata.length=\"" + this.a.length + "\"";
    }

    @Override // defpackage.d99
    public final void w(ed8 ed8Var) {
        String str = this.b;
        if (str != null) {
            ed8Var.a = str;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public ws6(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.a = bArrCreateByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
