package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ie0 implements Parcelable {
    public static final Parcelable.Creator<ie0> CREATOR = new d6(8);
    public final int X;
    public final String Y;
    public final int Z;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] o;
    public final int s0;
    public final CharSequence t0;
    public final int u0;
    public final CharSequence v0;
    public final ArrayList w0;
    public final ArrayList x0;
    public final boolean y0;

    public ie0(he0 he0Var) {
        int size = he0Var.a.size();
        this.a = new int[size * 6];
        if (!he0Var.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.o = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            v16 v16Var = (v16) he0Var.a.get(i2);
            int i3 = i + 1;
            this.a[i] = v16Var.a;
            ArrayList arrayList = this.b;
            a aVar = v16Var.b;
            arrayList.add(aVar != null ? aVar.Y : null);
            int[] iArr = this.a;
            iArr[i3] = v16Var.c ? 1 : 0;
            iArr[i + 2] = v16Var.d;
            iArr[i + 3] = v16Var.e;
            int i4 = i + 5;
            iArr[i + 4] = v16Var.f;
            i += 6;
            iArr[i4] = v16Var.g;
            this.c[i2] = v16Var.h.ordinal();
            this.o[i2] = v16Var.i.ordinal();
        }
        this.X = he0Var.f;
        this.Y = he0Var.h;
        this.Z = he0Var.s;
        this.s0 = he0Var.i;
        this.t0 = he0Var.j;
        this.u0 = he0Var.k;
        this.v0 = he0Var.l;
        this.w0 = he0Var.m;
        this.x0 = he0Var.n;
        this.y0 = he0Var.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.o);
        parcel.writeInt(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.s0);
        TextUtils.writeToParcel(this.t0, parcel, 0);
        parcel.writeInt(this.u0);
        TextUtils.writeToParcel(this.v0, parcel, 0);
        parcel.writeStringList(this.w0);
        parcel.writeStringList(this.x0);
        parcel.writeInt(this.y0 ? 1 : 0);
    }

    public ie0(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.o = parcel.createIntArray();
        this.X = parcel.readInt();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.s0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.t0 = (CharSequence) creator.createFromParcel(parcel);
        this.u0 = parcel.readInt();
        this.v0 = (CharSequence) creator.createFromParcel(parcel);
        this.w0 = parcel.createStringArrayList();
        this.x0 = parcel.createStringArrayList();
        this.y0 = parcel.readInt() != 0;
    }
}
