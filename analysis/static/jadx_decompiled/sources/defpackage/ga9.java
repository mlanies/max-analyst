package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ga9 {
    public static final MimeTypeMap a = MimeTypeMap.getSingleton();
    public static final Map b;

    static {
        dx6.b("image/heif", "heif", "image/heic", "heic");
        b = dx6.b("heif", "image/heif", "heic", "image/heic");
    }
}
