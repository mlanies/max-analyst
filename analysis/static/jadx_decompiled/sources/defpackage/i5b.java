package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i5b extends n3 {
    public static final Parcelable.Creator<i5b> CREATOR = new ufg(20);
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final List a;
    public float b;
    public int c;
    public final float o;
    public final ez1 s0;
    public final ez1 t0;
    public int u0;
    public final List v0;
    public final List w0;

    public i5b() {
        this.b = 10.0f;
        this.c = -16777216;
        this.o = 0.0f;
        this.X = true;
        this.Y = false;
        this.Z = false;
        this.s0 = new bv0();
        this.t0 = new bv0();
        this.u0 = 0;
        this.v0 = null;
        this.w0 = new ArrayList();
        this.a = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.S(parcel, this.a, 2);
        float f = this.b;
        ay7.X(parcel, 3, 4);
        parcel.writeFloat(f);
        int i2 = this.c;
        ay7.X(parcel, 4, 4);
        parcel.writeInt(i2);
        ay7.X(parcel, 5, 4);
        parcel.writeFloat(this.o);
        ay7.X(parcel, 6, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ay7.X(parcel, 7, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        ay7.X(parcel, 8, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        ay7.P(parcel, 9, this.s0.b(), i);
        ay7.P(parcel, 10, this.t0.b(), i);
        int i3 = this.u0;
        ay7.X(parcel, 11, 4);
        parcel.writeInt(i3);
        ay7.S(parcel, this.v0, 12);
        List<pae> list = this.w0;
        ArrayList arrayList = new ArrayList(list.size());
        for (pae paeVar : list) {
            mae maeVar = paeVar.a;
            float f2 = maeVar.a;
            Pair pair = new Pair(Integer.valueOf(maeVar.b), Integer.valueOf(maeVar.c));
            arrayList.add(new pae(new mae(this.b, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.X, maeVar.X), paeVar.b));
        }
        ay7.S(parcel, arrayList, 13);
        ay7.W(parcel, iT);
    }

    public i5b(ArrayList arrayList, float f, int i, float f2, boolean z, boolean z2, boolean z3, ez1 ez1Var, ez1 ez1Var2, int i2, ArrayList arrayList2, ArrayList arrayList3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.o = 0.0f;
        this.X = true;
        this.Y = false;
        this.Z = false;
        this.s0 = new bv0();
        this.t0 = new bv0();
        this.u0 = 0;
        this.v0 = null;
        this.w0 = new ArrayList();
        this.a = arrayList;
        this.b = f;
        this.c = i;
        this.o = f2;
        this.X = z;
        this.Y = z2;
        this.Z = z3;
        if (ez1Var != null) {
            this.s0 = ez1Var;
        }
        if (ez1Var2 != null) {
            this.t0 = ez1Var2;
        }
        this.u0 = i2;
        this.v0 = arrayList2;
        if (arrayList3 != null) {
            this.w0 = arrayList3;
        }
    }
}
