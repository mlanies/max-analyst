package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rl2 implements Parcelable {
    public static final Parcelable.Creator<rl2> CREATOR;
    public static final rl2 X;
    public static final /* synthetic */ rl2[] Y;
    public static final rl2 a;
    public static final rl2 b;
    public static final rl2 c;
    public static final rl2 o;

    static {
        rl2 rl2Var = new rl2("DIALOG_MESSAGE", 0);
        a = rl2Var;
        rl2 rl2Var2 = new rl2("CHAT_MESSAGE", 1);
        b = rl2Var2;
        rl2 rl2Var3 = new rl2("CHANNEL_MESSAGE", 2);
        c = rl2Var3;
        rl2 rl2Var4 = new rl2("GROUP_CHAT", 3);
        o = rl2Var4;
        rl2 rl2Var5 = new rl2("SCHEDULED_MESSAGE", 4);
        X = rl2Var5;
        Y = new rl2[]{rl2Var, rl2Var2, rl2Var3, rl2Var4, rl2Var5};
        CREATOR = new d6(26);
    }

    public static rl2 valueOf(String str) {
        return (rl2) Enum.valueOf(rl2.class, str);
    }

    public static rl2[] values() {
        return (rl2[]) Y.clone();
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
