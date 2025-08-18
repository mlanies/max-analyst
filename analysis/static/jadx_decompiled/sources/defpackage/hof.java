package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class hof extends z {
    public static final Parcelable.Creator<hof> CREATOR = new y(12);
    public final ClassLoader X;
    public int c;
    public Parcelable o;

    public hof(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? hof.class.getClassLoader() : classLoader;
        this.c = parcel.readInt();
        this.o = parcel.readParcelable(classLoader);
        this.X = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return zr6.j(sb, this.c, "}");
    }

    @Override // defpackage.z, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.o, i);
    }
}
