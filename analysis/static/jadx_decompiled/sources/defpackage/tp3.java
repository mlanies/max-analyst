package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.tamtam.nano.ProtoException;

/* loaded from: classes2.dex */
public final class tp3 implements Parcelable {
    public static final Parcelable.Creator<tp3> CREATOR = new f73(3);
    public final uj3 a;

    public tp3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        uj3 uj3Var = this.a;
        parcel.writeByte(uj3Var == null ? (byte) 1 : (byte) 0);
        if (uj3Var != null) {
            ql3 ql3Var = uj3Var.a;
            parcel.writeLong(ql3Var.b);
            byte[] bArrD = ql3Var.c.d();
            byte b = bArrD != null ? (byte) 1 : (byte) 0;
            parcel.writeByte(b);
            if (b != 0) {
                parcel.writeInt(bArrD.length);
                parcel.writeByteArray(bArrD);
            }
            parcel.writeParcelable(new x7b(ql3Var.o), i);
            parcel.writeByte(uj3Var.Y ? (byte) 1 : (byte) 0);
        }
    }

    public tp3(Parcel parcel) {
        try {
            byte[] bArr = null;
            if (!f8.w(parcel)) {
                long j = parcel.readLong();
                boolean z = true;
                if (parcel.readByte() == 1) {
                    bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                }
                pl3 pl3VarB = pl3.b(bArr);
                x7b x7bVar = (x7b) parcel.readParcelable(x7b.class.getClassLoader());
                if (parcel.readByte() != 1) {
                    z = false;
                }
                ql3 ql3Var = new ql3(j, pl3VarB, x7bVar.a);
                jke.a().getClass();
                this.a = new uj3(ql3Var, z, ((jyc) jke.b()).o());
                return;
            }
            this.a = null;
        } catch (ProtoException e) {
            throw new IllegalStateException(e);
        }
    }
}
