package defpackage;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class lp7 extends o26 {
    public final ml0 f;
    public sd7 g;
    public final MediaMetadataRetriever h;
    public final int i;
    public volatile long j;

    public lp7(hle hleVar, o45 o45Var, ti4 ti4Var) {
        super(hleVar, o45Var);
        this.f = new ml0(null);
        this.h = new MediaMetadataRetriever();
        vi4 vi4VarB = ti4Var.b();
        int iOrdinal = vi4VarB.ordinal();
        if (iOrdinal == 0) {
            this.i = 5;
            return;
        }
        if (iOrdinal == 1) {
            this.i = 10;
        } else if (iOrdinal == 2) {
            this.i = 20;
        } else {
            throw new IllegalStateException("unknown performance class " + vi4VarB);
        }
    }

    public final boolean b() {
        fef fefVar = this.e;
        if (fefVar != null) {
            Uri uriL = ((ok0) fefVar).l();
            int i = maf.a;
            String scheme = uriL.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                return true;
            }
        }
        return false;
    }
}
