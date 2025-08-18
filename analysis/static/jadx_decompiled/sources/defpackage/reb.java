package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class reb implements Parcelable {
    public static final Parcelable.Creator<reb> CREATOR;
    public static final /* synthetic */ reb[] X;
    public static final /* synthetic */ v25 Y;
    public static final vu4 b;
    public static final reb c;
    public static final reb o;
    public final String a;

    static {
        reb rebVar = new reb("LOCAL_CHAT", 0, "local_chat");
        c = rebVar;
        reb rebVar2 = new reb("SERVER_CHAT", 1, "server_chat");
        reb rebVar3 = new reb("CONTACT", 2, "contact");
        o = rebVar3;
        reb[] rebVarArr = {rebVar, rebVar2, rebVar3};
        X = rebVarArr;
        Y = new v25(rebVarArr);
        b = new vu4();
        CREATOR = new e9b(7);
    }

    public reb(String str, int i, String str2) {
        this.a = str2;
    }

    public static reb valueOf(String str) {
        return (reb) Enum.valueOf(reb.class, str);
    }

    public static reb[] values() {
        return (reb[]) X.clone();
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
