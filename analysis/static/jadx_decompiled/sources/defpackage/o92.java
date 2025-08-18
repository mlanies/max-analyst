package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o92 implements Parcelable, qu0 {
    public static final Parcelable.Creator<o92> CREATOR;
    public static final /* synthetic */ v25 X;
    public static final oz7 b;
    public static final o92 c;
    public static final /* synthetic */ o92[] o;
    public final String a;

    static {
        o92 o92Var = new o92("LOCAL_ID", 0, "local");
        c = o92Var;
        o92[] o92VarArr = {o92Var, new o92("SERVER_ID", 1, "server")};
        o = o92VarArr;
        X = new v25(o92VarArr);
        b = new oz7();
        CREATOR = new d6(23);
    }

    public o92(String str, int i, String str2) {
        this.a = str2;
    }

    public static o92 valueOf(String str) {
        return (o92) Enum.valueOf(o92.class, str);
    }

    public static o92[] values() {
        return (o92[]) o.clone();
    }

    @Override // defpackage.qu0
    public final Object a(String str) {
        b.getClass();
        return oz7.j(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
