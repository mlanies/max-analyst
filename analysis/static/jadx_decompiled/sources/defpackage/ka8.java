package defpackage;

/* loaded from: classes2.dex */
public abstract class ka8 {
    public static final ruc a;

    static {
        y5f y5fVar = new y5f("media-gallery-scope");
        ruc rucVar = c37.f;
        if (rucVar == null) {
            throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
        }
        y5fVar.c.add(rucVar);
        a = y5fVar.a();
    }
}
