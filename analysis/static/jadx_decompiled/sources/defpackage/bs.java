package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* loaded from: classes.dex */
public final class bs extends nud implements ddc {
    public final int a;
    public qk4 b;

    public bs(Context context, int i) {
        this.a = i;
        this.b = new qk4(new File(context.getApplicationInfo().nativeLibraryDir), i);
    }

    @Override // defpackage.ddc
    public final nud a(Context context) {
        this.b = new qk4(new File(context.getApplicationInfo().nativeLibraryDir), this.a | 1);
        return this;
    }

    @Override // defpackage.nud
    public final String b() {
        throw null;
    }

    @Override // defpackage.nud
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.b.c(str, i, threadPolicy);
    }

    @Override // defpackage.nud
    public final void d(int i) {
        this.b.getClass();
    }

    @Override // defpackage.nud
    public final String toString() {
        return "ApplicationSoSource[" + this.b.toString() + "]";
    }
}
