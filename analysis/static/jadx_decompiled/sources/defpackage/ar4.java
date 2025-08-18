package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ar4 implements Parcelable {
    public static final Parcelable.Creator<ar4> CREATOR = new f73(14);
    public final byte[] X;
    public int a;
    public final UUID b;
    public final String c;
    public final String o;

    public ar4(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.o = str2;
        this.X = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = bw0.a;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ar4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ar4 ar4Var = (ar4) obj;
        return maf.a(this.c, ar4Var.c) && maf.a(this.o, ar4Var.o) && maf.a(this.b, ar4Var.b) && Arrays.equals(this.X, ar4Var.X);
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

    public ar4(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        int i = maf.a;
        this.o = string;
        this.X = parcel.createByteArray();
    }
}
