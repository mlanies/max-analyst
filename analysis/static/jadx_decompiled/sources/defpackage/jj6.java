package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class jj6 {
    public static final jj6 a = new jj6();
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public static Context c;

    public static void a(File file) {
        if (file.exists()) {
            file.toString();
            file.delete();
        }
    }
}
