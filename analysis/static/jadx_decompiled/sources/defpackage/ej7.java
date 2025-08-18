package defpackage;

import android.os.Parcelable;

/* loaded from: classes2.dex */
public interface ej7 extends Parcelable {
    default String m() {
        cj7 cj7Var = this instanceof cj7 ? (cj7) this : null;
        if (cj7Var != null) {
            return cj7Var.m();
        }
        return null;
    }
}
