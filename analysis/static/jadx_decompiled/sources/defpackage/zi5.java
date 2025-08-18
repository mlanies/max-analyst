package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public interface zi5 {
    public static final String[] a = {"/videoCache/", "/previewVideoCache/", "/stickerCache/", "/upload/", "/imageCache/", "/audioCache/", "/gifCache/", "/exo_files_cache/", "/font/"};

    default File a(String str) {
        return ((kk5) this).o(null, str);
    }
}
