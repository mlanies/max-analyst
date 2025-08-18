package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class vv3 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(mv1.o, mv1.X, mv1.Y, mv1.Z));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(nv1.o, nv1.a));
    public static final Set c;
    public static final Set d;

    static {
        lv1 lv1Var = lv1.X;
        lv1 lv1Var2 = lv1.o;
        lv1 lv1Var3 = lv1.a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(lv1Var, lv1Var2, lv1Var3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(lv1Var2);
        enumSetCopyOf.remove(lv1Var3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }
}
