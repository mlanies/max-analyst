package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import defpackage.jcf;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(jcf jcfVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(jcfVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, jcf jcfVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, jcfVar);
    }
}
