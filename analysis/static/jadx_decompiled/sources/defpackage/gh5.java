package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;

/* loaded from: classes.dex */
public final class gh5 extends vrd {
    public static final gh5 b = new gh5();

    @Override // defpackage.vrd
    public final j64 c() {
        return new j64(new zf3(29), new fh5(0));
    }

    @Override // defpackage.vrd
    public final k64 d(Bundle bundle) {
        final long jD = i24.D("chat_id", bundle);
        final long jD2 = i24.D("message_id", bundle);
        final String string = bundle.getString("attach_id");
        final long jD3 = i24.D("file_id", bundle);
        final String strF = i24.F("file_name", bundle);
        Parcelable parcelable = bundle.getParcelable("file_url");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        final Uri uri = (Uri) parcelable;
        return new k64() { // from class: eh5
            @Override // defpackage.k64
            public final Object a() {
                return new FileDownloadWarningBottomSheet(jD, jD2, string, jD3, strF, uri.toString());
            }
        };
    }

    @Override // defpackage.vrd
    public final void e(urd urdVar) {
        i64.a(urdVar, ":dialogs/file-download-warning", new String[]{"chat_id", "message_id", "file_id", "file_name"}, Collections.singleton("file_url"), 0, 12);
    }
}
