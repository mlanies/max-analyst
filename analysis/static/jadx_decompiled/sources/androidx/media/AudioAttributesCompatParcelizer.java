package androidx.media;

import defpackage.jcf;
import defpackage.lcf;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(jcf jcfVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        lcf lcfVarH = audioAttributesCompat.a;
        if (jcfVar.e(1)) {
            lcfVarH = jcfVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) lcfVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, jcf jcfVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        jcfVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        jcfVar.i(1);
        jcfVar.l(audioAttributesImpl);
    }
}
