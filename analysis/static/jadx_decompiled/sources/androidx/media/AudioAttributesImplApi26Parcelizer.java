package androidx.media;

import android.media.AudioAttributes;
import defpackage.jcf;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(jcf jcfVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) jcfVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = jcfVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, jcf jcfVar) {
        jcfVar.getClass();
        jcfVar.k(audioAttributesImplApi26.a, 1);
        jcfVar.j(audioAttributesImplApi26.b, 2);
    }
}
