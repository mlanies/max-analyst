package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dfe implements efe {
    public final efe a;

    public dfe(sja sjaVar) {
        this.a = sjaVar;
    }

    @Override // defpackage.efe
    public final Object a(String str, File file, cfe cfeVar, String str2, boolean z, Continuation continuation) {
        return this.a.a(str, file, cfeVar, str2, z, continuation);
    }

    @Override // defpackage.efe
    public final Object b(File file, String str, Continuation continuation) {
        return this.a.b(file, str, continuation);
    }

    @Override // defpackage.efe
    public final Object c(File file, String str, Continuation continuation) {
        return this.a.c(file, str, continuation);
    }
}
