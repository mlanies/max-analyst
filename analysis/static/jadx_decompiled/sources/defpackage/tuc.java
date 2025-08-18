package defpackage;

import android.os.Build;

/* loaded from: classes2.dex */
public final class tuc {
    public static final /* synthetic */ tuc a = new tuc();
    public static final String b = uuc.class.getSimpleName();
    public static final String[] c;

    static {
        c = Build.VERSION.SDK_INT >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }
}
