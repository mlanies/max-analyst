package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pyd implements Parcelable, qu0 {
    public static final Parcelable.Creator<pyd> CREATOR;
    public static final /* synthetic */ pyd[] X;
    public static final /* synthetic */ v25 Y;
    public static final yxc b;
    public static final pyd c;
    public static final pyd o;
    public final String a;

    static {
        pyd pydVar = new pyd("CHAT", 0, "chat");
        c = pydVar;
        pyd pydVar2 = new pyd("CHANNEL", 1, "channel");
        o = pydVar2;
        pyd[] pydVarArr = {pydVar, pydVar2};
        X = pydVarArr;
        Y = new v25(pydVarArr);
        b = new yxc(17);
        CREATOR = new etd(11);
    }

    public pyd(String str, int i, String str2) {
        this.a = str2;
    }

    public static pyd valueOf(String str) {
        return (pyd) Enum.valueOf(pyd.class, str);
    }

    public static pyd[] values() {
        return (pyd[]) X.clone();
    }

    @Override // defpackage.qu0
    public final Object a(String str) {
        pyd pydVar;
        b.getClass();
        Iterator it = Y.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            pydVar = (pyd) u1Var.next();
        } while (!tpa.f(pydVar.a, str));
        return pydVar;
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
