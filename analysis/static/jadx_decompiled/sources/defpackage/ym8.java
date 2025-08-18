package defpackage;

import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ym8 {
    public static final Map a = mz7.a0(new kpa("mkv", "video/x-matroska"), new kpa("glb", "model/gltf-binary"));

    public static final String a(String str) {
        int iE0 = w9e.E0(str, '.', 0, 6);
        String strSubstring = (iE0 < 0 || iE0 == str.length() + (-1)) ? null : str.substring(iE0 + 1);
        if (strSubstring == null) {
            return null;
        }
        String lowerCase = strSubstring.toLowerCase(Locale.US);
        String mimeTypeFromExtension = (String) ga9.b.get(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = ga9.a.getMimeTypeFromExtension(lowerCase);
        }
        return mimeTypeFromExtension == null ? (String) a.get(lowerCase) : mimeTypeFromExtension;
    }
}
