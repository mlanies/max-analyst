package androidx.media;

import defpackage.jcf;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(jcf jcfVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = jcfVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = jcfVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = jcfVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = jcfVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, jcf jcfVar) {
        jcfVar.getClass();
        jcfVar.j(audioAttributesImplBase.a, 1);
        jcfVar.j(audioAttributesImplBase.b, 2);
        jcfVar.j(audioAttributesImplBase.c, 3);
        jcfVar.j(audioAttributesImplBase.d, 4);
    }
}
