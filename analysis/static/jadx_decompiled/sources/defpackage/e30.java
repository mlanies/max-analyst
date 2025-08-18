package defpackage;

import android.media.AudioAttributes;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public abstract class e30 {
    public static void a(AudioAttributes.Builder builder, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            builder.getClass().getMethod("setSpatializationBehavior", Integer.TYPE).invoke(builder, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}
