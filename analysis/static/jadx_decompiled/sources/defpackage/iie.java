package defpackage;

import android.os.StrictMode;

/* loaded from: classes.dex */
public final class iie extends nud {
    @Override // defpackage.nud
    public final String b() {
        throw null;
    }

    @Override // defpackage.nud
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // defpackage.nud
    public final String toString() {
        return "SystemLoadWrapperSoSource[" + mhe.getClassLoaderLdLoadLibrary() + "]";
    }
}
