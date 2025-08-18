package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hdb implements Parcelable, qu0 {
    public static final Parcelable.Creator<hdb> CREATOR;
    public static final hdb X;
    public static final /* synthetic */ hdb[] Y;
    public static final /* synthetic */ v25 Z;
    public static final dp3 b;
    public static final hdb c;
    public static final hdb o;
    public final String a;

    static {
        hdb hdbVar = new hdb("LOCAL_CHAT", 0, "local_chat");
        c = hdbVar;
        hdb hdbVar2 = new hdb("SERVER_CHAT", 1, "server_chat");
        o = hdbVar2;
        hdb hdbVar3 = new hdb("CONTACT", 2, "contact");
        X = hdbVar3;
        hdb[] hdbVarArr = {hdbVar, hdbVar2, hdbVar3};
        Y = hdbVarArr;
        Z = new v25(hdbVarArr);
        b = new dp3();
        CREATOR = new e9b(4);
    }

    public hdb(String str, int i, String str2) {
        this.a = str2;
    }

    public static hdb valueOf(String str) {
        return (hdb) Enum.valueOf(hdb.class, str);
    }

    public static hdb[] values() {
        return (hdb[]) Y.clone();
    }

    @Override // defpackage.qu0
    public final Object a(String str) {
        b.getClass();
        return dp3.c(str);
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
