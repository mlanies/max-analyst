package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class dl7 implements Parcelable {
    public static final Parcelable.Creator<dl7> CREATOR = new uk7(0);
    public final long a;
    public final long b;
    public final long c;
    public final long o;

    public dl7(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkData{chatId=");
        sb.append(this.a);
        sb.append(", messageServerId=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", stickerSetId=");
        return z7b.i(sb, this.o, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.o);
    }

    public dl7(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.o = parcel.readLong();
    }
}
