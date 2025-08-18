package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class xw8 implements Parcelable {
    public static final Parcelable.Creator<xw8> CREATOR = new uk7(19);
    public final es8 a;

    public xw8(es8 es8Var) {
        this.a = es8Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        es8 es8Var = this.a;
        parcel.writeByte(es8Var == null ? (byte) 1 : (byte) 0);
        if (es8Var != null) {
            parcel.writeParcelable(new du8(es8Var.a), i);
            parcel.writeParcelable(new tp3(es8Var.b), i);
            parcel.writeParcelable(new ew8(es8Var.c), i);
            parcel.writeParcelable(new xw8(es8Var.o), i);
        }
    }

    public xw8(Parcel parcel) {
        if (!f8.w(parcel)) {
            cu8 cu8Var = ((du8) parcel.readParcelable(du8.class.getClassLoader())).a;
            uj3 uj3Var = ((tp3) parcel.readParcelable(tp3.class.getClassLoader())).a;
            bw8 bw8Var = ((ew8) parcel.readParcelable(ew8.class.getClassLoader())).a;
            xw8 xw8Var = (xw8) parcel.readParcelable(xw8.class.getClassLoader());
            jke.a().getClass();
            jyc jycVar = (jyc) jke.b();
            this.a = new es8(cu8Var, uj3Var, bw8Var, xw8Var.a, ((t6b) jycVar.getAccessor().c(t6b.class)).c(cu8Var), (sw8) jycVar.getAccessor().c(sw8.class), (zx8) jycVar.getAccessor().c(zx8.class), (lr2) jycVar.getAccessor().c(lr2.class));
            return;
        }
        this.a = null;
    }
}
