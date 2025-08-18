package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g9b extends dt6 {
    public static final Parcelable.Creator<g9b> CREATOR = new e9b(1);
    public final String b;
    public final byte[] c;

    public g9b(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g9b.class != obj.getClass()) {
            return false;
        }
        g9b g9bVar = (g9b) obj;
        return oaf.a(this.b, g9bVar.b) && Arrays.equals(this.c, g9bVar.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.dt6
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public g9b(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = oaf.a;
        this.b = string;
        this.c = parcel.createByteArray();
    }
}
