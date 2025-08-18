package defpackage;

/* loaded from: classes.dex */
public abstract class ct6 implements c99 {
    public final String a;

    public ct6(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.a;
    }
}
