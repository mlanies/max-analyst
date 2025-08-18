package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f9b extends ct6 {
    public static final Parcelable.Creator<f9b> CREATOR = new e9b(0);
    public final String b;
    public final byte[] c;

    public f9b(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f9b.class != obj.getClass()) {
            return false;
        }
        f9b f9bVar = (f9b) obj;
        return maf.a(this.b, f9bVar.b) && Arrays.equals(this.c, f9bVar.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ct6
    public final String toString() {
        String str = this.a;
        int iE = rh4.e(8, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public f9b(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = maf.a;
        this.b = string;
        this.c = parcel.createByteArray();
    }
}
