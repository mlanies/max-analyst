package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ep7 extends w0e {
    public final /* synthetic */ wv6 Y;
    public final /* synthetic */ gp7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep7(gp7 gp7Var, fi0 fi0Var, hab habVar, eab eabVar, wv6 wv6Var) {
        super(fi0Var, habVar, eabVar, "LocalExifThumbnailProducer");
        this.Z = gp7Var;
        this.Y = wv6Var;
    }

    @Override // defpackage.w0e
    public final void b(Object obj) {
        g05.d((g05) obj);
    }

    @Override // defpackage.w0e
    public final Map c(Object obj) {
        return dx6.a("createdThumbnail", Boolean.toString(((g05) obj) != null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: IOException -> 0x000f, StackOverflowError -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x000f, StackOverflowError -> 0x004c, blocks: (B:5:0x0011, B:7:0x001c, B:9:0x0022, B:10:0x0028, B:12:0x0034, B:16:0x003e), top: B:70:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    @Override // defpackage.w0e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep7.d():java.lang.Object");
    }
}
