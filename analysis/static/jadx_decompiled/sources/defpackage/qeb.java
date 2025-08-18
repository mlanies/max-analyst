package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qeb implements Parcelable {
    public static final Parcelable.Creator<qeb> CREATOR;
    public static final /* synthetic */ v25 X;
    public static final o84 b;
    public static final qeb c;
    public static final /* synthetic */ qeb[] o;
    public final String a;

    static {
        qeb qebVar = new qeb("CREATE", 0, "create");
        c = qebVar;
        qeb[] qebVarArr = {qebVar, new qeb("EDIT", 1, "edit")};
        o = qebVarArr;
        X = new v25(qebVarArr);
        b = new o84(15);
        CREATOR = new e9b(6);
    }

    public qeb(String str, int i, String str2) {
        this.a = str2;
    }

    public static qeb valueOf(String str) {
        return (qeb) Enum.valueOf(qeb.class, str);
    }

    public static qeb[] values() {
        return (qeb[]) o.clone();
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
