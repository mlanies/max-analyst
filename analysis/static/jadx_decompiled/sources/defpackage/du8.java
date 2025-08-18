package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class du8 implements Parcelable {
    public static final Parcelable.Creator<du8> CREATOR = new uk7(17);
    public final cu8 a;

    public du8(cu8 cu8Var) {
        this.a = cu8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cu8 cu8Var = this.a;
        parcel.writeByte(cu8Var == null ? (byte) 1 : (byte) 0);
        if (cu8Var != null) {
            parcel.writeLong(cu8Var.b);
            parcel.writeLong(cu8Var.c);
            parcel.writeLong(cu8Var.o);
            parcel.writeLong(cu8Var.X);
            parcel.writeLong(cu8Var.Y);
            parcel.writeLong(cu8Var.Z);
            f8.H(parcel, cu8Var.s0);
            parcel.writeLong(cu8Var.t0);
            parcel.writeInt(cu8Var.u0.a);
            parcel.writeInt(cu8Var.v0.a);
            parcel.writeLong(cu8Var.w0);
            f8.H(parcel, cu8Var.x0);
            f8.H(parcel, cu8Var.y0);
            k8g k8gVar = cu8Var.z0;
            byte[] byteArray = k8gVar != null ? qw8.toByteArray(b.f(k8gVar)) : null;
            byte b = byteArray != null ? (byte) 1 : (byte) 0;
            parcel.writeByte(b);
            if (b != 0) {
                parcel.writeInt(byteArray.length);
                parcel.writeByteArray(byteArray);
            }
            parcel.writeInt(cu8Var.F0);
            parcel.writeLong(cu8Var.B0);
            parcel.writeInt(cu8Var.A0);
            parcel.writeParcelable(new du8(cu8Var.C0), 0);
            parcel.writeString(cu8Var.D0);
            parcel.writeString(cu8Var.E0);
            parcel.writeByte(cu8Var.G0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(cu8Var.H0);
            parcel.writeInt(cu8Var.I0);
            parcel.writeInt(ey8.e(cu8Var.V0));
            parcel.writeLong(cu8Var.J0);
            parcel.writeLong(cu8Var.K0);
            parcel.writeParcelable(new du8(cu8Var.L0), 0);
            parcel.writeInt(cu8Var.M0);
            parcel.writeLong(cu8Var.N0);
            parcel.writeInt(cu8Var.O0);
            parcel.writeInt(cu8Var.P0);
            parcel.writeLong(cu8Var.Q0);
            List list = cu8Var.R0;
            byte[] bArrB = list != null ? ou8.b(list) : null;
            byte b2 = bArrB == null ? (byte) 0 : (byte) 1;
            parcel.writeByte(b2);
            if (b2 != 0) {
                parcel.writeInt(bArrB.length);
                parcel.writeByteArray(bArrB);
            }
            parcel.writeByte(cu8Var.o() ? (byte) 1 : (byte) 0);
            if (cu8Var.o()) {
                ng4 ng4Var = cu8Var.T0;
                parcel.writeLong(ng4Var.a);
                parcel.writeByte(ng4Var.b ? (byte) 1 : (byte) 0);
            }
        }
    }

    public du8(Parcel parcel) throws ProtoException {
        byte[] bArr;
        byte[] bArr2;
        ArrayList arrayListA;
        du8 du8Var;
        ArrayList arrayList;
        long j;
        ng4 ng4Var;
        if (!f8.w(parcel)) {
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            long j5 = parcel.readLong();
            long j6 = parcel.readLong();
            long j7 = parcel.readLong();
            String strX = f8.x(parcel);
            long j8 = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            long j9 = parcel.readLong();
            String strX2 = f8.x(parcel);
            String strX3 = f8.x(parcel);
            if (parcel.readByte() == 1) {
                bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
            } else {
                bArr = null;
            }
            k8g k8gVarB = iz7.b(bArr);
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            long j10 = parcel.readLong();
            du8 du8Var2 = (du8) parcel.readParcelable(du8.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readByte() == 1;
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            long j11 = parcel.readLong();
            long j12 = parcel.readLong();
            du8 du8Var3 = (du8) parcel.readParcelable(du8.class.getClassLoader());
            int i8 = parcel.readInt();
            long j13 = parcel.readLong();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            long j14 = parcel.readLong();
            boolean z2 = z;
            if (parcel.readByte() == 1) {
                bArr2 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr2);
            } else {
                bArr2 = null;
            }
            if (bArr2 != null) {
                try {
                    Protos.MessageElements messageElements = new Protos.MessageElements();
                    qw8.mergeFrom(messageElements, bArr2);
                    arrayListA = ou8.a(messageElements.elements);
                } catch (Exception unused) {
                }
            } else {
                arrayListA = null;
            }
            if (parcel.readByte() == 1) {
                try {
                    du8Var = du8Var2;
                    try {
                        arrayList = arrayListA;
                        try {
                            j = j4;
                            try {
                                ng4Var = new ng4(parcel.readLong(), parcel.readByte() == 1);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        arrayList = arrayListA;
                    }
                } catch (Exception unused5) {
                }
            } else {
                arrayList = arrayListA;
                du8Var = du8Var2;
                j = j4;
                ng4Var = null;
            }
            ix8 ix8Var = new ix8(Collections.emptyList(), 0, null);
            iu8.b.getClass();
            iu8 iu8VarN = oz7.n(i);
            vx8[] vx8VarArrValues = vx8.values();
            int length = vx8VarArrValues.length;
            int i11 = 0;
            while (i11 < length) {
                vx8 vx8Var = vx8VarArrValues[i11];
                vx8[] vx8VarArr = vx8VarArrValues;
                if (vx8Var.a == i2) {
                    this.a = new cu8(j2, j3, j8, j, j5, j6, j7, strX, iu8VarN, vx8Var, j9, strX2, strX3, k8gVarB, i3, i4, j10, du8Var.a, string, string2, z2, i5, i6, ey8.a(i7), j11, j12, du8Var3.a, i8, j13, i9, i10, j14, arrayList, ix8Var, ng4Var);
                    return;
                } else {
                    i11++;
                    vx8VarArrValues = vx8VarArr;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        this.a = null;
    }
}
