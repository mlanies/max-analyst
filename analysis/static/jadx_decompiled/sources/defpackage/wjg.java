package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class wjg extends cdg {
    public final xr6 I0(oy9 oy9Var, String str, int i) {
        Parcel parcelG0 = G0();
        kgg.c(parcelG0, oy9Var);
        parcelG0.writeString(str);
        parcelG0.writeInt(i);
        Parcel parcelK = k(parcelG0, 2);
        xr6 xr6VarK0 = oy9.K0(parcelK.readStrongBinder());
        parcelK.recycle();
        return xr6VarK0;
    }

    public final xr6 J0(oy9 oy9Var, String str, int i, oy9 oy9Var2) {
        Parcel parcelG0 = G0();
        kgg.c(parcelG0, oy9Var);
        parcelG0.writeString(str);
        parcelG0.writeInt(i);
        kgg.c(parcelG0, oy9Var2);
        Parcel parcelK = k(parcelG0, 8);
        xr6 xr6VarK0 = oy9.K0(parcelK.readStrongBinder());
        parcelK.recycle();
        return xr6VarK0;
    }

    public final xr6 K0(oy9 oy9Var, String str, int i) {
        Parcel parcelG0 = G0();
        kgg.c(parcelG0, oy9Var);
        parcelG0.writeString(str);
        parcelG0.writeInt(i);
        Parcel parcelK = k(parcelG0, 4);
        xr6 xr6VarK0 = oy9.K0(parcelK.readStrongBinder());
        parcelK.recycle();
        return xr6VarK0;
    }

    public final xr6 L0(oy9 oy9Var, String str, boolean z, long j) {
        Parcel parcelG0 = G0();
        kgg.c(parcelG0, oy9Var);
        parcelG0.writeString(str);
        parcelG0.writeInt(z ? 1 : 0);
        parcelG0.writeLong(j);
        Parcel parcelK = k(parcelG0, 7);
        xr6 xr6VarK0 = oy9.K0(parcelK.readStrongBinder());
        parcelK.recycle();
        return xr6VarK0;
    }
}
