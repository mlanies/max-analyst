package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import defpackage.jcf;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(jcf jcfVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(jcfVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, jcf jcfVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, jcfVar);
    }
}
