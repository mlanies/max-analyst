package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class vcc {
    public final /* synthetic */ hi5 a;

    public /* synthetic */ vcc(hi5 hi5Var) {
        this.a = hi5Var;
    }

    public final MediaMuxer a(int i, cy1 cy1Var) {
        Uri uri = Uri.EMPTY;
        hi5 hi5Var = this.a;
        if (!(hi5Var instanceof hi5)) {
            throw new AssertionError("Invalid output options type: ".concat(hi5Var.getClass().getSimpleName()));
        }
        File file = hi5Var.b.c;
        File parentFile = file.getParentFile();
        if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
            file.getAbsolutePath();
        }
        MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
        ((adc) cy1Var.b).J = Uri.fromFile(file);
        return mediaMuxer;
    }
}
