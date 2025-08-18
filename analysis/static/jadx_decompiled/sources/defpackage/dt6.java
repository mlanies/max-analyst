package defpackage;

/* loaded from: classes.dex */
public abstract class dt6 implements d99 {
    public final String a;

    public dt6(String str) {
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
