package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rdb implements Parcelable {
    public static final Parcelable.Creator<rdb> CREATOR;
    public static final /* synthetic */ rdb[] X;
    public static final /* synthetic */ v25 Y;
    public static final sp3 b;
    public static final rdb c;
    public static final rdb o;
    public final String a;

    static {
        rdb rdbVar = new rdb("SETUP_NEW_ADMIN", 0, "setup_new_admin");
        c = rdbVar;
        rdb rdbVar2 = new rdb("CHANGE_ADMIN", 1, "change_admin");
        o = rdbVar2;
        rdb[] rdbVarArr = {rdbVar, rdbVar2};
        X = rdbVarArr;
        Y = new v25(rdbVarArr);
        b = new sp3();
        CREATOR = new e9b(5);
    }

    public rdb(String str, int i, String str2) {
        this.a = str2;
    }

    public static rdb valueOf(String str) {
        return (rdb) Enum.valueOf(rdb.class, str);
    }

    public static rdb[] values() {
        return (rdb[]) X.clone();
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
