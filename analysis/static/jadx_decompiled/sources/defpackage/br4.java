package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class br4 implements Parcelable {
    public static final Parcelable.Creator<br4> CREATOR = new f73(15);
    public final byte[] X;
    public int a;
    public final UUID b;
    public final String c;
    public final String o;

    public br4(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.o = ia9.l(str2);
        this.X = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = ew0.a;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof br4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        br4 br4Var = (br4) obj;
        return oaf.a(this.c, br4Var.c) && oaf.a(this.o, br4Var.o) && oaf.a(this.b, br4Var.b) && Arrays.equals(this.X, br4Var.X);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.X) + rh4.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.o);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public br4(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        int i = oaf.a;
        this.o = string;
        this.X = parcel.createByteArray();
    }
}
