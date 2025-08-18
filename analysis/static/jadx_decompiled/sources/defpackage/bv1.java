package defpackage;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class bv1 {
    public static y7g a(Context context, Object obj, LinkedHashSet linkedHashSet) throws InitializationException {
        try {
            return new y7g(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
