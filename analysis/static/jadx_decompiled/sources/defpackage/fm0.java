package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fm0 extends dt6 {
    public static final Parcelable.Creator<fm0> CREATOR = new d6(13);
    public final byte[] b;

    public fm0(byte[] bArr, String str) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fm0.class != obj.getClass()) {
            return false;
        }
        fm0 fm0Var = (fm0) obj;
        return this.a.equals(fm0Var.a) && Arrays.equals(this.b, fm0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + rh4.d(527, 31, this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fm0(Parcel parcel) {
        String string = parcel.readString();
        int i = oaf.a;
        super(string);
        this.b = parcel.createByteArray();
    }
}
