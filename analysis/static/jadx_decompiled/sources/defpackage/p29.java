package defpackage;

/* loaded from: classes2.dex */
public abstract class p29 {
    public static final ruc a;

    static {
        y5f y5fVar = new y5f("messages-list-scope");
        ruc rucVar = c37.f;
        if (rucVar == null) {
            throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
        }
        y5fVar.c.add(rucVar);
        y5fVar.e(n29.class, new ze7(26));
        y5fVar.e(o29.class, new sx6(11));
        y5fVar.e(ob6.class, new sx6(12));
        y5fVar.e(o89.class, new sx6(13));
        a = y5fVar.a();
    }
}
