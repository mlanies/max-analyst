package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j24 extends jp7 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j24(Executor executor, y7g y7gVar, int i) {
        super(executor, y7gVar);
        this.c = i;
    }

    @Override // defpackage.jp7
    public final g05 d(wv6 wv6Var) {
        boolean zEquals;
        byte[] bytes;
        switch (this.c) {
            case 0:
                String string = wv6Var.b.toString();
                if (!string.substring(0, 5).equals("data:")) {
                    throw new IllegalArgumentException();
                }
                int iIndexOf = string.indexOf(44);
                String strSubstring = string.substring(iIndexOf + 1, string.length());
                String strSubstring2 = string.substring(0, iIndexOf);
                if (strSubstring2.contains(";")) {
                    zEquals = strSubstring2.split(";")[r5.length - 1].equals("base64");
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    bytes = Base64.decode(strSubstring, 0);
                } else {
                    String strDecode = Uri.decode(strSubstring);
                    strDecode.getClass();
                    bytes = strDecode.getBytes();
                }
                return c(new ByteArrayInputStream(bytes), bytes.length);
            default:
                return c(new FileInputStream(wv6Var.c().toString()), (int) wv6Var.c().length());
        }
    }

    @Override // defpackage.jp7
    public final String e() {
        switch (this.c) {
            case 0:
                return "DataFetchProducer";
            default:
                return "LocalFileFetchProducer";
        }
    }
}
