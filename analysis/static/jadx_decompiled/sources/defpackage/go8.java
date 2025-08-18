package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class go8 implements Parcelable {
    public static final Parcelable.Creator<go8> CREATOR = new uk7(16);
    public final long a;
    public final ek2 b;
    public final boolean c;
    public final Integer o;

    public /* synthetic */ go8(long j, ek2 ek2Var, Integer num, int i) {
        this(j, ek2Var, true, (i & 8) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go8)) {
            return false;
        }
        go8 go8Var = (go8) obj;
        return this.a == go8Var.a && this.b == go8Var.b && this.c == go8Var.c && tpa.f(this.o, go8Var.o);
    }

    public final int hashCode() {
        int iD = ms2.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        Integer num = this.o;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MembersListArgs(chatId=" + this.a + ", chatMemberType=" + this.b + ", isLongClickEnabled=" + this.c + ", memberLimit=" + this.o + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeLong(this.a);
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        Integer num = this.o;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public go8(long j, ek2 ek2Var, boolean z, Integer num) {
        this.a = j;
        this.b = ek2Var;
        this.c = z;
        this.o = num;
    }
}
