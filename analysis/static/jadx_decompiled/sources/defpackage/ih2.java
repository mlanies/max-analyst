package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ih2 implements Parcelable {
    public static final Parcelable.Creator<ih2> CREATOR;
    public static final ih2 a;
    public static final ih2 b;
    public static final /* synthetic */ ih2[] c;
    public static final /* synthetic */ v25 o;

    static {
        ih2 ih2Var = new ih2("MEDIA", 0);
        a = ih2Var;
        ih2 ih2Var2 = new ih2("FILE", 1);
        ih2 ih2Var3 = new ih2("LINK", 2);
        ih2 ih2Var4 = new ih2("AUDIO", 3);
        b = ih2Var4;
        ih2[] ih2VarArr = {ih2Var, ih2Var2, ih2Var3, ih2Var4};
        c = ih2VarArr;
        o = new v25(ih2VarArr);
        CREATOR = new d6(24);
    }

    public static ih2 valueOf(String str) {
        return (ih2) Enum.valueOf(ih2.class, str);
    }

    public static ih2[] values() {
        return (ih2[]) c.clone();
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
