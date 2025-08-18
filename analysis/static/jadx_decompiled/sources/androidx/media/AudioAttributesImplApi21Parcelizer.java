package androidx.media;

import android.media.AudioAttributes;
import defpackage.jcf;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(jcf jcfVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) jcfVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = jcfVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, jcf jcfVar) {
        jcfVar.getClass();
        jcfVar.k(audioAttributesImplApi21.a, 1);
        jcfVar.j(audioAttributesImplApi21.b, 2);
    }
}
